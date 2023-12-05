public class Video extends ConteudoDeMidia{

    public Video(ReprodutorDeMidia reprodutor) {
        super(reprodutor);
    }

    @Override
    public void reproduzir() {
        reprodutor.reproduzirVideo();
        reprodutor.reproduzirAudio();
    }

}
