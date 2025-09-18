package com.br.exemplo.biblioteca;
import java.time.LocalDate;
public class Emprestimo{
    private Membro nomeAluno;
    private Livro nomeLivro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private LocalDate situacaoDeEntrega;

    //constructor

    public Emprestimo(Membro nomeAluno, Livro nomeLivro, LocalDate dataEmprestimo, LocalDate dataDevolucao){
        this.nomeAluno = nomeAluno;
        this.nomeLivro = nomeLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.nomeLivro.setDisponivel();
        this.situacaoDeEntrega = null;
    }

    //getters

    public Membro getnomeAluno(){
        return nomeAluno;
    }
    public Livro getnomeLivro(){
        return nomeLivro;
    }
    public LocalDate getdataEmprestimo(){
        return dataEmprestimo;
    }
    public LocalDate getdataDevolucao(){
        return dataDevolucao;
    }
    public LocalDate getsituacaoDeEntrega(){
        return situacaoDeEntrega;
    }

    //setters

    public void setAluno(Membro nomeAluno){
        this.nomeAluno = nomeAluno;
    }
    public void setLivro(Livro nomeLivro){
        this.nomeLivro = nomeLivro;
    }
    public void setdataEmprestimo(LocalDate dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }
    public void setdataDevolucao(LocalDate dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }
    public void setsituacaoDeEntrega(LocalDate situacaoDeEntrega){
        this.situacaoDeEntrega = situacaoDeEntrega;
        if(situacaoDeEntrega != null){
            this.nomeLivro.setDisponivel();
        }
    }
    //MENU
    @Override
    public String toString(){
        return "Emprestimo{" +
        "Nome do Aluno: " + nomeAluno +
        "Nome do Livro: " + nomeLivro +
        "Data do Emprestimo: " + dataEmprestimo + 
        "Data de Devolucao: " + dataDevolucao +
        "Situacao: " + situacaoDeEntrega;
    }
}