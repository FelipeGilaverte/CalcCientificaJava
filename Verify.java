
/**
 * Escreva uma descrição da classe Verify aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Verify
{
    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }   
    public static boolean isOperator(String str){

        if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
           return true;
        }else{
            return false;
        }
    }
    
    public static boolean Isbasic(String args[]){
        for (int i = 0; i <= args.length - 1; i++){
            
            if (args[i].contains("sqrt") || args[i].contains("!") || args[i].contains("sin")){
                
                return false;
            }
        }
        return true;
    }
}
