package day08;
import java.util.*;

public class HumanMain {
	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list
		= new ArrayList<HashMap<String, Object>>();
		
		HashMap<String, Human> map = new HashMap<>();
		//이름 : 홍길동 , 나이 : 30, 주소:서울
		Human hong = new Human("홍길동", 30, "서울");
		map.put("홍길동", hong);
		//이름:유재석,나이:40,주소:인천
		map.put("유재석", new Human("유재석",40,"인천"));
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
//		//처음에 홍길동, 그다음 유재석 접근
//		//스캐너로 점수 입력받아 javascore 채우기
//		Scanner s = new Scanner(System.in);
//		hong = map.get("홍길동");
//		hong.setjavaScore(s.nextInt());
//		
//		map.put("홍길동", hong);
		
		
		
		
		String addr = map.get("홍길동").getAddr();
		System.out.println(addr);
	}
}
