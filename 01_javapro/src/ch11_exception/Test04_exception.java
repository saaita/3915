package ch11_exception;
//throw : 예외 생성
//throws : 예외가 발생하면 메서드를 호출한 그 곳으로 제어권을 넘긴다

public class Test04_exception {
	public static void main(String[] args) {
		int jumsu[]={66,77,88,99,100};
		
		try{
			double avg=Jumsu.calcAvg(jumsu);//메서드호출
			System.out.println("평균"+avg);
			
		}catch(JumsuException e){
			System.out.println(e);
		}
	}//main-end
}//class-end
//-----------
class Jumsu{
	public static double calcAvg(int []score) throws JumsuException{
		if(score.length !=5){//예외발생조건
			//예외발생
			throw new JumsuException("배열 예외~~~");//예외 발생
		}//if-end
		
		//정상처리
		int sum=0;
		for(int i=0; i<score.length; i++){
			sum+=score[i];
		}//for-end
		double a=(double)sum/score.length;
		return a;
	}//calcAvg()-end
}//class-end
//---------------------------------
class JumsuException extends Exception{
	//생성자
	public JumsuException(String msg){
		//생성자
		super(msg);//상위클래스 생성자 호출
	}
}


