package in.Faisal.main;

public class SecondQuestion {
	public static void main(String[] args) {
/*		2. Write a program to print
		1 1 1 1
		2 2 2 2
		3 3 3 3
		4 4 4 4 */
		int n = 4;
		for(int i = 1 ; i <= n; i++) {
			for(int j = 1; j <= n ; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
