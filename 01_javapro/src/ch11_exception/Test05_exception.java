package ch11_exception;
//�޼���� stack ������ �����ȴ�
public class Test05_exception {
	public static void main(String[] args) {
		try{
			System.out.println("aa() ȣ�� ��");
			aa();
			System.out.println("aa() ȣ�� ��");
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("main finally��");
		}
	}//main-end

	public static void aa(){
		try{
			System.out.println("bb() ȣ�� ��");
			bb();
			System.out.println("bb() ȣ�� ��");
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("aa() finally��");
		}
	}//aa()_end

	public static void bb(){
		try{
			System.out.println("cc() ȣ�� ��");
			cc();
			System.out.println("cc() ȣ�� ��");
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("bb() finally��");
		}
	}//bb()_end

	public static void cc(){
		try{
			System.out.println("dd() ȣ�� ��");
			dd();
			System.out.println("dd() ȣ�� ��");
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("cc() finally��");
		}

	}//cc()_end
	public static void dd(){
		try{
			System.out.println("������ ��");
			int x=3;
			int y=0;
			System.out.println(x/y);//���� ���ܹ߻�
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("dd() finally��");
		}

	}//dd()_end
}//class-end
