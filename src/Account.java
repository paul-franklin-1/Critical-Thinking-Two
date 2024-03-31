import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Account {
    public static double balance;
    public static String str = "Current Balance: $0.00";
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bank Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 350);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        String strSetBalanceButton = "<html><center>Submit<br>Balance</center></html>";
        String strDepositButton = "<html><center>Submit<br>Deposit</center></html>";
        String strWithdrawalButton = "<html><center>Submit<br>Withdrawal</center></html>";

        UIManager.put("Button.font", new Font("Georgia", Font.BOLD, 25));
        UIManager.put("Label.font", new Font("Impact", Font.PLAIN, 35));
        UIManager.put("TextField.font", new Font("Georgia", Font.PLAIN, 20));

        JTextField enterBalanceField = new JTextField("Type Balance");
        JTextField depositField = new JTextField("Type Deposit Amount");
        JTextField withdrawalField = new JTextField("Type Withdrawal Amount");

        JButton setBalanceButton = new JButton(strSetBalanceButton);
        JButton depositButton = new JButton(strDepositButton);
        JButton withdrawalButton = new JButton(strWithdrawalButton);

        setBalanceButton.setPreferredSize(new Dimension(225, 105));
        depositButton.setPreferredSize(new Dimension(225, 105));
        withdrawalButton.setPreferredSize(new Dimension(225, 105));

        mainPanel.add(enterBalanceField);
        mainPanel.add(setBalanceButton);
        mainPanel.add(depositField);
        mainPanel.add(depositButton);
        mainPanel.add(withdrawalField);
        mainPanel.add(withdrawalButton);

        JLabel label = new JLabel("Current Balance: $0.00");

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
        frame.add(mainPanel);
        frame.add(label);
        frame.setVisible(true);




    }}