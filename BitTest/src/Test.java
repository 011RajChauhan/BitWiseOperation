import java.util.ArrayList;

public class Test {

	public static void main(String args[]) {
		int a = 60;			//60 = 0011 1100
		int b = 13;			//13 = 0000 1101
		
		int and = 0;
		int or = 0;
		int XOR = 0;
		int compliment = 0;
		int leftShift = 0;
		int rightShift = 0;
		int zeroFillRight = 0;
		
		and = a & b;				//0011 1100	
									//0000 1101
									//0000 1100			
									//	12
		
		System.out.println("a & b = "+and);
		
		or = a | b;					//0011 1100
									//0000 1101
									//0011 1101
									// 61
		
		System.out.println("a | b = "+or);
		
		XOR = a ^ b;				//0011 1100
									//0000 1101
									//0011 0001	
		
		System.out.println("a ^ b = "+XOR);
		
		compliment = ~a;			//0011 1100
									//1100 0011
		
		System.out.println(" ~a = "+compliment);
		
		leftShift = a << 2;			//0011 1100
									//1111 0000
		
		System.out.println("a << 2 = "+leftShift);
		
		rightShift = a >> 2;		//1111 0000
									//0011 1100
		
		System.out.println("a << 2 = "+rightShift);
		
		zeroFillRight = a >>> 2;
		
		System.out.println("a >>> 2 = "+zeroFillRight);
		
		// create an array of strings
		String[] strings = new String[10];

		// cast it to an array of objects
		Object[] objects = strings;

		// insert an object into the array
		objects[0] = new Object();
		System.out.println(objects);
		
	}	

}
