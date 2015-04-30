package caixa;

public class Conta {
    private String agencia;
    private String num_conta;
    private String nome_correntista;
    private Double saldo;
    private Boolean ativa;
    private Cliente correntista;
    private Gerente gerente;
    
    
    
    Conta ()
    {
        this.agencia = null;
        this.ativa = false;
        this.nome_correntista = null;
        this.num_conta = null;
        this.saldo = 0.0;
        this.correntista = new Cliente ();
        this.gerente = new Gerente ();
        
    }
  
    public Boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
   
 
    public Cliente getCorrentista ()
    {
        return correntista;
    }
    
    public String getAgencia ()
    {
        return this.agencia;
    }
    
    public String getNum_conta ()
    {
        return this.num_conta;
    }
    
    public String getNome_correntista ()
    {
        return this.nome_correntista;
    }
    
    public Double getSaldo ()
    {
        return this.saldo;
    }
    
    public void setAgecia (String agencia)
    {
        this.agencia = agencia;
    }
    
    public void setNum_correntista (String nome_correntista)
    {
        this.nome_correntista = nome_correntista;
    }
    
    public void setSaldo (Double saldo)
    {
        this.saldo = saldo;
    }
    

 
    void Abertura(String nconta, String nm_cor, String nragencia) {
        agencia = nragencia;
        num_conta = nconta;
        nome_correntista = nm_cor;
        saldo = 0.0;
        ativa = true;
    }

    boolean fecharConta(boolean desativar) {

        if (saldo == 0.0) 
        {
            ativa = false;
            return true;
        } 
        else
        {
            return false;
        }

    }
   boolean sacar (double vl_transacao){
       if (ativa == true && vl_transacao <= saldo)
       {
            saldo = saldo - vl_transacao;
           return true;
       }
       else 
       {
           return false;
       }
           
   }
   
   double retornarSaldo (){
       return saldo;
   }
   
   
   boolean depositar (double deposito){
    
    if (ativa == true ){
    saldo = saldo + deposito;   
        return true;
    }
    else
    {
        return false;
    }
    
}
   
}
