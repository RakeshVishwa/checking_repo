package BasicThing;


	
	
	class Accounts{
		  int a;
		  int b;
		 public void setData(int c,int d){
		   a=c;
		   b=d;
		   
		 }
		 public void showData(){
		   System.out.println("Value of a ="+a);
		   System.out.println("Value of b ="+b);
		   
		 }
	}
	
	public class ArraysOfObject {
	
	   public static void main(String args[]){
		     Accounts obj[] = new Accounts[3] ;
		     obj[0] = new Accounts();
		     obj[1] = new Accounts();
		     obj[2] = new Accounts();
		    obj[0].setData(1,2);
		    obj[1].setData(3,4);
		    obj[2].setData(5,6);
		    System.out.println("For Array Element 0");
		    obj[0].showData();
		    System.out.println("For Array Element 1");
		     obj[1].showData();
		     System.out.println("For Array Element 2");
		     obj[2].showData();
		    }
}
