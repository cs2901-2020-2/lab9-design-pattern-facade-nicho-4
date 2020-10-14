package cs.lab;

import java.util.logging.Logger;

public class PopcornPopper{

    static final Logger logger = Logger.getLogger(PopcornPopper.class.getName());

    private boolean popper;

    public PopcornPopper(boolean state){
        popper = state;
    }

    public void Pop(){
        if(popper){
            logger.info("");
        }
    }

};