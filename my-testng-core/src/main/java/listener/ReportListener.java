package listener;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;
import org.testng.xml.XmlSuite;

import java.util.List;

/**
 * Copyright,2019-2020,meituan Co.,Ltd.
 *
 * @Author: luxun
 * @Create: 2019/10/12 3:41 下午
 * @Description:
 * @Other:
 */
public class ReportListener extends TestListenerAdapter implements IReporter {

    public void generateReport(List<XmlSuite> list, List<ISuite> list1, String s) {
        System.out.println("======generateReport======");
    }
}
