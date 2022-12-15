package sungjuk.model.DAO;

import java.util.ArrayList;
import java.util.Scanner;

import sungjuk.model.DTO.SungjuckDTO;

public class SungjuckDAO {

	Scanner sc = new Scanner(System.in);
	
	public void getList(ArrayList<SungjuckDTO> list) {
		SungjuckDTO dt = new SungjuckDTO();
		
		for(int i=0; i<list.size(); i++) {
			dt = list.get(i);
			System.out.println(dt.display());
		}
	}
	
	public void setStudent(ArrayList<SungjuckDTO> list) {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("국어 : ");
		String kor = sc.nextLine();
		System.out.print("영어 : ");
		String eng = sc.nextLine();
		System.out.print("수학 : ");
		String mat = sc.nextLine();
		System.out.print("과학 : ");
		String sci = sc.nextLine();
		System.out.print("역사 : ");
		String his = sc.nextLine();

		SungjuckDTO dt = new SungjuckDTO(name, kor, eng, mat, sci, his);
		
		list.add(dt);
	}
	
	public void setInfo(ArrayList<SungjuckDTO> list) {
		SungjuckDTO dt = new SungjuckDTO();
		
		System.out.print("성적을 수정할 학생이름 : ");
		String name_ = sc.nextLine();
		
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			dt = list.get(i);
			if(name_.trim().equals(dt.getName())) {
				System.out.print("새로운 이름 : ");
				String name = sc.nextLine();
				System.out.print("새로운 국어 : ");
				String kor = sc.nextLine();
				System.out.print("새로운 영어 : ");
				String eng = sc.nextLine();
				System.out.print("새로운 수학 : ");
				String mat = sc.nextLine();
				System.out.print("새로운 과학 : ");
				String sci = sc.nextLine();
				System.out.print("새로운 역사 : ");
				String his = sc.nextLine();
				
				SungjuckDTO dt_ = new SungjuckDTO(name, kor, eng, mat, sci, his);
				list.remove(i);
				list.add(i, dt_);
				System.out.println("==수정 성공==");
				count++;
			}
		}
		if(count == 0) {
			System.out.println("==검색 실패==");
		}
	}
	
	public void setDelete(ArrayList<SungjuckDTO> list) {
		SungjuckDTO dt = new SungjuckDTO();
		
		System.out.print("성적을 삭제할 학생이름 : ");
		String name = sc.nextLine();
		
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			dt = list.get(i);
			if(name.trim().equals(dt.getName())) {
				System.out.println("==삭제 성공==");
				list.remove(i);
				count++;
			}
		}
		if(count == 0) {
			System.out.println("==검색 실패==");
		}
	}
	
	public void getSearch(ArrayList<SungjuckDTO> list) {
		SungjuckDTO dt = new SungjuckDTO();
		
		System.out.print("성적을 조회하고자 하는 학생이름 : ");
		String name = sc.nextLine();
		
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			dt = list.get(i);
			if(name.trim().equals(dt.getName())) {
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
