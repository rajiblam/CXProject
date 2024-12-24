package MyRetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer1 implements IRetryAnalyzer  {

	int counter=0;
	int countLimit=2;
	
	@Override
	public boolean retry(ITestResult result) {
		if(counter<countLimit)
		{
			counter++;
			return true;
		}
		return false;
	}

}
