package my.testng.core.listener;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

/**
 * Copyright,2019-2020,meituan Co.,Ltd.
 *
 * @Author: luxun
 * @Create: 2019/10/12 9:00 下午
 * @Description:
 * @Other:
 */
public class MyInvokedMethodListener implements IInvokedMethodListener {
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        System.out.println("======方法调用前=====");
    }

    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        System.out.println("======方法调用后=====");
    }
}
