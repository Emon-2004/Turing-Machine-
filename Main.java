public class Main {
    public static void main(String[] args) {

        // ==============================
        // OPERATION 1: Flip Bits
        // Input: 0110 → Output: 1001
        // ==============================
        System.out.println("===== OPERATION 1: Flip Bits =====");
        TuringMachine tm1 = new TuringMachine("0110", "q0", "qH");
        tm1.addTransition("q0", '0', '1', 'R', "q0");
        tm1.addTransition("q0", '1', '0', 'R', "q0");
        tm1.addTransition("q0", 'B', 'B', 'R', "qH");
        tm1.run();

        System.out.println();

        // ==============================
        // OPERATION 2: Increment Binary
        // Input: 101 → Output: 110
        // ==============================
        System.out.println("===== OPERATION 2: Increment Binary =====");
        TuringMachine tm2 = new TuringMachine("101", "q0", "qH");
        tm2.addTransition("q0", '0', '0', 'R', "q0");
        tm2.addTransition("q0", '1', '1', 'R', "q0");
        tm2.addTransition("q0", 'B', 'B', 'L', "q1");
        tm2.addTransition("q1", '1', '0', 'L', "q1");
        tm2.addTransition("q1", '0', '1', 'R', "qH");
        tm2.addTransition("q1", 'B', '1', 'R', "qH");
        tm2.run();

        System.out.println();

        // ==============================
        // OPERATION 3: Check if input
        // is all 1s (Unary Acceptor)
        // Input: 111 → Accepted
        // ==============================
        System.out.println("===== OPERATION 3: Unary 1s Checker =====");
        TuringMachine tm3 = new TuringMachine("111", "q0", "qH");
        tm3.addTransition("q0", '1', '1', 'R', "q0");
        tm3.addTransition("q0", 'B', 'B', 'R', "qH");
        tm3.run();
    }
}
