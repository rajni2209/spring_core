package com.springcore.expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("com/springcore/expression/exxconfig.xml");
		Mine m = (Mine) context.getBean("mine");
		System.out.println(m);
		
		
		//expression can be created by both annotation and also api class
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression expr =  temp.parseExpression("10+10");
		try {
			System.out.println(expr.getValue());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
