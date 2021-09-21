package pers.linus.first;

import java.util.Scanner;

public class State123Driver {

    static Scanner kbd = new Scanner(System.in);

    enum DFAstate {
        Enter, One, Two, Three, Four, Exit
    };

    DFAstate state = DFAstate.Enter;

    public static void main(String[] args) {
        State123Driver abcDFA = new State123Driver();
        abcDFA.run();
    }

    public int getInput() {
        int value;
        value = kbd.nextInt();
        return value;
    }

    void run() {
        int input;
        do {
            switch (state) {
                case Enter:
                    System.out.println("Enter state. Going to state One");
                    state = DFAstate.One;
                case One:
                    System.out.println("Now in state One. Enter 2 or 3.");
                    input = getInput();
                    switch (input) {
                        case 2:
                            state = DFAstate.Two;
                            break;
                        case 3:
                            state = DFAstate.Three;
                            break;
                        default:
                            System.out.println("invalid transition");
                            break;
                    }
                    break;
                case Two:
                    System.out.println("Now in state Two. Enter 3.");
                    input = getInput();
                    switch (input) {
                        case 3:
                            state = DFAstate.Three;
                            break;
                        default:
                            System.out.println("invalid transition");
                            break;
                    }
                    break;
                case Three:
                    System.out.println("Now in state Three. Enter 1 or 4.");
                    input = getInput();
                    switch (input) {
                        case 1:
                            state = DFAstate.One;
                            break;
                        case 4:
                            state = DFAstate.Four;
                            break;
                        default:
                            System.out.println("invalid transition");
                            break;
                    }
                    break;
                case Four:
                    System.out.println("Now in state Four. Exit state.");
                    state = DFAstate.Exit;
                    return;
                default:
                    System.out.println("invalid state");
            }
        } while (true);

    }
}

