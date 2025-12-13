import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

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

    //будем заменять всех актеров с фамилией, пробегая по их списку
    public void replaceActor(Actor newActor, String surNameActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor thisActor = listOfActors.get(i);
            if (thisActor.getSurname().equals(surNameActor)) {
                listOfActors.set(i, newActor);
            } else {
                System.out.println("Актера по фамилии " + surNameActor + " нет в постановке");
                System.out.println();
            }
        }
    }

    //у режесера есть toString, тут сделал метод печати режисера
    public void printDirector() {
        System.out.println(director);
    }


}
