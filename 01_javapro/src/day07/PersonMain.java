package day07;

public class PersonMain {
	//	메소드 생성(info)
	//	Person을 상속받아서 만들어진 클래스들의 객체를
	//	매개변수(파라미터)로 받는 메소드

	static void info(Person p){
		
		// Student 객체가 넘어오면 "학생입니다."문구 출력
		// -> 공부하기 메소드 출력
		
		// StudentWorker 객체가 넘어오면 "직장인 입니다." 문구 출력
		// -> 일하기 메소드 출력
		
		// Researcher 객체가 넘어오면"연구원입니다."출력
		// -> 연구하기 메소드 출력
		
		// Professor 객체가 넘어오면"교수입니다"출력
		// -> 가르치기 메소드 출력
		if(p instanceof Student){
			System.out.println("학생입니다.");
			Student s = (Student)p;
			s.study();
		}
		else if(p instanceof Worker){
			Worker obj = (Worker)p;
			obj.work();
			System.out.println("직장인 입니다.");
		}
		else if(p instanceof Researcher){
			
			System.out.println("연구원 입니다");
		}
		else if(p instanceof Professor){
			System.out.println("교수 입니다.");
		}




	}


	public static void main(String[] args) {


		//Student 객체를 Person형으로 업캐스팅

		Person s  = new Student();

		Person r = new Researcher();
		// Objdect클래스는 모든 클래스의 부모클래스 이기 때문에
		// 모든 클래스가 업캐스팅 가능하다.
		Object obj = new Professor();


	}
}
