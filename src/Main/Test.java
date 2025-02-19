package Main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import model.Student;

public class Test {

	 public static void main(String[] args) {
		        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		        Student student = (Student) context.getBean("studentbean");
		        student.displayInfo();  
		    }

		} 
