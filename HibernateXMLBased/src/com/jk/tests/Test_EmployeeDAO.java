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

import com.jk.dao.EmployeeDAO;

/**
 * @author kjamandlamudi
 * 
 */
public class Test_EmployeeDAO {

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
	 * Test method for {@link com.jk.dao.EmployeeDAO#getEmployee1(int)}.
	 */
	@Test
	public void testGetEmployee1() {
		EmployeeDAO empDAO = new EmployeeDAO();

		assertEquals("Test1", empDAO.getEmployee1(14), "Kishore");
	}

	/**
	 * Test method for {@link com.jk.dao.EmployeeDAO#getEmployee2(int)}.
	 */
	@Test
	public void testGetEmployee2() {
		EmployeeDAO empDAO = new EmployeeDAO();

		assertEquals("Test2", empDAO.getEmployee2(15), "Kishore1");
	}

}
