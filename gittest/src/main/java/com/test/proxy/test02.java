package com.test.proxy;
/**静态代理模式*/
public class test02 {
	public static void main(String[] args) {
		Action userAction=new UserAction();
		ProxyAction proxy=new ProxyAction(userAction);
		proxy.doAction();
	}
}


