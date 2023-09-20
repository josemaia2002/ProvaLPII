package visao;

import modelo.Pessoa;
import modelo.Professor;
import modelo.Aluno;
import dao.DataBase;


public class EscolaView {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Professor();
		Pessoa pessoa2 = new Aluno();
		
		
		// Professor 1
		((Professor)pessoa1).setNome("Popeye");
		((Professor)pessoa1).setIdade(58);
		((Professor)pessoa1).setCpf("023.957.893-43");
		((Professor)pessoa1).setEspecialidade("Navegacao");
		// ((Professor)pessoa1).addAluno((Aluno)pessoa2);
		
		// Aluno 1
		((Aluno)pessoa2).setNome("Billy");
		((Aluno)pessoa2).setIdade(13);
		((Aluno)pessoa2).setCpf("123.147.228-36");
		((Aluno)pessoa2).setMatricula("0012");
		
		DataBase db = new DataBase();
		
		db.addPessoa(pessoa1);
		db.addPessoa(pessoa2);
		
		db.listAlunos();
		db.listProfessores();
	}
}
