package com.test.proxy;

public class ProxyAction implements Action {
	private Action target;
	public  ProxyAction(Action target) {
		this.target=target;
	}
	@Override
	public void doAction() {
		long start=System.currentTimeMillis();
		target.doAction();
		long endTime=System.currentTimeMillis();
		System.out.println("×ÜºÄÊ±:"+(endTime-start));
	}

}
