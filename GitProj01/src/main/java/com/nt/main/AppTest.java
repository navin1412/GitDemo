package com.nt.main;

import com.nt.service.ArithemeticOperations;

public class AppTest{
	public static void main(String[] args) {
		ArithemeticOperations ar=new ArithemeticOperations();
		System.out.println("sum:"+ar.sum(200,100));
		System.out.println("sub:"+ar.sub(200,100));
		
	}

}
