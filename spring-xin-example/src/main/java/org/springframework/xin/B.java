package org.springframework.xin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author XINDQ 2020/6/13 0:22
 */
@Component
public class B {
	@Autowired
	A a;
	public B() {
		System.out.println("-------创建B---------");
	}
}
