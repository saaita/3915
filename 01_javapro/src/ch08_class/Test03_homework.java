package ch08_class;
import java.util.Scanner;

public class Test03_homework {
	public static void main(String[] args) {
		// �ֹι�ȣ�� �Է� �޾� �������� �������� �����Ͽ� ����Ͻÿ�
		// (���ڿ�)�Է� �ް� : �ֹι�ȣ,��ȭ��ȣ,�����ȣ
		Scanner scanner=new Scanner(System.in);
		System.out.print("�ֹι�ȣ �Է�>>");
		String juminNo=scanner.next();
		//
		String no=juminNo.substring(7,8);
		//System.out.println("no:"+no);
		
		if(no.equals("1")||no.equals("3")){
			System.out.println(juminNo+"\n����");
		}else if(no.equals("2")||no.equals("4")){
			System.out.println(juminNo+"\n����");
		}
		
		//------------
		//���ڿ��� ���ڷ� ��ȯ
		//-------------
		int num=Integer.parseInt(no);//**************
		//System.out.println("num:"+num);
		if(num==1 || num==3){
			System.out.println(juminNo+"����");
		}else if(num==2 || num==4){
			System.out.println(juminNo+"����");
		}
		
		// switch~case
		switch(num){
		case 1:
		case 3:
			System.out.println(juminNo+"����case");
			break;
		case 2:
		case 4:
			System.out.println(juminNo+"����case");
		}//switch-end

		
		//�Է� �޾� ���
		// 881219-1
		// 881219-2
		// 221219-3
		// 221219-4
	}//main-end
}//class-end
