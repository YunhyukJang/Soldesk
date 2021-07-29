package FlyVO;

import java.util.ArrayList;

public class FlyPlaneDAO {

	private static ArrayList<Flydata> list;

	public FlyPlaneDAO() {
		
		if (list == null) {
			list = new ArrayList<Flydata>();
		}
	}

	public void addData(String name, String id, String pw, String address) {
		list.add(new Flydata(name, id, pw, address));
	}
	
	/*public void add(Flydata e) {
		list.add(new Flydata(e.getName(), e.getEname(),e.getId() , e.getPw(), e.getAddress(), e.getPhonenum(), e.getBirth(), e.getCountry()));
	}*/

	//아이디로 정보 찾기
	public Flydata searchdata(String id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id)) {
				return list.get(i);
			}
		}
		return null;
	}

	
	
	// 이미 가입된 아이디 검색
	public boolean dupid(String id) {

		for (int i = 0; i < list.size(); i++) {
			if (((list.get(i).getId().equals(id)))) {
				return true;
			}
		}
		return false;
	}

}
