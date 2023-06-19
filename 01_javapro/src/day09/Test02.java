package day09;
import java.util.*;

public class Test02{
	
		
		
	
	public static void main(String[] args) {
		
		
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		
		if(4 < hour && hour < 12){
			System.out.println("good morning");
		}else if (hour < 18){
			System.out.println("good afternoon");
			
		}else if (hour < 22){
			System.out.println("good Evening");
		}else{
			System.out.println("good night");
		}
		
		
	}
}
