package View;


import Control.AcervoController;

import Model.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int ano = 0;
        String titulo = null, nomeAutor = null;
        Autor autor;
        Livro livro;
        char comando;

        AcervoController acervoController =  new AcervoController();
        Acervo acervo;

        Scanner scanner = new Scanner(System.in);
        do {
            try{
                System.out.println("Digitite o título do livro: ");
                titulo = scanner.nextLine();

                System.out.println("Digite o nome do autor");
                nomeAutor = scanner.nextLine();


            } finally {

                autor = new Autor(nomeAutor);
                livro = new Livro(titulo, autor);
                acervo = acervoController.cadastrar(livro);

                System.out.println("Cadastrar outro livro?(1=sim, 0=não)");
                comando = scanner.next().charAt(0);
                scanner.nextLine();


            }
        } while (comando == '1');

        scanner.close();
        acervoController.imprimir();
    }
}
