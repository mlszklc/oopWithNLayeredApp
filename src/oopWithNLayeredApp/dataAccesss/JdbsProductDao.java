package oopWithNLayeredApp.dataAccesss;

import oopWithNLayeredApp.entities.Product;

public class JdbsProductDao implements ProductDao {
	public void add(Product product) {
		//sadece db erişim kodları buraya yazılır...SQL
		System.out.println("JDBS ile veritabanına eklendi");
	}
}

//Hibernate

