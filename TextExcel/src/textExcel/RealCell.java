package textExcel;

public abstract class RealCell implements Cell {
	private String userinput;
	public RealCell(String numberValue) { //Constructor that takes int or double Double.parseDouble(userinput);
		userinput = numberValue;
	}
	public String abbreviatedCellText() { //May need to change so it print out something same with Full Cell Text
		return userinput;
	}
	public String fullCellText() { //Prints whatever is passed in will need o be override in percent cell
		return userinput;
	}
	public abstract double getDoubleValue(); //My abstarct method
}
