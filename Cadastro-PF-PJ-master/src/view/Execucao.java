package view;

import model.Pessoas;
import model.PessoaFisica;
import model.PessoaJuridica;

public class Execucao {

	public static void main(String[] args) {
	
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		pf.setNomecompleto ("Mayara Pires Theodoro");
		System.out.println(pf.getNomecompleto());
		pf.falar();
		
		pj.setRazaosocial ("Theodoro Pires Mayara");
		System.out.println(pf.getNomecompleto());
		pj.falar();
		
	}

}
