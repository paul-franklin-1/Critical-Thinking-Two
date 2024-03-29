import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Create a JPanel object
       JFrame frame = new JFrame("Bank Interface");
        frame.setSize(1000, 700);
        frame.setLayout(new FlowLayout());
        JPanel balancePanel = new JPanel();
        frame.add(balancePanel);
        JPanel depositPanel = new JPanel();
        frame.add(depositPanel);
        JPanel withdrawalPanel = new JPanel();
        frame.add(withdrawalPanel);
        JPanel currentBalancePanel = new JPanel();
        frame.add(currentBalancePanel);
        JTextField currentBalance = new JTextField("Current Balance");
        balancePanel.add(currentBalance);
        JTextField enterBalance = new JTextField("Enter Balance:");
        balancePanel.add(enterBalance);
        JTextField depositCash = new JTextField("Enter Deposit Amount:");
        depositPanel.add(depositCash);
        JTextField withdrawCash = new JTextField("Enter Withdrawal Amount:");
        withdrawalPanel.add(withdrawCash);
        JButton setBalanceButton = new JButton("Enter Balance");
        balancePanel.add(setBalanceButton);
        JButton depositButton = new JButton("Enter Deposit Amount");
        depositPanel.add(depositButton);
        JButton withdrawCashButton = new JButton("Enter Withdrawal Amount");
        withdrawalPanel.add(withdrawCashButton);
        frame.setVisible(true);

    }}