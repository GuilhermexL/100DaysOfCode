package entities;
public class Product {

    public String name;
    public double price;
    public int quantity;

    // Adicionando Construtor
    public Product(String name, double price, int quantity){ // Parece com umas instancia normal mas não possui particularidades
        this.name = name; // O 'this' referencia para o próprio objeto
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        quantity = 0; // Como não tenho atributo não possui ambiguidade parametro
                      // Posso ou não atribuir
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}