package com.example.demo;

 
public class TestingHello {

	


	

	public class TestHelloWorld {
		
	@Test 

	public void TestEmailGenerator() {
		
		RandomEmailGenerator abc = new RandomEmailGenerator () ;
		String email = abc.generate();
		Assert.assertNotNull (email);
		Assert.assertEquals(email, " feeback@yoursite.com");
		
		
	}

	}
	}

}
