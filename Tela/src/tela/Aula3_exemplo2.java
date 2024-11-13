//Faça um programa que recebe dois numeros e calcule as soma deles e imprima em outra janela    

package tela;
//@author Camila

import javax.swing.JOptionPane;
import model.Calculadora;

public class Aula3_exemplo2 {

    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        
        calc.num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
        calc.num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero: "));
        
        JOptionPane.showMessageDialog(null, calc.num1 + " + " + calc.num2 + " = " + calc.somaNumeros());
        JOptionPane.showMessageDialog(null, calc.num1 + " - " + calc.num2 + " = " + calc.subtracaoNumeros());
        JOptionPane.showMessageDialog(null, calc.num1 + " * " + calc.num2 + " = " + calc.multiplicacaoNumeros());
        JOptionPane.showMessageDialog(null, calc.num1 + " % " + calc.num2 + " = " + calc.divisaoNumeros());
        
    }
    
}


