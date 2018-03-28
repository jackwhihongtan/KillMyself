package textExcel;

public class PercentCell extends RealCells{
	private double number;
	private String userInput;
	public PercentCell(String userInput) {
		super(userInput);
		this.userInput = userInput;
		String[] percentSign = userInput.split("%");
		number = Double.parseDouble(percentSign[0]);
	}
	public String abbreviatedCellText() { //May need to change so it print out something same with Full Cell Text
		int extraSpaces = 0; // To count how many spaces I need to add
		String returnString = ""+(int)number+"%";	
		extraSpaces = 10 - returnString.length();
		for (int j = 0; j < extraSpaces; j++) {
			returnString += " ";
		}
		return returnString;
			}
		
	public String fullCellText() {
		number = number/100;
		return ""+number+"";
	}
	public double getDoubleValue(){
		return number;
	}
}
