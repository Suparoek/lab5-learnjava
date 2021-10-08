package com.Labvee.lab5Learnjava;

public class Lab5Larnjava {
	public static void main(String[] arges) {
		graude();
	}
	public static void graude() {
		int guade =75;
		if(guade >=80) {
			System.out.println("You are gruade: A");
		}else if(guade >=70 && guade<80) {
			System.out.println("You are gruade: B");
		}else if(guade >=60 && guade<70) {
			System.out.println("You are gruade: C");
		}else if(guade >=50 && guade<60) {
			System.out.println("You are gruade: D");
		}else if(guade >=40 && guade<50) {
			System.out.println("You are gruade: F");
		}else {
			System.out.println("You are gruade: E");
		}
		switch(guade){
		case 80:
			System.out.println("You are gruade: A");
			break;
		case 70:
			System.out.println("You are gruade: B");
			break;
		case 60:
			System.out.println("You are gruade: C");
			break;
		case 50:
			System.out.println("You are gruade: D");
			break;
		case 40:
			System.out.println("You are gruade: F");
			break;
		default:
			System.out.println("You are gruade: E");
		}
	}

}
