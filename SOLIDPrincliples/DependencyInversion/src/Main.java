public class Main {

    public static void main(String[] args) {
        Person parent = new Person("John");
        Person chris = new Person("Chris");
        Person matt = new Person("Matt");

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, chris);
        relationships.addParentAndChild(parent, matt);

        BetterRelationships betterRelationships = new BetterRelationships();
        betterRelationships.addParentAndChild(parent, chris);
        betterRelationships.addParentAndChild(parent, matt);

        new Research(relationships);
        //
        new Research(betterRelationships);


    }
}
