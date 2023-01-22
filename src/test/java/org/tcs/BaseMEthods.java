package org.tcs;



	import java.awt.AWTException;
	import java.awt.Robot;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.List;

	import org.apache.commons.io.FileUtils;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseMEthods {
		
		 public static WebDriver  driver;
		//1 URL METHOD
		public static void browserLaunch(String url) {
			
			WebDriverManager.chromedriver().setup();
			
			 driver = new ChromeDriver();
			
			driver.get(url);
			driver.manage().window().maximize();
		}
		//2 MAXIMIZE ME
		
//		public void maximize() {
//			
//			driver.manage().window().maximize();
			

		//} 
		//3 GET TITLE METHOD
		
		public void title() {
			
			String title = driver.getTitle();
			
			System.out.println(title);
			
		}
		//4 FindElement BY.ID METHOD
		
		public static  WebElement findelementID(String id) {
			
			WebElement element = driver.findElement(By.id(id));
			
			return element;
		}
		
		//5 SendKeys METHOD
		
		public void sendkeyID(WebElement element,String data) {
			
			element.sendKeys(data);
			
		}
		
		//6 FindElement BY.Name METHOD
		
		public WebElement FindElementName(String Name) {
			
			WebElement name = driver.findElement(By.name(Name));
			return name;

		}
		
		
		
		//7 click METHOD
		
		public void click(WebElement c) {
			
			c.click();
		}
		
		//8 GET TEXT METHOD
		
		public String getText (WebElement text) {
			
			String t = text.getText();
			return t;
				
		}
		
		//9 Attribute method
		
		public  String getAttribute(WebElement A) {
			
			String attribute = A.getAttribute("value");
			
			System.out.println(attribute);
			
			return attribute;
			
			
		}
		
		//10 Xpath method
		
		public WebElement findxpath(String xpath ) {
			
			WebElement findElement = driver.findElement(By.xpath(xpath));
			return findElement;
			
		}
		
		//11 close method
		
			public  void close() {
				
				driver.close();
				
				}
			
			//12  quit method
			
			
			public void quit() {
				
				driver.quit();
			}
			
			
			
		
		//13 ACTION (move to element method)
		
		public void movetoelement(WebElement target) {
			
			Actions a = new Actions(driver);
			
			 a.moveToElement(target).perform();
			
			}
		
		//14 drag & drop method
		
		public void dragdrop(WebElement source, WebElement dest) {
			
			
			Actions a = new Actions(driver);
			
			a.dragAndDrop(source,dest ).perform();
			
		}
		
		
		//15 Right click
		
		public void rightclick(WebElement e) {
			
			Actions aa = new Actions(driver);
			
			 aa.contextClick(e).perform();
			
			}
		
		//16 clear method
		
		public String clear( WebElement e) {
			
			e.clear();
			return null;
			
		}
		
		//17doubleclick method
		
		public void doubleclick(WebElement e) {
			
			Actions aa = new Actions(driver);
			
			 aa.doubleClick(e).perform();
			
			}

		//18alert accept method
		
		public void alertaccpet() {
			
			Alert al = driver.switchTo().alert();
			
			al.accept();
			
			}
		 
		//19alert cancel method
		
		public void alertcancel() {
			
			Alert al = driver.switchTo().alert();
			
			al.dismiss();
			
			}
		
		//20 alert gettext method
		
		
		public String alertgettext() {
			
			Alert al = driver.switchTo().alert();
			
			String text = al.getText();
			 System.out.println(text);
			return text;
			
			}
		
		//21screenshotmethod
		
		public void screenshot(WebElement e) {
			
			File source = e.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("path");
			
		}
		
		//22selectby value method
		
		public void selectbyvalue(WebElement element,String value) {
			
			Select s = new Select(element);
			
			s.selectByValue(value);
		}
		
		//23 select by visibletext method
		
		public void selectbyvisibletext(WebElement element,String text) {
			
			Select s = new Select(element);
			
			s.selectByVisibleText(text);
			
			
		}
		
		//24 select by index method
		
			public void selectbyindex(WebElement element,int index) {
				
				Select s = new Select(element);
				
				s.selectByIndex(index);
				
			}
			
			//25getoption method
			
			public List<WebElement> getoption(WebElement element) {
				
				Select s = new Select(element);
				
				List<WebElement> options = s.getOptions();
				
				
				
				
				return options;
				
			
			}
			
			//26getall optionmethod
			
			public List<WebElement> allgetoption(WebElement element) {
				
				Select s = new Select(element);
				
				List<WebElement> alloptions = s.getAllSelectedOptions();
				
				for (int i = 0; i <alloptions.size() ; i++) {
					
					System.out.println(alloptions.get(i).getText());
					
					return alloptions;
				}
				return alloptions;
			}
			
			
			
			
				//27getfirstselectoption
				
				
				public WebElement firstselectoption (WebElement element) {
					
					Select s = new Select(element);
					
					WebElement firstSelectedOption = s.getFirstSelectedOption();
					
					return firstSelectedOption;
					
				}
					
					//28ismutablemethod
				
				public boolean mutable (WebElement element) {
					
					Select s = new Select(element);
					
	                boolean multiple = s.isMultiple();
	                
	                System.out.println(multiple);
					return multiple;
				}
					
				//29.findlocatorbyName
	                
				public WebElement findelementClass(String className) {
					
					WebElement element = driver.findElement(By.className(className));
							
					
					return element;
				}
				   //30 sleep
				
				public void sleep(int milliseconds) throws InterruptedException {
					
					Thread.sleep(milliseconds);
				}
				
				//31 robot class keypress method
				
				public void  keypress(int keycode) throws AWTException {
				
				Robot r = new Robot();
				
				r.keyPress(keycode);
				
			}
				//32 robot class keyrelease method
				
				public void  keyrelease(int keycode) throws AWTException {
				
				Robot r = new Robot();
				
				r.keyRelease(keycode);
				
			}
				//33 robot class keydown method
				
				public void  keydown(CharSequence key) {
				
				Actions a = new Actions(driver);
				
				a.keyDown(key);
				
			
				
			}
				
				//34 robot class keyup method
				
				public void  keyup(CharSequence key) {
				
				Actions a = new Actions(driver);
				
				a.keyUp(key);
				
			
				
			}
				//35 scrolldown
				
				public void scrolldown(WebElement element) {
					
					JavascriptExecutor exe = (JavascriptExecutor)driver;
					
					exe.executeScript("argument[0].scrollintoview(true)",element);
					
				}
				

				//35 scrolldown
				
				public void scrollup(WebElement element) {
					
					JavascriptExecutor exe = (JavascriptExecutor)driver;
					
					exe.executeScript("argument[0].scrollintoview(false)",element);
					
				}
				
				//36TakeScreenshot
				
				public void takeScreenshot(String pathname ) throws IOException {
					
					TakesScreenshot ss= (TakesScreenshot) driver;
					
					
					
					File s= ss.getScreenshotAs(OutputType.FILE);
					
					File d =new File(pathname);
					
					FileUtils.copyFile(s, d);
					
				
					
				}
				
				//37create new file
				
				public File newfile(String location) {
					
					File f= new File(location);
					return f;
					
			}
				//38copy nd paste file
				
				public void copypastefile(String sourcelocation,String destlocation) throws IOException {
					
					File s = new File(sourcelocation);
					File d = new File(destlocation);
					
					FileUtils.copyFile(s, d);
				}
				
				//39url using navigation
				
				public void navigationUrl(String url) {
					
					driver.navigate().to(url);
					
				}
				
				//40Navigation backward
			
				public void navigationbackward() {
					
					driver.navigate().back();
					
				}
			
				//41Navigation foeward
				
				public void navigationforward() {
					
					driver.navigate().forward();
					
				}
				
				//42Navigation refresh
				
				public void navigationrefresh() {
					
					driver.navigate().refresh();
					
				}
				
			//43 deselectbyindex
				
				public void deselectbyindex(WebElement e,int index) {
					
					Select s = new Select(e);
					
					s.deselectByIndex(index);
					
				}
			
				//44 deselectall
				
				public void deselectall(WebElement e ) {
					
					Select s = new Select(e);
					
					s.deselectAll();
					
				}
				
				//45deselectbyvalue
			
				public void deselectbyvalue(WebElement e,String value ) {
					
					Select s = new Select(e);
					
					s.deselectByValue(value);
					
				}
			

				//46deselectbytext
				
				public void deselectbytext(WebElement e,String text ) {
					
					Select s = new Select(e);
					
					s.deselectByVisibleText(text);
					
				}
			
				//47switchtoframe nameOrId 
		
			public void switchtoframeid(String nameOrId) {
				
				driver.switchTo().frame(nameOrId);
				
			}
			
			
			//48switchtoframe 
			
			public void switchtoframeindex(int index) {
				
				driver.switchTo().frame(index);
				
			}
			 //49 defaultcontent
			
			public void defaultcontent() {
				
				driver.switchTo().defaultContent();
			}
			 //50wait
			
			public void waitmethod() throws InterruptedException {
				
				driver.wait();
			}
					
			
			
			//50.excelread
			
			public String Excelread(String pathname, String SheetName,int rowNO,int cellNO) throws IOException {
				
				String data = null;
				
				File file = new File(pathname);
				
				FileInputStream stream = new FileInputStream(file);
				
				Workbook workbook = new XSSFWorkbook(stream);
				
				Sheet sheet = workbook.getSheet(SheetName);
				
				Row row = sheet.getRow(rowNO);
				
				Cell cell = row.getCell(cellNO);
				
				int cellType = cell.getCellType();
				
				if (cellType==1) {
					
					 data = cell.getStringCellValue();
					 
				} 
					 
					if (cellType==0) {
						
						if (DateUtil.isCellDateFormatted(cell)) {
							
							
							Date dateCellValue = cell.getDateCellValue();
							
							SimpleDateFormat dateformat = new SimpleDateFormat("dd-mmm-yyyy");
							
							data = dateformat.format(dateCellValue);
							
						}	
							
						else {
							
							double numericCellValue = cell.getNumericCellValue();
							
							long l = (long)numericCellValue;
							
							 data = String.valueOf(l);
							
							
						}
						
						
						
							
		}
					return data;
					
			}

					//51.excelsendvalues
					
					public void excelsendvalues(WebElement element,String data) {
						
						
						
						element.sendKeys(data);
						
						
					}
					
					
					
				//52.EXCEL WRITE DATA
					
					
					public String ExcelWrite(String pathname, String SheetName,int rowNO,int cellNO,String ordernumber) throws IOException {
					
					
						File file = new File(pathname);
						
						Workbook workbook = new XSSFWorkbook();
						
						Sheet sheet = workbook.createSheet(SheetName);
						
						
						Row row = sheet.createRow(rowNO);
						
						Cell cell = row.createCell(cellNO);
					
						cell.setCellValue(ordernumber);
						

						FileOutputStream output = new FileOutputStream(file);
						
						workbook.write(output);
						
						
						return ordernumber;
						
					
				
					}
				
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
					
}
