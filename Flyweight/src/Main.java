public class Main {

    public static void main(String[] args) {
        FormattedText ft = new FormattedText("Make America Great Again");
        System.out.println(ft);
        ft.capitalised(5, 11);
        System.out.println(ft);
        System.out.println(ft.getNumberOfObjects());

        FlyweightFormattedText fft = new FlyweightFormattedText("Make America Great Again");

        System.out.println(fft);
        System.out.println(fft.getNumberOfObjects());
        fft.getRange(5, 11).isCapitalised = true;
        System.out.println(fft);
    }
}
