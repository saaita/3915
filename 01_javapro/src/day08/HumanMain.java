package day08;
import java.util.*;

public class HumanMain {
	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list
		= new ArrayList<HashMap<String, Object>>();
		
		HashMap<String, Human> map = new HashMap<>();
		//�̸� : ȫ�浿 , ���� : 30, �ּ�:����
		Human hong = new Human("ȫ�浿", 30, "����");
		map.put("ȫ�浿", hong);
		//�̸�:���缮,����:40,�ּ�:��õ
		map.put("���缮", new Human("���缮",40,"��õ"));
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
//		//ó���� ȫ�浿, �״��� ���缮 ����
//		//��ĳ�ʷ� ���� �Է¹޾� javascore ä���
//		Scanner s = new Scanner(System.in);
//		hong = map.get("ȫ�浿");
//		hong.setjavaScore(s.nextInt());
//		
//		map.put("ȫ�浿", hong);
		
		
		
		
		String addr = map.get("ȫ�浿").getAddr();
		System.out.println(addr);
	}
}
