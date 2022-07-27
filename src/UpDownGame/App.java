package UpDownGame;

import java.util.Random;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		
		boolean running = false;

		do {
			int guessNum = r.nextInt(100);
			int MaxNum = 99;
			int MinNum = 0;
			int myNum = 0;
			
			System.out.println("Up & Down게임입니다. 숨겨진 수를 맞추어 보세요");
			for(int i =1; i <= 10; i++) {
				System.out.printf("%d-%d \n", MinNum, MaxNum);
				System.out.printf("%d>>", i);
				
				myNum = Integer.parseInt(scan.nextLine());
				
				if (myNum < guessNum) {
					MinNum = myNum;
					System.out.println("더 높게");
				} else if (myNum > guessNum) {
					MaxNum = myNum;
					System.out.println("더 낮게");
				} else {
					System.out.println("맞았습니다.");
					System.out.println("다시하겠습니까(y/n)>>");
					String answer = scan.nextLine().trim();
					
					if (answer.equalsIgnoreCase("n")) {
						running = false;
						break;
					}else if(answer.equalsIgnoreCase("y")) {
						running = true;
						i = 11;
					}else {
						System.out.println("선택안됨!");
						break;
					}
				}
				
				
			}
			
		}while(running);
		
		scan.close();
	}
}
