package Assignment;

import java.util.Scanner;

public class looppractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner input = new Scanner(System.in);
		
		int i = 0;
		
		int sum = 0;
		
		
	
		System.out.println("100 ������ ���� ������ �Է��ϼ���.");
		i = input.nextInt();
		
		while (i<=100 && i>=0)
		{
			sum = sum + i;
			
			i--;
		}
		
		
		System.out.println("�հ�=" + sum); 
		
		input.close();
		
		
	}

}
