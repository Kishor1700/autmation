package library;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class DataReader {
	public String[][] getExcelData(String fileName, String sheetName) {
		String[][] arrayExcelData = null;
		try {
			FileInputStream fileStream = new FileInputStream(fileName);
			Workbook workbook = Workbook.getWorkbook(fileStream);
			Sheet sheet = workbook.getSheet(sheetName);

			int totalColumn = sheet.getColumns();
			int totalRows = sheet.getRows();

			arrayExcelData = new String[totalRows - 1][totalColumn];
			for (int i = 1; i < totalRows; i++) {

				for (int j = 0; j < totalColumn; j++) {

					arrayExcelData[i - 1][j] = sheet.getCell(j, i).getContents();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return arrayExcelData;
	}

}
