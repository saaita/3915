package ch02_datatype;

public class Test05 {
public static void main(String[] args) {
	
	int a=10;
	System.out.println(Integer.toBinaryString(a));
	System.out.println(Integer.toOctalString(a));	
	System.out.println(Integer.toHexString(a));
	//
	//
	int b=014;//8진
	System.out.println(b);//10진
	
	int c=0xa;//16진
	System.out.println(c);//10진
	}//main-end
}//class-end
