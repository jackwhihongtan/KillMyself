package textExcel;

public class ValueCell extends RealCells { // Current Sattuus when I input some thing long it pritns everything but the
											// first number
	private String userInput; // This will be used for the two methods thatr eturn strings
	private double vaule;

	public ValueCell(String userInput) {
		super(userInput);
		this.userInput = userInput;
		vaule = Double.parseDouble(userInput);
	}

	public double getDouble() { // it returns 12 like 12.0
		return vaule;
	}

	public String abbreviatedCellText() {
		int extraSpaces = 0; // To count how many spaces I need to add
		String returnString = userInput;
		System.out.println(returnString);
		if (!returnString.contains(".")) {
			returnString += ".0";
		}
		System.out.println(returnString);
		if (userInput.length() >= 10) {
			return returnString.substring(0, 10);
		} else {
			extraSpaces = 10 - returnString.length();
			for (int j = 0; j < extraSpaces; j++) {
				returnString += " ";
			}
			return returnString;
		}
	}

	public String fullCellText() { // I am printing the whole String that was passed in
		return "" + vaule + "";
	}
	
}
