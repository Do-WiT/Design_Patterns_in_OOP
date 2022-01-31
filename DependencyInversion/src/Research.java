import java.util.List;

public class Research {
    public Research(Relationships relationships) {
        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
        relations.stream().filter(r -> r.getFirst().getName().equals("John") && r.getSecond() == Relationship.PARENT)
                .forEach(ch -> System.out.println("John has a child called " + ch.getThird().getName()));
    }

    public Research(RelationshipBrowser relationshipBrowser ) {
        List<Person> children = relationshipBrowser.findAllChildrenOf("John");
        for (Person p:children) {
            System.out.println("John has a child called " + p.getName());
        }


    }
}
