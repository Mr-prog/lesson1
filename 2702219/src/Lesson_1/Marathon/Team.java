package Lesson_1.Marathon;

public class Team {

    Competitor[] competitors;
    public Team(String HumanName, String CatName, String DogName){
        Competitor[] _competitors = {new Human(HumanName), new Cat(CatName), new Dog(DogName)};
        competitors = _competitors;
    }



    public void showResults(){

    }
}
