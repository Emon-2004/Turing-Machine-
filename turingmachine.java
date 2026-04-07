import java.util.ArrayList;
import java.util.List;

public class turingmachine {
    private Tape tape;
    private String currentState;
    private String endState;
    private List<Transition> transitions;

    public turingmachine(String input, String startState, String endState)
    {
        this.tape = new Tape(input);
        this.currentState = startState;
        this.endState = endState;
        this.transitions = new ArrayList<>();
    }

    public void addTransition(String currentState, char readSymbol, char writeSymbol, char moveDirection , String nextState)
    {
        transitions.add(new Transition(currentState,readSymbol,writeSymbol,moveDirection,nextState));
    }

    public void run()
    {
        System.out.println("Starting State : " + currentState);
        System.out.println("Initial Tape : " + tape.getTape());
        System.out.println("-----------------------------");

        while(!currentState.equals(endState))
        {
            char symbol = tape.read();
            boolean found = false;

            for(Transition t: transitions)
            {
                if(t.currentState.equals(currentState) && t.readSymbol==symbol)
                {
                    System.err.println("State: " + currentState + " |Read: " + symbol + " | Write: " + t.writeSymbol + " | Move: " + t.moveDirection + " | Next: " + t.nextState);

                    tape.write(t.writeSymbol);
                    if(t.moveDirection=='R')
                    {
                        tape.moveRight();
                    }
                    else
                    {
                        tape.moveLeft();
                    }
                    currentState = t.nextState;
                    found = true;
                    break;
                }
            }

            if(!found)
            {
                System.out.println("No transition found! Halting.");
                break;
            }
        }
        System.out.println("-----------------------------");
        System.out.println("Final State : " + currentState);
        System.out.println("Final Tape  : " + tape.getTape());
    }
}
