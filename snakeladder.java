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

	}
}
