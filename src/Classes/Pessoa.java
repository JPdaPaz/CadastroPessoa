package Classes;

import java.io.Serializable;
import java.util.Date;

public class Pessoa implements Serializable{
    String nome;
    char sexo;
    Date dataNasc;
    String nacionalidade;

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, char sexo, Date dataNasc, String nacionalidade) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNasc = dataNasc;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
}
