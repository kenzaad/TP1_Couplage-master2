package pack_dao;

import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IDao {
	@Override
	 public double getData() {
		 System.out.println("version capteurs");
		 /*une données stocke dans une variable data*/
		 double temp=Math.random()*60;
	        return temp;
	}

}
