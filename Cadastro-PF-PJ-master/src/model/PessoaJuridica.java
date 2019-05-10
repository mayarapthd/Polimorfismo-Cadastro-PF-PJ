package model;

public class PessoaJuridica extends Pessoas {

	private String razaosocial;
	private long cnpj;
	private String nomefantasia;
	private String atividadeprincipal;
	private String atividadesecundaria;
	private String dataconstituicao;
	private long inscricaoestadual;
	
	public String getRazaosocial() {
		return razaosocial;
	}
	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomefantasia() {
		return nomefantasia;
	}
	public void setNomefantasia(String nomefantasia) {
		this.nomefantasia = nomefantasia;
	}
	public String getAtividadeprincipal() {
		return atividadeprincipal;
	}
	public void setAtividadeprincipal(String atividadeprincipal) {
		this.atividadeprincipal = atividadeprincipal;
	}
	public String getAtividadesecundaria() {
		return atividadesecundaria;
	}
	public void setAtividadesecundaria(String atividadesecundaria) {
		this.atividadesecundaria = atividadesecundaria;
	}
	public String getConstituicao() {
		return dataconstituicao;
	}
	public void setConstituicao(String constituicao) {
		this.dataconstituicao = constituicao;
	}
	public long getInscricaoestadual() {
		return inscricaoestadual;
	}
	public void setInscricaoestadual(long inscricaoestadual) {
		this.inscricaoestadual = inscricaoestadual;
	}
	@Override
	public void falar() {
		// TODO Auto-generated method stub
		System.out.println("Falando - Pessoa Juridica");
		
	}
	


}
