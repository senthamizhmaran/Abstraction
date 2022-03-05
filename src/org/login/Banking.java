package org.login;

public class Banking extends Axisbank {

	@Override
	void savings() {
		System.out.println("saving is 11%");
		
	}

	@Override
	void fixed() {
		System.out.println("fixed is 9%");
		
	}

	@Override
	void deposit() {
		System.out.println("minimum deposite amount is 10000");
		
	}
	public static void main(String[] args) {
		Banking a = new Banking();
		a.savings();
		a.fixed();
		a.deposit();
		a.minimumDeposite();
		
	}

}
