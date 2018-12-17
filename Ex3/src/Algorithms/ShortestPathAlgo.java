package Algorithms;

import java.util.ArrayList;

import TheGame.Fruit;
import TheGame.Game;
import TheGame.Packman;
import Geom.Point3D;

public class ShortestPathAlgo  {

	private Game game;

	public ShortestPathAlgo(Game game) {
		this.game = game;
	}

	public void ShortestPath() {
		while(game.getFruitList() != null) {
			Path fastestPaths = new Path();

			for(Packman p : game.getPackmanList()) {
				Path path = new Path(p, game.getFruitList());
				path.BuildPath();
				fastestPaths.getPackmanPrio().add(path.next());
			}
			//set the point of the packman to the point of the fruit
			fastestPaths.next().getPackman().setPoint3D(fastestPaths.next().getFruit().getPoint3D());
			//erase the fruit that got eatten from the list
			game.getFruitList().remove(fastestPaths.next().getFruit());	
		}
	}




}