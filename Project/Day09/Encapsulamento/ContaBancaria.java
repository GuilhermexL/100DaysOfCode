public class ContaBancaria {

    // Tratando com Encapsulamento: Função onde protegemos os dados de uma classe.

    private double saldo; // Adicionando atributo privado

    public double getSaldo(){ // Obtendo o valor com getter
        return saldo;
    }

    public void setSaldo (double saldo) { // Modificando o valor com o setter
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo Inválido");
        }
    }
}
