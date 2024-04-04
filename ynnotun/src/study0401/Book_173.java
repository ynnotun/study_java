package study0401;

public class Book_173 {

	/*
	 * 배열 초기화
	 * 정수 배열 : 0
	 * 실수 배열 : 0.0
	 * 논리 배열 : false
	 * 참조 배열 : null
	 * */

	public static void main(String[] args) {
		// 배열 변수 선언과 배열 생성
		// 정수 배열
		int[] arr1 = new int[3];
		
		// 배열 항목의 초기값 출력
		for (int i = 0; i<3; i++) {
			System.out.printf("arr1[%d] : %d, ", i, arr1[i]);
		}
		System.out.println();
		
		// 배열 항목의 값 변경
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		// 배열 항목의 변경 값 출력
		for (int i = 0; i<3; i++) {
			System.out.printf("arr1[%d] : %d, ", i, arr1[i]);
		}
		System.out.println("\n");
		
		// 배열 변수 선언과 배열 생성
		// 실수 배열
		double[] arr2 = new double[3];
		
		// 배열 항목의 초기값 출력
		for (int i = 0; i<3; i++) {
			System.out.printf("arr2[%d] : %f, ", i, arr2[i]);
		}
		System.out.println();
		
		// 배열 항목의 값 변경
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		// 배열 항목의 변경 값 출력
		for (int i = 0; i<3; i++) {
			System.out.printf("arr2[%d] : %f, ", i, arr2[i]);
		}
		System.out.println("\n");
		
		// 배열 변수 선언과 배열 생성
		// 문자열 배열
		String[] arr3 = new String[3];
		
		// 배열 항목의 초기값 출력
		for (int i = 0; i<3; i++) {
			System.out.printf("arr2[%d] : %s, ", i, arr2[i]);
		}
		System.out.println();
		
		// 배열 변수 선언과 배열 생성
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		
		// 배열 항목의 변경값 출력
		for (int i = 0; i<3; i++) {
			System.out.printf("arr3[%d] : %s, ", i, arr3[i]);
		}
		System.out.println("\n");

	}

}
