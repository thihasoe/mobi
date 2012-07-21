package com.thiha;

public class Child extends Parent{
	public void test(){
		System.out.println("child   parz");
	}
	
	public static void main(String[] args) {
		Parent p []= {new Parent(),new Child()};
		for(Parent par: p){
			par.test();
		}
	}
}
