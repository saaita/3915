package day03;

public class Mun01 {
	public static void main(String[] args) {

		for(int i=2; i<10; i++){
			System.out.println(i+"단");
			for(int j=1; j<10; j++){
				if(i == 5){
					continue;
				}else{
					System.out.println(i+"X"+j+"="+i*j);
				}
				
			}
		}
		
	}//main-end
}//class-end


//1. 구구단에서 5단을 제외하고 출력
//2. 5개의 숫자를 입력받아서 배열 만들기. 단, 홀수만 들어가도록
//3. {5, 3, 10, 2, 9, 8}
//	오름차순 정렬하기. 단, 홀수먼저 정렬하고 짝수 정렬
//	ex) {3, 5, 9, 2, 8, 10}
//	-> Arrays.sort() 써도 됨
//	-> 홀수, 짝수의 개수는 같다고 가정
//4. Calculator 클래스 생성
//	1. 두개의 정수를 매개변수로 받아서 곱한 값을 리턴해주는 multiple 메소드 생성
//	2. 3개의 정수를 입력받아서 곱한 값을 리턴해주는 multiple 메소드 생성
//	3. 4개의 실수(double)를 입력받아서 가장 큰 값을 리턴해주는 max 메소드 생성