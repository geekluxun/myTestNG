package my.testng.core.listener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

/**
 * Copyright,2019-2020,meituan Co.,Ltd.
 *
 * @Author: luxun
 * @Create: 2019/10/12 9:04 下午
 * @Description:
 * @Other:
 */
public class MyISuiteListener implements ISuiteListener {
    public void onStart(ISuite iSuite) {
        System.out.println("======测试套件调用前=====");

    }

    public void onFinish(ISuite iSuite) {
        System.out.println("======测试套件调用后=====");

    }
}
