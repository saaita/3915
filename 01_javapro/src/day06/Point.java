package day06;

public class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;

	}
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}

	//new Point(2, 5);
	//new Point(1, 6);
	//x와y의 값 합이 같으면 true return
	public boolean equals(Object p) {
		Point obj = (Point)p;
		if((x+y) == (obj.x+obj.y)){
			return true;
		}else{
			return false;
		}

	}

}
