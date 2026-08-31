package model;

import  java.util.Date;
import java.time.LocalDate;

public class Produto implements Comparable<Produto>{
    String descricao;
    int codigo;
    LocalDate data;

    public Produto(int codigo, String descricao, LocalDate data) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public String toString() {
        return "Produto{ Codigo=" + codigo + "," + ", descricao=" + descricao + "data=" + data + '}';
    }
    
    @Override
    public int compareTo(Produto outro) {
        //int compData....
        
    }
    
}
