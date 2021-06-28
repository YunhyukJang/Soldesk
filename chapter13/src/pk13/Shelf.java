package pk13;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf; //add(), remove(), sort(), size()
	
	public Shelf() {
		shelf=new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
