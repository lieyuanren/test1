package com.test.proxy;
/**��̬����ģʽ*/
public class test02 {
	public static void main(String[] args) {
		Action userAction=new UserAction();
		ProxyAction proxy=new ProxyAction(userAction);
		proxy.doAction();
	}
}


