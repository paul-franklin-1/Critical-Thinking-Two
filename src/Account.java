import javax.swing.*;
import java.awt.event.*;
public class Account {
    public static double balance;
    public static String str = "Current Balance: $0.00";
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bank Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);

        JPanel mainPanel = new JPanel();
        JPanel balancePanel = new JPanel();
        JPanel depositPanel = new JPanel();
        JPanel withdrawalPanel = new JPanel();
        JPanel currentBalancePanel = new JPanel();

        frame.add(mainPanel);

        mainPanel.add(balancePanel);
        mainPanel.add(depositPanel);
        mainPanel.add(withdrawalPanel);
        mainPanel.add(currentBalancePanel);

        JTextField currentBalanceField = new JTextField("Current Balance");
        JTextField enterBalanceField = new JTextField("Enter Balance:");
        JTextField depositField = new JTextField("Enter Deposit Amount:");
        JTextField withdrawalField = new JTextField("Enter Withdrawal Amount:");

        balancePanel.add(currentBalanceField);
        balancePanel.add(enterBalanceField);
        depositPanel.add(depositField);
        withdrawalPanel.add(withdrawalField);

        JButton setBalanceButton = new JButton("Enter Balance");
        JButton depositButton = new JButton("Enter Deposit Amount");
        JButton withdrawalButton = new JButton("Enter Withdrawal Amount");

        balancePanel.add(setBalanceButton);
        depositPanel.add(depositButton);
        withdrawalPanel.add(withdrawalButton);

        JLabel label = new JLabel(str);
        frame.add(label);

        frame.setVisible(true);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == setBalanceButton){
                    balance = Double.parseDouble(enterBalanceField.getText());
                    str = String.format("Current Balance: %.2f",balance);}
                else if (source == depositButton){
                    double depositAmount = Double.parseDouble(depositField.getText());
                    balance = depositAmount + balance;
                    str = String.format("Current Balance: %.2f",balance);}
                else if (source == withdrawalButton){
                    double withdrawalAmount = Double.parseDouble(withdrawalField.getText());
                    balance = balance - withdrawalAmount;
                    str = String.format("Current Balance: %.2f",balance);}
                else{ str = "Error";}}};

        setBalanceButton.addActionListener(listener);
        depositButton.addActionListener(listener);
        withdrawalButton.addActionListener(listener);


    }}

