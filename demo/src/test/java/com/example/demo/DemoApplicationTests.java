package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	private Calculator c=new Calculator();
	
	
	
	@Test
	void testSum()
	{
//		EXPECTED RESULT
		
		int expectedResult=17;
		
		// ACTUAL RESULT
		
		int actualResult=c.doSum(12, 3, 2);
		
		assertThat(actualResult).isEqualTo(expectedResult);
		
		
	}
	
	@Test
	void testProduct()
	{
		int ExpectedResult=20;
		
		int actualResult=c.doProduct(5, 4);
		
		assertThat(actualResult).isEqualTo(ExpectedResult);
	}
	
	@Test
	
	void testIsEqual()
	{
		boolean res=c.isEqual(20, 20);
		
		assertThat(res).isEqualTo(true);
	}
	@Autowired
	private PersonRepo pr;
	
	@Test
	void isPersonExistById()
	{
		
//		Person p=new Person(123, "Vikas", "Kolkata");
//		pr.save(p);
		
		Boolean actualResult=pr.isPersonExistById(121);
		assertThat(actualResult).isTrue();
	}
	
	
	 
	
}
