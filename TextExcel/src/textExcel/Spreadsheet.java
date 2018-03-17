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
	public String processCommand(String command)
	{
		public class Spreadsheet implements Grid
		{
			private Cell[][] array = new Cell [getRows()][getCols()];
			
			public Spreadsheet(){
				//creates a new spredsheet
				newSheet();
			}
			
			@Override
			public String processCommand(String command)
			{
				//checks to see if the input is anything, if not just ends here
				if(command.length() == 0 || command.equals("quit")){
					return "";
				}
				
				//splits the input by spaces
				String[] split = command.split(" ", 3);
				
				//gets rid of issue if the input has lowercases or uppercases
				// for columns
				split[0] = split[0].toUpperCase();
				
				//checks to see if the input has save in it
				if(split[0].equals("SAVE")){
					return saveData(split[1]);
				}
				
				// checks for an open in the input
				if(split[0].equals("OPEN")){
					return openData(split[1]);
				}
				//checks to see if the input is only 3 characters or less
				//which could only be a cell and returns the value
				if(split.length == 3){
					setCellValue(split[0], split[2]);
					return getGridText();
				
				// the first value is all uppercase
				// checks to see if the first word is clear
				}else if(split[0].contains("CLEAR")){
						
						// means that its clear with a cell so clears the cell
						if(split.length == 2){
							clearCell(split[1]);
							clearCell(split[1]);
							
							//returns how the grid looks like afterwards
							return getGridText();
							
						}else{
							
							//clears the entire grid by making an entirely new grid
							newSheet();
							
							//returns the new grid
							return getGridText();
						}
						
					}else{
						//returns the value of the cell
						return inspectCell(split[0]);
					}			
				}

				@Override
				public int getRows()
				{
					//total number of rows
					return 20;
				}

				@Override
				public int getCols(
							//returns how the grid looks like afterwards
							return getGridText();
							
						}else{
							
							//clears the entire grid by making an entirely new grid
							for(int i = 0; i < 20; i++) {
								for (int j = 0; j < 12; j++) {
									elements[i][j] = new EmptyCell();
							
							//returns the new grid
							return getGridText();
						}else{
							//returns the value of the cell
							SpreadsheetLocation loc = new SpreadsheetLocation(split[0]);
							
							return inspectCell(split[0]);
						}			
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
