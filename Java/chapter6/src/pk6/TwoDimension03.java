package pk6;

import javax.swing.JOptionPane;

public class TwoDimension03 {

	public static void main(String[] args) {
		int[][] javaScore=new int[2][3];
		
		int java=0;
		
		for(int i=0; i<javaScore.length; i++) {
			for(int j=0; j<javaScore[i].length; j++) {
				java=Integer.parseInt(JOptionPane.showInputDialog("javaScore"));
				
				javaScore[i][j]=java;
				
				System.out.println("javaScore["+i+"]["+j+"]="+javaScore[i][j]);
			}
			
			System.out.println();
		}
		
		int python=0;
		
		int[][] pythonScore=new int[2][];
		
		pythonScore[0]=new int[2];
		pythonScore[1]=new int[3];
		
		for(int i=0; i<pythonScore.length; i++) {
			for(int j=0; j<pythonScore[i].length; j++) {
				python=Integer.parseInt(JOptionPane.showInputDialog("pythonScore"));
				
				pythonScore[i][j]=python;
				
				System.out.println("pythonScore["+i+"]["+j+"]="+pythonScore[i][j]);
			}
			
			System.out.println();
		}
		
		int[][] bigData= {{70, 80}, {92, 96, 80}};
		
		for(int i=0; i<bigData.length; i++) {
			for(int j=0; j<bigData[i].length; j++) {
				System.out.println("bigData["+i+"]["+j+"]="+bigData[i][j]);
			}
			
			System.out.println();
		}
	}
}

