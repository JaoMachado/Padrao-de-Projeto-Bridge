public class Musica extends ConteudoDeMidia{
    
    public Musica(ReprodutorDeMidia reprodutor) {
        super(reprodutor);
    }

    @Override
    public void reproduzir() {
        reprodutor.reproduzirAudio();
    }
    
}
