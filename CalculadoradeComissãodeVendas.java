
import javax.swing.JOptionPane;

public class CalculadoradeComissãodeVendas { //Início do programa

    public static void main(String[] args) { //Início da programação
        
        // Declaração das variáveis
        
        double vlrtotal=0.0, lucro5=0.0, lucro7=0.0, lucro10=0.0, bonus5=0.0, bonus7=0.0, bonus10=0.0;
        int quantvenda=11;
        
        // Declaração
        JOptionPane.showMessageDialog(null, "Calculadora de Comissão de Vendas");
        
        // Entrada de dados
                // Entrada de dados com conversão de tipos juntas
                // Conversão do tipo de variável para saída de dados do tipo Double
        vlrtotal= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor total das vendas"+
                 "\n R$: "));
        quantvenda= Integer.parseInt(JOptionPane.showInputDialog("Quantas vendas foram realizadas?")); 
        
            // Cálculo das porcentagens
            lucro5= vlrtotal+vlrtotal*5.0/100.0;
            lucro7= vlrtotal+vlrtotal*7.0/100.0;
            lucro10= vlrtotal+vlrtotal*10.0/100.0;
            bonus5= lucro5*2.0/100.0;
            bonus7= lucro7*2.0/100.0;
            bonus10= lucro10*2.0/100.0;
            vlrtotal++;
            quantvenda++;
 
        // Entrada de dados
            // Repetição e saída
        while (vlrtotal<1000.00) { // while o vlrtotal das vendas for menor do que R$ 1000,00          
            // Comando se a condição for verdadeira
            JOptionPane.showMessageDialog(null, "Sua comissão é de 5% sobre o valor total das vendas. \n R$: "+lucro5);  
            JOptionPane.showMessageDialog(null, "Deseja realizar um novo cálculo?"+vlrtotal);
          
            }  // Fim while para vlrtotal > R$ 1000,00       
                
                // Comando se a condição for falsa
                if (vlrtotal>=1000.00 && vlrtotal<=5000.00) { // if o vlrtotal for maior e igual a R$ 1000,00 e menor e igual a R$ 5000,00
                        // Comando se a condição for verdadeira
                        JOptionPane.showMessageDialog(null, "Sua comissão é de 7% sobre o valor total das vendas. \n R$: "+lucro7);                     
                       
                        } // Fim do if para R$1000,00 =< vlrtotal <= R$ 5000,00
                
                        // Comando se a condição for falsa
                        else if (vlrtotal>5000.00) { // else if o vlrtotal for maior do que R$ 5000,00
                                    // Comando se a condição for verdadeira
                                    JOptionPane.showMessageDialog(null, "Sua comissão é de 10% sobre o valor total das vendas. \n R$: "+lucro10);
                                                    
                                    } // Fim do else if para vlrtotal > R$ 5000,00       
            // Repetição e saída                 
                if (quantvenda > 10) { // if quando a quantvenda for maior a 10 unidades
                        // Comando se a condição for verdadeira
                        JOptionPane.showMessageDialog(null, "Você receberá um bônus adicional de 2% sobre o valor total das vendas! R$: "+bonus5);
                        JOptionPane.showMessageDialog(null, "Você receberá um bônus adicional de 2% sobre o valor total das vendas! R$: "+bonus7);
                        JOptionPane.showMessageDialog(null, "Você receberá um bônus adicional de 2% sobre o valor total das vendas! R$: "+bonus10);                        
                        }  // Fim do if para quantvenda  
                
    } // Fim do método
                                    
} // Fim da classe  
        

