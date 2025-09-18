package com.br.exemplo.biblioteca;
public class Membro{
    private Long id;
    private String nome;
    private String cpf;

    //constructor

public Membro(Long id, String nome, String cpf){
    this.id = id;
    this.nome = nome;
    this.cpf = cpf;
}

    //getters

public Long getId(){
    return id;
}
public String getNome(){
    return nome;
}
public String getCPF(){
    return cpf;
}
    
    //setters

public void setId(Long id){
    this.id = id;
}
public void setNome(String nome){
    this.nome = nome;
}
public void setCPF(String cpf){
    this.cpf = cpf;
}

    //MENU

@Override
public String toString(){
    return "Membro{" +
    "id: " + id + 
    " | nome: " + nome +
    " | cpf: " + cpf;
}
}