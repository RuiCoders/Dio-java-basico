public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // metodo são legiveis e nem todos precisam de parametros
    public void ligarTv() {
        ligada = true;
        System.out.println("Novo status da TV: " + ligada);
    }

    public void desligarTv() {
        ligada = false;
         System.out.println("Novo status da TV: " + ligada);
    }
   // metodo tem um parametro e usuario pode mudar de canal
    public void mudarCanal(int novoCanal){
    canal = novoCanal;
    System.out.println("Canal selecionado: " + canal);
}  
    public void aumentarCanal() {
        canal++;
         System.out.println("Canal atual: " + canal);
    }

    public void diminuirCanal() {
        canal--;
         System.out.println("Canal atual: " + canal);
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
}
