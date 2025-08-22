package entities;

    public class ComissaoFuncionario extends Funcionario {
	private double vendasBrutas;
	private double taxaDeComissao;
	
   public ComissaoFuncionario() {
	// TODO Auto-generated constructor stub
    }
   
	public ComissaoFuncionario(double vendas, double taxa) {
	super();
	setTaxaDeComissao(taxa);
	setVendasBrutas(vendas);
}
    
	public double getVendasBrutas() {
		return vendasBrutas;
	}

	public void setVendasBrutas(double vendas ) {
		this.vendasBrutas = vendasBrutas;
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
		
		return String.format("%s:,%s\n%s:$%,.2f; %s: %.2f",
				"Comissão do Funcionário", super.toString(),
				"Vendas Brutas ", getVendasBrutas(),
				 "Taxa de Comissão ", getTaxaDeComissao());
		
	}

   }
