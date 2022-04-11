import java.util.ArrayList;
import java.util.List;

public class FlyweightFormattedText {
    private int[] characterIndex;
    private List<Alphabet> alphabetPool = new ArrayList<>();
    private List<TextRange> formatting = new ArrayList<>();
    public int getNumberOfObjects() {
        return alphabetPool.size();
    }

    public FlyweightFormattedText (String text) {
        characterIndex = new int [text.length()];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean foundChar = false;
            for (int j = 0; j < alphabetPool.size(); j++) {
                Alphabet a = alphabetPool.get(j);
                if (a.character == c) {
                    characterIndex[i] = j;
                    foundChar = true;
                    break;
                }
            }
            if (!foundChar) {
                Alphabet alphabet = new Alphabet(c);
                alphabetPool.add(alphabet);
                characterIndex[i] = alphabetPool.indexOf(alphabet);
            }
        }
    }

    public TextRange getRange (int start, int end) {
        TextRange range = new TextRange (start, end);
        formatting.add(range);
        return range;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < characterIndex.length; i++) {
            char c = alphabetPool.get(characterIndex[i]).character;
            for (TextRange range: formatting) {
                if (range.covers(i) && range.isCapitalised) {
                    c = Character.toUpperCase(c);
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
