package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.dept;
import bean.emp;

class IOCtest {

	
	@Test
	public void sysEmp() {
		ApplicationContext context=new ClassPathXmlApplicationContext("applictionContext.xml");
		emp em=(emp)context.getBean("emps");
		System.out.println(em.getEid()+"-----"+em.getEname()+"----"+em.getBirthday()+"---"+em.getDid());
		dept de=(dept)context.getBean("depts");
		System.out.println(de.getDid()+"------"+de.getDname());
	}
}
