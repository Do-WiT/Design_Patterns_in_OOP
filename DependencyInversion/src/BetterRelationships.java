import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BetterRelationships implements RelationshipBrowser {
    protected List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

    public void addParentAndChild(Person parent, Person child){
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
    }

    @Override
    public List<Person> findAllChildrenOf(String name) {

        return relations.stream().filter(r -> Objects.equals(r.getFirst().getName(), name) && r.getSecond() == Relationship.PARENT)
                .map(Triplet::getThird).collect(Collectors.toList());
    }
}
