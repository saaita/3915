package day07;
import java.util.*;

public class HashMapEx {
	public static void main(String[] args) {
		
		HashMap<String, Integer> scoreMap =
				new HashMap<String, Integer>();
		
		scoreMap.put("�輺��", 97);
		scoreMap.put("Ȳ����", 88);
		scoreMap.put("�賲��", 98);
		scoreMap.put("���繮", 70);
		scoreMap.put("�ѿ���", 99);
		scoreMap.put("�ѿ���", 99);
		
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("�̸��� �Է��ϼ��� : ");
			String name = s.nextLine();
			if(scoreMap.containsKey(name)){
				System.out.println(scoreMap.get(name));
			}else{
				System.out.println("�׷� ��� ����");
			}
		}

		
		
	}
}
