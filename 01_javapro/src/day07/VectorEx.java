package day07;
import java.util.Vector;


public class VectorEx {
	public static void main(String[] args) {
		// ���� ���� �ٷ�� ���׸� ���� ����
		Vector<Integer> v = new Vector<Integer>(); 
		v.add(5); // 5 ���� - 0
		v.add(4); // 4 ���� -1 
		//v.add(100); - 2
		//v.add 70 3
		//v.add 80 4
		v.add(-1); // -1 ���� -5
		// ���� �߰��� �����ϱ�
		v.add(2, 100); // 4�� -1 ���̿� ���� 100 ����
		v.add(2, 70);
		v.add(2, 80);
		v.add(3, 90);
		System.out.println("���� ���� ��� ��ü �� : " + v.size()); 
		System.out.println("������ ���� �뷮 : " + v.capacity()); 
		// ��� ��� ���� ����ϱ�
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);

		}
		// ���� ���� ��� ���� ���ϱ�
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		System.out.println("���Ϳ� �ִ� ���� �� :" + sum);
	}

}
