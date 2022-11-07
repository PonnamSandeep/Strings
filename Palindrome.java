package strings;




public class Palindrome {

	public static void main(String[] args) {
//		String.format("b"+""+"s");
		
		String str = "Geeks";
		reverseWord(str);
		System.out.println(str);

//		String str="Sanas";
//		System.out.println(isPalindrome(str));

	}
	
	public static String reverseWord(String str)
    {
        String rev="";
        // Reverse the string str
        for(int i=str.length()-1;i>0;i--){
            rev += str.charAt(i);
        }
        return rev;
    }
	public class Employee{
		int id=1000;
		protected String name="sm";
	}


	static boolean isPalindrome(String str) {
		if(str==null||str.length()==0) {
			return true;
		}
		str = str.toLowerCase();
		for(int i=0;i<=str.length()/2;i++) {
				char start=str.charAt(i);
				char end=str.charAt(str.length()-1-i);
				
				if(start!=end) {
					return false;
				}
		}
		return true;
	}

}
