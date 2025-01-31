package com.tnfif.constructor;

public class Parameterdemo {
Parameterdemo(){
	System.out.println("dafault");
}
Parameterdemo(int a){
	System.out.println("one parameter");
	
}
	Parameterdemo(int a,String b){
		System.out.println("two parameter");
	}
	public static void main(String[] args) {
		Parameterdemo s=new Parameterdemo();
		Parameterdemo s1=new Parameterdemo(1,"ramya");
		Parameterdemo s2=new Parameterdemo(5);
	}
}