import java.util.Objects;
import java.util.Set;

public class Product {
    private final String productName;
    private Double price;
    private Double amount;
    private boolean checked;

    public Product(String productName, Double price, Double amount) {
        if (productName == null || productName.isBlank()) {
            throw new NotEnoughData("Заполните карточку товара полностью!");
        } else {
            this.productName = productName;
        }
        setPrice(price);
        setAmount(amount);
        this.checked = false;
    }

    public String toString() {
        String checkedString = this.isChecked() ? "да" : "нет";
        return getProductName() + ". Цена - " + getPrice() + " рублей. Количество - " + getAmount() + " кг. Куплен: " + checkedString;
    }

    public String getProductName() {
        return productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price != null && price > 0) {
            this.price = price;
        } else {
            throw new NotEnoughData("Заполните карточку товара полностью!");
        }
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        if (amount != null && amount > 0) {
            this.amount = amount;
        } else {
            this.amount = 1.0;
        }
    }

    public void setChecked() {
        this.checked = true;
    }

    public boolean isChecked() {
        return checked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName,product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }
}
