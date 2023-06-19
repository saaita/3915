package ch11_exception;
//메서드는 stack 영역에 보관된다
public class Test05_exception {
	public static void main(String[] args) {
		try{
			System.out.println("aa() 호출 전");
			aa();
			System.out.println("aa() 호출 후");
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("main finally절");
		}
	}//main-end

	public static void aa(){
		try{
			System.out.println("bb() 호출 전");
			bb();
			System.out.println("bb() 호출 후");
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("aa() finally절");
		}
	}//aa()_end

	public static void bb(){
		try{
			System.out.println("cc() 호출 전");
			cc();
			System.out.println("cc() 호출 후");
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("bb() finally절");
		}
	}//bb()_end

	public static void cc(){
		try{
			System.out.println("dd() 호출 전");
			dd();
			System.out.println("dd() 호출 후");
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("cc() finally절");
		}

	}//cc()_end
	public static void dd(){
		try{
			System.out.println("나누기 전");
			int x=3;
			int y=0;
			System.out.println(x/y);//연산 예외발생
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("dd() finally절");
		}

	}//dd()_end
}//class-end
