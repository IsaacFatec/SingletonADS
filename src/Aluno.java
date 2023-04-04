public class Aluno {

    private static Aluno instancia;

    private String nome;
    private int idade;
    private String ra;

    public static Aluno getInstance() {

        if (instancia == null) {
            instancia = new Aluno();
        }

        return instancia;
    }

    private Aluno() {

    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getRa() {
        return this.ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
}
