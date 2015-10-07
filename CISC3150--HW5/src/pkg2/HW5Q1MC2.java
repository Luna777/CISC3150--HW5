//CISC 3150
//XIN GUAN
//10/07/2015

package pkg2;

//import the parent class from different package
import pkg1.HW5Q1MC1;

//this is the driver program
public class HW5Q1MC2{
	
	public static void main(String[] args){
		
		Child myClass= new Child();
		myClass.printX();
		
	}	
}

//this is the child class 
//extends the parent class from another package
class Child extends HW5Q1MC1{
	
	Child(){
	}
	
	public void printX(){
		System.out.println(super.x);
	}
	
}

