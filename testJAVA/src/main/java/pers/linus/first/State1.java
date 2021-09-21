package pers.linus.first;

public class State1 extends DFAState{
    @Override
    public void transition(DFArunner dfArunner) {
        System.out.println("Now in state One. Enter 2 or 3.");
        int input = dfArunner.getInput();
        if (input == 2) {
            dfArunner.state = new State2();
        }
        else if (input == 3) {
            dfArunner.state = new State3();
        }
        else {
            System.out.println("invalid transition");
        }
    }
}
