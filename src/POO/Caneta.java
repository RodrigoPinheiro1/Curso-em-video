package POO;

public class Caneta {


    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;


    public boolean getTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public  Caneta(String modelo, String cor, float ponta ) { //metodo construtor pois tem o mesmo nome da classe

        this.setModelo(modelo);
        this.setCor(cor);
        this.setPonta(ponta);
        this.tampar();

    }

    public void tampar() {

        this.tampada = true;


    }

    public void destampar() {

        this.tampada = false;


    }

    public String getModelo() {

        return this.modelo;

    }

    public void setModelo(String modelo) {

        this.modelo = modelo;

    }

    public float getPonta() {

        return this.ponta;
    }

    public void setPonta(float ponta) {

        this.ponta = ponta;


    }

    public void status() {
        System.out.println("sobre a caneta");
        System.out.println("modelo " + this.getModelo());
        System.out.println("ponta " + this.getPonta());
        System.out.println( "cor " + this.getCor());
        System.out.println("tampado " +this.getTampada());

    }


}
