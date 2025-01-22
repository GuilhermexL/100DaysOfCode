public class Main {
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria();
        
        conta.setSaldo(1500);
        
        System.out.println("Saldo atual: R$ " + conta.getSaldo()); // Acessando o saldo usando o getter
    }
}