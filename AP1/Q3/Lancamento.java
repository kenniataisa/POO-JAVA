public class Lancamento{
    private String desc;
    private Double valor;
    private Boolean tipo;


    public Lancamento(String desc, Double valor, Boolean tipo) {
        this.desc = desc;
        this.valor = valor;
        this.tipo = tipo;
}

    public Double getValor() {
        return valor;
}

    public String getDesc() {
        return desc;        
}   

    public boolean getTipo() {        
        return tipo;    
}   

}