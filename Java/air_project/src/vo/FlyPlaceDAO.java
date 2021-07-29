package vo;

import java.util.ArrayList;

public class FlyPlaceDAO {
	private static ArrayList<FlyPlace> list; //여행지 정보 리스트
	private static ArrayList<FlyMyPlace> myList; //예매 정보 리스트
	
	public String monthSlot[]={"월 선택", "1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", 
			"10월", "11월", "12월"};
	public String dateSlot[]={"일 선택", 
			"1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", 
			"11일", "12일", "13일", "14일", "15일", "16일", "17일", "18일", "19일", 
			"20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일", 
			"29일", "30일", "31일"};
	public String timeSlot[]={"시간 선택", "00:00", "02:30", "05:00", "07:30", 
			"09:00", "11:30", "14:00", "16:30", "19:00", "21:30"};
	public String clientSlot[]={"인원 선택", "1명", "2명", "3명", "4명", "5명"};
	
	public FlyPlaceDAO() {
		if(list == null) {
			init();
		}
		
		if(myList == null) {
			myList=new ArrayList<FlyMyPlace>();
		}
		
	}
	
	private void init() {
		list=new ArrayList<FlyPlace>();
		
		//괌
		list.add(new FlyPlace("괌", "반짝이는 바다와 맛있는 차모로 전통 음식 그리고 쇼핑 등 빼놓을 수 "
				+"없는 요소들을 두루 갖추고 있는 휴양지", "820,000 원", "추천 여행 기간 : 12월~4월", 
				"건기에 방문해야 에메랄드 빛 바다를 제대로 즐길 수 있다. 열대 해양성의 고온다습한 기후, 연평균 "
				+"기온 26℃이나 주간에는 30℃이상으로 온도가 높으며, 습도가 80%, 1~6월은 건기, 7~12월은 우기."));
		
		//도쿄
		list.add(new FlyPlace("도쿄", "신구의 조화가 절묘한 도시", "680,000 원", "추천 여행 기간 : 10월~11월", 
				"낮에는 따뜻하고 밤에는 선선해 걸어 다니기 좋다. 이 즈음 청명한 날씨가 이어진다. 평균 기온이 16℃ 정도로 "
				+"여름이지만 많이 덥지 않고, 한낮에도 습도가 낮아 여행하기 좋다."));
		
		//로스앤젤레스
		list.add(new FlyPlace("로스앤젤레스", "미국에서 뉴욕에 이어 두 번째로 인구가 많은 도시이며 세계 영화 "
				+"산업을 이끌어 가고 있는 할리우드가 있는 곳", "1,810,000 원", "추천 여행 기간 : 4월~5월 / 9월~11월", 
				"1년 내내 방문해도 좋지만, 그래도 한여름에는 30~40℃ 이상 되는 경우도 있어 우리나라 봄 날씨 정도인 4~5월과 "
				+"9~11월 정도가 좋겠다. 한여름 시기인 6~8월 시즌도 건조한 더위이기에 우리나라의 찜통더위와는 사뭇 다르다. 그래서 "
				+"이 시기에 와도 바닷가 비치에서 할 수 있는 액티비티가 많아서, 바다를 하거나 서핑 등 물에서 하는 액티비티를 좋아한다면 "
				+"여름도 좋다."));
		
		//발리
		list.add(new FlyPlace("발리", "세계 최고의 휴양지, 세계 1위의 허니문 여행지 신들의 섬 발리", "700,000 원", 
				"추천 여행 기간 : 5월~9월", "세계 1등 휴양지인 발리는 7월 8월이 최성수기이고 4월부터 10월까지 건기인 시기에 "
						+"찾는 것이 여행하기 좋다. 발리는 지역마다 고도가 달라 평균날씨도 다르지만 평균 32.4℃이며 3월에 가장 "
						+"높고 평균온도가 29.6℃로 8월에 가장 낮다. 4월부터 10월까지 건기이며 11월부터 3월까지 우기이다. 1월과 "
						+"2월에 비가 가장 많이 오며, 동남아시아의 전형적인 스콜성 비입니다."));
		
		//오클랜드
		list.add(new FlyPlace("오클랜드", "북섬의 북단에 위치한 수많은 인종이 함께 어울려 사는 뉴질랜드의 최대 도시이며 경제 중심지", "1,670,000 원", 
				"추천 여행 기간 : 12월~3월", "이 기간에는 좋은 날씨가 지속되는 날이 많고, 기온 또한 20℃에서 25℃로 쾌적해서 여행하기 가장 좋다. 오클랜드는 바다를 "
						+"끼고있는 해양 도시. 해수욕과 서핑 등 해양 액티비티를 즐기고자 한다면 여름철인 12월부터 3월이 가장 좋다. 10월과 11월도 "
						+"날씨가 좋은 편이며, 수많은 철새가 오클랜드 서부의 해안에서 산란과 부화를 하는 진풍경을 볼 수 있어 추천하는 시즌이다. 봄에 "
						+"해당하는 9월~11월도 여행하기에 나쁘지 않은 편이다."));
		
		//취리히
		list.add(new FlyPlace("취리히", "취리히는 스위스 최대의 도시이자 풍요롭고 활기찬 도시, 경제 문화의 중심이다.", "657,400 원", "추천 여행 기간 : "
				+"연중 내내", "여름은 더워도 습하지 않고 겨울에도 지나치게 춥지 않다. 기본적으로 여름에는 덥고 건조, 겨울에는 춥고 눈이 많이 오는 기후지만, "
						+"수시로 날씨가 바뀌기 때문에 그에 대비한 준비를 철저히 해야 한다."));
		
		//파리
		list.add(new FlyPlace("파리", "패션과 미식, 예술과 낭만이 있는 세계 문화의 중심지", "682,900 원", "추천 여행 기간 : 4월~5월 / 9월~10월", 
				"봄과 가을이 우리에게 가장 친숙한 날씨이다. 다만 일교차가 크니 얇은 겉옷은 항상 챙기도록 하자. 연평균 기온은 11.3℃. 가장 더운 달은 7월로 "
				+"평균 20℃, 가장 추운 달은 1월로 5℃ 정도 된다. 연중 강우량이 높으며 비가 오는 날에도 건조한 편. 겨울에는 온도가 0℃ 이하로 내려가거나 "
				+"눈이 내리는 날은 드물다."));
		
		//하와이
		list.add(new FlyPlace("하와이", "미국의 50번째 주로 태평양의 낙원이라 일컬어진다.", "2,981,200 원", "추천 여행 기간 : 4월~6월", "하와이는 "
				+"연중 온화한 날씨로 사계절 언제 방문해도 좋은 휴양지다. 단 비가 많이 내리는 우기를 피하고 싶다면 강수량이 가장 적은 4월부터 6월까지가 오아후를 "
				+"여행하기 가장 좋은 시기 물놀이가 여행의 주목적이라면 우기인 11월부터 3월까지는 피하는 것이 좋다. 특히 연중 가장 많은 비가 내리는 11월을 조심할 것"));
	}
	
