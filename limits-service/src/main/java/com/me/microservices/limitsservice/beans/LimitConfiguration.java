package com.me.microservices.limitsservice.beans;

public class LimitConfiguration {

	private int minium;
	private int maximun;
	
	protected LimitConfiguration() {
	}
	
	public LimitConfiguration(int minium, int maximun) {
		super();
		this.minium = minium;
		this.maximun = maximun;
	}
	public int getMinium() {
		return minium;
	}
	public void setMinium(int minium) {
		this.minium = minium;
	}
	public int getMaximun() {
		return maximun;
	}
	public void setMaximun(int maximun) {
		this.maximun = maximun;
	}
	
	
}
