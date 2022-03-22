import emojis.Angry;
import emojis.Emojis;
import emojis.Like;
import emojis.Love;

public class EmojisFactory {
    public static Like getLike(){
        return new Like();
    }
    public static Love getLove(){
        return new Love();
    }
    public static Angry getAngry(){
        return new Angry();
    }
}
