import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class A_BaseTestListener implements ITestListener {


    @Override
    public void onTestStart(ITestResult TestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult TestResult) {

    }

    @Override
    public void onTestFailure(ITestResult TestResult) {
        System.out.println("sdasdasda");
    }

    @Override
    public void onTestSkipped(ITestResult TestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult TestResult) {
        System.out.println("123123");
    }

    @Override
    public void onStart(ITestContext TestContext) {

    }

    @Override
    public void onFinish(ITestContext TestContext) {

    }

}