package TheGame;

import Geom.Point3D;

public class Packman {

	private PackmanMetaData data;
	private Point3D point3D;
	//private Pixel pixel;
	
	public Packman(Point3D point, PackmanMetaData data) {
		this.point3D = point;
		this.data = data;
	}
	
	public Packman(Point3D point) {
		this.point3D = point;
	//	this.pixel = pixel;
	}
	

	public PackmanMetaData getPackmanData() {
		return data;
	}

	public Point3D getPoint3D() {
		return point3D;
	}

	public void setPoint3D(Point3D point3d) {
		point3D = point3d;
	}
	
//	public Pixel getPixel() {
//		return pixel;
//	}

	
	
	
}
