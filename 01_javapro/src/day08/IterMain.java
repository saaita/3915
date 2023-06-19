package day08;
import java.util.*;
public class IterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		
		// v 객체에 숫자 5개넣기
		
		v.add(1);
		v.add(4);
		v.add(6);
		v.add(7);
		v.add(8);
		
		Iterator<Integer> it = v.iterator();
		// [5,2,4,6,1]
		// it위치  => -1
		while(it.hasNext()){//hasNext -1 부터시작 (방문요소가있으면 리턴) = 0부터 끝까지 출력
			
			System.out.println(it.next());
		}
		// ArrayList<String>생성
		// 문자열5개 스캐너로 입력 받아서 저장
		// Iterator 객체를 통해서 출력
		
		ArrayList<String> list= new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		
		Iterator<String> its = list.iterator();
		for(int i=0; i<5; i++){
			System.out.println("입력:");
			list.add(s.next());
					
		}
		Iterator<String> it2 = list.iterator();
		while(it2.hasNext()){
		System.out.print(it2.next());
		}
		

		

		
		
//		for(int i = 0; i<v.size(); i++){
//		System.out.println(v.get(i));
//		}
		
		
	}

}
