package strings;


public class Validator {
	
	public static void main(String[] args) {
		Employee emp1=new Employee();
		validate(emp1);
	}
	public static void validate(Employee emp1) {
		boolean ans=isValidEmployeeId(Employee.empId);
		boolean ans1=isValidEmployeeEmail(Employee.empEmail);
		boolean ans2=isValidEmployeePhoneNo(Employee.empPhoneno);
		boolean ans3=isValidEmployeeAge(Employee.empAge);
		
		System.out.println(ans);
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		
	}
	
	public static Boolean isValidEmployeeId(Long empId) {
		String regex="([0-9]{6,7})";
		String p=empId.toString();
		if(p.matches(regex)) {
			return true;
		}
		return false;

	}
	public static Boolean isValidEmployeeEmail(String empEmail) {
		String regex="([A-Za-z0-9]{1}[A-Za-z0-9,-_.,@]{1,63})";
		if(empEmail.matches(regex)) {
			return true;
		}
		return false;


	}
	
	public static Boolean isValidEmployeePhoneNo(Long empPhoneno) {
		String regex="([1-9]{1}[0-9]{9})";
		String p=empPhoneno.toString();
		if(p.matches(regex)) {
			return true;
		}
		return false;
	}
		public static Boolean isValidEmployeeAge(Long empAge) {
			String regex="([1-9]{2})";
			String p=empAge.toString();
			if(p.matches(regex)) {
				return true;
			}
			return false;
}
}