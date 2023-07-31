public class Garrafa {
    public String marca;
    public float litros;
    public String cor;
     private boolean tampada;

    public void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Litros: " + this.litros);
        System.out.println("Cor: " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }
    public void beber(){
        if (this.tampada == true){
            System.out.println("ERRO! A garrafa está tampada.");
        } else{
            System.out.println("Ela está destampada, pode beber!");
        }
    }
}
