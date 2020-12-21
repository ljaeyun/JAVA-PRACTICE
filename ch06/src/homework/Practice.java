package homework;

public class Practice 
{

	public static void main(String[] args) 
	{
		Board[] boards = new Board[100];
		
		//새로운 게시물 저장
		Board board0 = new Board();  // board 객체 생성
		board0.setBno(1);
		board0.setBti("제목1");
		board0.setBcont("내용1");
		board0.setBwri("글쓴이1");    // 힙에 board 객체 생성  힙의 0번째 주소를 board 객체와 같은 주소 참조하도록 한다
		
		Board board1 = new Board();  // board 객체 생성
		board1.setBno(2);
		board1.setBti("제목2");
		board1.setBcont("내용2");
		board1.setBwri("글쓴이2");
		
		Board board2 = new Board();  // board 객체 생성
		board2.setBno(3);
		board2.setBti("제목3");
		board2.setBcont("내용3");
		board2.setBwri("글쓴이3");
		
	
		boards[0] = board0;
		boards[1] = board1;
		boards[2] = board2;
	
		
		//게시물 삭제
		boards[0] = null;
		boards[1] = null;
		boards[2] = null;
		
		//게시물 번호가 2번 게시물 삭제
		for(int i = 0 ; i < boards.length ; i++)
		{
			Board board = boards[i]; // 새로운 객체 선언
			if(board.getBno() == 2)
			{
				boards[i] = null;  // 메모리 주소값을 삭제하면서 쓰레기 객체로 만든다
			}
		}
		
		
		//게시물 번호가 2번 게시물 수정
		for(int i = 0 ; i < boards.length ; i++)
		{
			Board board = boards[i]; // 새로운 객체 선언
			if(board.getBno() == 2)
			{
				board.setBti("수정된 제목");
				board.setBcont("수정된내용");
			}
		}
		
		
		//게시물 목록 보기
		System.out.println("--------------------------");
		for(int i = 0 ; i < boards.length ; i++)
		{
			Board board = boards[i]; // 새로운 객체 선언
			System.out.print(board.getBno() + "\t");
			System.out.print(board.getBti() + "\t");
			System.out.print(board.getBcont() + "\t");
			System.out.print(board.getBwri() + "\t");
			System.out.println();
		}
		System.out.println("--------------------------");

	}

}
