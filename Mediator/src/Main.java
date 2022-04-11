public class Main {

    public static void main(String[] args) {
        Person john = new Person("John");
        Person jane = new Person("Jane");

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






    }
}
