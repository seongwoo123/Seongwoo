package Assignment;

import java.util.Scanner;

public class looppractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		int i;
		
		int sum = 0;
		
		System.out.println("100������ ������ �Է��ϼ���.");
		i = input.nextInt();
		
		while (i<=100)	
		{
			sum = sum + i;
			
			i++;
		}
		
		System.out.println( sum );
		
		input.close();

	}

}
