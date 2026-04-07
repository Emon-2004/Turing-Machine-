public class Transition {
    public String currentState;
    public char readSymbol;
    public char writeSymbol;
    public char moveDirection;
    public String nextState;

    public Transition( String currentState, char readSymbol, char writeSymbol, char moveDirection ,String nextState)
    {
        this.currentState = currentState;
        this.readSymbol = readSymbol;
        this.writeSymbol = writeSymbol;
        this.moveDirection = moveDirection;
        this.nextState = nextState;
    }
}
