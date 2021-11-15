//WAP to check whether the character is a vowel or consonant using switch block ?
class sample1{
	public static void main(String[] args) {
		char ch='o';
		switch(ch) {
		     case 'a' :
                                                case 'A' :
		      case 'e' :
		      case 'E' :
		      case 'i' :
		      case 'I' :
		      case 'o' :
		      case 'O' :     
		        case 'u' :
		        case 'U' : {
			System.out.println(ch+" is a vowel");
			break;
		        }   
		        default:
		            System.out.println(ch + "is a consonant");       
                                           }
                        }
}