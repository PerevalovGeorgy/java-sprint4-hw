import java.util.ArrayList;

public class Ballet extends MusicalShow {
    protected Choreographer choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                  MusicAuthor musicAuthor, String librettoText, Choreographer choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    public void printActors() {
        System.out.println("Актеры баллета: ");
        for(Actor actor : getListOfActors()) {
            System.out.println(actor);
        }
        System.out.println();
    }
}
