package TheGame;

import Geom.ElementGeom;
import Geom.Point3D;

public class Packman {

	private ElementGeom point;
	private PackmanMetaData data;
	private Point3D point3D;
	//private Pixel pixel;
	
	public Packman(ElementGeom point, PackmanMetaData data) {
		this.point = point;
		this.data = data;
	}
	
	public Packman(Point3D point) {
		this.point3D = point;
	//	this.pixel = pixel;
	}
	
	

	public ElementGeom getPoint() {
		return point;
	}


	public PackmanMetaData getPackmanData() {
		return data;
	}

	public Point3D getPoint3D() {
		return point3D;
	}
	
//	public Pixel getPixel() {
//		return pixel;
//	}

	
	
	
}
