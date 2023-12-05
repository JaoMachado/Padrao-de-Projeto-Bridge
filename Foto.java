public class Foto extends ConteudoDeMidia{

    public Foto(ReprodutorDeMidia reprodutor) {
        super(reprodutor);
    }

    @Override
    public void reproduzir() {
        reprodutor.reproduzirFoto();
    }
    
}
