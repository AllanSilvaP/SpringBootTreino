package barbeariaaguiareal.com.barbearia.models.entities;

public class Cliente {
    
    private int id;
    private String nome;
    private String cpf;

    public Cliente (int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }
    //setters
    public void setId (int id) {
        this.id = id;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }

    public int getId () {
        return this.id;
    }

    public String getNome () {
        return this.nome;
    }

    public String getCpf () {
        return this.cpf;
    }
}
