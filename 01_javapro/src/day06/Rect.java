package day06;

public class Rect {
	private int width;
	private int height;
	public Rect(int width, int height) {
		this.width = width; 
		this.height = height;
	}
		public boolean equals(Object obj) {
			Rect rect = (Rect)obj;
			if (width*height == rect.width*rect.height) 
			return true;
			else 
			return false;

	}

}
