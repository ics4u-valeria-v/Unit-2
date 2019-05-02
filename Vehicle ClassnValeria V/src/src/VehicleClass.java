package src;
import java.util.Scanner;

public class VehicleClass  {
	
	 public static void main(String[] args) {
		 
		 //declare local variables 
		 String plateNum = "";
		 String color = "";
		 int doors = 0;
		 
		 //constructors
	      vehicle myObj = new vehicle( color, plateNum, doors );
	      vehicle bikeObj = new bike("red", 2, 1);
	       //declare local variables
	       Scanner reader = new Scanner(System.in);
	       
	      /* //F-I-R-S-T  V-E-H-I-C-L-E
	       
	       //PLATE NUMBER
	       //get the plate number from the user
	       System.out.print("Insert the plate number: ");
	       plateNum = reader.nextLine();
	       
	     //COLOR
	       //get the plate number from the user
	       System.out.print("Insert the color: ");
	       color = reader.nextLine();
	     
	     //NUMBER OF DOORS
	       //get the plate number from the user
	       System.out.print("Insert the number of doors: ");
	       doors = reader.nextInt();
	       
	       //ACCELERATION
	       System.out.print("Insert acceleration: ");
	       int accel =  reader.nextInt();
	       System.out.print("Insert time: ");
	       int time = reader.nextInt();
	       
	       
	       System.out.println("\n"+"Vehicle #1");
	     //display the information
	       System.out.println( myObj.toString());
	     //display the max speed
	       System.out.println( "Speed: " + myObj.maxSpeedOneGet());
	     //display final velocity
	       System.out.println( "Final velocity: " + myObj.accelerate(accel, time));
	       
      //S-E-C-O-N-D  V-E-H-I-C-L-E
	       
	       String extra = reader.nextLine();
	       
	       //PLATE NUMBER
	       //get the plate number from the user
	       System.out.print("\n" + "Insert the plate number: ");
	       plateNum = reader.nextLine();
	       
	     //COLOR
	       //get the plate number from the user
	       System.out.print("Insert the color: ");
	       color = reader.nextLine();
	     
	     //NUMBER OF DOORS
	       //get the plate number from the user
	       System.out.print("Insert the number of doors: ");
	       doors = reader.nextInt();    
	       
	       //ACCELERATION
	       System.out.print("Insert acceleration: ");
	       accel =  reader.nextInt();
	       System.out.print("Insert time: ");
	       time = reader.nextInt();
	       
	       System.out.println("\n"+"Vehicle #2");
	     //display the information
	       System.out.println( myObj.toString());
	     //display the max speed
	       System.out.println( "Speed: " + myObj.maxSpeedTwoGet());
	     //display final velocity
	       System.out.println( "Final velocity: " + myObj.accelerate(accel, time));*/
	       
	       
	       
	       //B-I-K-E
	 	     //COLOR
	 	      //set the plate number to be equal to the user answer
	 	    
	 	       
	 	       /*//ACCELERATION
	 	       System.out.print("Insert acceleration: ");
	 	       accel =  reader.nextInt();
	 	       System.out.print("Insert time: ");
	 	       time = reader.nextInt();*/
	 	       
	 	       System.out.println("Bike" );
	 	     //display the information
	 	       System.out.println( bikeObj.toString());
	 	     /*//display the max speed
	 	       System.out.println( "Speed: " + myObj.maxSpeedTwoGet());
	 	     //display final velocity
	 	       System.out.println( "Final velocity: " + myObj.accelerate(accel, time));*/
	       
	    }
}

//V-E-H-I-C-L-E
class vehicle 
{
	//create local variables/ properties
	String _plateNum = " ";
	String _color = " ";
	int _doorsNum = 0;
	int _speed = 0;
	int _MAX_SPEED_1 = 60;
	int _MAX_SPEED_2 = 70;
	
	//constructor
	public vehicle (String newColor,String newNum, int newDoors)
	{
		_plateNum = newNum;
		_color = newColor;
		_doorsNum = newDoors;
	}
	
	//Get and Set methods (Java doesn't have build in functions)
	//set and get plateNum
	public String plateNumGet()
	{
		return _plateNum;
	}
	
	
	//set and get color
	public String colorGet()
	{
		return _color;
	}
	
	//set and get doors
	public int doorsGet()
	{
		return _doorsNum;
	}
		
	
	// get speed
	public int speedGet()
	{
		return _speed;
	}
	
	//get max speed one
	public int maxSpeedOneGet()
	{
		return _MAX_SPEED_1;
	}
	
	//get max speed one
	public int maxSpeedTwoGet()
	{
		return _MAX_SPEED_2;
	}	
	
	public String toString()
	{
		return ("Plate number: " + plateNumGet() + "\n" + "Color: " + colorGet() + "\n" + "Number of doors: " + doorsGet());
	}
	
	//Protected methods
	protected int accelerate (int _accel, int _time)
	{
		int _finalSpeed = _speed + _accel*_time;
		return _finalSpeed;
	}
	
	protected int breaking (int _accel, int _time)
	{
		int _finalSpeed = _speed - _accel*_time;
		return _finalSpeed;
	}
}

////////////////////////////////////////////////////////////////////////////
//DAY 22 - INHERITANCE
////////////////////////////////////////////////////////////////////////////
class bike extends vehicle
{
	//declare local variables
	String _color;
	int _speed = 0;
	int _wheels;
	int _seats;
	final int _MAX_SPEED = 60;
	
	//bike class has one constructor
	public bike (String color, int wheels, int seats)
	{
		//invoke base-class
		super(color, "", 0);
		this._wheels = wheels;
		this._seats = seats;
		//this._color = color;
	}
	
	//Set & get methods
	
	//set and get color
	public String colorGet()
	{
		return(super.colorGet());
	}
	
	//get speed
	public int speedGet()
	{
	  return(super.speedGet());
	}
	
	//return the string
	public String toString()
	{
		return("Color: " + colorGet() + "\n" + "Speed: " + speedGet() + "\n" + "Wheels: " + _wheels + "\n" + "Seats: " + _seats + "\n" + "Max Speed: " + _MAX_SPEED);
	}
	
}
