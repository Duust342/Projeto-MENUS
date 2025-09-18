package com.br.exemplo.biblioteca;

public class Livro{
    private Long id;
    private String titulo;
    private String autor;
    private int dataLancamento;
    private boolean disponivel;

                //constructor
    public Livro(Long id, String titulo, String autor, int datalancamento){
    this.id = id;
    this.titulo = titulo;
    this.autor = autor;
    this.disponivel = true;
    this.dataLancamento = datalancamento;
}
                //getters

    public Long getId(){
        return id;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getdataLancamento(){
        return dataLancamento;
    }
                //setters
    
    public void setId (Long id){
        this.id = id;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public boolean setDisponivel(){
        return disponivel;
    }
    public void setDataLancamento (int dataLancamento){
        this.dataLancamento = dataLancamento;
    }
                //MENU
    @Override
    public String toString(){
        return "Livro{" +
        "id = " + id +
        "titulo = " + titulo +
        "autor = " + autor + 
        "data de lançamento = " + dataLancamento +
        "disponivel = " + disponivel +
        "}";
    }
    }


    