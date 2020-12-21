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
		
		String[][] boards = new String[maxIndex][4];
		
		while(true)
		{
			System.out.println("---------------------------------------------");
			System.out.println("1.목록 | 2.생성 | 3.상세보기 | 4.수정 | 5.삭제 | 6.종료");
			System.out.println("---------------------------------------------");

			System.out.print("번호 입력 : ");
			//int selNum = Integer.parseInt(sc.nextLine());
			String selNum = sc.nextLine();
			
			if(selNum.equals("1"))
			{
				// 목록 출력
				for(int i = 0 ; i < boards.length ; i++)
				{
					for(int j = 0 ; j < boards[i].length ; j++)
					{
						System.out.print(boards[i][j] + " | ");
					}
					System.out.println();
				}
			}
			else if(selNum.equals("2"))
			{
				// 새로운 게시물 입력받아 저장 게시물 번호는 nextBno의 값으로 저장 , 게시물의 저장 위치는 게시물 번호가 null인 곳을 찾아서 저장, 제목, 내용, 글쓴이 저장
				System.out.print("제목을 입력하세요 : ");
				String title = sc.nextLine(); // 제목
				System.out.print("내용을 입력하세요 : ");
				String content = sc.nextLine(); // 내용
				System.out.print("작가을 입력하세요 : ");
				String writer = sc.nextLine(); // 글쓴이
				
				
				for(int i = 0 ; i < boards.length ; i++)
				{
					if(boards[i][0] == null)
					{
						for(int j = 0 ; j < boards[i].length ; j++)
						{
							boards[i][0] = Integer.toString(nextBno);
							boards[i][1] = title;
							boards[i][2] = content;
							boards[i][3] = writer;
							//System.out.print(boards[i][j] + " | ");
						}
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
					if(printNum.equals(boards[i][0]))
					{
						for(int j = 0 ; j < boards[0].length ; j++)
						{
							System.out.print(boards[i][j] +" | ");
						}
						System.out.println();
						break;
					}					
				}
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
					if(modiNum.equals(boards[i][0]))
					{
						for(int j = 0 ; j < boards[0].length ; j++)
						{
							boards[i][1] = modiTi; // 수정된 제목 저장 
							boards[i][2] = modiCo; // 수정된 내용 저장
						}
						System.out.println();
						break;
					}
				}
			}
			else if(selNum.equals("5"))
			{
				// 해당 인덱스 게시물 삭제
				System.out.print("삭제할 인덱스 번호를 입력하세요 : ");
				String delNum = sc.nextLine();
				
				for(int i = 0 ; i < boards.length ; i++)
				{
					if(delNum.equals(boards[i][0]))
					{
						boards[i][0] = null; // 인덱스
						boards[i][1] = null; // 제목
						boards[i][2] = null; // 내용 
						boards[i][3] = null; // 글쓴이
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
