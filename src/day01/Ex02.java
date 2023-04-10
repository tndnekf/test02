package day01;

public class Ex02 {
	public static void main(String[] args) {
		
		/*
		 escape문자
		 - 문자열 안에서 특수한 기능을 하는것.
		 - 문자열은 " " (큰따옴표)로 묶여있는 값들
		 - \n : 엔터와 비슷하다.
		 - \t : tab(스페이스바 8칸정도)많큼 오른쪽 이동
		 - \\ : \ 하나 표현
		 - \" : " 하나 표현
		 */
		
		System.out.println("안\n녕\n하\n세\n요");
		System.out.println("1\t1234567\t12345678\t1");
		System.out.println("이름\t나이");
		System.out.println("홍킬동\t20살");
		
		System.out.println(" \\ ");
		System.out.println("D:\\오전 취업반_정보처리산업기사 취득과정 A\\JAVA\\workspace\\day01\\src");
		
		System.out.println(" \" ");
		System.out.println("D:\\새 폴더");
		
	}

}
