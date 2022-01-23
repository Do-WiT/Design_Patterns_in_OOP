import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product book = new Product("cartoon", Color.GREEN, Size.MEDIUM);
        Product fruit = new Product("banana", Color.GREEN, Size.SMALL);
        Product house = new Product("house", Color.RED, Size.LARGE);

        List<Product> products = List.of(book, fruit, house);

        ProductFilter pf = new ProductFilter();
        System.out.println("Green products by old filter");
        pf.filterByColor(products, Color.GREEN)
                .forEach(product -> System.out.println(" -> " + product.name + " : " + product.color));


        ProductBetterFilter pbf = new ProductBetterFilter();
        System.out.println("Green products by better filter");
        pbf.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(product -> System.out.println(" -> " + product.name + " : " + product.color));

        System.out.println("Green and Small Product.");
        pbf.filter(products,
                new AndSpecification<>(
                        new ColorSpecification(Color.GREEN),
                        new SizeSpecification(Size.SMALL)
                ))
                .forEach(product -> System.out.println(
                        " -> " + product.name + " : " + product.color + " and " + product.size
                ));



    }
}
