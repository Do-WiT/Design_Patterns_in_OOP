public class Main implements Observer<Person>{

    static Person john, jane, simon;
    static ChatRoomMediator roomMediator;

    public static void main(String[] args) {

        /*

        System.out.println("===Mediator===");
        ChatRoomMediator chatRoomMediator = new ChatRoomMediator();

        chatRoomMediator.join(john);
        chatRoomMediator.join(jane);

        john.say("Hi room");
        jane.say("Hello");

        Person simon = new Person("Simon");
        chatRoomMediator.join(simon);
        simon.say("Hi everyone");

        jane.say("Hi Simon");
        john.say("Hello Simon");

        jane.privateMessage("Simon", "What do you like ?");

        System.out.println();
        john.printChatLog();
        System.out.println();
        jane.printChatLog();
        System.out.println();
        simon.printChatLog();

         */


        john = new Person("John");
        jane = new Person("Jane");
        simon = new Person("Simon");
        roomMediator = new ChatRoomMediator();


        new Main();
        john.setName("forever alone");



    }

    public Main(){
        john.subscribe(this);
        jane.subscribe(this);
        simon.subscribe(this);
    }



    @Override
    public void handle(PropertyChangedEvent<Person> args) {
        String s = args.source.getName() + "'s "+ args.propertyName + " has been changed to " + args.newValue;

        System.out.println(s);
        roomMediator.broadcast("room", s);
    }
}
