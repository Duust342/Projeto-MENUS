package com.br.exemplo;
import com.br.exemplo.biblioteca.Emprestimo;
import com.br.exemplo.biblioteca.Livro;
import com.br.exemplo.biblioteca.Membro;

import java.awt.*;
import java.time.LocalDate;
    public class BibliotecaAPP {
        public static void main(String[] args){
            System.out.println("------------- Sistema de Gerenciamento da Biblioteca -------------");
            Livro livro1 = new Livro(100L, " Senhor dos aneis ", " Jennifer ", 21/2/1999);
            Livro livro2 = new Livro(83L , " Carros ", " Kayle ", 23/7/2000);

            System.out.println("Livros criados: ");
            System.out.println(livro1);
            System.out.println(livro2);
            System.out.println("----------------------------------------------------");

            Membro membro1 = new Membro(193L," Paulo " , " 29310133-32");
            Membro membro2 = new Membro(92L, " José", " 9213114-31");

            System.out.println("Membros do Emprestimo: ");
            System.out.println(membro1);
            System.out.println(membro2);
            System.out.println("----------------------------------------------------");

            Emprestimo emprestimo1 = new Emprestimo(membro1.getNome(), livro1, LocalDate.now(), LocalDate.now().plusWeeks(2));
            System.out.println("Registro do emprestimo 1: ");
            System.out.println(emprestimo1);
            System.out.println("Verificando disponibilidade do livro >>> " + livro1.getTitulo() + ".............." + livro1.isDisponivel());
            System.out.println("----------------------------------------------------");

            Emprestimo emprestimo2 = new Emprestimo(membro2.getNome(), livro2, LocalDate.now(), LocalDate.now().plusWeeks(6));
            System.out.println("Verificando disponibilidade do livro >>> " + livro2.getTitulo() + ".............." + livro2.isDisponivel());
            System.out.println("----------------------------------------------------");

            if(livro1.isDisponivel()){
                Emprestimo emprestimo3 = new Emprestimo(membro1.getNome(), livro2, LocalDate.now(), LocalDate.now().plusWeeks(2));
                System.out.println(emprestimo3);
            }else {
                System.out.println("O livro: " + livro1.getTitulo() + " nao esta disponivel");
            }




        }
}
