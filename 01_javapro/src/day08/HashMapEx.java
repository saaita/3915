package day08;
import java.util.*;

public class HashMapEx {
	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list
		= new ArrayList<HashMap<String, Object>>();

		Scanner s = new Scanner(System.in);

		for(int i=0; i<3; i++){
			HashMap<String, Object> map = 
					new HashMap<String, Object>();
			System.out.println((i+1) + "번째 사용자 정보 입력");

			System.out.print("이름 : ");
			map.put("name", s.next());

			System.out.print("나이 : ");
			map.put("age", s.nextInt());

			System.out.print("성별 : ");
			map.put("gender", s.next());

			System.out.print("주소 : ");
			map.put("addr", s.next());
			list.add(map);
		}

		for(int i=0; i<list.size(); i++){
			System.out.print("이름 : " + list.get(i).get("name"));
			System.out.print(", 나이 : " + list.get(i).get("age"));
			System.out.print(", 성별 : " + list.get(i).get("gender"));
			System.out.print(", 주소 : " + list.get(i).get("addr"));
			System.out.println();
		}//			HashMap<String, Object> map = list.get(i);
		//		System.out.print("이름 : " + map.get("name"));
		//		System.out.print(", 나이 : " + map.get("age"));
		//		System.out.print(", 성별 : " + map.get("gender"));
		//		System.out.print(", 주소 : " + map.get("addr"));
		//		System.out.println();
	}
}
