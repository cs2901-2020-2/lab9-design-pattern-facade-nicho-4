package cs.lab;

public class HomeTheaterFacade{

    public HomeTheaterFacade(){}

    void PlayMovie(String title){
        Amplifier amplifier = new Amplifier(true);
        DVDPlayer dvd = new DVDPlayer(true);
        CDPlayer cd = new CDPlayer(true);
        Projector projector = new Projector(true);
        Screen screen = new Screen(true);
        TheaterLights lights = new TheaterLights(true);
        PopcornPopper popcorn = new PopcornPopper(true);
    }

    void EndMovie(){
        
    }
};