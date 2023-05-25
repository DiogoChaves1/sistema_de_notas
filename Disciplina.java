import java.util.ArrayList;

public class Disciplina{
    private String nome;
    private ArrayList<Aluno> alunos;


    public Disciplina (String nome){
        this.nome=nome;
        alunos = new ArrayList<Aluno>();
    }

    
}
