package aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect //当前类是一个Aspect注解类
@Component //当前类是spring的一个组件类，可以让spring自动扫描功能扫描到
public class studentAop {
	@Before("execution(* bean.student.say())")
	public void before() {
		System.out.println("开始自我介绍");
	}
	@After("execution(* bean.student.say())")
	public void after() {
		System.out.println("自我介绍完毕");
	}
}
