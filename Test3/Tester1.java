package Tester;

public class Tester1 {
	
	public static String moveSpecialCharacters(String str) {
		StringBuilder result = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                specialChars.append(c);
            } else {
                result.append(c);
            }
        }
        result.append(specialChars);
        return result.toString();

		
	}

	public static void main(String[] args) {
	  String str ="Hello@#$%^&*";
		System.out.println(moveSpecialCharacters(str));
	}

}
