package LogicalProgramm;

public class diffClassOfData {
	
	
	@org.testng.annotations.DataProvider(name="emp")
	public Object[] [] employeeData(){
		Object [] [] info = {{1 ,"xyz"}, {2 , "L"}, {3 , "pqr"}};
		return info;
	}
}
