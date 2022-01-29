//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   char first = a.charAt(0);
	   char last = a.charAt(a.length() - 1);
	   String search = "aeiouAEIOU";

	   for (int i = 0; i < a.length(); i++) {
		   switch(a.charAt(i)) {
		   	case 'a':
		   	case 'e':
		   	case 'i':
		   	case 'o':
		   	case 'u':
		   	case 'A':
		   	case 'E':
		   	case 'I':
		   	case 'O':
		   	case 'U':
		   		if (i == 0 || i == a.length()-1) {
		   			return "yes";
		   		}

		   }
	   }
	   return "no";

	  }
}