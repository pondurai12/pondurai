package code;

public class StringMultiplication {
	public static void main(String[] args){
		String s1="-12";
		String s2="12";
		int a = Integer.parseInt(s1);
		int b =  Integer.parseInt(s2);
		int c =(int)a*b;
		String s3=Integer.toString(c);
		System.out.println("c : "+s3);
		}

}
