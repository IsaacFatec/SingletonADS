public class Main {

    public static void main(String[] args) {

        Aluno aluno = Aluno.getInstance();

        aluno.setNome("Ozonio");
        Aluno aluno1 = Aluno.getInstance();

        System.out.println(aluno1.getNome());
    }
}