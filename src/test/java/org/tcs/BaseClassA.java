package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassA {

	static WebDriver driver;
	static Actions actions;
	static Select select;
	static WebDriverWait Wait;
	static JavascriptExecutor executor;
	static TakesScreenshot Screenshot;

	public static void browserLanuch(String url) {
		// 1
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}

	// 2
	public void maximize() {
		driver.manage().window().maximize();
	}

	// 3
	public WebElement findElementId(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}

	// 4
	public void Sendkeys(WebElement element, String data) {
		element.sendKeys(data);

	}

	// 5
	public WebElement findElementName(String Name) {
		WebElement Nam = driver.findElement(By.name(Name));
		return Nam;
	}
	


	// 6
	public void click(WebElement element) {
		element.click();
	}

	// 7
	public void clear(WebElement element) {
		element.clear();

	}

	// 8
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	// 9
	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	// 10
	public void close(WebDriver element) {
		element.close();
	}

	// 11
	public String currentUrl(WebDriver element) {
		String currentUrl = element.getCurrentUrl();
		return currentUrl;
	}

	// 12
	public String title(WebDriver element) {
		String title = element.getTitle();
		return title;
	}

	// 13
	public  void moveToElement(WebElement element) {
		Actions actions= new Actions(driver);
		actions.moveToElement(element).perform();
		
		
	}

	// 14
	public void dragandDrop(WebElement source, WebElement target) {
		actions.dragAndDrop(source, target).perform();
	}

	// 15
	public static void contextClick(WebElement element) {
		actions.contextClick(element).perform();

	}

	// 16
	public void doubleClick() {
		actions.doubleClick().perform();
	}

	// 17
	public void okInAlert() {
		driver.switchTo().alert().accept();
	}

	// 18
	public void cancelInAlert() {
		driver.switchTo().alert().dismiss();
	}

	// 19
	public static void dropDownText(WebElement element, String data) {
		select.selectByVisibleText(data);
	}

	// 20
	public void dropDownAttribute(WebElement element, String value) {
		select.deselectByValue(value);
	}

	// 21
	public void JavascriptText(WebElement element, String data) {
		executor.executeScript("arguments[0].setAttribute('value','+data+')", element);

	}

	// 22
	public static void dropByIndex(WebElement element, int index) {
		select.deselectByIndex(index);
	}

	// 23
	public void clickByJs(WebElement element) {
		executor.executeScript("arguments[0].click()", element);

	}

	// 24
	public String switchtochild(String nameorhandle) {
		driver.switchTo().window(nameorhandle);
		return nameorhandle;
	}

	// 25
	public int switchToFrame(WebElement element, int index) {
		driver.switchTo().frame(index);
		return index;
	}

	// 26
	public String switchtoFrameId(WebElement element, String Id) {
		driver.switchTo().frame(Id);
		return Id;
	}

	// 27
	public WebElement findelement( String className) {
		WebElement element = driver.findElement(By.className(className));
		return element;
			}
	// 28
	public WebElement findElementByxpath( String Name) {
		WebElement findElement = driver.findElement(By.xpath(Name));
		return findElement;
	}
	// 29

	public String allDragandDropAsText(WebElement element) {
		String text = element.getText();
		return text;
	}

	// 30
	public String allDragandDropAsAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}

	// 31
	public String allDragandDropFirstselect(WebElement element) {
		String firstSelectedOption = select.getFirstSelectedOption().getText();
		return firstSelectedOption;
	}

	// 32
	public boolean verifyMultipleSelectInDropdown() {
		boolean multiple = select.isMultiple();
		return multiple;

	}

	// 33
	public void implicitywait(WebElement element, Duration unit) {
		driver.manage().timeouts().implicitlyWait(unit);
	}

	// 34
	public boolean verifyDisplay(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	// 35
	public boolean enabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	// 36
	public boolean selected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

	// 37
	public int deselectByIndex(WebElement element, int index) {
		select.deselectByIndex(index);
		return index;
	}

	// 38
	public void deselectall(WebElement element) {
		select.deselectAll();
	}

	public void selectByValue(String value, WebElement element) {
		Select select = new Select(element);
		select.selectByValue(value);}
	
	// 39
	public void deselectByValue(WebElement element, String value) {
		select.deselectByValue(value);
	}

	// 40
	public void deselectByVisibleText(WebElement element, String text) {
		select.deselectByVisibleText(text);
	}

	// 41
	public void getParentWindow(WebElement element, String nameOrHandle) {
		driver.switchTo().window(nameOrHandle);
	}

	// 42
	public void getAllWindows(WebElement element, String eachwindowId) {
		driver.switchTo().window(eachwindowId);
	}

	// 43
	public void Takescreenshot(String pathname) throws IOException{
		
	TakesScreenshot ss =(TakesScreenshot) driver;
	File s = ss.getScreenshotAs(OutputType.FILE);
	File d= new File(pathname);
	FileUtils.copyFile(s, d);
		
		
		
	}

	// 44
	public File Takescreenshotelement(OutputType<File> file) {
		File screenshotAs = Screenshot.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
	}

	// 45
	public void refreshpage() {
		driver.navigate().refresh();
	}

	// 46
	public void backNavigation() {
		driver.navigate().back();
	}

	// 47
	public void fwdNavigation() {
		driver.navigate().forward();
	}

	// 48
	public void defaultcontent() {
		driver.switchTo().defaultContent();
	}

	// 49
	public File createNewFile(String location) {
		File file = new File(location);
		return file;

	}

	// 50
	public void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	// 51
	public void SelectbyIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public void SelectbyVisibleText(WebElement element, String string) {
		Select select = new Select(element);
		select.selectByVisibleText(string);
	}
	
	
	public String Excel(String pathname, String Sheet, int Row,int Cell) throws IOException {
		String data=null;
		File file = new File(pathname); 
		FileInputStream stream= new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(Sheet);
		Row row = sheet.getRow(Row);
		Cell cell = row.getCell(Cell);
		
		int cellType = cell.getCellType();
//		System.out.println(cellType);

		if (cellType == 1) {
			data = cell.getStringCellValue();
		}

		if (cellType == 0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("DD-MM-YYYY");

				data = dateformat.format(dateCellValue);

			} else {
				double db = cell.getNumericCellValue();
				long l = (long) db;
				data = String.valueOf(l);

			}

		}
		return data;
	}
	public void Sendvalues(WebElement element, String Data) {
		element.sendKeys(Data);
}


	}