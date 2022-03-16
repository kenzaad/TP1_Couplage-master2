package pack_dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {

	
@Override
 public double getData() {
	 System.out.println("version base donn�e");
	 /*une donn�es stocke dans une variable data*/
	double temp=Math.random()*60;
	return temp;
 }
}
