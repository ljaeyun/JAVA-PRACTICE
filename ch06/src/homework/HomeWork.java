package homework;

import java.util.Scanner;

public class HomeWork 
{

	public static void main(String[] args) 
	{
		int maxIndex = 10; // 게시물 수
		
		Scanner sc = new Scanner(System.in);
		//게시물을 새로 저장할때마다 1씩 증가 되어야 한다.
		int nextBno = 1;
		
		//String[][] boards = new String[maxIndex][4];
		
		Board[] boards = new Board[maxIndex];
		
		//초기화
		for(int i = 0 ; i < maxIndex ; i++)
		{
			boards[i] = new Board();
		}
		

		while(true)
		{
			System.out.println("---------------------------------------------");
			System.out.println("1.목록 | 2.생성 | 3.상세보기 | 4.수정 | 5.삭제 | 6.종료");
			System.out.println("---------------------------------------------");

			System.out.print("번호 입력 : ");
			//int selNum = Integer.parseInt(sc.nextLine());
			String selNum = sc.nextLine();  // 문자열로 입력받아 비교
			
			if(selNum.equals("1"))
			{
				// 목록 출력
				
				System.out.println("번호 \t 제목 \t 내용 \t 작가");
				System.out.println("------------------------------");
				for(int i = 0 ; i < boards.length ; i++)
				{
					Board board = boards[i]; // 새로운 객체 선언
					System.out.print(board.getBno() + "\t");
					System.out.print(board.getBti() + "\t");
					System.out.print(board.getBcont() + "\t");
					System.out.print(board.getBwri() + "\t");
					System.out.println();
				}
					System.out.println();
				
			}
			else if(selNum.equals("2"))
			{
				// 새로운 게시물 입력받아 저장 게시물 번호는 nextBno의 값으로 저장 , 게시물의 저장 위치는 게시물 번호가 0인 곳을 찾아서 저장, 제목, 내용, 글쓴이 저장
				System.out.print("제목을 입력하세요 : ");
				String title = sc.nextLine(); // 제목
				System.out.print("내용을 입력하세요 : ");
				String content = sc.nextLine(); // 내용
				System.out.print("작가을 입력하세요 : ");
				String writer = sc.nextLine(); // 글쓴이
				
				
				for(int i = 0 ; i < boards.length ; i++)
				{
					if(boards[i].getBno()== 0)
					{
						Board board = new Board();
						board.setBno(nextBno);
						board.setBti(title);
						board.setBcont(content);
						board.setBwri(writer);
						boards[i] = board;
						nextBno++;
						break;
					}
					//System.out.println();
				}
			
			}
			else if(selNum.equals("3"))
			{
				// 해당 인덱스의 게시물을 출력
				System.out.print("정보 상세보기할 번호를 입력하세요 : ");
				String printNum = sc.nextLine();
				for(int i = 0 ; i < boards.length ; i++)
				{
					Board board = boards[i]; // 새로운 객체 선언
					if(printNum.equals(Integer.toString(board.getBno())))
					{
						System.out.println("번호 \t 제목 \t 내용 \t 작가");
						System.out.println("------------------------------");
						System.out.print(board.getBno() + "\t");
						System.out.print(board.getBti() + "\t");
						System.out.print(board.getBcont() + "\t");
						System.out.print(board.getBwri() + "\t");
					}
				}
				System.out.println();
			}
			else if(selNum.equals("4"))
			{
				// 인덱스 번호를 입력 받아서 해당 인덱스의제목과 내용을 입력받고 수정
				System.out.print("수정할 인덱스 번호를 입력하세요 : ");
				String modiNum = sc.nextLine(); // 수정할 인덱스 번호
				
				System.out.print("수정할 제목을 입력하세요 : ");
				String modiTi = sc.nextLine(); // 수정할 제목
				System.out.print("수정할 내용을 입력하세요 : ");
				String modiCo = sc.nextLine(); // 수정할 내용
				for(int i = 0 ; i < boards.length ; i++)
				{
					Board board = boards[i]; // 새로운 객체 선언
					if(modiNum.equals(Integer.toString(board.getBno())))
					{
						board.setBti(modiTi);
						board.setBcont(modiCo);
					}
						//break;
				}
			}
			else if(selNum.equals("5"))
			{
				// 해당 인덱스 게시물 삭제
				System.out.print("삭제할 인덱스 번호를 입력하세요 : ");
				String delNum = sc.nextLine();
				
				for(int i = 0 ; i < boards.length ; i++)
				{
					Board board = boards[i];
					if(delNum.equals(Integer.toString(board.getBno())))
					{
						boards[i]= new Board(); 
						break;
					}
				}
			}
			else if(selNum.equals("6"))
			{
				break;
			}
			else
			{
				System.out.println("잘못 입력하였습니다");
			}
		}
		
		System.out.println("프로그램을 종료합니다");
	}

}
