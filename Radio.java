public class Radio implements ReprodutorDeMidia{
    private int frequencia;

    public Radio(int frequencia) {
        this.frequencia =frequencia;
    }

    @Override
    public void reproduzirAudio() {
        System.out.println("Radio tocando na frequencia: " + frequencia);
    }
}
