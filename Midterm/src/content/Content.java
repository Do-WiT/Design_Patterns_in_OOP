package content;

import emojis.Angry;
import emojis.Emojis;
import emojis.Like;
import emojis.Love;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Content implements Feelings, Message{

    private HashMap<String, Integer> feelings;
    private List<Content> discussion;
    private String message;

    public Content() {
        this.feelings = new HashMap<>();
        this.feelings.put(new Like().detail(), 0);
        this.feelings.put(new Love().detail(), 0);
        this.feelings.put(new Angry().detail(), 0);
        this.discussion = new ArrayList<>();
        this.message = "";
    }

    @Override
    public void setFeelings(Emojis emoji) {
        int oldCount = feelings.get(emoji.detail());
        feelings.replace(emoji.detail(), oldCount, oldCount +1);
    }

    @Override
    public String getFeelings() {
        sort();
        String res = "";
        for (String k: feelings.keySet()) {
            res += feelings.get(k) + ":" + k + ", ";
        }

        return res;
    }

    @Override
    public void setMessage(String message) {
        message = message;
    }

    public void reply(Content comment){
        discussion.add(comment);
    }

    public void delete(Content content){
        discussion.remove(content);
    }

    public Content getComment(int num){
        return discussion.get(num);
    }

    private void sort(){

    }
}
