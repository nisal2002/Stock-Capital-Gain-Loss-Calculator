# Stock Capital Gain Loss Calculator

This Java application calculates the total capital gain or loss from a series of stock transactions using the FIFO (First-In-First-Out) protocol. When multiple shares of stock are sold, the shares that have been held the longest are considered sold first.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Usage](#usage)
- [Technologies](#technologies)
- [Setup](#setup)
- [Example](#example)
- [Contributing](#contributing)
- [License](#license)

## Overview
When shares of a company's stock are sold, the capital gain or loss is the difference between the selling price and the original purchase price. This application implements the FIFO accounting principle to determine which shares are sold first, thus calculating the accurate capital gain or loss.

## Features
- Input a sequence of stock transactions (buying and selling shares at different prices on different days).
- Calculates the total capital gain or loss based on the FIFO protocol.
- Outputs the calculated gain or loss.

## Usage
1. Clone the repository:
   ```bash
   git clone https://github.com/nisal2002/Stock-Capital-Gain-Loss-Calculator.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Stock-Capital-Gain-Loss-Calculator
   ```
3. Compile the Java application:
   ```bash
   javac StockCalculator.java
   ```
4. Run the application:
   ```bash
   java StockCalculator
   ```
5. Follow the prompts to input your stock transactions. The application will output the total capital gain or loss.

## Technologies
- Java

## Setup
To run this application, ensure you have the following installed:
- Java Development Kit (JDK)

## Example
### Input
```
Day 1: Buy 100 shares at $20 each
Day 2: Buy 20 shares at $24 each
Day 3: Buy 200 shares at $36 each
Day 4: Sell 150 shares at $30 each
```
### Output
```
Total capital gain/loss: $940
```

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request for any improvements or bug fixes.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
