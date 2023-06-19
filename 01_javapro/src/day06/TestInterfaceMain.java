package day06;

public class TestInterfaceMain implements TestInterface{

	@Override
	public int Add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int Sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int Mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int Div(int a, int b) {
		// TODO Auto-generated method stub
		/*try{
			int c = a/b;
		}catch(Exception e){
			
		}*/
		return a/b;
	}

}
