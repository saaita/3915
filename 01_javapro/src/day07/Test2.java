package day07;

import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);

		for(int i=0; i<5; i++){
			System.out.println((i+1)+"번 숫자입력 : ");
			list.add(s.nextInt());

		}
		int max = 0;
		int min = 0;

		for(int i=0; i<list.size(); i++){
			if(list.get(max) < list.get(i)){
				max = i;
			}if(list.get(min) > list.get(i)){
				min = i;
			}	

		}

		int temp = list.get(max);
		list.add(max, list.get(min));
		list.remove(max+1);

		list.add(min, temp);
		list.remove(min+1);
		for(int i=0; i<list.size(); i++){

			System.out.print(list.get(i));
		}

	}
}
