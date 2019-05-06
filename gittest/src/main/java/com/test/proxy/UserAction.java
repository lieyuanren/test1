package com.test.proxy;

public class UserAction implements Action {

	@Override
	public void doAction() {
		for(int i=0;i<1000;i++) {
			System.out.println("userÖ´ÐÐ¶¯×÷À²");
		}
		

	}

}
