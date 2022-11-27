import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductList {
private final Set<Product> products = new HashSet<>();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов:").append('\n');
        for (Product product : this.products) {
            stringBuilder.append(product).append('\n');
        }
        return stringBuilder.toString();
    }

    public void addProductToList(Product product) {
        if (product == null) {
            return;
        }
        if (this.products.contains(product)) {
            throw new ExistingElementException("Такой продукт уже есть в списке!");
        } else {
            this.products.add(product);
        }
    }

    public void checkProduct(String name) {
        for (Product product : this.products) {
            if (product.getProductName().equals(name)) {
                product.setChecked();
                System.out.println("Продукт " + name + " куплен.");
                break;
            } else {
                System.out.println("Продукт " + name + " не куплен.");
                break;
            }
        }
    }

    public void removeProduct(String name) {
        Iterator<Product> productsIterator = this.products.iterator();
        while (productsIterator.hasNext()) {
            if (productsIterator.next().getProductName().equals(name)) {
                productsIterator.remove();
                break;
            }
        }
    }

}
