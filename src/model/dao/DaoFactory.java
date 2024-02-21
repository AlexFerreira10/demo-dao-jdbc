package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	//Expoem o tipo da interface, mas internamente instancia uma implementação
	//Programa nao conhece a implementação somente a interface
	//Injeçao de dependencia sem explicitar a implemnetação
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
