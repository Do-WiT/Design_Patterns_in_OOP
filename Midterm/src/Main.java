import content.Content;

public class Main {

    public static void main(String[] args) {

        Content post1 = ContentFactory.getNewPost();
        post1.setMessage("This is first Post.");
        post1.setFeelings(EmojisFactory.getLike());
        post1.setFeelings(EmojisFactory.getLike());
        post1.setFeelings(EmojisFactory.getLove());

        Content comment1 = ContentFactory.getNewComment();
        comment1.setMessage("I see.");
        post1.reply(comment1);

        comment1.setFeelings(EmojisFactory.getLove());

        System.out.println(post1.getFeelings());
        System.out.println(post1.getComment(0).getFeelings());
        post1.delete(comment1);
        System.out.println(post1.getComment(0).getFeelings());


    }

}
