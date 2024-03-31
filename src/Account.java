import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Account {
    public static double balance;
    public static String str = "Current Balance: $0.00";
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bank Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);

        JPanel mainPanel = new JPanel();

        frame.add(mainPanel);

        JTextField enterBalanceField = new JTextField("Enter Balance:");
        JTextField depositField = new JTextField("Enter Deposit Amount:");
        JTextField withdrawalField = new JTextField("Enter Withdrawal Amount:");

        JButton setBalanceButton = new JButton("Enter Balance");
        JButton depositButton = new JButton("Enter Deposit Amount");
        JButton withdrawalButton = new JButton("Enter Withdrawal Amount");

        setBalanceButton.setPreferredSize(new Dimension(150, 75));
        depositButton.setPreferredSize(new Dimension(150, 75));
        withdrawalButton.setPreferredSize(new Dimension(150, 75));

        mainPanel.add(enterBalanceField);
        mainPanel.add(setBalanceButton);
        mainPanel.add(depositField);
        mainPanel.add(depositButton);
        mainPanel.add(withdrawalField);
        mainPanel.add(withdrawalButton);

        JLabel label = new JLabel("Current Balance: $0.00");
        mainPanel.add(label);
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == setBalanceButton){
                    balance = Double.parseDouble(enterBalanceField.getText());
                    label.setText(String.format("Current Balance: $%.2f",balance));}
                else if (source == depositButton){
                    double depositAmount = Double.parseDouble(depositField.getText());
                    balance = depositAmount + balance;
                    label.setText(String.format("Current Balance: $%.2f",balance));}
                else if (source == withdrawalButton){
                    double withdrawalAmount = Double.parseDouble(withdrawalField.getText());
                    balance = balance - withdrawalAmount;
                    label.setText(String.format("Current Balance: $%.2f",balance));}
                else{ label.setText("Error. Please try again.");}}};

        setBalanceButton.addActionListener(listener);
        depositButton.addActionListener(listener);
        withdrawalButton.addActionListener(listener);
        frame.pack();
        frame.setVisible(true);




    }}

