package textExcel;

public class TextCell implements Cell {
	private String value;

	public TextCell(String cellName) {
		value = cellName;
	}

	public String fullCellText() {
		return " \" " + value + " \" ";
	}

	public String abbreviatedCellText() {
		int extraSpaces = 0; // To count how many spaces I need to add
		if (value.length() >= 10) {
			return value.substring(0, 9);
		} else {
			extraSpaces = 10 - value.length();
			for (int j = 0; j < extraSpaces; j++) {
				value += " ";
			}
			return value;
		}
	}
}
