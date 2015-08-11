/**
 * 
 */
package com.jk.tests;

import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertNotEquals;

import com.jk.hib.HibernateUtils;

/**
 * @author kjamandlamudi
 *
 */
public class Test_HibUtils {

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
	 * Test method for {@link com.jk.hib.HibernateUtils#getSessionFactory()}.
	 */
	@Test
	public void testGetSessionFactory() {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		if (sessionFactory != null){
			assertNotEquals(sessionFactory, null);
		}
		
	}

}
