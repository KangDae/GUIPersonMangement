package org.comstudy21.ex06;

import java.util.Vector;

public class SaramDao {
	private static Vector<SaramDto> saramList = new Vector<SaramDto>();
	static {
		saramList.add(new SaramDto(1, "kim", "kim@aa.com", "010-1111-1111"));
		saramList.add(new SaramDto(2, "lee", "lee@aa.com", "010-2222-2222"));
		saramList.add(new SaramDto(3, "park", "park@aa.com", "010-3333-3333"));
	}
	public static int sequence = 4;

	public Vector selectAll() {
		Vector vector = new Vector();
		for (int i = 0; i < saramList.size(); i++) {
			vector.add(saramList.get(i).toVector());
		}
		return vector;
	}

	public void insert(SaramDto saramDto) {// 입력
		if (saramDto != null) {
			saramDto.setIdx(sequence++);
			saramList.add(saramDto);
		}
	}

	public void Delete(String name) {// 삭제

		for (int i = 0; i < this.saramList.size(); i++) {
			SaramDto temp = this.saramList.get(i);

			if (temp.getName().equals(name)) {
				saramList.get(i).setName(name);
				this.saramList.remove(i);
				break;
			}

			if (i == this.saramList.size() - 1) {
				System.out.println("오류");
			}
		}
	}

	public void modify( String Name,String Email,String Phone) {// 수정
		
			
		for (int i = 0; i <saramList.size(); i++) {
			SaramDto temp = saramList.get(i);
			
			if (temp.getName().equals(Name)) {
				saramList.get(i).setName(Name);
				saramList.get(i).setEmail(Email);
				saramList.get(i).setPhone(Phone);
				break;
			}
		}
		
		
	}

	public Vector SelectOne(String name) {

		Vector vector = new Vector();
		for (int i = 0; i < saramList.size(); i++) {

			if (saramList.get(i).getName().equals(name)) {
				vector.add(saramList.get(i).toVector());
			}
		}

		return vector;
	}

}
