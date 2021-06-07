package Assignment;

import java.util.Scanner;

public class looppractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt(); //입력받는 값의 배수가 될 수.  ex)5
		
		//5(n)x1(i)=5
		//5(n)x2(i)=10
		//5(n)x3(i)=15
		//.
		//.
		//.
		
		int i;
		for(i = 1; i <= 10; i++) {
			//System.out.println(n*i+" ");
			System.out.print(n*i + " ");//
		}
		
		
		
		
		
		
		
		
		input.close();
		
		
		
		
		
	}

}
