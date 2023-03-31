package com.ust.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTest {
  @Test(priority=1, description="this is executed first")
  public void f() {
	  System.out.println("from test method f()");
  }
  @Test(priority=2, description="test description")
  public void a() {
	  System.out.println("from test method a()"); // TestNG will test according to the alphabetical order.
  }												// but if we give priority then it will test according to the priority.
  @BeforeTest
  public void beforeTest() {
	  System.out.println("from beforetest");
  }

  @AfterTest
  public void afterTest() {
  }

}
