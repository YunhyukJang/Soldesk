package main;

import frame.FrameBase;
import frame.FrameGuam;
import frame.FrameTokyo;

public class AirMain {

	public static void main(String[] args) {
		FrameBase.getInstance(new FrameGuam());
	}
}
