package product.model.DAO;

import java.util.ArrayList;
import java.util.Scanner;

import product.model.DTO.ProductDTO;

public class ProductDAO {
	Scanner sc = new Scanner(System.in);
	
	public void getList(ArrayList<ProductDTO> list) {
		ProductDTO dt = new ProductDTO();
		
		for(int i=0; i<list.size(); i++) {
			dt = list.get(i);
			System.out.println(dt.display());
		}
	}
	
	public void setProduct(ArrayList<ProductDTO> list) {
		ProductDTO dt = new ProductDTO();
		
		System.out.print("상품 이름 : ");
		String name = sc.nextLine();
		System.out.print("상품 가격 : ");
		String price = sc.nextLine();
		
		dt.setName(name);
		dt.setPrice(price);
		
		list.add(dt);
	}
	
	public void setInfo(ArrayList<ProductDTO> list) {
		ProductDTO dt = new ProductDTO();
		
		System.out.print("수정할 상품이름 : ");
		String name = sc.nextLine();
		
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			dt = list.get(i);
			if(name.trim().equals(dt.getName())) {
				System.out.print("새로운 상품 이름 : ");
				String name_ = sc.nextLine();
				System.out.print("새로운 상품 가격 : ");
				String price_ = sc.nextLine();
				
				dt.setName(name_);
				dt.setPrice(price_);
				
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
	
	public void setDelete(ArrayList<ProductDTO> list) {
		ProductDTO dt = new ProductDTO();
		
		System.out.print("삭제할 상품이름 : ");
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
	
	public void getSearch(ArrayList<ProductDTO> list) {
		ProductDTO dt = new ProductDTO();
		
		System.out.print("찾고싶은 상품이름 : ");
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
