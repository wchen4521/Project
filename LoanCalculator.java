import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 * LoanCalculator class represents a simple loan calculator with a GUI using Java Swing.
 *
 * How to run:
 * 1. Run the program.
 * 2. Enter the annual interest rate, number of years, and loan amount in their respective fields.
 * 3. Click the "Calculate" button to display the monthly and total payments.
 *
 * Example:
 *
 * Enter the Annual Interest Rate: 0.05
 * Enter the Number of Years: 2
 * Enter the Loan Amount: 2000
 *
 * Output:
 * Monthly Payment: 87.74
 * Total Payment: 2105.83
 */
public class LoanCalculator extends JFrame {
    /**
     * Constructor for the LoanCalculator class.
     * Sets up the GUI components and initializes the frame.
     */
    public LoanCalculator() {
        setTitle("Loan Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 300);

        JLabel rateLabel = new JLabel("Annual Interest Rate:");
        JLabel yearsLabel = new JLabel("Number of Years:");
        JLabel loanAmountLabel = new JLabel("Loan Amount:");
        JLabel monthlyLabel = new JLabel("Monthly Payment:");
        JLabel totalLabel = new JLabel("Total Payment:");


        rateField = new JTextField(15);
        yearsField = new JTextField(15);
        loanAmountField = new JTextField(15);
        monthlyField = new JTextField(15);
        totalField = new JTextField(15);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSum();
            }
        });

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(rateLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(rateField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(yearsLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(yearsField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(loanAmountLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(loanAmountField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(monthlyLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(monthlyField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(totalLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(totalField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        panel.add(calculateButton, gbc);

        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    } //end constructor

    /**
     * Calculates the sum of the entered values and displays the result in the sum field.
     */
    private void calculateSum() {
        try {
            double annualRate = Double.parseDouble(rateField.getText());
            double yearCount = Double.parseDouble(yearsField.getText());
            double loanAmount = Double.parseDouble(loanAmountField.getText());

            double i = annualRate / 12;
            double n = yearCount * 12;
            double P = (i * loanAmount) / (1 - Math.pow(1 + i, 0 - n));
            double total = n * P;

            monthlyField.setText(String.format("%.2f", P));
            totalField.setText(String.format("%.2f", total));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } //end calculateSum

    /**
     * main process
     * @param args
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoanCalculator();
            }
        });
    } //end main()

    //Define variables
    private JTextField rateField, yearsField, loanAmountField, monthlyField, totalField;
} //end class LoanCalculator
