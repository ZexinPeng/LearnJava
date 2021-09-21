package pers.linus.first;

public class State2 extends DFAState{
    @Override
    public void transition(DFArunner dfArunner) {
        System.out.println("Now in state Two. Enter 3.");
        int input = dfArunner.getInput();
        if (input == 3) {
            dfArunner.state = new State3();
        }
        else {
            System.out.println("invalid transition");
        }
    }
}
