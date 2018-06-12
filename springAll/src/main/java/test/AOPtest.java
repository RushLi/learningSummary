package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.dept;
import bean.emp;
import bean.student;

class AOPtest {

	@Test
	public void sys() {
		ApplicationContext context=new ClassPathXmlApplicationContext("applictionContext.xml");
		student st=(student)context.getBean("stu");
		st.say();
	}

}
