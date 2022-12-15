package proc;

import java.util.Scanner;

import member._proc.MemberSample;
import product._proc.ProductSample;
import sungjuk._proc.SungjukSample;

public class Example {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("선택( 1: 상품관리, 2: 회원관리, 3: 성적관리, 기타: 종료 ): ");
			String sel = sc.nextLine();
			
			if(sel.trim().equals("1")) {
				ProductSample sa = new ProductSample();
			} else if(sel.trim().equals("2")) {
				MemberSample sa = new MemberSample();
			} else if(sel.trim().equals("3")) {
				SungjukSample sa = new SungjukSample();
			} else {
				break;
			}
		}
		System.out.println("==프로그램 종료==");
		sc.close();
	}

}
