package test;

import javax.print.DocFlavor.STRING;

public class methods {
	int numberofvechicle(){
	return 4;
	}
	public void sub(int a,int b,float cf)
	{
		System.out.println(a-b-cf);
	}
	String str(String name ,String city)
	{
	return name+""+city;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methods s=new methods();
		
		s.sub(90, 70, 10);		
     System.out.println(s.numberofvechicle());
     System.out.println(s.str("priya", "Richmond"));
     
	}

}
