package pk6;

import javax.swing.JOptionPane;

public class CharArray01 {

	public static void main(String[] args) {
		String str[]= {"ab1111", "cd2222", "ef3333", "gh4444", "ij5555"};
		String res="";
		
		for(int i=0; i<str.length; i++) {
			res += str[i]+"\n"; //enter="\n"
			
			System.out.println(res);
			
			JOptionPane.showMessageDialog(null, "배열 원소의 값 \n"+res);
		}
	}
}
