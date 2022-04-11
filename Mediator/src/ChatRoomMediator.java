import java.util.ArrayList;
import java.util.List;

public class ChatRoomMediator {
    private List<Person> people = new ArrayList<>();


    public void broadcast(String source, String message){
        for (Person p:people) {
            if (!p.getName().equals(source)){
                p.receive(source,message);
            }
        }

    }

    public void join (Person p) {
        String joinMsg = p.getName() + " joins the chat";
        broadcast("room", joinMsg);
        p.setRoom(this);
        people.add(p);
    }

    public void message (String source, String destination, String message) {
        for (Person person : people)
        {
            if (person.getName().equals(destination))
            {
                person.receive(source, message);
                return;
            }
        }
    }


}
