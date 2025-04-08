
/**
 * Escreva uma descrição da classe Fatorial aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Fatorial
{
    public static double fat(double num){
        if (num < 0) return -1;
        double result = 1;
        for (double i = 2; i <= num; i++){
            result = result * i;
        }
        return result;
    }
}
