package ch05_array;
//Math
//주사위 나올수 있는 가지수 :6
//int a=(int)(Math.random()*6+1)
//int a=(int)(Math.random()*가짓수+나올수있는 가장작은수)
//int a=(int)(Math.random()*(큰수-작은수)+1)

//Math.random() : 0<x<1 실 수 발생, 1970년 1월 1일 0시 0분 0초 기준으로 발생
//난수 발생 검색

//10~100임의의 수 구하기

public class Test11_Math {
	public static void main(String[] args) {
		//주사위를 10개발생
		for(int i=1; i<=10; i++){
			int a=(int)(Math.random()*6+1);
			System.out.println(a+" ");
		}//for-end
		//실행
		System.out.println();
		//임의의 난수 출력
		for(int i=1; i<=10; i++){
			System.out.println(Math.random());
		}//for-end
		System.out.println();
		//
		//10~100 임의의 수 구하기
		for(int i=1; i<=10; i++){
			int a=(int)(Math.random()*(100-10+1)+10);
			System.out.print(a+" ");
		}//for-end
		
		
	}//main-end
}//class-end
