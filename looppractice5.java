package Assignment;

import java.util.Scanner;

public class looppractice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int count = 0; //3�ǹ���� 5�ǹ���� ������ ������������ ������ ī��Ʈ
		
		//5==> 5/5=---> 0
		//10 5 ==>2 5*2(��)+0(������)
		//4 5 ==>   4*1 + 1(������) 
		
		
		
		int i = 0; //i = input.nextInt�����Ƿ�, i�� 0�� �ƴ϶� �ʱ�ȭ ��.
		
		while(true) {
			i = input.nextInt(); //������ ���� �Է¹޴´�.
			
			if(((i % 3) != 0) && ((i % 5) != 0)) {//3�ǹ���� �ƴϸ鼭 5�� ����� �ƴϸ�
				count ++; //ī��Ʈ
			}
			
			if(i == 0){//0�� �ԷµǸ� ���α׷� ����
				break; //���� ����� �ݺ��� Ż��
			}
			
		}
		
		
		System.out.println("3�ǹ���� �ƴϸ鼭 5�� ����� �ƴѼ��� ������? " + count);
		
		input.close();
		
		
		
		
		
	}

}
