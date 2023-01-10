import javax.swing.*;

public class Exemplo_7_2 {
    public static void main(String[] args) {
        int numero;
        int fat;
        numero = Integer.parseInt(JOptionPane.showInputDialog(
                "Qual é o número?"
        ));
        fat = fatorial(numero);
        JOptionPane.showMessageDialog(
                null, "O fatorial de " + numero + " é " + fat
        );
    }

    static  int fatorial(int numero) {
        int f = 1;
        for(int i = 1; i <= numero; i++)
            f = f * i;
        return f;
    }
}
