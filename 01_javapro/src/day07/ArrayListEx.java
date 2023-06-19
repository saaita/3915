package day07;
import java.util.*;


public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		// Scanner로 문자열을 5개 입력받아서 ArrayList 객체에 저장
		Scanner s = new Scanner(System.in);
		for(int i=0; i<5; i++){
			System.out.print((i+1) + "번째 문자 입력 : ");
			list.add(s.next());
		}

		// ArrayList 객체에 있는 문자열 출력
		//		for(int i=0; i<list.size(); i++){
		//			System.out.println(list.get(i));
		//		}

		// 가장 긴 문자열 찾아서 출력
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
