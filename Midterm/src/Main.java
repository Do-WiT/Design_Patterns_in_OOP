public class Main {

    public static void main(String[] args) {
        test(new RefAbstraction1());
        test(new RefAbstraction2());

	// write your code here
    }

    public static void test(AbstractPost abstractPost){
        abstractPost.print();
    }
}
