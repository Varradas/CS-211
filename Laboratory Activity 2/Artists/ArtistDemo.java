public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Kimi Antonelli", "Italian", 43, "Visual Arts", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("Edgar Allan Poe", "American", 50, "Writing", WritingStyle.DRAMA);
        writer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Rudolf Nureyev", "Russian", 33, "Writing", DanceStyle.CONTEMPORARY);
        dancer.displayInfo();

        System.out.println();
    }
}