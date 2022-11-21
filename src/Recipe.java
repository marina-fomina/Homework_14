import java.util.*;

public class Recipe {
    private final String recipeName;
    private Set<Product> products = new HashSet<>();

    private final double totalCost;

    public Recipe(String recipeName, Set<Product> products) {
        if (recipeName == null || recipeName.isBlank() || products == null || products.size() == 0) {
            throw new NotEnoughData("Не все поля заполнены.");
        }
        this.recipeName = recipeName;
        this.products = products;
        this.totalCost = countCostOfRecipe();
    }

    public double countCostOfRecipe() {
        double sum = 0;
        for (Product product : products) {
            sum = sum + product.getPrice();
        }
        return sum;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Блюдо - " + getRecipeName()).append(". Стоимость приготовления - " + getTotalCost()).append(" рублей. Состав продуктов: ").append('\n');
        for (Product product : this.products) {
            stringBuilder.append(product).append('\n');
        }
        return stringBuilder.toString();
    }

    public String getRecipeName() {
        return recipeName;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(recipeName, recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName);
    }
}

