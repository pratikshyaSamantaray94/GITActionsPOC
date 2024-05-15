package GitHub.ActionsPOC;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import ch.qos.logback.core.net.ObjectWriter;

public class ConvertToJson {

	public static void jsonReportGenerator() throws IOException {
		String readFromXML = readFile("./test-output/testng-results.xml");
		String conJsonTxt = convertToJson(readFromXML);
		createFile(conJsonTxt);
		System.out.println(conJsonTxt);
	}

	public static String readFile(String path) throws IOException {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String sCurrentLine = "";
			while ((sCurrentLine = br.readLine()) != null) {
				sb.append(sCurrentLine);
			}

		}

		return sb.toString();
	}

	public static String convertToJson(String s) {
		JSONObject soapDatainJsonObject = XML.toJSONObject(s);
		return soapDatainJsonObject.toString();
	}
	
	public static void createFile(String data) {
		//JSONObject jsonObject=new JSONObject();
		try {
	         FileWriter file = new FileWriter("./test-output/testNgOutput.json");
	         
	         ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
	         Object jsonObject = mapper.readValue(data, Object.class);
	         String prettyJson = mapper.writeValueAsString(jsonObject);
	         file.write(prettyJson);
	         file.close();
	      } catch (IOException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	}
}
