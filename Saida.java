/**
 * Escreva uma descrição da classe Saida aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import javax.swing.JOptionPane;
public class Saida
{
  
   
 
    public static void print(String msg,boolean erro){
        Vars.error = erro;
        if (Vars.isGraf == false){
            System.out.println(msg);
        }else{
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}
