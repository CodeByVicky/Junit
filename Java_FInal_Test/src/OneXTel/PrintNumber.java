package OneXTel;

public class PrintNumber {

	public static void main(String[] args) {
		for(int i=0;i<20;i++) {
			 if(i%3==0) {
				 System.out.println("OneX");
			 }else if(i%5==0 && i%3==0) {
				 System.out.println("OneXTel");
			 }else if(i%5==0) {
				 System.out.println("Tel");
			 }else {
				 System.out.println(i);
			 }
			 
		}

	}

}
