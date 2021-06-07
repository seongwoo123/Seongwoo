package Assignment;

import java.util.Scanner;

public class looppractice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int count = 0; //3의배수와 5의배수를 제외한 나머지수들의 개수를 카운트
		
		//5==> 5/5=---> 0
		//10 5 ==>2 5*2(몫)+0(나머지)
		//4 5 ==>   4*1 + 1(나머지) 
		
		
		
		int i = 0; //i = input.nextInt했으므로, i는 0이 아니라 초기화 됨.
		
		while(true) {
			i = input.nextInt(); //임의의 수를 입력받는다.
			
			if(((i % 3) != 0) && ((i % 5) != 0)) {//3의배수가 아니면서 5의 배수가 아니면
				count ++; //카운트
			}
			
			if(i == 0){//0이 입력되면 프로그램 종료
				break; //가장 가까운 반복문 탈출
			}
			
		}
		
		
		System.out.println("3의배수가 아니면서 5의 배수가 아닌수의 개수는? " + count);
		
		input.close();
		
		
		
		
		
	}

}
