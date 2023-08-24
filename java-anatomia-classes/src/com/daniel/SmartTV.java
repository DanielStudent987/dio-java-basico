package com.daniel;
public class SmartTV {
    private boolean ligada;
    private int canal;
    private int volume;

    public boolean isLigada() {
        return ligada;
    }
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    //MENU
    public void menu() {
        System.out.println("Status");
        System.out.println("Ligada: "+isLigada()+"\nCanal: "+getCanal()+"\nVolume: "+getVolume()+"\n");
        System.out.println("Escolha uma Opção: \na - ligar/desligar\nb - Mudar Canal\nc - Mudar Volume\nInforme: ");
    }

    //LIGAR OU DESLIGAR A TV
    public void ligar() {
        boolean status = !isLigada();
        setLigada(status);
    }

    //MUDAR DE CANAL DE 1 EM 1 OU PELO NUMERO CORRESPONDENTE
    public void mudarCanal(int num) {
        int canal = this.canal + num;
        setCanal(canal);
    }

    //-1 OU +1 NO VOLUME
    public void mudarVolume(int num) {
        
        int number = (num==0) ? --volume : ++volume;
        setVolume(number);
    }
}