package aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect //��ǰ����һ��Aspectע����
@Component //��ǰ����spring��һ������࣬������spring�Զ�ɨ�蹦��ɨ�赽
public class studentAop {
	@Before("execution(* bean.student.say())")
	public void before() {
		System.out.println("��ʼ���ҽ���");
	}
	@After("execution(* bean.student.say())")
	public void after() {
		System.out.println("���ҽ������");
	}
}
