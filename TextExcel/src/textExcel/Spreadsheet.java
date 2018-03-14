// Jack Tan 3/7/18 2nd Period
package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private Cell[][] elements;
	public Spreadsheet() {
		elements = new Cell[20][12];
			for(int i = 0; i < 20; i++) {
				for(int j = 0; j < 12; j++) {
					elements[i][j] = new EmptyCell();
				}
			}
	}
	@Override
	public String processCommand(String command)
	{
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public int getRows()
	{
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int getCols()
	{
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	public Cell getCell(Location loc) //Returns a Cell at the location
	{
		return elements[loc.getCol()][loc.getRow()];
	}

	@Override
	public String getGridText()
	{
		String entireSpreadSheet = "";
		for(int i = 0; i < 21; i++) {
			
		}
		return null;
	}

}
