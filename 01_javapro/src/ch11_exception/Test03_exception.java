package ch11_exception;
import java.io.*;

public class Test03_exception {
	public static void main(String[] args) {
		try{
			Runtime r=Runtime.getRuntime();//실행 파일 정보를 얻어서
			//r.exec("C:\\WINDOWS\\system32\\notepad.exe");//파일 실행
			//r.exec("C:\\WINDOWS\\system32\\calc.exe");//파일 실행
			//r.exec("C:\\Program Files\\Windows NT\\Accessories\\wordpad.exe");//파일 실행
			//r.exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe https://www.naver.com");
		}catch(Exception e){
			System.out.println("예외:"+e);
		}

	}//main-end
}//class-end
