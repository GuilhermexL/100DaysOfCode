
public static void main(String[] args) {

    LocalDate d01 = LocalDate.now();           // Aqui mostra a data
    Instant d02 = Instant.now();              // Aqui mostra a data e hora GMT (Londres)
    LocalDateTime d03 = LocalDateTime.now(); // Aqui mostra a data e hora local

    System.out.println(d01);
    System.out.println(d02);
    System.out.println(d03);

}