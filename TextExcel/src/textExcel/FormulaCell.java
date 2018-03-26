package textExcel;

public class FormulaCell extends RealCells{
	private String userInput;
	private String[] insideParentheses; //It is an array but still has the parentheses
	public FormulaCell(String newValue) { //Just an outline
		super(newValue);
		insideParentheses = newValue.split(" ");
		userInput = newValue;
	}
	public String abbreviatedCellText() { //May need to change so it print out something same with Full Cell Text
		return userInput;
	}
	public String fullCellText() { //Prints whatever is passed in will need o be override in percent cell
		return userInput;
	}
	public double getDouble() { //Inplment in checkpoint 4
		return 0.1;
	}
	public double getDoubleValue() { //First split array then check operand
		
		for(int i = 3; i < insideParentheses.length; i += 2) { //It checks the operon first
			if(insideParentheses[i].equals("+")) {
				insideParentheses[i+1] = ""+Double.parseDouble(insideParentheses[i-1]) + Double.parseDouble(insideParentheses[i+1])+"";
				System.out.println(insideParentheses[i+1]);
				return Double.parseDouble(insideParentheses[i+1]);
			} else if(insideParentheses[i].equals("-")) {
				insideParentheses[i+1] = ""+Double.parseDouble(insideParentheses[i-1]) /- Double.parseDouble(insideParentheses[i+1])+""; //You need to find out hwo to concatenate
				System.out.println(insideParentheses[i+1]);
				return Double.parseDouble(insideParentheses[i+1]);
			} else if(insideParentheses[i].equals("/")) {
				insideParentheses[i+1] = ""+Double.parseDouble(insideParentheses[i-1]) / Double.parseDouble(insideParentheses[i+1])+"";
				System.out.println(insideParentheses[i+1]);
				return Double.parseDouble(insideParentheses[i+1]);
			} else { //This one is multiplying
				insideParentheses[i+1] = ""+Double.parseDouble(insideParentheses[i-1]) * Double.parseDouble(insideParentheses[i+1])+"";
				System.out.println(insideParentheses[i+1]);
				return Double.parseDouble(insideParentheses[i+1]);
			}
		}
	}
}
