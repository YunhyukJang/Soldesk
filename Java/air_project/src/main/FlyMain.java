package main;

import java.awt.Frame;

import frame.FlyFrameBase;
import frame.FlyGuam;
import vo.FlyPlace;
import vo.FlyPlaceDAO;

public class FlyMain {

	public static void main(String[] args) {
		FlyPlace sf=new FlyPlaceDAO().searchPlace("괌");
		
		FlyFrameBase.getInstance(new FlyGuam(sf));
	}
}
