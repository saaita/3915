package ch11_exception;
//���1 : ����ó��
public class Test01_exception {
	public static void main(String[] args) {
		try{
			int num=Integer.parseInt(args[0]);//���ڿ��� ������ ��ȯ
			
			//if(num%2==0){
			if(num%0==0){
				System.out.println(num+"�� ¦��");
			}else{
				System.out.println(num+"�� Ȧ��");
			}
		}catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("�迭���� : "+e1);
		}catch(NumberFormatException e2){
			System.out.println("���ڸ� �Է� �ϼ���."+e2);
		}catch(ArithmeticException e3){
			System.out.println("���� ���� : "+e3);
		}finally{
			System.out.println("finally���� ���� �߻��� ������� ����ȴ�");
		}
		
	}//main-end
}//class-end
// 0. �����ϸ� �迭���� �߻�
// 1. �迭���� ���ڷ� �Է��ϰ� ����
// 2. �迭�� �Է� ���� �ʰ� ����
// 3. a �����Է� �ϰ� ����
// 4. �����Է�, ���ĺ���(���꿡��)