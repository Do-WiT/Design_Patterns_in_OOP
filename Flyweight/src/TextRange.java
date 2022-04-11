public class TextRange {
    public int start, end;
    public boolean isCapitalised, isBold, isItalic, isUnderlined;

    public TextRange (int start, int end) {
        this.start = start;
        this.end = end;
    }

    public boolean covers(int position) {
        return position >= start && position <= end;
    }
}
