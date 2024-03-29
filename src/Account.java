import javax.swing.*;

public class Account {
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
        JTextField depositCashField = new JTextField("Enter Deposit Amount:");
        JTextField withdrawField = new JTextField("Enter Withdrawal Amount:");

        balancePanel.add(currentBalanceField);
        balancePanel.add(enterBalanceField);
        depositPanel.add(depositCashField);
        withdrawalPanel.add(withdrawField);

        JButton setBalanceButton = new JButton("Enter Balance");
        JButton depositButton = new JButton("Enter Deposit Amount");
        JButton withdrawalButton = new JButton("Enter Withdrawal Amount");

        balancePanel.add(setBalanceButton);
        depositPanel.add(depositButton);
        withdrawalPanel.add(withdrawalButton);

        frame.setVisible(true);
        }}

        /*BankInterface listenerSetBalance = new BankInterface();
        BankInterface listenerDeposit = new BankInterface();
        BankInterface listenerWithdraw = new BankInterface();

        setBalanceButton.addActionListener(listenerSetBalance);
        depositButton.addActionListener(listenerDeposit);
        withdrawalButton.addActionListener(listenerWithdraw);*/

