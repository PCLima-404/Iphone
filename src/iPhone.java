// Implementação da classe iPhone
public class iPhone implements Musicas, Celular, Internet {
    private int volume;


    public iPhone(int volume) {
        this.volume = volume;
    }

    public void tocarMusica() {
        System.out.println("Tocando sua música de preferencia");
    }

    public void ligacao() {
        System.out.println("Chamando..");
    }


  public void browseInternet() {
        System.out.println("Pesquisando");
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Método main para testar a implementação
    public static void main(String[] args) {
        iPhone myiPhone = new iPhone(50);
        myiPhone.ligacao();
        myiPhone.tocarMusica();
        myiPhone.browseInternet();
        System.out.println("Volume: " + myiPhone.getVolume());
    }
}
