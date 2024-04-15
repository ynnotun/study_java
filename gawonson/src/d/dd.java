package d;

import java.util.Scanner;

public class dd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 금액(money) 입력
		 * 로또 6자리 :1~45까지의 중복되지 않은 숫자
		 * 로또금액 입력? 800 금액이 부족합니다
		 * 로또 금액입력?0 종료합니다
		 * 로또금액 이벽? 3000
		 * 1회: 4	5	1	6	...
		 * ..
		 * 3회: 4	9	...
		 * 로또금액 입력
		 *중복 x, 정렬 
		 */
		Scanner sc=new Scanner(System.in);
		int []lotto=new int[6];
		int money;
		while(true) {
			System.out.println("로또 금액 입력(종료:0)");
			money=sc.nextInt();
			if(money==0)
				break;
			if(money<1000) {
				System.out.println("부족한 금액입니다");
				continue;

			}

			if(money!=0)
			{
				for(int b=0;b<money/1000;b++) {
					Loop:

						for(int i=0;i<lotto.length;i++)
						{
							lotto[i]=(int)(Math.random()*45)+1;

							// 중복처리
							for(int j=0;j<i;j++) 
							{
								if(lotto[i]==lotto[j])
								{
									i--;
									continue Loop;
								}
							}
						}
					//정렬
					for (int i=0; i<lotto.length-1;i++) {
						for(int j=i+1;j<lotto.length;j++) {
							if(lotto[i]>lotto[j])
							{
								int a=lotto[i];
								lotto[i]=lotto[j];
								lotto[j]=a;
							}
						}
					}
					System.out.printf("%2d 회: ",b+1);
					for (int n:lotto) 
						System.out.printf("%3d",n);
					System.out.println();

				}
			}
			//프린트



		}
	}
}




