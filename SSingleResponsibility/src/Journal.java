import java.util.ArrayList;
import java.util.List;


public class Journal {

    private List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text){
        entries.add(text);
    }

    public void removeEntry(int id){
        entries.remove(id);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
    /*
    public void saveToFile(String fileName, boolean overWrite){
        if (overWrite || new File(fileName).exists()){
            try(PrintStream out = new PrintStream(fileName)){
                out.println(toString());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

    }*/

}
