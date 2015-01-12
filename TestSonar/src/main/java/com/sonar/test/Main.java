package com.sonar.test;

public class Main {
	
	private static final int CONST_10 = 10;
	private static final int CONST_5 = 5;
	
	private Main(){
		super();
	}
	
	public static void main(String[] args) {

		for(int i=0;i<CONST_10;i++){
			for(int j=0;j<CONST_10;j++){
				if(i>CONST_5){
					for(int k=0;k<CONST_10;k++){
						if(j>CONST_5){
							System.out.println("Je suis K : J > 5");
						}
					}
				} else {
					for(int l=0;l<CONST_10;l++){
						if(j<=CONST_5){
							System.out.println("Je suis L : J <= 5");
						} else {
							System.out.println("Je suis L ...");
						}
					}
					for(int m=0;m<CONST_10;m++){
						if(j<=CONST_5){
							System.out.println("Je suis L : J <= 5");
						} else {
							System.out.println("Je suis L ...");
						}
					}
				}
			}
		}
	}

}
