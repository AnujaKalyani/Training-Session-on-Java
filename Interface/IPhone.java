package com.sam.phone;

public class IPhone implements Phone {

	@Override
	public String processor() {
		
		return "IPhone8 pro";
	}

	@Override
	public String os() {
		
		return "IOS";
	}

	@Override
	public int spaceinGB() {
		
		return 64;
	}
	
}
