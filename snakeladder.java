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

	int playerposition= (int) Math.floor(Math.random() * 10 % 3);


		switch ((int) playerposition)
			{
		case 1 :
	   	playerposition  = diceroll;
		System.out.println("move ahead:" +playerposition);
		break;

		case 2 :
		playerposition = playerposition - diceroll;
                System.out.println("move back:" +playerposition);
		break;

		default:
		 System.out.println("same position:" +playerposition);
                
		}

	}
}
