package my.testng.core.listener;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import java.util.List;

/**
 * Copyright,2019-2020,meituan Co.,Ltd.
 *
 * @Author: luxun
 * @Create: 2019/10/12 9:02 下午
 * @Description:
 * @Other:
 */
public class MyMethodInterceptor implements IMethodInterceptor {
    public List<IMethodInstance> intercept(List<IMethodInstance> list, ITestContext iTestContext) {
        System.out.println("方法调用拦截");
        return null;
    }
}

