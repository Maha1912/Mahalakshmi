package baselayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import excelutilis.Xlsreader;

public class base1 {
		// TODO Auto-generated method stub
		public WebDriver driver;
		Xlsreader obj= new Xlsreader("E:\\Book5.xlsx");
		@BeforeMethod
		public void setup() {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pinterest.com/");
		}
		//@AfterMethod
		//public void tearDown() {
		//driver.quit();
		//}
		@DataProvider(name ="Credentials1")
		public Object[][] getExcelData() {
		//Totals rows count
		int rows=obj.getRowCount("Data");
		//Total Columns
		int column=obj.getColumnCount("Data");
		int actRows=rows-1;
		Object[][] data= new Object[actRows][column];
		for(int i=0;i<actRows;i++) {
		for(int j=0; j<column;j++) {
		data[i][j]=obj.getCellData("Data", j, i+2);
		}
		}
		return data;
		}
}
