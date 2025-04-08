
/**
 * Escreva uma descrição da classe EntradaDeDados aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;

   // Scanner sc = new Scanner(System.in);
     //  System.out.print("Digite o primeiro numero: ");
     //  String num1 = sc.next(); 
import javax.swing.JOptionPane;
public class EntradaDeDados
{
    
    Scanner sc = new Scanner(System.in);
    public String[] ScannerEntrada(){
       
       
       System.out.print("Digite a operação com espaços\n exemplo(1 + 2 + sqrt25 * 5! - sin90): ");
       String op = sc.nextLine();
       String[] ops = op.split("\\s+");

       return ops;
    }
    public String Continue(){
        String cont = sc.nextLine();
        return cont;
    }
     static void graf(){
        Vars.isGraf = true;
        CalcCie cc = new CalcCie();
        CalcBasica cb = new CalcBasica();
        String exp = JOptionPane.showInputDialog("Digite a operação com espaços\n exemplo(1 + 2 + sqrt25 * 5! - sin90): ");
        if (exp != null && !exp.isEmpty()){
            String[] ops = exp.split("\\s+");
            double result;
            
            if (Verify.Isbasic(ops) == true){
                    result = cb.calcular(ops); 
            }else{
                    result = cc.calcular(ops); 
            }
            
            String newresult = String.format("Resultado: %f", result);
            if (Vars.error == false){
                JOptionPane.showMessageDialog(null, newresult); 
                String cont = JOptionPane.showInputDialog("Digite (continuar) para realizar novos calculos");
                if(cont.equals("continuar")){
                    Vars.continuar = true;
                }
            }  
        }
        
        
    }
    
}
