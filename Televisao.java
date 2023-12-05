public class Televisao implements ReprodutorDeMidia{
    private int canal;

    public Televisao(int canal) {
        this.canal = canal;
    }

    @Override
    public void reproduzirVideo() {
        System.out.println("Reproduzindo na Televisao o video do canal: " + canal);
    }

    @Override
    public void reproduzirAudio() {
        System.out.println("Reproduzindo na Televisao o audio do canal: " + canal);
    }

    @Override
    public void reproduzirFoto() {
        System.out.println("Reproduzindo na Televisao a foto do canal: " + canal);
    }
    
}
