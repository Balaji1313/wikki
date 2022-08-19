package org.TCS;

import java.util.Scanner;

public class Switch {


public static void main(String[] args) {
	

	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter channel no:");
	
	
	int channel= s.nextInt();
	
	System.out.println("your channel no:"+channel);
	System.out.println("\n");
	
			
	switch (channel) {
	
	case 1:
		System.out.println("sunmusic,rajmusic,kmuisc");
		
		break;2

    case 2:
    	System.out.println("Ktv");
		
		
		break;
		
    case 3:
    	System.out.println("Jaya tv");
		
	
	break;
	
	default:
		System.out.println("error");
		
		break;
		
	}		
	
	
}

	
}
