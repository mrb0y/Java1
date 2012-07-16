import java.util.Scanner;
public class Assign3
{

public static void main( String argv [ ] )
{Scanner input = new Scanner (System.in); 
OneRowNim2 game = new OneRowNim2(9);
int counter = 0;
while(game.gameOver() == false )
{
game. report ( );
System.out.print("\n");
//Why did you ask to have the remaining numbers 264 checked for <=4? 
System.out.print ("input the digits '582423264' one digit at a time and hit return:" );
int sticks = input.nextInt ();
game.takeSticks ( sticks );
if (sticks <=4)
counter=counter+1;
System.out.println ( );
}
game. report ( ) ;
System.out.print ("Game won by player ");
System.out.println (game. getWinner ( ) ) ;
System.out.println("Counter ="+ counter);
}
}
//Assign3