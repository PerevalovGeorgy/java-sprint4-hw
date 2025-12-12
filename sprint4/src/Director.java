public class Director extends Person{

    private final int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public void printDirector() {
        System.out.println(getName() +' '+ getSurname());
    }

    @Override
    public String toString() {
        return "Режисер " +
                super.toString();
    }
}
