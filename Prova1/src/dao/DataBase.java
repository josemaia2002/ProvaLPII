package dao;

import java.util.ArrayList;

import modelo.Pessoa;
import modelo.Professor;
import modelo.Aluno;


public class DataBase {
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public void addPessoa(Pessoa p) {
		pessoas.add(p);
	}
	
	public void removePessoa(Pessoa p) {
		pessoas.remove(p); 
	}
	

	public void listProfessores() {
		System.out.println("#################### Professores ########################################");
		for(Pessoa p : pessoas) {
			if(p instanceof Professor) {
				System.out.print("Nome: " + p.getNome() + " ");
				System.out.print("Idade: " + p.getIdade() + " ");
				System.out.print("CPF: " + p.getCpf() + " ");
				System.out.print("Tipo: [" + p.getClass() + "] ");
				System.out.print("Especialidade " + ((Professor) p).getEspecialidade() + ".");
			}
			System.out.println();
		}
		System.out.println("##########################################################################");
		System.out.println();
	}
	
	public void listAlunos() {
		System.out.println("#################### Alunos ########################################");
		for(Pessoa p : pessoas) {			
			if(p instanceof Aluno) {
				System.out.print("Nome : " + p.getNome() + " ");
				System.out.print("Idade : " + p.getIdade() + " ");
				System.out.print("CPF: " + p.getCpf() + " ");
				System.out.print("Tipo: [" + p.getClass() + "] ");
				System.out.print("Matricula: " + ((Aluno) p).getMatricula() + ".");
			}
			System.out.println();
		}
		System.out.println("#########################################################################");
		System.out.println();
	}
}
