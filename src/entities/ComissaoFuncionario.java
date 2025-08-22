package entities;

    public class ComissaoFuncionario extends Funcionario {
	private double vendasBrutas;
	private double taxaDeComissao;
	
   public ComissaoFuncionario() {
	// TODO Auto-generated constructor stub
    }
   
   public ComissaoFuncionario(String primeiro,String segundo,String cpf,double vendas, double taxa) {
	super(primeiro,segundo,cpf);
	setTaxaDeComissao(taxa);
	setVendasBrutas(vendas);
}
	public double getVendasBrutas() {
		return vendasBrutas;
	}
	public void setVendasBrutas(double vendas ) {
		if(vendas< 0.0) {
			vendasBrutas = 0.0;
		}else {
			vendasBrutas = vendas;
		}
	}
	public double getTaxaDeComissao() {
		return taxaDeComissao;
	}
	public void setTaxaDeComissao(double taxa ) {
		if(taxa > 0.0 && taxa < 1.0) {
			taxaDeComissao = 0.0;
		}else {
			taxaDeComissao = taxa;
		}
	}
	@Override
	public double ganhos() {
		// TODO Auto-generated method stub
		return getTaxaDeComissao()*getVendasBrutas();
	}
	@Override
	public String toString() {
		return "Comissão do Funcionário: " + super.toString() +
				"\nVendas Brutas: " + getVendasBrutas() + 
				"\nTaxa de Comissão: " + getTaxaDeComissao();
	}
   }
