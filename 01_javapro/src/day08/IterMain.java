package day08;
import java.util.*;
public class IterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		
		// v ��ü�� ���� 5���ֱ�
		
		v.add(1);
		v.add(4);
		v.add(6);
		v.add(7);
		v.add(8);
		
		Iterator<Integer> it = v.iterator();
		// [5,2,4,6,1]
		// it��ġ  => -1
		while(it.hasNext()){//hasNext -1 ���ͽ��� (�湮��Ұ������� ����) = 0���� ������ ���
			
			System.out.println(it.next());
		}
		// ArrayList<String>����
		// ���ڿ�5�� ��ĳ�ʷ� �Է� �޾Ƽ� ����
		// Iterator ��ü�� ���ؼ� ���
		
		ArrayList<String> list= new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		
		Iterator<String> its = list.iterator();
		for(int i=0; i<5; i++){
			System.out.println("�Է�:");
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
