package GitHub.ActionsPOC;


import java.io.IOException;

import org.testng.IExecutionListener;

public class CustomExecutionListener implements IExecutionListener{
		 public void onExecutionFinish() { 
			 try {
				Thread.sleep(10000);
				 ConvertToJson.jsonReportGenerator();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		 }
}
