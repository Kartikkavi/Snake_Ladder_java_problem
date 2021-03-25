import java.util.Random;

public class snakeladder
{
        public static void main(String args[])
        {
                int player1position = 0,  player1previousposition = 0;
		int player2position = 0,  player2previousposition = 0;
                int player1startpoint = 0;
		int player2startpoint = 0;
		int Dice1counter = 0;
		int Dice2counter = 0;

                while ((player1position <= 100) && (player2position <= 100)){


                Random random = new Random();
                int dice1roll = (random.nextInt(6))+1;
		Dice1counter++;

                Random rand = new Random();
                int Check1= rand.nextInt(3);

		
                Random ran = new Random();
                int dice2roll = (ran.nextInt(6))+1;
                Dice2counter++;

                Random ra = new Random();
                int Check2= (ra.nextInt(3));


                 player1previousposition = player1position;
		 player2previousposition = player2position;

                switch (Check1)
                        {

                case 0 :
                player1position = player1position;
               // System.out.println("player same position");
		break;

                case 1 :
                player1position  = dice1roll + player1position;
                //System.out.println("player move ahead"+dice1roll+" position.");
                break;

                case 2 :
                player1position = player1position - dice1roll;
                //System.out.println(" player move back" );
                break;

                default:
                 System.out.println("Invalid option");

                          }


		switch (Check2)
                        {

                case 0 :
                player2position = player2position;
               // System.out.println("player same position");
                break;

                case 1 :
                player2position  = dice2roll + player2position;
                //System.out.println("player move ahead"+dice1roll+" position.");
                break;

                case 2 :
                player2position = player2position - dice2roll;
                //System.out.println(" player move back" );
                break;

                default:
                 System.out.println("Invalid option");
	                }


                if (player1position < 0){
                  player1position =   player1startpoint ;}
                else if (player1position > 100 ){
                  player1position =  player1previousposition;}
                else if ( player1position == 100 ){
                break ;}

		
                if (player2position < 0){
                  player2position =   player2startpoint ;}
                else if (player2position > 100 ){
                  player2position =  player2previousposition;}
                else if ( player2position == 100 ){
                break ;}

		}

		if ( player1position == 100 ){
		System.out.println("Player 1 wins.");}
		else if ( player2position == 100 ){
		System.out.println("Player 2 wins.");}
		System.out.println("Num of Time Dice 1 roll=" + Dice1counter);
	        System.out.println("Num of Time Dice 1 roll=" + Dice2counter);

        }
}


