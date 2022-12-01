
public class HadaniSlovImp implements HadaniSlov {
    String word = "FOODCHAIN";

    String word1 = word.replaceAll("[A-Z]", "_ ");


    public String getWord() {
        return word;
    }

    public String getWord1() {
        return word1;
    }
    String prevGuess = "";
    @Override
    public String CheckWord(String letter) {
        letter = letter.toUpperCase();
        boolean prevGuessWas = false;
        char letter2 = letter.charAt(0);
        prevGuessWas = prevGuess.contains(letter);
        boolean letterInWord = word.contains(letter);
        if (prevGuessWas) {
            System.out.println("You ALREADY guessed "
                    + letter + ". \n");
        }
        else {
            prevGuess += letter;
            if (letterInWord) {
                System.out.println(letter + " is present in the word.");
                System.out.print("\n");
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == letter2) {
                        word1 = word1.replaceAll("_ ", "_");
                        String word2;
                        word2 = word1.substring(0, i)
                                + letter
                                + word1.substring(i
                                + 1);
                        word1 = word2;
                    }
                }
            } else {
                System.out.println(letter + " is not present in the word.");
            }
        }
        if (word1.contains("_")) {
            return word1;
        }
        else {
            System.out.println("YOU WON");
            return word1;
        }
    }
}