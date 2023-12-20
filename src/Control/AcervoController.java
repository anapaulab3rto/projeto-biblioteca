package Control;

import Model.Acervo;
import Model.Livro;

public class AcervoController {

    Acervo acervo =  new Acervo();

    public Acervo cadastrar(Livro livro){
        acervo.getLivros().add(livro);

        return acervo;
    }
    public void imprimir() {
        System.out.println("\n*************************************");
        System.out.println("Livros");
        System.out.println("*************************************");
        for (Livro itemLivro : acervo.getLivros()){
            System.out.println("\nNome: " + itemLivro.getTitulo());
            System.out.println("Autor: " + itemLivro.getAutor().getNome());
        }
    }


}
