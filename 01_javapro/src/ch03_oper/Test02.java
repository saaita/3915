package ch03_oper;
//����������
// ++ : 1���� 
// -- : 1����
// a++ : ���� ����
// ++a : ���� ����
public class Test02 {
	public static void main(String[] args) {
		int a=5;
			System.out.println(a++);// 6
		
		int b=5;
			System.out.println(++b);// 6
		
		int x=++a + b--;
		//	   7  + 6
			System.out.println("x:"+x);
		
			a=5;
		int y=++a + ++a;
		//     6(����)+������6++1
			System.out.println(y);//13 14(c����)
		
		for(int i=1; i<=10; i++){
			System.out.print(i+" ");
		}
			System.out.println();//ln
		
		for(char ch='A'; ch<='Z'; ch++){//�����ڵ尪
			System.out.print(ch);
		}
			System.out.println();//�ٹٲ�
		for(int d=65; d<=90; d++){
			System.out.print((char)d);
		}
			
	}//main-end
}//class-end
