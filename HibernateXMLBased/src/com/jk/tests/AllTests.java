package com.jk.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Test_EmployeeDAO.class, Test_HibUtils.class, Test_UserDAO.class })
public class AllTests {

}
