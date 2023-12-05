public abstract class ConteudoDeMidia {
    protected String nome;
    protected String autor;
    protected ReprodutorDeMidia reprodutor;

    public ConteudoDeMidia(ReprodutorDeMidia reprodutor) {
        this.reprodutor = reprodutor;
    }

    public void reproduzir(){

    }
}
