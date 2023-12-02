import java.util.Date;

public class Emprestimo {
    private int id;
    private Usuario usuario;
    private Livro livro;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    // construtores, getters e setters

    @Override
    public String toString() {
        return "ID: " + id + ", Usuário: " + usuario + ", Livro: " + livro +
               ", Empréstimo: " + dataEmprestimo + ", Devolução: " + dataDevolucao;
    }
}
