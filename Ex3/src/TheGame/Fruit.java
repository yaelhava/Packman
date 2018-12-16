package TheGame;

import Geom.ElementGeom;
import Geom.Point3D;

public class Fruit {
	
	private ElementGeom point;
	private FruitMetaData data;
	private Point3D point3D;
	//private Pixel pixel;
	
	
	public Fruit(ElementGeom point, FruitMetaData data) {
		this.point = point;
		this.data = data;
	
	}
	
	public Fruit(Point3D point) {
		this.point3D = point;
		//this.pixel = pixel;
	}

	
	
	public ElementGeom getPoint() {
		return point;
	}

	public FruitMetaData getFruitData() {
		return data;
	}

	public Point3D getPoint3D() {
		return point3D;
	}
	
//	public Pixel getPixel() {
//		return pixel;
//	}


}
