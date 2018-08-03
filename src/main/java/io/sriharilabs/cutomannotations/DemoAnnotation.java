package io.sriharilabs.cutomannotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface SmartPhone{
	String os();
	int version();
	
}

@SmartPhone(os = "android", version = 8)
class MyPhone{
	
	String myPhone;

	public MyPhone(String myPhone) {
		super();
		this.myPhone = myPhone;
	}
	
}

public class DemoAnnotation {

	public static void main(String as[]) {
		MyPhone m=new MyPhone("Honour..");
		
		Class<? extends MyPhone> c=m.getClass();
		Annotation a=c.getAnnotation(SmartPhone.class);
		SmartPhone s=(SmartPhone) a;
		System.out.println(s.os());
		System.out.println(s.version());
	}
	
}
