package study0401;

public class book173 {
	public static void main(String[] args) 
	{
		int[] arr1 = new int[3]; //arr1 배열 선언과 동시에 int형 타입의 배열공간 3개 할당

		for(int i = 0; i < 3; i++)// i = 0부터 0,1,2순으로 i를 1씩 증가시키며 반복수행
		{
			System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");//arr1[0],arr1[1],arr1[2] 출력
		}
		//출력 결과 : arr1[0] : 0, arr1[1] : 0, arr1[2] : 0,
		//결과가 전부 0이 나오는 이유 : 할당만 했지 원소를 저장하지는 않음
		//지역변수의 경우 초기값을 지정하지 않으면 쓰레기값이 들어있어서 초기화하기 전까지는 사용이 불가능하다. static 변수는 0으로 자동 초기화된다.
		//자바에서 배열은 초기값이 0으로 바로 지정된다.
		System.out.println();//줄넘김

		arr1[0] = 10;//arr1[0]를 10으로 초기화
		arr1[1] = 20;//arr1[1]를 20으로 초기화
		arr1[2] = 30;//arr1[2]를 30으로 초기화

		for(int i = 0; i < 3; i++)// i = 0부터 0,1,2순으로 i를 1씩 증가시키며 반복수행
		{
			System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");//arr1[0],arr1[1],arr1[2] 출력
		}
		//출력 결과 : arr1[0] : 10, arr1[1] : 20, arr1[2] : 30,
		System.out.println("\n");//줄넘김

		//===============================================================================================================
		double[] arr2 = new double[3];//arr2 배열 선언과 동시에 double형 타입의 배열공간 3개 할당
		for(int i = 0; i < 3; i++)// i = 0부터 0,1,2순으로 i를 1씩 증가시키며 반복수행
		{
			System.out.print("arr2[" + i + "] : " + arr2[i] + ", "); //arr2[0] : 0.0, arr2[1] : 0.0, arr2[2] : 0.0, 
		}
		//위에 arr1과 동일하게 arr2 또한 각 배열공간은 선언과 동시에 0.0으로 초기화됨
		System.out.println();

		arr2[0] = 0.1;//arr2[0]를 0.1로 초기화
		arr2[1] = 0.2;//arr2[1]를 0.2로 초기화
		arr2[2] = 0.3;//arr2[2]를 0.3로 초기화
		for(int i = 0; i < 3; i++)// i = 0부터 0,1,2순으로 i를 1씩 증가시키며 반복수행
		{
			System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");// arr2[0], arr2[1], arr2[2] 출력
		}
		//출력 결과 : arr2[0] : 0.1, arr2[1] : 0.2, arr2[2] : 0.3, 
		System.out.println("\n");

		//===============================================================================================================
		String[] arr3 = new String[3];//String 타입의 배열 선언과 동시에 String형 배열공간 3개 할당
		for(int i = 0; i < 3; i++)// i = 0부터 0,1,2순으로 i를 1씩 증가시키며 반복수행
		{
			System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");//arr3[0], arr3[1], arr3[2] 출력
		}
		//출력결과 : arr3[0] : null, arr3[1] : null, arr3[2] : null
		//수 타입의 배열은 초기값이 0, 0.0 등으로 지정되지만, 문자열, 문자 타입의 배열은 null로 초기화된다.
		//null로 초기화 되기 때문에 문자타입은 출력하면 공백문자 ' '가 출력된다.
		//문자열은 null이 출력된다.
		System.out.println();//줄넘김

		//		char []c = new char[3];
		//		System.out.println(c[1]);
		//		String []s = new String[3];
		//		System.out.println(s[1]);

		arr3[0] = "1월";//arr3[0]에 "1월" 저장
		arr3[1] = "2월";//arr3[1]에 "2월" 저장
		arr3[2] = "3월";//arr3[2]에 "3월" 저장

		for(int i = 0; i < 3; i++)// i = 0부터 0,1,2순으로 i를 1씩 증가시키며 반복수행
		{
			System.out.print("arr3[" + i + "] : " + arr3[i] + ", "); //arr3[0], arr3[1], arr3[2] 출력
		}
		//출력결과 : arr3[0] : 1월, arr3[1] : 2월, arr3[2] : 3월, 
	}
}
