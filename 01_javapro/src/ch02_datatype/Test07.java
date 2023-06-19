package ch02_datatype;

public class Test07 {
	public static void main(String[] args) {
		final int MAX=100;//변수를 상수화 해서 값변경안됨
		System.out.println(MAX);
		
	//MAX=1000;//에러, 값변경 못함
		System.out.println(Math.PI);
	}//main-end
}//class-end
