package model;

public class PessoaFisica extends Pessoas {
	
	private String nomecompleto;
	private long rg;
	private long cpf;
	private String datadenascimento;
	
	public String getNomecompleto() {
		return nomecompleto;
	}
	public void setNomecompleto(String nomecompleto) {
		this.nomecompleto = nomecompleto;
	}
	public long getRg() {
		return rg;
	}
	public void setRg(long rg) {
		this.rg = rg;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getDatadenascimento() {
		return datadenascimento;
	}
	public void setDatadenascimento(String datadenascimento) {
		this.datadenascimento = datadenascimento;
	}
	@Override
	public void falar() {
		// TODO Auto-generated method stub
		System.out.println("Falando - Pessoa Fisica");
		
	}

}
