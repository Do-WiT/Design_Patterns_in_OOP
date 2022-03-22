public class Main {

    public static void main(String[] args) {
        Journal journal = new Journal();

        journal.addEntry("Trade Forex");
        journal.addEntry("Animal Word");


        Persistence persistence = new Persistence();

        String fileName = "journal.txt";
        persistence.saveToFile(journal,
                fileName,
                true);

        System.out.println(journal);


    }
}
