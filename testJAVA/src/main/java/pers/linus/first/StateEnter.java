package pers.linus.first;

public class StateEnter extends DFAState{
    @Override
    public void transition(DFArunner dfArunner) {
        System.out.println("Enter state. Going to state One");
        dfArunner.state = new State1();
    }
}
