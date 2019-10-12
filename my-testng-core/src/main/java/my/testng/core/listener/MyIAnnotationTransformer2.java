package my.testng.core.listener;

import org.testng.IAnnotationTransformer2;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Copyright,2019-2020,meituan Co.,Ltd.
 *
 * @Author: luxun
 * @Create: 2019/10/12 9:06 下午
 * @Description:
 * @Other:
 */
public class MyIAnnotationTransformer2 implements IAnnotationTransformer2 {
    public void transform(IConfigurationAnnotation iConfigurationAnnotation, Class aClass, Constructor constructor, Method method) {
        System.out.println("======MyAnnotationTransformer2.1=====");

    }

    public void transform(IDataProviderAnnotation iDataProviderAnnotation, Method method) {
        System.out.println("======MyAnnotationTransformer2.2=====");

    }

    public void transform(IFactoryAnnotation iFactoryAnnotation, Method method) {
        System.out.println("======MyAnnotationTransformer2.3=====");

    }

    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
        System.out.println("======MyAnnotationTransformer2.4=====");

    }
}
