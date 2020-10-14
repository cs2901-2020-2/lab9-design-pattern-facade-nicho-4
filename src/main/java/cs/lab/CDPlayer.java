package cs.lab;

public class CDPlayer{

    private boolean OnOff;
    private boolean stop;
    private boolean eject;

    public CDPlayer(boolean state){
        OnOff = state;
        stop = false;
        eject = false;
    }

    public void Finish(){
        stop = true;
        eject = true;
    }

};