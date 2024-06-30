package com.java;

class Test{
	
	public static void main(String[] args) {
		String a = "good person is good is";
		String[] aa = a.split(" ");
		int count = 0;
		for(String i : aa) {
			if(i.equals("good")) {
				count++;
			}
		}
		System.out.println("good: "+count);
}
}