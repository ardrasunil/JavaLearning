
import java.util.Arrays;
import java.util.Scanner;

public class TestString4
{

public static void main(String[] args)
{
	String[] visits = new String[0];
	String k = new String();
	Scanner sc = new Scanner(System.in);
	boolean isContinue = true;
	while(isContinue)
	{
		System.out.println("enter the page you have visited");
		String s = sc.next();
		
		boolean flag = false;
		int count = 0;
		for(String str:visits)
		{ count += 1;
			if(str.substring(0,str.length()-4).equals(s))
			{
				flag = true;
				k = str;
				break;
			}
		}
		if(flag) {
			String found = k;
			String num = found.substring(found.length()-1);
			int c = Integer.parseInt(num);
			int newC = c + 1;
			String newStr = found.substring(0,found.length()-1);
			visits[count-1]= newStr.concat(String.valueOf(newC));
		
		}
		else {
			int lenC = visits.length;
			//System.out.println(lenHistory);
			//creating temp array
			String[] tempContainers = new String[lenC+1];
			for(int i =0;i<lenC;i++) {
			tempContainers[i]=visits[i];
			}
			tempContainers[lenC]=s.concat(" ## 1");
			visits=tempContainers;
		//error will come if I enter www
		}
		for(String str : visits) {
			System.out.println(str);
		}
		
		//System.out.println("Do you want to browse more(true/false)");
		//isContinue = sc.nextBoolean();
		}


	}


}