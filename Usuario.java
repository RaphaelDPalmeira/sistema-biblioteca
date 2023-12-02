public class Usuario {
    private int id;
    private String nome;
    private String endereco;

    // construtores, getters e setters

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Endereço: " + endereco;
    }
}
