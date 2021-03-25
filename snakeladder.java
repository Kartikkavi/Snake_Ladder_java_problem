import java.util.Random;

public class snakeladder
{
        public static void main(String args[])
        {
                int playerposition = 0,  playerpreviousposition = 0;

                int startpoint = 0;
                while (playerposition <= 100){


                Random random = new Random();
                int diceroll = (random.nextInt(6))+1;


                Random rand = new Random();
                int Check= rand.nextInt(3);

                 playerpreviousposition = playerposition;
                switch (Check)
                        {
		
                case 0 :
                playerposition = playerposition;
               // System.out.println("player same position");
		break;

                case 1 :
                playerposition  = diceroll + playerposition;
                //System.out.println("player move ahead"+diceroll+" position.");
                break;

                case 2 :
                playerposition = playerposition - diceroll;
                //System.out.println(" player move back" );
                break;

                default:
                 System.out.println("Invalid option");

                                }
                if (playerposition < 0){
                  playerposition =  startpoint;}
                else if (playerposition > 100 ){
                  playerposition =  playerpreviousposition;}
                else if ( playerposition == 100 ){
                break ;}
                  }
                System.out.println(playerposition);
                System.out.println("Player win");
        }
}
