import java.util.ArrayList;
import java.util.List;

public class CadastroAluno {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void imprimirListaAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println();
        }
    }
}
