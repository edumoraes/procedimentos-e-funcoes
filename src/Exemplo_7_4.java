import javax.swing.*;

public class Exemplo_7_4 {
    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(
                "Qual o número 1?"
        ));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(
                "Qual o número 2?"
        ));
        multiplicar(num1, num2); //Parâmetros reais
    }

    static void multiplicar(int a, int b) {
        int res;
        res = a * b;
        JOptionPane.showMessageDialog(
                null, "Resultado: " + res
        );
    }
}
