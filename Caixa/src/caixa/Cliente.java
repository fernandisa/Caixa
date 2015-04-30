package caixa;

public class Cliente {
    private String cpf;
    private String nome;
    private String nascimento;
    private String endereco;
    private boolean negativadoSPC;
    private boolean negativadoSERASA;
    
    Cliente ()
    {
        this.cpf = null;
        this.endereco = null;
        this.nascimento = null;
        this.negativadoSERASA = false;
        this.negativadoSPC = false;
             
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isNegativadoSPC() {
        return negativadoSPC;
    }

    public void setNegativadoSPC(boolean negativadoSPC) {
        this.negativadoSPC = negativadoSPC;
    }

    public boolean isNegativadoSERASA() {
        return negativadoSERASA;
    }

    public void setNegativadoSERASA(boolean negativadoSERASA) {
        this.negativadoSERASA = negativadoSERASA;
    }
    
    public boolean verificarCredito ()
    {
        return this.negativadoSERASA != false && this.negativadoSPC != false;
        
    }
    
    
}


