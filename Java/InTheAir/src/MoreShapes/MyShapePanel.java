package MoreShapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MyShapePanel extends JPanel{
	ArrayList<Shape> shapeArray = new ArrayList<Shape>();
	
	public MyShapePanel() {
		Shape s;
		
		s=new Arc2D.Float(220, 100, 200, 360, 45, 80, Arc2D.PIE);
		
		shapeArray.add(s);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(3));
		for (Shape s: shapeArray) g2.draw(s);
		
		
	}

}
