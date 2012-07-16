public class OneRowNim2
{

private int nSticks = 7;
private int player = 1;
public OneRowNim2()
{
}

public OneRowNim2( int sticks )
{
nSticks = sticks ;
}
public OneRowNim2( int sticks ,
int starter )
{
nSticks = sticks ;
player = starter ;
}



public boolean takeSticks ( int num)
{
if (num < 1) return false ;

else if ( num > 4) return false ;
 
{

nSticks = nSticks - num;
player = 3 - player ;
return true ;
}

}
public int getSticks ()
{
return nSticks ;
}

public int getPlayer ()
{
return player ;
}

public boolean gameOver()
{
return ( nSticks <= 0);
}

public int getWinner ()
{
if ( nSticks < 1) return getPlayer () ;
else return 0;

}


public void report ()
{
System.out.println ("Number of sticksleft :"+getSticks());
System.out.println ("Next turn by player" +getPlayer());
}

}
//OneRowNim2