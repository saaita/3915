package day09;
import java.util.*;

public class CollectionsEx {

	static void printList(ArrayList<Integer> list){
		Iterator<Integer> it = list.iterator();
		//Scanner s = new Scanner(System.in);
		while(it.hasNext()){
			//int a = s.nextInt();
			
			
			while(it.hasNext()){
				int b = it.next();
				String c;
				if(it.hasNext())
					c = "->";
				else
					c = "\n";
				System.out.println(b+c);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<5; i++){
			System.out.println("입력 : ");
			list.add(s.nextInt());
		}
		Collections.sort(list);
		printList(list);
		System.out.println("찾는위치:");
		int index = Collections.binarySearch(list, s.nextInt())+1;//정렬을하고 찾기
		System.out.println(index);
		
		
		
		
		
		
		
		
	}
}
