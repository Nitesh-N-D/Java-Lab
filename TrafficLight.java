import java.util.Scanner;

public class TrafficLight

{

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String Colour;

System.out.println("Enter the colour of traffic light(red,yellow,green):");

Colour=sc.nextLine();

Colour=Colour.toLowerCase();

switch(Colour)

{

case "red":

System.out.println("Stop");

break;

case "yellow":

System.out.println("Ready to move");

break;

case "green":

System.out.println("Go");

break;

default:

System.out.println("Invalid colour");

break;

}

sc.close();

}

}
