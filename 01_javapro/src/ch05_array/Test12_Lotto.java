package ch05_array;
//로또 : 1~45  6개
public class Test12_Lotto {
	public static void main(String[] args) {
		int lotto[]=new int[6];//선언동시에 생성


		//로또값 발생
		for(int i=0; i<6; i++){
			lotto[i]=(int)(Math.random()*45+1);

			//중복값 해결하기
			for(int j=0; j<i; j++){
				if(lotto[i]==lotto[j]){//같은값이면, 지금 발생된 값 무효화
					i--;
					break;//안쪽 for블럭 탈출

				}//if
			}//inner-for

		}//out-for
		//출력
		for(int i=0; i<6; i++){
			System.out.print(lotto[i]+" ");
		}//for-end
	}//main-end
}//class-end
