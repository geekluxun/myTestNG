package my.testng.core.listener;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Copyright,2019-2020,meituan Co.,Ltd.
 *
 * @Author: luxun
 * @Create: 2019/10/12 8:59 下午
 * @Description:
 * @Other:
 */
public class MyAnnotationTransformer implements IAnnotationTransformer {
    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
        System.out.println("======MyAnnotationTransformer=====");
    }
}
