package textExcel;

public class RealCells implements Cell {
	private String userinput;
	public RealCells(String numberValue) { //Constructor that takes in double
		userinput = numberValue;
	}
	public double getDouble() {
		return Integer.valueOf(userinput);
	}
	public String abbreviatedCellText() { //May need to change so it print out something same with Full Cell Text
		return "";
	}
	public String fullCellText() {
		return "";
	}
}
