package study0401;

import java.util.Scanner;

public class Book_199 {
	
	// 타이틀 출력
	private static void showTitle() {
		System.out.println("-".repeat(50));
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
		System.out.println("-".repeat(50));
	}
	
	// 에러 메시지
	public static void errorMessage() {
		System.out.println("잘못된 숫자를 입력했습니다.");
	}
	
	// 선택지 출력
	public static void showAnswer(int answer) {
		System.out.println("선택>" + answer);
	}
	
	// 학생, 점수 입력값이 없는 경우 다시 입력 받음
	public static boolean checkStudent(int student, int[] score) {
		if(student <= 0) { // 학생을 미입력한 경우 다시 입력 받음
			System.out.println("학생 수를 입력해주세요");
			return false;
		} else if(score== null){ // NullPointerException 방지
			System.out.println("점수를 입력해주세요");
			return false;
		} else {
			return true;
		}
		
	}
	
	// Scanner 입력값 반환
	// NumberFormatException 발생시 에러 메시지 출력
	public static int insertInt() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		try {
			num = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			errorMessage();
			num = -1;
		}
		return num;
	}
	
	// 최고 점수 반환
	public static void topScore(int[] score) {
		int top = 0;
		for(int i = 0; i < score.length; i++) {
			if(top<score[i]) top = score[i];
		}
		System.out.println("최고 점수 : "+ top);
	}

	// 평균 점수 반환
	public static void avgScore(int[] score) {
		int sum = 0;
		for(int s : score) sum += s;
		System.out.println("평균 점수 : "+(double)sum/score.length);
	}
	
	public static void main(String[] args) {
		int student = 0;
		int[] score = null;
		
		Exit:
		while(true) {
			showTitle();
			int answer = insertInt();
			showAnswer(answer);	
	
			switch (answer) {
			case 1:
				student = insertInt();
				if(student <= 0) errorMessage();
				System.out.println("학생수>"+student);
				continue;
			case 2:
				score = new int[student];
				if(!checkStudent(student, score)) continue;
				for(int i = 0; i<score.length; i++) {
					System.out.printf("score[%d]>",i);
					int num = insertInt();
					if(num>100 || num<0) {
						System.out.println("범위 내의 점수를 입력해주세요");
						i--; // 다시 입력하도록 함
					} else {
						score[i] = num; // 정상적인 점수일 때만 점수 등록
					}
				}
				continue;
			case 3:
				if(!checkStudent(student, score)) continue;
				for(int i = 0; i<score.length; i++) {
					System.out.printf("score[%d]: %d\n",i,score[i]);
				}
				continue;
			case 4:
				if(!checkStudent(student, score)) continue;
				topScore(score);
				avgScore(score);
				continue;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break Exit; // while 종료
			default: 
				// 보기 이외의 번호 입력 시 에러메시지 출력 후 다시 입력 받음
				errorMessage(); continue;
			}
		}
	}
}
