import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Account {
    public static double balance;
    public static String str = "Current Balance: $0.00";
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bank Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(350, 350);

        JPanel mainPanel = new JPanel();

        frame.add(mainPanel);

        JTextField enterBalanceField = new JTextField("Type Balance");
        JTextField depositField = new JTextField("Type Deposit Amount");
        JTextField withdrawalField = new JTextField("Type Withdrawal Amount");

        String strSetBalanceButton = "<html><center>Submit<br>Balance</center></html>";
        String strDepositButton = "<html><center>Submit<br>Deposit</center></html>";
        String strWithdrawalButton = "<html><center>Submit<br>Withdrawal</center></html>";

        JButton setBalanceButton = new JButton(strSetBalanceButton);
        JButton depositButton = new JButton(strDepositButton);
        JButton withdrawalButton = new JButton(strWithdrawalButton);

        setBalanceButton.setPreferredSize(new Dimension(150, 75));
        depositButton.setPreferredSize(new Dimension(150, 75));
        withdrawalButton.setPreferredSize(new Dimension(150, 75));

        mainPanel.add(enterBalanceField);
        mainPanel.add(setBalanceButton,BorderLayout.EAST);
        mainPanel.add(depositField);
        mainPanel.add(depositButton,BorderLayout.EAST);
        mainPanel.add(withdrawalField);
        mainPanel.add(withdrawalButton,BorderLayout.EAST);

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
        //frame.pack();
        frame.setVisible(true);




    }}