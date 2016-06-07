package org.model;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DAOHelloWorldTest {
	DAOHelloWorld DAO;
	@Before
	 public void setUp() throws Exception {
	 this.DAO = DAOHelloWorld.getInstance();
	 /*System.out.println("JE VAIS TESTER");
	 System.out.println("Essaie OPEN");
	 this.DAO.open();
		//assertFalse(this.DAO.open());
		System.out.println("Fin essaie OPEN");*/
	 }
	
	
	@Test
	public void reconnect(){
		/*System.out.println("Essaie du singleton");
		assertNull(this.DAO.getInstance());
		System.out.println("Fin essaie du singleton");*/
	}
	@Test
	public void open(){
		this.DAO.open();
	}
	@Test
	public void getQuery(){
		assertNotNull(this.DAO.getQuerySelectFirstHelloWorld());
	}
	/*@Test
	public void executeQuery(){
		assertNotNull(this.DAO.executeQuery(this.DAO.getQuerySelectFirstHelloWorld()));
		System.out.println(this.DAO.executeQuery(this.DAO.getQuerySelectFirstHelloWorld()));
	}*/
}
