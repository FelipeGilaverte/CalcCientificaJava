
/**
 * Escreva uma descrição da classe Hello aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.lang.Math;
import java.util.regex.*;

public class CalcCie
{
    
  double calcular(String args[]){
                
        int tam = args.length;
        String op = null;
        double result = 0;
        for(int i = 0; i <= tam - 1;i++){
            boolean isNum = true;
            double Num = 0;
            if (Verify.isDouble(args[i])){
                Num = Double.parseDouble(args[i]);
            }else if (args[i].contains("sin")){
                 Pattern pattern = Pattern.compile("\\((\\d+)\\)");
                 Matcher matcher = pattern.matcher(args[i]);
                 String numeroString;
                 if (matcher.find()) {
                    String numero = matcher.group(1);
                    numeroString = numero;
                } else {
                    String saida = String.format("Operação invalida\nErro na expressão: %s",args[i]);
                    Saida.print(saida,true);
                    break;
                }
                double Num1 = Double.parseDouble(numeroString); 
                Num = Math.sin(Math.toRadians(Num1));
            }else if (args[i].contains("sqrt")){
                 Pattern pattern = Pattern.compile("\\((\\d+)\\)");
                 Matcher matcher = pattern.matcher(args[i]);
                 String numeroString;
                 if (matcher.find()) {
                    String numero = matcher.group(1);
                    numeroString = numero;
                } else {
                    String saida = String.format("Operação invalida\nErro na expressão: %s",args[i]);
                    Saida.print(saida,true);
                    break;
                }
                
                 double Num1 = Double.parseDouble(numeroString);
                 Num = Math.sqrt(Num1);
            }else if (args[i].contains("!")){
                 String[] fat = args[i].split("!");
                 String numeroString = fat[0];
                 double Num1 = Double.parseDouble(numeroString);
                 int numInt = (int) Num1;
                 Num = Fatorial.fat(numInt);
                 if (Num == -1){
                     Saida.print("Operacao invalida (Fatorial negativo)",true);
                 }
            
            }else if (Verify.isOperator(args[i]) == true){
                 isNum = false;
                 op = args[i];
            }else{
                isNum = false;
                String saida = String.format("Operação invalida\nErro na expressão: %s",args[i]);
                Saida.print(saida,true);
                result = 0;
                break;
            }
            if (isNum == false && i == 0){
                Saida.print("Operação invalida\nA expressão precisa começar com um numero.",true);
                break;
            }
            if (i == 0){
                result = Num;
            }else{
                if (isNum == true) {
                    switch (op){
                         case "+": result = result + Num;
                         break;
                         case "-": result = result - Num;
                         break;
                         case "*": result = result * Num;
                         break;
                         case "/": if (Num != 0){
                             result = result / Num;
                         }else{
                             Saida.print("Operação invalida\nImpossivel dividir por 0.",true);
                         }
                             
                        break;
                    }
                }
            }
        }
                return result;
 }       
       
       
       
   
}
