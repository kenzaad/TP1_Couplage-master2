package pack_metier;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pack_dao.IDao;


@Component
public class MetierImpl implements IMetier {
	
 @Autowired
	private IDao dao;
	
	
	public double calcul() {
		//stocke la valeur de data dans une variable t
		double t=dao.getData();
		
		double temp=Math.random()*60;
        return temp;
	}
	public void setDao(IDao dao) {
		this.dao=dao;
	}
	
}
