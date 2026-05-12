# 🤖 Turing Machine Simulator in Java

A Java implementation of a Turing Machine that demonstrates the basic operations of a Turing Machine, including bit flipping, binary increment, unary acceptance checking, and unary addition.

---
## 📂 Project Structure
```
TuringMachine/
│
├── Main.java            # Entry point — runs all operations
├── TuringMachine.java   # Core engine — processes rules and runs machine
├── Transition.java      # Rule container — stores one transition rule
└── Tape.java            # Tape operations — read, write, move
```

---

## ⚙️ How It Works

A Turing Machine consists of:

- **Tape** — An infinite strip of cells containing symbols
- **Head** — Reads and writes symbols on the tape
- **States** — Modes of operation (q0, q1, qH)
- **Transition Rules** — Instructions: IF (state + symbol) THEN (write + move + next state)
- **Halt State** — Machine stops when it reaches this state

### Basic Operations:
| Operation | Method | Description |
|-----------|--------|-------------|
| Read | `tape.read()` | Read symbol at current head position |
| Write | `tape.write()` | Write symbol at current head position |
| Move Left | `tape.moveLeft()` | Move head one step left |
| Move Right | `tape.moveRight()` | Move head one step right |
| Change State | `currentState = nextState` | Switch between modes |
| Halt | `currentState.equals(haltState)` | Stop the machine |

---

## 🚀 Getting Started

### Prerequisites
- Java JDK 8 or higher
- Any Java IDE (IntelliJ, Eclipse, VS Code) or terminal

### Installation & Running

```bash
# Step 1: Clone the repository
git clone https://github.com/yourusername/TuringMachine.git

# Step 2: Navigate to project folder
cd TuringMachine

# Step 3: Compile all Java files
javac *.java

# Step 4: Run the program
java Main
```

---

## 🧪 Operations & Examples

### Operation 1: Flip Bits
Flips all 0s to 1s and 1s to 0s on the tape.
```
Input:  0110
Output: 1001
```

### Operation 2: Binary Increment
Adds 1 to a binary number.
```
Input:  101
Output: 110  (101 + 1 = 110)
```

### Operation 3: Unary 1s Checker
Checks if input contains only 1s. Accepts if all 1s, rejects otherwise.
```
Input:  111
Output: Accepted 

Input:  101
Output: Rejected 
```

### Operation 4: Unary Addition
Adds two unary numbers separated by 0.
```
Input:  110111  (2 + 3)
Output: 11111   (5) 
```

---

## 📋 Sample Output

```
===== OPERATION 1: Flip Bits =====
Starting State : q0
Initial Tape   : 0110
-----------------------------
State: q0 | Read: 0 | Write: 1 | Move: R | Next: q0
State: q0 | Read: 1 | Write: 0 | Move: R | Next: q0
State: q0 | Read: 1 | Write: 0 | Move: R | Next: q0
State: q0 | Read: 0 | Write: 1 | Move: R | Next: q0
State: q0 | Read: B | Write: B | Move: R | Next: qH
-----------------------------
Final State : qH
Final Tape  : 1001

===== OPERATION 2: Binary Increment =====
Starting State : q0
Initial Tape   : 101
-----------------------------
...
Final State : qH
Final Tape  : 110
```

---

## 🗂️ File Descriptions

### `Tape.java`
Handles all tape operations.
- Creates tape with input written at position 10
- Fills remaining cells with blank character `B`
- Provides read, write, moveLeft, moveRight methods

### `Transition.java`
Stores one transition rule with 5 fields:
- `currentState` — Current state of machine
- `readSymbol` — Symbol to read from tape
- `writeSymbol` — Symbol to write on tape
- `moveDirection` — Direction to move (`L` or `R`)
- `nextState` — Next state after transition

### `TuringMachine.java`
The core engine that:
- Stores the tape and rulebook
- Searches for matching transition rules
- Executes read, write, move, and state change operations
- Stops when halt state is reached

### `Main.java`
Entry point that:
- Defines all transition rules for each operation
- Creates TuringMachine objects
- Runs all 4 operations

---

##  System Requirements

| Requirement | Details |
|-------------|---------|
| Language | Java |
| JDK Version | 8 or higher |
| OS | Windows / Linux / MacOS |
| IDE | Any Java IDE or terminal |

---
