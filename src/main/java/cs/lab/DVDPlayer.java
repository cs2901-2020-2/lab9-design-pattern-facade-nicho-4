package cs.lab;

public class DVDPlayer{

    private boolean OnOff;
    private boolean stop;
    private boolean eject;

    public DVDPlayer(boolean state){
        OnOff = state;
        stop = false;
        eject = false;
    }

    public void Finish(){
        stop = true;
        eject = true;
    }


};