package caixa;
import javax.swing.JOptionPane;
public class Caixa {

    public static void main(String[] args) {
        Conta mymoney = new Conta ();
        Cliente c = new Cliente ();
        String opcao;
       do {
           JOptionPane.showMessageDialog(null,"Menu do Banco:\n1. Abrir Conta\n2. Depositar\n3. Sacar\n4. Fechar conta\n5. Mostrar saldo\n6.Verificar crédito"
                   + "7. Sair\n");

        opcao = JOptionPane.showInputDialog("Digite sua opção:");
       
           switch (opcao)
        {
            case "1" : 
            {
                String numero, corren, agenc;
                
                numero = JOptionPane.showInputDialog("Digite o número da conta:");
            
                corren = JOptionPane.showInputDialog("Digite o nome do correntista:");
            
                agenc = JOptionPane.showInputDialog("Digite o nome da agência");
                
                mymoney.Abertura(numero, corren, agenc);
                
                JOptionPane.showMessageDialog(null,"Sua conta foi aberta!");
                break;    
            }
            case "2" : 
            {
                
                mymoney.depositar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para depositar:")));
                
                 break;
            }
            case "3" : 
            {
                Double sac;
               
                
                sac = (Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para sacar:")));
                
                mymoney.sacar(sac);
                
                
                break;
            }
            case "4" : 
            {
               mymoney.fecharConta(true);
               
               break;
            }
            case "5" :
            {
                JOptionPane.showMessageDialog(null,"Saldo: " + mymoney.getSaldo());
                
                break;
            }
            case "6" :
            {
                String negativadoSERASA, negativadoSPC;
                negativadoSERASA = JOptionPane.showInputDialog("Está negativado no SERASA?(S/N)");
                negativadoSPC = JOptionPane.showInputDialog("Está negativado no SPC?(S/N)");
                if ("S".equals(negativadoSERASA) )
                {
                    c.setNegativadoSERASA(true);
                    
                }
                if ("S".equals(negativadoSPC))
                {
                    c.setNegativadoSPC(true);
                }
                else {
                    c.setNegativadoSERASA(false);
                    c.setNegativadoSPC(false);
                }
                break;
                
            }
            case "7" :
            {
               JOptionPane.showMessageDialog(null,"Encerrando app.");
                break;
            }
            
            default : 
            {
               JOptionPane.showMessageDialog(null,"Essa opção nÃ£o existe.");
               break;
            }
      }
    }while (!"5".equals(opcao) );
}
}
    
    

