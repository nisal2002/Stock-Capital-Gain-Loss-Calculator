# Stock Capital Gain Loss Calculator

This repository contains a Java application that calculates the capital gain or loss when shares of common stock are sold, using a FIFO (First In, First Out) protocol.

## Task Description

When a share of common stock is sold, the capital gain or loss is the difference between the share’s selling price and the price originally paid to buy it. This application identifies the shares being sold using the FIFO protocol, which means the shares held the longest are sold first.

### Example Scenario

Suppose you perform the following transactions:

- Day 1: Buy 100 shares at $20 each
- Day 2: Buy 20 shares at $24 each
- Day 3: Buy 200 shares at $36 each
- Day 4: Sell 150 shares at $30 each

According to the FIFO protocol, the 150 shares sold on Day 4 would consist of:
- 100 shares bought on Day 1
- 20 shares bought on Day 2
- 30 shares bought on Day 3

The capital gain (or loss) for this example would be calculated as follows:
- Gain from shares bought on Day 1: 100 * ($30 - $20) = $1000
- Gain from shares bought on Day 2: 20 * ($30 - $24) = $120
- Loss from shares bought on Day 3: 30 * ($30 - $36) = -$180

Total Capital Gain = $1000 + $120 - $180 = $940

## Project Structure

- **Queue.java**: The main Java file containing the implementation of the FIFO protocol to calculate capital gain/loss based on the sequence of transactions.

## How to Run

1. **Clone the repository:**

   ```bash
   git clone https://github.com/nisal2002/Stock-Capital-Gain-Loss-Calculator.git
   ```

2. **Navigate to the project directory:**

   ```bash
   cd Stock-Capital-Gain-Loss-Calculator
   ```

3. **Compile the Java program:**

   ```bash
   javac Queue.java
   ```

4. **Run the program:**

   ```bash
   java Queue
   ```

   The program will prompt you to enter a sequence of transactions. Enter the transactions in the format: 

   ```
   How many times did you buy shares?
   How many shares did you buy at one time?
   What is the unit price($) of those 10 shares?
   How many shares did you sell?
   What is the unit price($) of those n shares?
   The capital gain in this case :
   ```

   The program will then calculate and output the total capital gain or loss.

## Technologies Used

- Java

## Author

- [Author](NisalNPGamage) - Initial work

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
