package day09;

import java.util.*;

public class MethodTestMain {
	public static void main(String[] args) {
		
		MethodTest method = new MethodTest("ȫ�浿", 100, 90, 80);
		
		
		// result �޼ҵ带 ȣ���ϸ� (method.result();)
		// name, list, arr 3���� ����
		
		HashMap<String, Object> map = method.result();
		System.out.println(map.get("name"));
		System.out.println(map.get("list"));
		System.out.println(map.get("array"));
		
	}
}
