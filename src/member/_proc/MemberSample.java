package member._proc;

import java.util.ArrayList;
import java.util.Scanner;

import member.model.DAO.MemberDAO;
import member.model.DTO.MemberDTO;

public class MemberSample {
	public MemberSample() {
		Scanner sc = new Scanner(System.in);
		ArrayList<MemberDTO> arr = new ArrayList<>();
		
		while(true) {
			System.out.print("선택(1:목록, 2:등록, 3:수정, 4:삭제, 5:검색, 기타:종료) : ");
			String sel = sc.nextLine();
			MemberDAO da = new MemberDAO();
			
			if(sel.trim().equals("1")) {
				da.getList(arr);
			}else if(sel.trim().equals("2")) {
				da.setMember(arr);
			}else if(sel.trim().equals("3")) {
				da.setInfo(arr);
			}else if(sel.trim().equals("4")) {
				da.setDelete(arr);
			}else if(sel.trim().equals("5")) {
				da.getSearch(arr);
			}else {
				break;
			}
		}
		System.out.println("==회원 관리 프로그램 종료==");
		sc.close();
	}
}
