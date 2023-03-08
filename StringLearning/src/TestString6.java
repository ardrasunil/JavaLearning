import java.util.StringTokenizer;
public class TestString6 {
	
	public static void main(String[] args) {
			StringTokenizer st = new StringTokenizer(" my, name, is, Ardra",",");  
			while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());  
	         
	         StringBuilder sb = new StringBuilder("ardra.com##1");
	         System.out.println(sb.substring(0, sb.lastIndexOf("#")));
	     }  
	}

}
