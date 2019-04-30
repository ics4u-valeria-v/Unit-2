package src;
import java.util.Scanner;

public class VehicleClass  {
	
	 public static void main(String[] args) {
		 //create the object related to vehicle class
	       vehicle myObj = new vehicle();
	       //declare local variables
	       Scanner reader = new Scanner(System.in);
	       
	       //F-I-R-S-T  V-E-H-I-C-L-E
	       
	       //PLATE NUMBER
	       //get the plate number from the user
	       System.out.print("Insert the plate number: ");
	       String plateNum = reader.nextLine();
	      //set the plate number to be equal to the user answer
	       myObj.plateNumSet(plateNum);
	       
	     //COLOR
	       //get the plate number from the user
	       System.out.print("Insert the color: ");
	       String color = reader.nextLine();
	      //set the plate number to be equal to the user answer
	       myObj.colorSet(color);
	     
	     //NUMBER OF DOORS
	       //get the plate number from the user
	       System.out.print("Insert the number of doors: ");
	       int doors = reader.nextInt();
	      //set the plate number to be equal to the user answer
	       myObj.doorsSet(doors);	       
	       
	       System.out.println("\n"+"Vehicle #1");
	     //display the plate number
	       System.out.println("Plate number: " + myObj.plateNumGet());
	     //display the color
	       System.out.println( "Color: " + myObj.colorGet());
	     //display the doors
	       System.out.println( "Number of doors: " + myObj.doorsGet());
	     //display the speed
	       System.out.println( "Speed: " + myObj.speedGet());
	     //display the max speed
	       System.out.println( "Speed: " + myObj.maxSpeedOneGet());
	       
//S-E-C-O-N-D  V-E-H-I-C-L-E
	       
	       String extra = reader.nextLine();
	       
	       //PLATE NUMBER
	       //get the plate number from the user
	       System.out.print("\n" + "Insert the plate number: ");
	       plateNum = reader.nextLine();
	       //set the plate number to be equal to the user answer
	       myObj.plateNumSet(plateNum);
	       
	     //COLOR
	       //get the plate number from the user
	       System.out.print("Insert the color: ");
	       color = reader.nextLine();
	      //set the plate number to be equal to the user answer
	       myObj.colorSet(color);
	     
	     //NUMBER OF DOORS
	       //get the plate number from the user
	       System.out.print("Insert the number of doors: ");
	       doors = reader.nextInt();
	      //set the plate number to be equal to the user answer
	       myObj.doorsSet(doors);	    
	       
	       System.out.println("\n"+"Vehicle #2");
	     //display the plate number
	       System.out.println("Plate number: " + myObj.plateNumGet());
	    //display the color
	       System.out.println( "Color: " + myObj.colorGet());
	     //display the doors
	       System.out.println( "Number of doors: " + myObj.doorsGet());
	     //display the speed
	       System.out.println( "Speed: " + myObj.speedGet());
	     //display the max speed
	       System.out.println( "Speed: " + myObj.maxSpeedTwoGet());
	    }
}

class vehicle 
{
	//create local variables/ properties
	String plateNum = " ";
	String color = " ";
	int doorsNum = 0;
	int speed = 0;
	int MAX_SPEED_1 = 60;
	int MAX_SPEED_2 = 70;
	
	//set and get plateNum
	public String plateNumGet()
	{
		return plateNum;
	}
	
	public void plateNumSet(String newNum)
	{
		plateNum = newNum;
	}
	
	//set and get color
	public String colorGet()
	{
		return color;
	}
	
	public void colorSet(String newColor)
	{
		color = newColor;
	}
	
	//set and get doors
	public int doorsGet()
	{
		return doorsNum;
	}
		
	public void doorsSet(int newDoors)
	{
		doorsNum = newDoors;
	}
	
	// get speed
	public int speedGet()
	{
		return speed;
	}
	
	//get max speed one
	public int maxSpeedOneGet()
	{
		return MAX_SPEED_1;
	}
	
	//get max speed one
	public int maxSpeedTwoGet()
	{
		return MAX_SPEED_2;
	}				
}
