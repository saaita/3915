package ch09_interface;

public class BoardImpl implements Board{

	//오버라이딩
	public void boardWrite() {
		System.out.println("게시판 글쓰기");
	}


	public void boardList() {
		System.out.println("글목록 보기");
	}


	public void boardContent() {
		System.out.println("글내용 보기");
	}


	public void boardEdit() {
		System.out.println("게시판 글수정");
	}


	public void boardDelete() {
		System.out.println("게시판 글삭제");
	}


}//class-end
