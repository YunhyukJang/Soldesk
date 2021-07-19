package main;

import java.awt.Frame;

import frame.FrameBase;
import frame.FrameGuam;

public class AirMain {

	public static void main(String[] args) {
		FrameGuam p=new FrameGuam();
		
		FrameBase.getInstance(p);
	}
}
