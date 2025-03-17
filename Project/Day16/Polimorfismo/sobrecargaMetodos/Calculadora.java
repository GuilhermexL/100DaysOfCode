package util;

// Praticando conceitos de Polimorfismo permite
// que o mesmo método seja usado de maneiras diferentes dependendo do contexto (ou classe).

/* 
Neste exemplo mostro uma particularidade, sobrecarga de método, que
*  Você define vários métodos com o mesmo nome, mas assinaturas diferentes
*  (número ou tipos de parâmetros).                                     
*/

public class Calculadora {
    // Somar dois números
    public int somar(int a, int b) {
        return a + b;
    }

    // Somar três números
    public int somar(int a, int b, int c) {
        return a + b + c;
    }
}