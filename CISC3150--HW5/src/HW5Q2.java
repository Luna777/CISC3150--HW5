//CISC 3150
//XIN GUAN
//10/07/2015
//
//Short Description:
// let's set the radius of the circle, r=1, and the center is
// at (0, 0). Then the square is in the first quadrant, from
// (0, 0) to (1, 1); the length of each edge is 1.
//
// In this case, each time I generate a point(x,y), where 
// x and y is random from 0 to 1, will be inside the square.
// The distance from the random point to center(0, 0) is
// d=sqrt(x^2+y^2). 
// If d>1, the point is outside the circle.
// If d<=1, the point is inside the circle.
//
// For picking 4 billion times random points,
// I break 4 billion up to 20* 200,000,000,
// because the largest "int" is around 2*10^8 and
// I want to show how much percentage the programming runs.

public class HW5Q2{
	public static void main(String[] args){	
		
		double x, y, d;
		double total=0; //total points falled inside the circle
		int inside=0;
		//running 20 loops for picking 200,000,000 points
		for(int i=0; i<20; i++){
			inside=0;
			//randomly generate 200,000,000 points 
			//and return how many times inside the circle.
			for(int j=0; j<200000000; j++){
				//get random x,y both from 0 to 1
				x= Math.random(); 
				y= Math.random();
				//the distance from (x,y) to center,(0,0)
				d= Math.sqrt(x*x + y*y);
				
				if(d<=1){
					inside++;//counter
				}
			}
			
			total=total+inside;
			//give some output for long time running
			System.out.println("----running-"+(i+1)*5+"%----");	
		}
		
		System.out.println("\n My Pi is: "+ total*4/4000000000.0);
	}
}





