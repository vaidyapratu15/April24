package LogicalProgramm;

import org.testng.annotations.Test;

public class DataProvider {
	
	
	@org.testng.annotations.DataProvider(name="info")
	public Object[] [] employeeData(){
		Object [] [] info = {{1 ,"pratiksha"}, {2 , "L"}, {3 , "Vaidya"}};
		return info;
	}
	
	@Test (dataProvider = "info")
	public void data(int no , String name) {
		System.out.println(no + ":" + name);
	}
	
	
	//-----Data form diff class ----------
	
	@Test (dataProvider = "emp", dataProviderClass = diffClassOfData.class)
	public void diffclassdata(int no , String name) {
		System.out.println("----Data from diff class----");
		System.out.println(no + ":" + name);
	}
	

}
