package SpringCore.com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.HindhiTeacher;
import com.springCore.Teacher;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Teacher teach = context.getBean("hindhiTeacher", HindhiTeacher.class);
		System.out.println(teach.subject());
		teach.teach();

	}
}
