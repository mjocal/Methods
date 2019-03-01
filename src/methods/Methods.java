
package methods;

/**
 *
 * @author Majo Calderon
 */
public class Methods {

    public static void main(String[] args) {
        
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        
        // Assigning methods to variables
        int highScore = calculateHighScore(gameOver, score, levelCompleted, 
                        bonus);
        System.out.println("Final score was: " + highScore);
    
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        
        highScore = calculateHighScore(gameOver, score, levelCompleted, 
                        bonus);
        System.out.println("Final score was: " + highScore);
        
//        String player = "Michelle";
//        int position = 1;
//        score = 1500;
//        
//        String displayScorePosition = displayHighScorePosition(player, position);
//        int calculateScorePosition = calculateHighScorePosition(score);
//        
        int calculateScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Michelle", calculateScorePosition);

//        System.out.println(displayScorePosition + " and has a High Score "
//                + "Position of " + calculateScorePosition);
//        
//        player = "Yves";
//        position = 19;
//        score = 900;
//        
        calculateScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Yves", calculateScorePosition);
      
        calculateScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Majo", calculateScorePosition);
     
        calculateScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Emma", calculateScorePosition);
        
    }
    
    public static int calculateHighScore(boolean gameOver, int score, 
            int levelCompleted, int bonus){
        
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        
        return -1;
    }
    
    public static void displayHighScorePosition(String player, int position){

        System.out.println(player + " managed to get into position #" 
                           + position + " on the High Score Table");
    }
    
    public static int calculateHighScorePosition(int score){
        
        if (score >= 1000) {
            score = 1;
        } else if (score >= 500 && score < 1000){
            score = 2;
        } else if (score >= 100 && score < 500){
            score = 3;
        } else {
            score = 4;
        }
        
        return score;
    }
}
