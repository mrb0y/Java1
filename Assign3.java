import java.io.InputStream;
import java.util.Scanner;
public class Assign3
{
public static void main( String argv [ ] )
{ Scanner input = new Scanner (System.in); 
OneRowNim2 game = new OneRowNim2(11);
while(game.gameOver() == false )
{
game. report ( );

System.out.print ("Input 1 , 2 , or 3: " );
int sticks = input.nextInt ();

game.takeSticks ( sticks );

System.out.println ( );
}

game. report ( ) ;

System.out.print ("Game won by player ");
System.out.println (game. getWinner ( ) ) ;
}


}
//Assign3