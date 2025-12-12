import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void printActors() {
        System.out.println("Актеры шоу: ");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
        System.out.println();
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актер уже в постановке");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, String surNameActor) {
        int count = 0;
        int order = -1;
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surNameActor)) {
                count ++;
                order ++;
            }
        }
        if (count > 0) {
            listOfActors.set(order, newActor);
        } else {
            System.out.println("Актера по фамилии " + surNameActor +" нет в постановке");
            System.out.println();
        }
    }
}
