// Jack Tan 3/7/18 2nd Period
package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid {
	private Cell[][] elements;

	public Spreadsheet() {
		elements = new Cell[20][12];
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 12; j++) {
				elements[i][j] = new EmptyCell();
			}
		}
	}

	@Override
	public String processCommand(String command) // Parse and check how many chacreters are in it
	{
		String[] commands = command.split(" "); // Split to see how many are worsd are in String command
		if (commands.length > 1 && commands[0] == "clear") {
			int colNumber = Character.toUpperCase(command.charAt(0) - 'A');
			int rowNumber = (Integer.valueOf(command.substring(1)) - 1); 
			elements[colNumber][rowNumber] = new EmptyCell();
			return getGridText();
		} else if (commands[0] == "clear") { //Regular clear
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 12; j++) {
					elements[i][j] = new EmptyCell();
				}
			}
			return getGridText();
		} else if (commands.length == 1) { // Cell Inspection
			return " \" " + command + " \" "; // This could need changing it feels wrong
		} else { //Assiagment of String Values
			int colNumber = Character.toUpperCase(command.charAt(0) - 'A');
			int rowNumber = (Integer.valueOf(command.substring(1)) - 1); 
			elements[colNumber][rowNumber] = new TextCell(commands[2]);
			return getGridText();
		}
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int getCols() {
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	public Cell getCell(Location loc) // Returns a Cell at the location
	{
		return elements[loc.getCol()][loc.getRow()];
	}

	@Override
	public String getGridText() {
		String entireSpreadSheet = "";
		for (int i = 0; i < 21; i++) { // This for loops creates the numbers on the side
			if (i == 0) {
				entireSpreadSheet += "   |";
			} else if (i <= 9) {
				entireSpreadSheet += "" + i + "  |";
			} else {
				entireSpreadSheet += "" + i + " |";
			}
			for (int j = 0; j < 12; j++) {
				if (i == 0) { // Prints the Letters in the first row
					entireSpreadSheet += ("" + (char) (65 + j)) + "        |";
				} else {// Prints the rest of the empty bracket
					entireSpreadSheet += "         |";
				}
			}
			entireSpreadSheet = entireSpreadSheet + "\n"; // I need help inorder to print a new line afte ri print one
															// row
		}
		return entireSpreadSheet;

	}
}
