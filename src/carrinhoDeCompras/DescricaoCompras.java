package carrinhoDeCompras;

public class DescricaoCompras {

    private String descricaoCompras;

    //construtor
    public DescricaoCompras(String descricaoCompras) {
        this.descricaoCompras = descricaoCompras;
    }

    //metodo pra recuperar a descrção
    public String getDescricaoCompras() {
        return descricaoCompras;
    }

    //metodo para modificar a descrição
    public void setDescricaoCompras(String descricaoCompras) {
        this.descricaoCompras = descricaoCompras;
    }
}
