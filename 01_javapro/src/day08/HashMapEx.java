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
			System.out.println((i+1) + "��° ����� ���� �Է�");

			System.out.print("�̸� : ");
			map.put("name", s.next());

			System.out.print("���� : ");
			map.put("age", s.nextInt());

			System.out.print("���� : ");
			map.put("gender", s.next());

			System.out.print("�ּ� : ");
			map.put("addr", s.next());
			list.add(map);
		}

		for(int i=0; i<list.size(); i++){
			System.out.print("�̸� : " + list.get(i).get("name"));
			System.out.print(", ���� : " + list.get(i).get("age"));
			System.out.print(", ���� : " + list.get(i).get("gender"));
			System.out.print(", �ּ� : " + list.get(i).get("addr"));
			System.out.println();
		}//			HashMap<String, Object> map = list.get(i);
		//		System.out.print("�̸� : " + map.get("name"));
		//		System.out.print(", ���� : " + map.get("age"));
		//		System.out.print(", ���� : " + map.get("gender"));
		//		System.out.print(", �ּ� : " + map.get("addr"));
		//		System.out.println();
	}
}
