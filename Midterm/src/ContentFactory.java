import content.Comment;
import content.Post;

public class ContentFactory {
    public static Comment getNewComment(){
        return new Comment();
    }
    public static Post getNewPost(){
        return new Post();
    }
}
