package member.model.DAO;

import java.util.ArrayList;
import java.util.Scanner;

import member.model.DTO.MemberDTO;

public class MemberDAO {
Scanner sc = new Scanner(System.in);
	
	public void getList(ArrayList<MemberDTO> list) {
		MemberDTO dt = new MemberDTO();
		
		for(int i=0; i<list.size(); i++) {
			dt = list.get(i);
			System.out.println(dt.display());
		}
	}
	
	public void setMember(ArrayList<MemberDTO> list) {
		MemberDTO dt = new MemberDTO();
		
		System.out.print("Id : ");
		String id = sc.nextLine();
		System.out.print("Pw : ");
		String pw = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		dt.setId(id);
		dt.setPw(pw);
		dt.setName(name);
		dt.setPhone(phone);
		dt.setAddress(address);
		
		list.add(dt);
	}
	
	public void setInfo(ArrayList<MemberDTO> list) {
		MemberDTO dt = new MemberDTO();
		
		System.out.print("수정할 회원ID : ");
		String name_ = sc.nextLine();
		
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			dt = list.get(i);
			if(name_.trim().equals(dt.getName())) {
				System.out.print("새로운 id : ");
				String id = sc.nextLine();
				System.out.print("새로운 pw : ");
				String pw = sc.nextLine();
				System.out.print("새로운 이름 : ");
				String name = sc.nextLine();
				System.out.print("새로운 전화번호 : ");
				String phone = sc.nextLine();
				System.out.print("새로운 주소 : ");
				String address = sc.nextLine();
				
				dt.setId(id);
				dt.setPw(pw);
				dt.setName(name);
				dt.setPhone(phone);
				dt.setAddress(address);
				
				list.remove(i);
				list.add(i, dt);
				
				System.out.println("==수정 성공==");
				count++;
			}
		}
		if(count == 0) {
			System.out.println("==검색 실패==");
		}
	}
	
	public void setDelete(ArrayList<MemberDTO> list) {
		MemberDTO dt = new MemberDTO();
		
		System.out.print("삭제할 회원ID : ");
		String id = sc.nextLine();
		
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			dt = list.get(i);
			if(id.trim().equals(dt.getName())) {
				System.out.println("==삭제 성공==");
				list.remove(i);
				count++;
			}
		}
		if(count == 0) {
			System.out.println("==검색 실패==");
		}
	}
	
	public void getSearch(ArrayList<MemberDTO> list) {
		MemberDTO dt = new MemberDTO();
		
		System.out.print("찾고싶은 회원ID : ");
		String id = sc.nextLine();
		
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			dt = list.get(i);
			if(id.trim().equals(dt.getName())) {
				System.out.println("==검색 성공==");
				System.out.println(dt.display());
				count++;
			}
		}
		if(count == 0) {
			System.out.println("==검색 실패==");
		}
	}
}
