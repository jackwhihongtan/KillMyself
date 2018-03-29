package textExcel;

public class FormulaCell extends RealCells{
	private String userInput;  //It is an array but still has the parentheses
	public FormulaCell(String newValue) { //Just an outline
		super(newValue);
		userInput = newValue;
	}
	public String abbreviatedCellText() { //May need to change so it print out something same with Full Cell Text
		double formatString = getDoubleValue();
		System.out.println(formatString);
		int extraSpaces = 0; // To count how many spaces I need to add
		String returnString = ""+formatString; 
		if (returnString.length() >= 10) {
			return returnString.substring(0, 10);
		} else {
			extraSpaces = 10 - returnString.length();
			for (int j = 0; j < extraSpaces; j++) {
				returnString += " ";
			}
			return returnString;
		}
	}
	
	public String fullCellText() { //Prints whatever is passed in will need o be override in percent cell
		return "( "+userInput+" )";
	}
	public double getDoubleValue() { //First split array then check operand
		double totalValue = 0;
		String[] insideParentheses = userInput.split(" ");
		if(insideParentheses.length == 1) {
			return Double.parseDouble(insideParentheses[0]);
		}
		for(int i = 1; i < insideParentheses.length; i += 2) { //It checks the operon first
			if(insideParentheses[i].equals("+")) {
				insideParentheses[i+1] = Double.parseDouble(insideParentheses[i-1]) + Double.parseDouble(insideParentheses[i+1])+"";
				System.out.println(insideParentheses[i+1]);
				totalValue = Double.parseDouble(insideParentheses[i+1]);
			} else if(insideParentheses[i].equals("-")) {
				insideParentheses[i+1] = Double.parseDouble(insideParentheses[i-1]) - Double.parseDouble(insideParentheses[i+1])+""; //You need to find out hwo to concatenate
				System.out.println(insideParentheses[i+1]);
				totalValue = Double.parseDouble(insideParentheses[i+1]);
			} else if(insideParentheses[i].equals("/")) {
				insideParentheses[i+1] = Double.parseDouble(insideParentheses[i-1]) / Double.parseDouble(insideParentheses[i+1])+"";
				System.out.println(insideParentheses[i+1]);
				totalValue = Double.parseDouble(insideParentheses[i+1]);
			} else { //This one is multiplying
				insideParentheses[i+1] = Double.parseDouble(insideParentheses[i-1]) * Double.parseDouble(insideParentheses[i+1])+"";
				System.out.println(insideParentheses[i+1]);
				totalValue = Double.parseDouble(insideParentheses[i+1]);
			} 
		}
		return totalValue;
	}
}
