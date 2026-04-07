public class Main {
    public static void main(String args[])
    {
        System.out.println("===== OPERATION 1: Flip Bits =====");

        turingmachine tm1 = new turingmachine("0110","q0","qH");

        tm1.addTransition("q0",'0','1','R',"q0");

        tm1.addTransition("q0", '1', '0', 'R', "q0");
        
        tm1.addTransition("q0", 'B', 'B', 'R', "qH");

        tm1.run();

        System.out.println();
    }
}