package pers.linus.first;

public class State4 extends DFAState{
    @Override
    public void transition(DFArunner dfArunner) {
        System.out.println("Now in state Four. Exit state.");
        dfArunner.state = new StateExit();
    }
}
