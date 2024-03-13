
/**
 * Escreva uma descrição da classe WordGuessingGame aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WordGuessingGame
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    private InputReader reader;

    /**
     * Construtor para objetos da classe WordGuessingGame
     */
    public WordGuessingGame()
    {
        // inicializa variáveis de instância
        hiddenWord = "abc";
        guessedWord = "___";
        numberOfTries = 0;
        reader = new InputReader();
    }
    
    public String getHiddenWord(){
        return hiddenWord;
    }
    public String getGuessedWord(){
        return guessedWord;
    }
    public int getNumberOfTries(){
        return numberOfTries;
    }
    
    public void showGuessedWord(){
        System.out.println("Guessed Word: " + guessedWord);
    }

}
