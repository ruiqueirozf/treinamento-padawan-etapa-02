package br.com.frwk;

public class Vendedor {
    private String nomeVendedor;
    private Double totalComissao;

    public Vendedor(String _nomeVendedor, Double _valorComissao){
        setNomeVendedor(_nomeVendedor);
        this.totalComissao = _valorComissao;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        if (nomeVendedor != null){
            this.nomeVendedor = nomeVendedor;
        }
    }

    public Double getTotalComissao() {
        return totalComissao;
    }

    public void setTotalComissao(Double valorComissao) {
        this.totalComissao = valorComissao;
    }


}
