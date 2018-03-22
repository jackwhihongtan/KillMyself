package textExcel;

public class FormulaCell extends RealCells{
	private String userInput;
	public FormulaCell(String newValue) { //Just an outline
		super(newValue);
		String[] insideValues = newValue.split(" ");
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
}
