package exe;
import javax.swing.JOptionPane;
//@author Camila
     
public class Exemplo1 {
    
    public static void main(String[] args) {
        
        String resp = JOptionPane.showInputDialog(null, "Digite algo:", "Titulo", JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "Voce digitou: " + resp,"Resposta" , JOptionPane.PLAIN_MESSAGE);
        
        
                
    }
    
}
