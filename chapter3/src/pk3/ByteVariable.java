package pk3;

public class ByteVariable {

	public static void main(String[] args) {
		byte bs1=-128; //8bit=-128~127
		
		//byte bs2=128;
		byte bs2=127;
		
		//short s=33000; //16bit=-32768~32767
		short s=32767;
		
		System.out.println(bs1);
		System.out.println(bs2);
		System.out.println(s);
	}
}
