package Algorithms;

import java.util.ArrayList;

import TheGame.Fruit;
import TheGame.Packman;
import Geom.Point3D;

public class ShortestPathAlgo  {


	private ArrayList<Fruit> fruitList;
	private ArrayList<Packman> packmanList;
	
	
	public ArrayList<Fruit> getFruitList() {
		return fruitList;
	}
	public ArrayList<Packman> getPackmanList() {
		return packmanList;
	}
	
	public ShortestPathAlgo(ArrayList<Packman> p, ArrayList<Fruit> f ) {
		double [] dis= new double[ p.size()];
		int packman=0;
		int count=0;
		for( Fruit F: fruitList) {
			double xF= F.getPoint().getX();
			double yF= F.getPoint().getY();
			Point3D pointF= new Point3D(xF,yF);
			for(Packman P: packmanList) {
				double min= dis[0];
				double xP= P.getPoint().getX();
				double yP= P.getPoint().getY();
				Point3D pointP= new Point3D(xP,yP);
				double FPdis= pointP.distance3D(pointF);
				dis[count]= FPdis;
				if(min>FPdis) {
					min= dis[count];
					packman= count;
				}
				count++;
			}
			//להכניס חלק שהפאקמן הולך לאכול את הפרי
			//להכניס שהפאקמן מקבל נק מיקום חדשה של הפרי
		}
	}
	
}