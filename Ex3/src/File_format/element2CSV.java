package File_format;

import java.util.ArrayList;

import TheGame.Fruit;
import TheGame.Packman;

public class element2CSV {

	private ArrayList<Fruit> fruitList;
	private ArrayList<Packman> packmanList;
	int id = 0;

	public element2CSV() {
	
	}

	public String[] packman2String(ArrayList<Packman> list) {
		String[] sPackman = new String[7];
		for(Packman p : list) {
			sPackman[0] = "P";
			sPackman[1] = "" + id;
			sPackman[2] = "" + p.getPoint3D().x();
			sPackman[3] = "" + p.getPoint3D().y();
			sPackman[4] = "" + 0;
			sPackman[5] = "" + 1;
			sPackman[6] = "" + 1;
			
		}
		id++;
		return sPackman;
	}

	public String[] fruit2String(ArrayList<Fruit> list) {
		String[] sFruit = new String[6];
		for(Fruit f : list) {
			sFruit[0] = "F";
			sFruit[1] = "" + id;
			sFruit[2] = "" + f.getPoint3D().x();
			sFruit[3] = "" + f.getPoint3D().y();
			sFruit[4] = "" + 0;
			sFruit[5] = "" + 1;
		}
		id++;
		return sFruit;
	}


}
