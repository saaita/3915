package day08;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list
		= new ArrayList<HashMap<String, Object>>();
	Scanner s = new Scanner(System.in);
	while(true){
		System.out.print("(1)입력, (2)삭제, (3)출력, (4)종료 : ");
		int num = s.nextInt();
		if(num == 1){
			HashMap<String, Object> map = 
					new HashMap<String, Object>();
			System.out.println("사용자 정보 입력");
			System.out.print("이름 : ");
			map.put("name", s.next());
			System.out.print("나이 : ");
			map.put("age", s.nextInt());
			System.out.print("주소 : ");
			map.put("addr", s.next());
			
			list.add(map);
		} else if(num == 2){
			System.out.println("삭제할 사용자 이름 입력 : ");
			String name = s.next();
			for(int i=0; i<list.size(); i++){
				HashMap<String, Object> map = list.get(i);
				if(map.get("name").equals(name)){
					list.remove(i);
				}
			}
		} 
		} 
	}
}

