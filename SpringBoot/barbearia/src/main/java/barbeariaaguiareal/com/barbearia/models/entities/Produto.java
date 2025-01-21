package barbeariaaguiareal.com.barbearia.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotBlank
    private String nome;

    @Min(0)
    private double preco;

    @Min(0) 
    @Max(1)
    private double desconto;

    public Produto () {
    }


    public Produto(String nome, double preco,  double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    

    
}
