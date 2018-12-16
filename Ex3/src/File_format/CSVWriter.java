package File_format;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import TheGame.Fruit;
import TheGame.Game;
import TheGame.Packman;

public class CSVWriter {

	element2CSV e2CSV;
	Game game;


	public CSVWriter() {
		e2CSV = new element2CSV();
		game = new Game();
	}


	public void writeCSV(String fileName, PrintWriter pw, ArrayList<Packman> packmanList, ArrayList<Fruit> fruitList) {
		//		try {
		//			pw = new PrintWriter(new File(fileName));
		//		} 
		//		catch (FileNotFoundException e) {
		//			e.printStackTrace();
		//			return;
		//		}

		StringBuilder sb = new StringBuilder();
		sb.append("Type");
		sb.append(',');
		sb.append("id");
		sb.append(",");
		sb.append("Lat");
		sb.append(",");
		sb.append("Lon");
		sb.append(",");
		sb.append("Alt");
		sb.append(",");
		sb.append("Speed/Weight");
		sb.append(",");
		sb.append("Radius");
		sb.append('\n');

		//System.out.println("what i wanted" + packmanList.get(0));

		for(Packman p : packmanList) {
			readFromString(e2CSV.packman2String(packmanList), sb);
		}
		for(Fruit f : fruitList) {
			readFromString(e2CSV.fruit2String(fruitList), sb);
		}
	//	System.out.println(sb.toString());

		pw.write(sb.toString());
		pw.close();
	}



	public StringBuilder readFromString(String[] s, StringBuilder sb) {
		for(int i = 0; i < s.length; i++) {
			sb.append(s[i]);
			if(i != s.length - 1) {
				sb.append(",");
			}
		}
		sb.append('\n');
		return sb;

	}

	public static void main(String[] args){
		String fileName = "yael.csv";
		PrintWriter pw = null;

		CSVWriter writer = new CSVWriter();

		//writer.writeCSV(fileName, pw);
		System.out.println("done!");
	}

}




