import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Create a JPanel object
        JFrame frame = new JFrame("Bank Interface");
        frame.setSize(1000, 700);
        frame.setLayout(new FlowLayout());
        JPanel balancePanel = new JPanel();
        JPanel depositPanel = new JPanel();
        JPanel withdrawalPanel = new JPanel();
        JPanel currentBalancePanel = new JPanel();

        frame.add(balancePanel);
        frame.add(depositPanel);
        frame.add(withdrawalPanel);
        frame.add(currentBalancePanel);

        JTextField currentBalance = new JTextField("Current Balance");
        JTextField enterBalance = new JTextField("Enter Balance:");
        JTextField depositCash = new JTextField("Enter Deposit Amount:");
        JTextField withdrawCash = new JTextField("Enter Withdrawal Amount:");

        balancePanel.add(currentBalance);
        balancePanel.add(enterBalance);
        depositPanel.add(depositCash);
        withdrawalPanel.add(withdrawCash);

        JButton setBalanceButton = new JButton("Enter Balance");
        JButton depositButton = new JButton("Enter Deposit Amount");
        JButton withdrawCashButton = new JButton("Enter Withdrawal Amount");

        balancePanel.add(setBalanceButton);
        depositPanel.add(depositButton);
        withdrawalPanel.add(withdrawCashButton);

        frame.setVisible(true);
        b.addActionListener(this);
    }}