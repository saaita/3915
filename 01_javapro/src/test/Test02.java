package test;

public class Test02 {
	public static void main(String[] args) {
		for(int i = 2; i<10; i++){
			for(int j = 1; j<10; j++){
				if(i==5){
					break;
				}
				System.out.println(i+"´Ü"+i+"X"+j);
			}
		}
		
	}
}
