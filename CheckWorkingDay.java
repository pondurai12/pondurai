package code;
import java.util.*;
public class CheckWorkingDay {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		if(s1.equalsIgnoreCase("sunday")){
			System.out.println("false");
		}
		else{
			System.out.println("true");
		}
	}

}
