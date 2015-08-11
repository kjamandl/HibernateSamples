/**
 * 
 */
package com.jk.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jk.dao.UserDAO;

/**
 * @author kjamandlamudi
 *
 */
public class Test_UserDAO {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.jk.dao.UserDAO#getUserName(int)}.
	 */
	@Test
	public void testGetUserName() {
		UserDAO userDAO = new UserDAO();
		
		assertEquals("UserName Test", userDAO.getUserName(1),"Kishore");
	}

	/**
	 * Test method for {@link com.jk.dao.UserDAO#getUserEmail(int)}.
	 */
	@Test
	public void testGetUserEmail() {
		UserDAO userDAO = new UserDAO();
		
		assertEquals("UserEmail Test", userDAO.getUserEmail(2),"kijamand@gmail.com");
	}

}
