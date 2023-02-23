package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;


public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {

		JFileChooser chooser = new JFileChooser("resources");

		chooser.showOpenDialog(null);

		File f = new File(chooser.getSelectedFile().getPath());

		Scanner in = new Scanner(f); //making Scanner with a File

		String shapeType = in.next(); //nextLine here reads the entire line as a string and messes up the following variables

		int redComponent = in.nextInt();

		int greenComponent = in.nextInt();

		int blueComponent = in.nextInt();

		boolean isFilled = in.nextBoolean();

		double x = in.nextDouble();

		double y = in.nextDouble();

		double halfWidth = in.nextDouble();

		double halfHeight = in.nextDouble();

		Color studioColor = new Color(redComponent, greenComponent, blueComponent);

		StdDraw.setPenColor(studioColor);

		if (isFilled == true ) { // filled shapes

			if (shapeType.equals("rectangle")) {	

				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);

			} else if(shapeType.equals("ellipse") == true) {	

				StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
			}

		} else { // outline shapes

			StdDraw.rectangle(x, y, halfWidth, halfHeight);
		}

	}
}
