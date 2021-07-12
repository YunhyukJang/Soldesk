package pk3;

public class ExplicitConversion {

	public static void main(String[] args) {
		//명시적 형 변환
		int iNum=1000; //32bit
		byte bNum=(byte)iNum; //8bit
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum=1.2;
		float fNum=0.9f;
		int iNum1=(int)(dNum+fNum); //2.1->2
		int iNum2=(int)dNum+(int)fNum; //1+0=1
		
		System.out.println(iNum1);
		System.out.println(iNum2);
	}
}
