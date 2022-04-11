public class FormattedText {

    private Alphabet[] alphabets;

    public FormattedText (String text) {
        alphabets = new Alphabet[text.length()];
        for (int i = 0; i < text.length(); i++) {
            alphabets[i] = new Alphabet(text.charAt(i));
        }
    }

    public void capitalised (int start, int end) {
        for (int i = start; i <= end; i++) {
            alphabets[i].isCapitalised = true;
        }
    }

    public int getNumberOfObjects() {
        return alphabets.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabets.length; i++) {
            sb.append(alphabets[i].isCapitalised? Character.toUpperCase(alphabets[i].character): alphabets[i].character);
        }
        return sb.toString();
    }
}
