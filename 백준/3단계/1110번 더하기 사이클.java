import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException{
	
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();//0~99 중 입력
		String s1="";
		String s2="";
		int n1=0, t=0, count=1;
		
		if(Integer.parseInt(s)<10) {//입력값이 0보다 작을 경우
			s=s+"0"; //뒤에 0 추가
		}

		s1=s; 
		
		while(true) {//초기 값과 계산결과가 일치할 때까지 반복
			//일의 자리
			n1=Character.getNumericValue(s1.charAt(1)); 

			//십의 자리 숫자+일의 자리 숫자
			t=Character.getNumericValue(s1.charAt(0))+ n1; 			
			
			//주어진 수의 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리수를 붙이기
			s2=String.valueOf(s1.charAt(1))+Integer.toString(t%10);

			if(!s2.equals(s)) {//입력값이 첫 번째 계산 결과와 다를 경우
				s1=s2; 
				count++; //사이클 횟수 1회씩 증가
				continue; //밑에 무시하고 다시 반복
			}
			else {//입력값이 마지막 계산 결과와 같을 경우
				break; //탈출
			}
			
		}//while
		System.out.println(count); //사이클 횟수 출력
	}//main

}//class