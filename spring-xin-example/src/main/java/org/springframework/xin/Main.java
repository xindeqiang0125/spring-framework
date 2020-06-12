package org.springframework.xin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XINDQ 2020/6/13 0:11
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		A a = ac.getBean(A.class);
	}
}
