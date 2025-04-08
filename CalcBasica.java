
/**
 * Escreva uma descrição da classe CalcBasica aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class CalcBasica
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
