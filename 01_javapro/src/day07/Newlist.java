package day07;
import java.util.*;

public class Newlist {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);

		for(int i=0; i<5; i++){
			System.out.println((i+1)+"번째 숫자입력 : ");
			list.add(s.nextInt());
		}
		int min = list.get(0);
		for(int i=1; i<list.size(); i++){
			if(min > list.get(i)){
				min = list.get(i);

			}
			//	Math.min(min, list.get(i));
		}
		int cnt = 0;
		for(int i=0; i<list.size(); i++){
			if(min == list.get(i)){
				cnt++;
				
			}
		}
		System.out.println("작은값 : "+min);
		System.out.println("개수 : "+cnt);
	}
}
