package pack_pre;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

import pack_dao.IDao;
import pack_metier.IMetier;

public class Presentation_Dynamique {

	
		// TODO Auto-generated method stub
        //Instanciation dynamique
		public static void main(String[] args) throws Exception {
			
			Scanner scanner=new Scanner(new File("config.txt"));

			String daoClassname=scanner.next(); Class cdao=Class.forName(daoClassname); IDao dao= (IDao) 
			cdao.newInstance();

			String metierClassName=scanner.next();
			Class cmetier=Class.forName(metierClassName); IMetier metier=(IMetier) cmetier.newInstance();

			Method meth=cmetier.getMethod("setDao",IDao.class); meth.invoke(metier,dao); 
			System.out.println(metier.calcul());

	}

}
