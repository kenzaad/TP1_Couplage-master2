package pack_pre;

import pack_metier.MetierImpl;
import pack_dao.DaoImpl;
import pack_dao.DaoImpl2;

public class Presentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciation statique.
		MetierImpl metier=new MetierImpl();
		
		//DaoImpl1
		DaoImpl dao=new DaoImpl();
		metier.setDao(dao);
		System.out.println(metier.calcul());
		
		//DaoImpl2
		metier.setDao(new DaoImpl2());
		System.out.println(metier.calcul());
		
		

	}

}
