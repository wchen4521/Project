****Description****
 * The LoanCalculator application is a GUI-based program designed to assist users in calculating monthly and total payments for a loan based on provided input values. The graphical user interface (GUI) includes input fields for the annual interest rate (rateField), number of years (yearsField), and loan amount (loanAmountField), as well as output fields for the monthly payment (monthlyField) and total payment (totalField). A "Calculate" button initiates the calculation process. The application utilizes Java Swing components to create the GUI and handle user interactions.
 * Design Choices
1. GUI Components:
- JLabel: Display labels for "Annual Interest Rate," "Number of Years," "Loan Amount," "Monthly Payment," and "Total Payment."
- JTextField: Input fields for annual interest rate, number of years, and loan amount, as well as read-only fields for monthly and total payments.
- JButton: A "Calculate" button to trigger the calculation.
- JPanel: A container to organize and arrange the GUI components.
- JFrame: The main frame for the application.
2. Event Handling:
- ActionListener: Attached to the "Calculate" button to respond to user clicks.
- calculateSum(): Method that performs the loan payment calculation and updates the monthly and total payment fields.
- Input Validation: Handles potential NumberFormatException by displaying an error message using JOptionPane.
3. User Interaction:
1）Users input numeric values for the annual interest rate, number of years, and loan amount.
2）Clicking the "Calculate" button triggers the calculation, and the monthly and total payments are displayed.

**** Main Method****
 * The main method initializes the LoanCalculator application by creating an instance of the class.
Example Interaction:
Enter the Annual Interest Rate: 0.05
Enter the Number of Years: 2
Enter the Loan Amount: 2000
Output:
Monthly Payment: 87.74
Total Payment: 2105.83
