package calculadoraimc;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class CalculadoraIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float altura, peso,calImc;
        String respAltura, respPeso;
        
        respPeso = JOptionPane.showInputDialog("digite seu Peso");
        peso = Integer.parseInt(respPeso);
        
        respAltura = JOptionPane.showInputDialog("digite sua altura");
        altura = Integer.parseInt(respAltura);
        
        calImc = peso / ((altura / 100) * (altura / 100));
        
        if (calImc < 17){
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f",
                    calImc) + "\n Situação: Muito abaixo do peso");
        }else if ((calImc > 17) && (calImc < 18.49)){
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", 
                    calImc) + "\n Situação: Abaixo do peso");        
        }else if ((calImc > 18.50) && (calImc < 24.99)){
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", 
                    calImc) + "\n Situação: Peso normal"); 
        }else if ((calImc > 25) && (calImc < 29.99)){
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", 
                    calImc) + "\n Situação: Acima do peso");
        }else if ((calImc > 30) && (calImc < 34.99)){
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", 
                    calImc) + "\n Situação: Obesidade I");
        }else if ((calImc > 35) && (calImc < 39.99)){
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", 
                    calImc) + "\n Situação: Obesidade II [severa]");
        
        }else{
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", 
                    calImc) + "\n Situação: Obesidade III [mórbida]");
        }               
    }
}
  

