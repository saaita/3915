package ch08_class;

public class Test02 {
	public static void main(String[] args) {
		String str="banana";
		int idx=str.indexOf('a');// 1
		System.out.println("idx:"+idx);
		//
		String s="�Ѻ���� $45.67";
		//		   0123 45($��5��°)
		int idx2=s.indexOf("$45.67");
		System.out.println("idx2:"+idx2);/// 5
		System.out.println(s.substring(idx2));//$45.67
	
	
	}//main-end

}//class-end
