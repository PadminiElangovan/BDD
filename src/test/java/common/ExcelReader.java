package common;

	import java.io.File;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.LinkedHashMap;
	import java.util.List;
	import java.util.Map;
	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class ExcelReader {
		public static int totalRow;

	    public List<Map<String, String>> getData(String excelFilePath, String sheetName)
	            throws InvalidFormatException, IOException {
	        try (Workbook workbook = WorkbookFactory.create(new File(excelFilePath))) {
	            Sheet sheet = workbook.getSheet(sheetName);
	            return readSheet(sheet);
	        }
	    }
	    private List<Map<String, String>> readSheet(Sheet sheet) {
	        Row row;
	        Cell cell;
	        totalRow = sheet.getLastRowNum();

	        List<Map<String, String>> excelRows = new ArrayList<>();
	        if (totalRow > 0) {
	            Row headerRow = sheet.getRow(0);
	            for (int currentRow = 1; currentRow <= totalRow; currentRow++) {

	                row = sheet.getRow(currentRow);
	                int totalColumn = row.getLastCellNum();
	                LinkedHashMap<String, String> columnMapData = new LinkedHashMap<>();
	                for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {
	                    cell = row.getCell(currentColumn);
	                    String columnHeaderName = headerRow.getCell(currentColumn).getStringCellValue();
	                    String cellValue = (cell != null) ? cell.getStringCellValue() : "";
	                    columnMapData.put(columnHeaderName, cellValue);
	                }

	                excelRows.add(columnMapData);
	            }
	        }
	        return excelRows;
	    }

	    public int countRow() {
	        return totalRow;
	    }



}
