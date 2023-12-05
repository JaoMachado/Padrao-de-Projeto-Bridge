public class Main {
    public static void main(String[] args) {
        Televisao t1 = new Televisao(44);

        Radio r1 = new Radio(430);

        Musica m1 = new Musica(r1);
        m1.reproduzir();

        Video v1 = new Video(t1);
        v1.reproduzir();

        Foto f1 = new Foto(t1);
        f1.reproduzir();
    }
}
