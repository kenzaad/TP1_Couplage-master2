package pack_pre;





import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pack_metier.IMetier;


public class Presentation_Config {
public static void main(String[] args) throws Exception {
ApplicationContext ctx=new  ClassPathXmlApplicationContext("Config.xml");
IMetier metier=ctx.getBean(IMetier.class);
System.out.println("valeur:"+metier.calcul());
}
}

