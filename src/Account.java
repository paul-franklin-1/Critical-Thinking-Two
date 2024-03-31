import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Account {
    //set fields for account balance ("balance") and for String of initial current balance ("str")
    public static double balance;
    public static String str = "Current Balance: $0.00";

    //all subsequent code is contained in main method
    public static void main(String[] args) {

        //create first and only JFrame, set title, size, layout, and default close operation of frame
        JFrame frame = new JFrame("Bank Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 350);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        //create first and only JPanel, set the layout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        //initialize HTML Strings that will later be added to buttons as button titles
        String strSetBalanceButton = "<html><center>Submit<br>Balance</center></html>";
        String strDepositButton = "<html><center>Submit<br>Deposit</center></html>";
        String strWithdrawalButton = "<html><center>Submit<br>Withdrawal</center></html>";

        //set the font, size, and style for all buttons, labels, and text fields that are subsequently created
        UIManager.put("Button.font", new Font("Georgia", Font.BOLD, 32));
        UIManager.put("Label.font", new Font("Impact", Font.PLAIN, 30));
        UIManager.put("TextField.font", new Font("Georgia", Font.PLAIN, 27));

        //create all JTextFields that will accept numeric user input. Also, 3 empty JTextFields for spacing
        JTextField enterBalanceField = new JTextField("Type Balance");
        JTextField depositField = new JTextField("Type Deposit Amount");
        JTextField withdrawalField = new JTextField("Type Withdrawal Amount");
        JTextField emptyLineField = new JTextField("");
        JTextField emptyLineField2 = new JTextField("");
        JTextField emptyLineField3 = new JTextField("");

        //create all three buttons and add the previously created Strings to be used as button titles
        JButton setBalanceButton = new JButton(strSetBalanceButton);
        JButton depositButton = new JButton(strDepositButton);
        JButton withdrawalButton = new JButton(strWithdrawalButton);

        //set the size of buttons
        setBalanceButton.setPreferredSize(new Dimension(225, 105));
        depositButton.setPreferredSize(new Dimension(225, 105));
        withdrawalButton.setPreferredSize(new Dimension(225, 105));

        //add all text fields and buttons to mainPanel
        mainPanel.add(emptyLineField);
        mainPanel.add(enterBalanceField);
        mainPanel.add(setBalanceButton);
        mainPanel.add(emptyLineField2);
        mainPanel.add(depositField);
        mainPanel.add(depositButton);
        mainPanel.add(emptyLineField3);
        mainPanel.add(withdrawalField);
        mainPanel.add(withdrawalButton);

        //create a single label to display the current account balance to the user, so that
        //when user makes changes to the balance, the label is updated to display the changed balance
        JLabel label = new JLabel("Current Balance: $0.00");

        //initialize action listener to detect a clicked button and detect which button is the click source
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                //through branching, direct the program to modify
                //account balance based on source of user clicks, and
                //employ String interpolation for text in "current balance" label: $#.##
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

        //set action listener "listener" to all three buttons
        setBalanceButton.addActionListener(listener);
        depositButton.addActionListener(listener);
        withdrawalButton.addActionListener(listener);

        //finally, add panel to frame, add label to frame, apply pack() function, and set frame as visible
        frame.add(mainPanel);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }}