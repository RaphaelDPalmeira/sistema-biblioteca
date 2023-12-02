public class Livro {
    private int id;
    private String titulo;
    private String autor;

    // construtores, getters e setters

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Autor: " + autor;
    }
}
