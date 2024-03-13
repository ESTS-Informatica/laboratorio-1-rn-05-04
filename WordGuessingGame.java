
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
    private WordGenerator generator;

    /**
     * Construtor para objetos da classe WordGuessingGame
     */
    public WordGuessingGame()
    {
        generator = new WordGenerator();
        // inicializa variáveis de instância
        hiddenWord = generator.generateWord();
        guessedWord = initializeGuessedWord();
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
    
    private void showWelcome(){
        System.out.println("Welcome to the world guessing game");
    }
    
    private String changeCharInPosition(int pos, char c, String s){
        char[] charArray = s.toCharArray();
        charArray[pos] = c;
        return new String(charArray);
    }
    
    private String initializeGuessedWord(){
        int len = hiddenWord.length();
        String newWord = "";
        for (int i = 0; i < len; i++)
        {
            newWord += "_";
        }
        return newWord;   
    }
    
    private boolean guess(char letter){
        int i = hiddenWord.indexOf(letter);
        boolean result = false;
        while (i >= 0){
            guessedWord = changeCharInPosition(i, letter, guessedWord);
            i = hiddenWord.indexOf(letter,i+1);
            result = true;
        }
        return result;
    }
    
    private void showResult(){
        System.out.println("A palavra foi encontrada com " +numberOfTries+ " tentativas");
    }

    
    public void play(){ //Nivel 2
        while (!guessedWord.equals(hiddenWord)){
            showWelcome();
            showGuessedWord();
            if (guess(reader.getChar("What letter is in the word?: "))){
                System.out.println("The letter is in the word");
            }else{
                System.out.println("The letter is not in the word");
            }
            System.out.println(guessedWord);
            numberOfTries++;
        }
        showResult();
    }
}