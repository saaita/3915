package ch04_control;

public class Test01 {
	public static void main(String[] args) {
		int x=6;
		int y=7;
		if(x>20){
			int z=++x + y;
		}
	//	System.out.println(z);//error
		
		//에러발생 이유
		//z변수는 if블럭안에서 지역변수로 선언되었기 때문에 
		//if블럭을 벗어나면 z변수는 사용할수없다.
	}//main-end
}//class-end
