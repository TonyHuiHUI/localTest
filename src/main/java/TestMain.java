import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;
import org.junit.Test;

public class TestMain {

    @Test
    public void testExcelByteBuffer() {

        Runtime ru = Runtime.getRuntime();
        long totalMemoryStart = ru.totalMemory();
        long freeMemoryStart = ru.freeMemory();
        long consumeMemoryStart = totalMemoryStart - freeMemoryStart;
        long beginTime = System.currentTimeMillis();
        System.err.println(String.format(">>>> begin <<<< total: %s, free: %s, consume: %s", totalMemoryStart, freeMemoryStart, consumeMemoryStart));
        // 创建excle
        XSSFWorkbook work = new XSSFWorkbook();
        // 创建一个sheet表
        XSSFSheet sheet = work.createSheet("test");
        XSSFRow firstRow = sheet.createRow(0);
        for (int n = 0; n < 10; n++) {
            XSSFCell cell = firstRow.createCell(n);
            cell.setCellValue(String.format("第%s列", n));
        }
        // 创建10列，20000 行数据
        for (int i = 1; i <= 20000; i++) {
            XSSFRow row = sheet.createRow(i);
            for (int j = 0; j < 10; j++) {
                XSSFCell cell = row.createCell(j);
                cell.setCellValue(String.format("%s , %s", i + "行", j + "列"));
                cell.setCellStyle(getNormalCellStyle(work));
            }
        }

        long totalMemoryEnd = ru.totalMemory();
        long freeMemoryEnd = ru.freeMemory();
        long consumeMemoryEnd = totalMemoryEnd - freeMemoryEnd;
        long endTime = System.currentTimeMillis();
        long consumeTime = endTime - beginTime;
        System.err.println(String.format(">>>> end <<<< total: %s, free: %s, consume: %s, memory increase: %s, time: %s ms",
                totalMemoryEnd, freeMemoryEnd, consumeMemoryEnd, consumeMemoryEnd - consumeMemoryStart, consumeTime));

        FileOutputStream outStream = null;
        // 写出文件
        try {
            File outFile = new File("test1.xlsx");
            outStream = new FileOutputStream(outFile);
            work.write(outStream);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != outStream) {
                try {
                    outStream.flush();
                    outStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testSXSSFWorkbookByteBuffer() {

        Runtime ru = Runtime.getRuntime();
        long totalMemoryStart = ru.totalMemory();
        long freeMemoryStart = ru.freeMemory();
        long consumeMemoryStart = totalMemoryStart - freeMemoryStart;
        long beginTime = System.currentTimeMillis();
        System.err.println(String.format(">>>> begin <<<< total: %s, free: %s, consume: %s", totalMemoryStart, freeMemoryStart, consumeMemoryStart));
        /** OPCPackage方式只能用于读，大文件读可以减小内存消耗
        OPCPackage opcPackage = OPCPackage.create("E:/logs/test.xlsx");
        **/
        SXSSFWorkbook work;
        try {
            work = new SXSSFWorkbook(100);
        } catch (Exception e) {
            System.err.println(e);
            return;
        }
        // 创建一个sheet表
        Sheet sheet = work.createSheet("test");
        Row firstRow = sheet.createRow(0);
        for (int n = 0; n < 10; n++) {
            Cell cell = firstRow.createCell(n);
            cell.setCellValue(String.format("第%s列", n));
        }
        // 创建10列，20000 行数据
        for (int i = 1; i <= 20000; i++) {
            Row row = sheet.createRow(i);
            for (int j = 0; j < 10; j++) {
                Cell cell = row.createCell(j);
                cell.setCellValue(String.format("%s , %s", i + "行", j + "列"));
            }
        }

        long totalMemoryEnd = ru.totalMemory();
        long freeMemoryEnd = ru.freeMemory();
        long consumeMemoryEnd = totalMemoryEnd - freeMemoryEnd;
        long endTime = System.currentTimeMillis();
        long consumeTime = endTime - beginTime;
        System.err.println(String.format(">>>> end <<<< total: %s, free: %s, consume: %s, memory increase: %s, time: %s ms",
                totalMemoryEnd, freeMemoryEnd, consumeMemoryEnd, consumeMemoryEnd - consumeMemoryStart, consumeTime));

        FileOutputStream outStream = null;
        // 写出文件
        try {
            File outFile = new File("test2.xlsx");
            outStream = new FileOutputStream(outFile);
            work.write(outStream);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != outStream) {
                try {
                    outStream.flush();
                    outStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public  XSSFCellStyle getNormalCellStyle(XSSFWorkbook workbook){
        XSSFCellStyle titleCellStyle = workbook.createCellStyle();
        titleCellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        titleCellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);

        titleCellStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN); //下边框
        titleCellStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);//左边框
        titleCellStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);//上边框
        titleCellStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);//右边框

        titleCellStyle.setBottomBorderColor(HSSFColor.BLACK.index);
        titleCellStyle.setLeftBorderColor(HSSFColor.BLACK.index);
        titleCellStyle.setRightBorderColor(HSSFColor.BLACK.index);
        titleCellStyle.setTopBorderColor(HSSFColor.BLACK.index);
        return titleCellStyle;
    }
}
