//package genericsexamples;
//
//public class DemoGenerics {
//	public static void main(String[] args) {
//		Sender <Integer,Integer> s1=new Sender<Integer,Integer> ();	
//		
//		s1.setData(12);
//		s1.setData1(15);
//		System.out.println(s1.getData() + s1.getData1());
//		
//		System.out.println(s1);
//		
//		Sender<String,Float> s2 =  new Sender<String,Float>();
//		s2.setData("Hello");
//		s2.setData1(15.1f);
//		System.out.println(s2);
//		
//	}
//
//}



package genericsexamples;

public class DemoGenerics {
  static int add(int a,int b) 
  {
	  return a+b;
  }
  static int add(int a,int b,int c) {
	  return a+b+c;
	  
  }
  static double add(double a,double b)
  {
	  return a+b;
  }
  
  public static void main(String[] args) {
	  System.out.println(add(7,5));
	  
	  System.out.println(add(4,4,5));
	  
	  System.out.println(add(4d,5d));
  }
  
  
  
  
  

}
