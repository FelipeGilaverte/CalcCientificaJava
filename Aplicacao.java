/**
 * Calculadora científica multi operações.
 * Felipe Caliope das Merces Nascimento Gilaverte
 * Henrique Abreu Hollanda da Rocha
 * Murilo Carvalho Giroto
 * William da Silva Marquês
 */
public class Aplicacao
{   
    
    public static void main(String args[]){
        CalcCie cc = new CalcCie();
        CalcBasica cb = new CalcBasica();
          double result;
        if (args.length == 0 || args[0] == "grafico" || args[0] == "Grafico"){
            
            do{
                Vars.continuar = false;
                EntradaDeDados.graf();
            }while (Vars.continuar == true);
            
        }else{     
            EntradaDeDados entrada = new EntradaDeDados();
            do{
                Vars.continuar = false;
                
                String ops[] = entrada.ScannerEntrada();
                
                if (Verify.Isbasic(ops) == true){
                    result = cb.calcular(ops); 
                }else{
                    result = cc.calcular(ops); 
                }
                
                
                String newresult = String.valueOf(result);
                if (Vars.error == false){
                     Saida.print(newresult,false);
                     Saida.print("Digite (continuar) para realizar novos \ncalculos ou aperte Enter para fechar o programa",false);
                     String cont = entrada.Continue();
                     
                     if (cont != null && cont.equals("continuar")) {
                    Vars.continuar = true;
                    }else {
                        break;
                    }
                }
            }while (Vars.continuar == true);  
            
                      
        }   
   
    }
}