package pers.linus.third;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Justificator {

	private JustificationStrategy justificationStrategy;

	private JustifyType justification;
	private int width;

	public enum JustifyType {
		None, Left, Right, Center
	};

	Justificator() {
		justification = JustifyType.None;
	}

	public void doIt() {
		format();
	}

	private void format() {
		String line, word;
		Scanner inFile;
		boolean isFirstWord = true; 
		try {
			inFile = new Scanner(new File("quote.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File cannot be opened. Aborting.");
			return;
		}
		line = "";
		while (inFile.hasNextLine()) {
			Scanner linescanner = new Scanner(inFile.nextLine());
			while (linescanner.hasNext()) {
				word = linescanner.next();
				if (line.length() + word.length() + 1 > width) {
					this.justify(line);
					line = ""; 
				} else {
					if(!isFirstWord)
						line = line + " ";
					isFirstWord = false; 
				}
				line = line + word;
			}
			linescanner.close();
		}
		this.justify(line);
		inFile.close();
	}

	private void justify(String line) {
		justificationStrategy.justify(line);
	}

	private void left_justify(String line) {
		System.out.println(line);
	};

	private void right_justify(String line) {
		String buf = new String();
		int offset = width - line.length();
		for (int i = 0; i < offset; i++)
			buf = buf + " ";
		buf = buf + line;
		System.out.println(buf);
	};

	private void center_justify(String line) {
		String buf = new String();
		int offset = (width - line.length()) / 2;
		for (int i = 0; i < offset; i++)
			buf = buf + " ";
		buf = buf + line;
		System.out.println(buf);
	};

	public void setJustify(int type, int width) {
		this.width = width;
		switch (type) {
		case 1:
			justificationStrategy = new LeftJustification(width);
			break;
		case 2:
			justificationStrategy = new RightJustification(width);
			break;
		case 3:
			justificationStrategy = new CenterJustification(width);
			break;
		}
	}
};
