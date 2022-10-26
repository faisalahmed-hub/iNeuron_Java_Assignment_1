package in.Faisal.main;

public class FirstQuestion {

	public static void main(String[] args) {
		//1.Write a program(WAP) to print INEURON using pattern programming logic.
		int n = 6;
		for(int i = 0 ; i < n ; i++) { 
			for(int j = 0; j < n; j++) { // I
				if(i == 0 || j == (n-1)/2 || i == (n-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j = 0 ; j < n/2 ; j++) { //space
				System.out.print(" ");
			}
			for(int j = 0; j < n; j++) { //N
				if(j == 0 || i== j || j == (n-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j = 0 ; j < n/2 ; j++) { //space
				System.out.print(" ");
			}
			for(int j = 0; j < n; j++) { //
				if(j == 0 || i == 0 || i == n-1 || i == (n-1)/2) { // E
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j = 0 ; j < n/2 ; j++) { //space
				System.out.print(" ");
			}
			for(int j = 0; j < n; j++) { 
				if((j == 0 && i < n-1 )|| (j == n-1  && i < n-1) || (i == n-1 &&  j > 0 && j < n-1)) {  // U
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j = 0 ; j < n/2 ; j++) { //space
				System.out.print(" ");
			}
			for(int j = 0; j < n; j++) { 
				if(j == 0 || (i == 0 && j < (n-1)) || (j == (n-1)  && i > 0 && i < (n-1)/2 ) || (i == (n-1)/2 && j < (n-1) ) || (i == j &&  j > (n-1)/2) ) {  // R
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j = 0 ; j < n/2 ; j++) { //space
				System.out.print(" ");
			}
			for(int j = 0; j < n; j++) { 
				if( (i == 0 && j > 0 && j < n-1) || (j == 0 && i > 0 && i < n-1) || (i == n-1 && j > 0 && j < n-1) || (j == n-1 && i > 0 && i < n-1) ) { // O
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j = 0 ; j < n/2 ; j++) { //space
				System.out.print(" ");
			}
			for(int j = 0; j < n; j++) { //N
				if(j == 0 || i== j || j == (n-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
