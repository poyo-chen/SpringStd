package com.spring.ioc.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AfterHandler implements BeanPostProcessor {

    /* 物件初始創建前 */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Person person = (Person) bean;
        if (person.getSex().equals("男")) {
            person.setName("HI");
        } else {
            person.setName("HO");
        }
        return null;
    }

    /* 物件初始創鍵後 */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
