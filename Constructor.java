import java.util.Scanner;
public class Constructor {
	
	Constructor(String name,int code){
	//	System.out.println("welcome");
		String collageName=name;
		int collageCode = code;
		System.out.println("collage name is: "+collageName);
		System.out.println("college code is: "+collageCode);
		
	}
	public static void main(String[]args) { 
		
		Constructor obj= new Constructor("XYZ",101);
	}
}














