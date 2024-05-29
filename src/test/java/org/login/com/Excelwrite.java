package org.login.com;

import java.io.File;


import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwrite {
	public static void main(String[] args) throws IOException {
		File excelloc = new File("C:\\Users\\PRAKASH\\eclipse-workspace\\Framework10Am\\Data\\newfolder");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet();
		Row r = s.createRow(2);
		Cell c = r.createCell(2);
		c.setCellValue("java");
		FileOutputStream fout = new FileOutputStream(excelloc);
		w.write(fout);
		System.out.println("Done");
	}
	

}
