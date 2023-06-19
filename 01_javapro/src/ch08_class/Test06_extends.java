package ch08_class;
//수퍼클래스
class PanMaeSuper{
	//전역변수
	protected String pum;;//상품이름
	protected int su;//상품 수량
	protected int dan;//상품 단가

	//디폴트 생성자
	public PanMaeSuper(){}//{} < 넣기만하면 자동초기화

	//인자 있는 생성자
	public PanMaeSuper(String pum, int su, int dan){
		this.pum=pum;
		this.su=su;
		this.dan=dan;
	}//cons-end
	//사용자 정의 메서드
	protected void disp(){
		System.out.println("품명:"+pum);
		System.out.println("수량:"+su);
		System.out.println("단가:"+dan+"\n");
	}//disp()-end

}//class-end

//파생클래스
class PanMaeSub extends PanMaeSuper{
	private double rate;//할인률

	//디폴트 생성자
	public PanMaeSub(String pum,int su,int dan, double rate){
		super(pum,su,dan);//상위 클래스 생성자 호출
		this.rate=rate;
	}//cons-end
	//	오버로드 : 하나의 클래스 안에 메소드 이름이 같은것이 여러개 있는경우
	//	오버로드 메서드는 매개변수 자료형이 다르거나
	//		 "       매개변수 갯수가 달라야 한다
	//	리턴형은 상관없다
	
	// 오버라이딩 : 상속받은 메서드 내용 재정의
	// 리턴형, 메서드이름, 매개변수는 반드시 같아야한다.
	// 단. 접근제한자는 상위와 같거나 더 넓은 것을 사용할 수 있다
	// 상위 접근제한자가 protected이면 public도 사용가능하다
	public void disp(){
		System.out.println("품명:"+pum);
		System.out.println("수량:"+su);
		System.out.println("단가:"+dan);
		System.out.println("할인율:"+rate+"%");
		System.out.println("할인 되어져서 내가 낼 돈:"+(dan-(dan*0.2)));
		System.out.println();
	}//disp()-end
}//class-end

// 주 클래스
public class Test06_extends {
	public static void main(String[] args) {
		//관계 없는 클래스는 객체 생성하여 사용한다
		PanMaeSuper super2=new PanMaeSuper("수박",1,9900);
		super2.disp();
		//
		//상위클래스변수로 하위 객체 처리 : 자동 형변환과 유사하다
		super2=new PanMaeSub("참외",4,5000,0.2);
		super2.disp();
	}//main-end
}//class-end
