package my.testng.core.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Copyright,2019-2020,meituan Co.,Ltd.
 *
 * @Author: luxun
 * @Create: 2019/10/12 9:05 下午
 * @Description:
 * @Other:
 */
public class MyITestListener implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("======测试开始=====");

    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("======测试成功=====");

    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("======测试失败=====");

    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("======测试跳过=====");

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("======测试失败但在成功率之内=====");

    }

    public void onStart(ITestContext iTestContext) {
        System.out.println("======测试前=====");

    }

    public void onFinish(ITestContext iTestContext) {
        System.out.println("======测试后=====");

    }
}
