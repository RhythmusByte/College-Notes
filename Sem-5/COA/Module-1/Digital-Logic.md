## Digital Logic

Digital logic is the foundation of electronic systems, particularly computers and other digital systems. It deals with circuits that operate using binary digits (0s and 1s) and is used to implement logical operations and decision-making within these systems.

### Positive Logic and Negative Logic

#### Positive Logic
- **Definition**: In positive logic, a higher voltage level represents a logical '1', and a lower voltage level represents a logical '0'.
- **Example**: In many digital systems, 5V or 3.3V is considered a logical '1', and 0V is considered a logical '0'.

#### Negative Logic
- **Definition**: In negative logic, a higher voltage level represents a logical '0', and a lower voltage level represents a logical '1'.
- **Example**: In a negative logic system, 0V might represent a logical '1', and 5V or 3.3V would represent a logical '0'.

### Logic Gates

Logic gates are the basic building blocks of digital circuits. They perform basic logical functions that are fundamental to digital circuits. Here are the primary types of logic gates:

1. **AND Gate**
   - **Symbol**:
     <img src="https://en.m.wikipedia.org/wiki/File:AND_ANSI.svg" width="50px" alt="Symbol of AND Gate">
   - **Operation**: The output is true (1) only if all inputs are true (1).
   - **Truth Table**:
     | A | B | Output |
     |---|---|--------|
     | 0 | 0 |   0    |
     | 0 | 1 |   0    |
     | 1 | 0 |   0    |
     | 1 | 1 |   1    |

2. **OR Gate**
   - **Symbol**: A curved symbol with two or more inputs and one output.
   - **Operation**: The output is true (1) if at least one input is true (1).
   - **Truth Table**:
     | A | B | Output |
     |---|---|--------|
     | 0 | 0 |   0    |
     | 0 | 1 |   1    |
     | 1 | 0 |   1    |
     | 1 | 1 |   1    |

3. **NOT Gate (Inverter)**
   - **Symbol**: A triangle pointing to the right with a small circle (bubble) on the output.
   - **Operation**: It inverts the input; the output is true (1) if the input is false (0) and vice versa.
   - **Truth Table**:
     | A | Output |
     |---|--------|
     | 0 |   1    |
     | 1 |   0    |

4. **NAND Gate**
   - **Symbol**: Similar to the AND gate but with a small circle (bubble) on the output.
   - **Operation**: The output is true (1) if at least one input is false (0); it is the inverse of the AND gate.
   - **Truth Table**:
     | A | B | Output |
     |---|---|--------|
     | 0 | 0 |   1    |
     | 0 | 1 |   1    |
     | 1 | 0 |   1    |
     | 1 | 1 |   0    |

5. **NOR Gate**
   - **Symbol**: Similar to the OR gate but with a small circle (bubble) on the output.
   - **Operation**: The output is true (1) if all inputs are false (0); it is the inverse of the OR gate.
   - **Truth Table**:
     | A | B | Output |
     |---|---|--------|
     | 0 | 0 |   1    |
     | 0 | 1 |   0    |
     | 1 | 0 |   0    |
     | 1 | 1 |   0    |

6. **XOR Gate (Exclusive OR)**
   - **Symbol**: A curved symbol with an additional curved line at the input side.
   - **Operation**: The output is true (1) if exactly one input is true (1).
   - **Truth Table**:
     | A | B | Output |
     |---|---|--------|
     | 0 | 0 |   0    |
     | 0 | 1 |   1    |
     | 1 | 0 |   1    |
     | 1 | 1 |   0    |

7. **XNOR Gate (Exclusive NOR)**
   - **Symbol**: Similar to the XOR gate but with a small circle (bubble) on the output.
   - **Operation**: The output is true (1) if both inputs are the same (either both true or both false).
   - **Truth Table**:
     | A | B | Output |
     |---|---|--------|
     | 0 | 0 |   1    |
     | 0 | 1 |   0    |
     | 1 | 0 |   0    |
     | 1 | 1 |   1    |
 
