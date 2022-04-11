import java.util.ArrayList;
import java.util.List;

public class Person extends Observable<Person>{
    private String name;
    private List<String> chatLog;
    private ChatRoomMediator room;

    public void setRoom(ChatRoomMediator room) {
        this.room = room;
    }

    public Person(String name) {
        this.name = name;
        this.chatLog = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (this.name.equals(name))
            return;
        this.propertyChanged(this, "name", name);
        this.name = name;
    }

    public void receive(String sender, String message){
        String s = sender + ": '" + message + "'";
        chatLog.add(s);
        System.out.println("[" + this.name + "'s chat session]" + s);
    }

    public void say(String message){
        String s = "me:" + message + "'";
        chatLog.add(s);
        room.broadcast(this.name, message);
    }

    public void printChatLog(){
        System.out.println("[" + this.name + "'s chat log]");
        for (String msLog: chatLog) {
            System.out.println(msLog);
        }

    }

    public void privateMessage(String destination, String message) {
        String s = "me to " + destination + ": '" + message + "'";
        chatLog.add(s);
        room.message(name, destination, message);
    }



















}