	//이름으로 여행지 정보를 찾는 메서드
	public FlyPlace searchPlace(String name) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getpName().equals(name)) {
				return list.get(i);
			}
			
		}
		
		return null;
	}
	
	//인원
	public FlyMyPlace searchClient(String client) {
		for(int i=0; i<myList.size(); i++) {
			if(myList.get(i).getClient().equals(client)) {
				return myList.get(i);
			}
			
		}
		
		return null;
	}
	
	//예매 정보 리스트에 방금 선택한 정보를 등록
	public void addChoiceInfo(FlyMyPlace mp) {
		myList.add(new FlyMyPlace(mp.getpName(), mp.getMonth(), mp.getDate(), 
				mp.getTime(), mp.getClient(), mp.getSeat()));
	}
		
	//이미 예매된 정보인지 검색
	public boolean dupSeat(String pName, String month, String date, String time, String seat) {
		for(int i=0; i<myList.size(); i++) {
			if((myList.get(i).getpName().equals(pName)) 
					&& (myList.get(i).getMonth().equals(month)) 
					&& (myList.get(i).getDate().equals(date)) 
					&& (myList.get(i).getTime().equals(time)) 
					&& (myList.get(i).getSeat().equals(seat))) {
				return true;
			}
			
		}
		
		return false;
		
	}
}
