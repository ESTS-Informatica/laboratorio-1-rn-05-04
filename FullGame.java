public class FullGame
{
    WordGuessingGame game;
    InputReader reader;
    
    public FullGame() {
        reader = new InputReader();
        game = new WordGuessingGame();
    }
    public void reset() {
        game = new WordGuessingGame();
    }
    public void play() {
        char option = 's';
        while(option == 's' || option == 'S')
        {
            game.play();
            option = reader.getChar("Type (s/S) to continue playing:" );
            reset();
        }
    }

}
