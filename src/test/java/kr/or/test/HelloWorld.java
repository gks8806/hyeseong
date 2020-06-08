package kr.or.test;

import java.util.Scanner;

class Tire {
	public void run() {
		System.out.println("일반 타이어가 굴러갑니다.");
	}
}
class SnowTire extends Tire {
	@Override
	public void run() {
		System.out.println("스노우 타이어가 글러갑니다.");
	}
}
public class HelloWorld {
	
	String name ="한혜성";//클래스 안 전체에 영향을 가지는 글로벌변수

	public static void main(String[] args) {
		//SnowTire클래스형 변수 snowTire 생성, new 키워드로 SnowTire()매서드를 이용해서 snowTire라는 인스턴스(메모리에로딩됐다)가 실행된상태.
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		tire.run(); 
	}
		
		/*String name="홍길동";//매서드 안에서 영향을 가지는 로컬변수
		boolean run =true;
		int balance=0;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("----------------------");
			System.out.println("1.입금|2.출금|3.잔고|4.종료");
			System.out.println("----------------------");
			System.out.print("위 번호를 입력해주세요>");
			
			int menuNum =scanner.nextInt();
			
			switch(menuNum) {
			case 1:
				System.out.println("입금액을 입력해주세요>");
				balance = balance + scanner.nextInt();
				break;
			case 2:
				System.out.println("출금액을 입력해주세요>");
				balance = balance - scanner.nextInt();
				break;
			case 3:
				System.out.println("잔고는 다음과 같습니다.>");
				System.out.println(balance + " 원입니다.");
				break;
			case 4:
				run = false;
				break;
			}
			
			System.out.println();
		}
		System.out.println("프로그램 while문이 종료되었습니다.");
		
		
		
	
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		
		int cnt = 1;
		while(cnt<=100) {
			sum = sum +cnt;
			cnt = cnt + 1;
		}
		System.out.println("1부터 100까지의 합은: " + sum + "입니다.");

		System.out.println("안녕하세요. Hello world 자바!");
		int score=85;
		String result= (!(score>90))? "가":"나";
		System.out.println(result);
		
		int x = 10;
		int y = 5;
		
		System.out.println((x>7) && (y<=5));
		System.out.println((x<7) && (y<=5));
		System.out.println((x<7) || (y<=5));
		
		
	}
*/
}
