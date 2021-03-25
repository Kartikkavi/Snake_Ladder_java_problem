import java.util.Random;

public class snakeladder
{
	public static void main(String grgs[])
	{
		int startpoint = 0;
		System.out.println("PlayerStartPoint:" +startpoint);
		Random random = new Random();
		int diceroll = (random.nextInt(6))+1;

		System.out.println("Dice Number:"+diceroll);

	       
                Random rand = new Random();
                int empCheck= rand.nextInt(3);
		int playerposition =0;

                switch (empCheck)
                        {
                case 0 :
                playerposition = playerposition;
                System.out.println("player same position");

                case 1 :
                playerposition  = diceroll + playerposition;
                System.out.println("player move ahead:"+diceroll+" position.");
                break;

                case 2 :
                playerposition = playerposition - diceroll;
                System.out.println(" player move back" );
                break;

                default:
                 System.out.println("Invalid option");
        
		}

	}
}
