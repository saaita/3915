package day07;
import java.util.*;


public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		// Scanner�� ���ڿ��� 5�� �Է¹޾Ƽ� ArrayList ��ü�� ����
		Scanner s = new Scanner(System.in);
		for(int i=0; i<5; i++){
			System.out.print((i+1) + "��° ���� �Է� : ");
			list.add(s.next());
		}

		// ArrayList ��ü�� �ִ� ���ڿ� ���
		//		for(int i=0; i<list.size(); i++){
		//			System.out.println(list.get(i));
		//		}

		// ���� �� ���ڿ� ã�Ƽ� ���
		String str = "";
		for(int i=0; i<list.size(); i++){
			if(str.length() < list.get(i).length()){
				str = list.get(i);
			}
		}
		for(int i=0; i<list.size(); i++){
			if(str.length() == list.get(i).length()){
				System.out.println(list.get(i));
			}
		}
	}
}
//		int len = 0;
//		for(int i=0; i<list.size(); i++){
//			if(len < list.get(i).length()){
//				len = list.get(i).length();
//			}
//		}
//		for(int i=0; i<list.size(); i++){
//			if(len == list.get(i).length()){
//				System.out.println(list.get(i));
//			}
//		}
