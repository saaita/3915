package ch02_datatype;

public class Test05 {
public static void main(String[] args) {
	
	int a=10;
	System.out.println(Integer.toBinaryString(a));
	System.out.println(Integer.toOctalString(a));	
	System.out.println(Integer.toHexString(a));
	//
	//
	int b=014;//8��
	System.out.println(b);//10��
	
	int c=0xa;//16��
	System.out.println(c);//10��
	}//main-end
}//class-end
