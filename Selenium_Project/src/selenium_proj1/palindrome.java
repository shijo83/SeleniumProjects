package selenium_proj1;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String pal_org ="Malayalam";
String pal = pal_org.toLowerCase();
int startPos=0;
int endPos = pal.length() -1;

boolean isPal = true;

while(startPos < endPos)
{
	String startLetter = pal.substring(startPos, startPos+1);
	String endLetter = pal.substring(endPos, endPos+1);
	
	if(startLetter.equals(endLetter)==false)
	{
		isPal=false;
		break;
	}
	startPos++;
	endPos--;
}

if(isPal==true)
{
	System.out.println(pal+ " is a palindrome!");
	}
else
	System.out.println(pal+ " is not a palindrome!");
	}
}


