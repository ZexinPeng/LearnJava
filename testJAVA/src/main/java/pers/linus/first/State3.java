package pers.linus.first;

public class State3 extends DFAState{
    @Override
    public void transition(DFArunner dfArunner) {
        System.out.println("Now in state Three. Enter 1 or 4.");
        int input = dfArunner.getInput();
        if (input == 1) {
            dfArunner.state = new State1();
        }
        else if (input == 4) {
            dfArunner.state = new State4();
        }
        else {
            System.out.println("invalid transition");
        }
    }
}
