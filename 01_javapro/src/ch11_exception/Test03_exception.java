package ch11_exception;
import java.io.*;

public class Test03_exception {
	public static void main(String[] args) {
		try{
			Runtime r=Runtime.getRuntime();//���� ���� ������ ��
			//r.exec("C:\\WINDOWS\\system32\\notepad.exe");//���� ����
			//r.exec("C:\\WINDOWS\\system32\\calc.exe");//���� ����
			//r.exec("C:\\Program Files\\Windows NT\\Accessories\\wordpad.exe");//���� ����
			//r.exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe https://www.naver.com");
		}catch(Exception e){
			System.out.println("����:"+e);
		}

	}//main-end
}//class-end
