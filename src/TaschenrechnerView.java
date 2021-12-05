import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaschenrechnerView {
    private JPanel mainPanel;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton deleteButton;
    private JButton nullButton;
    private JButton resultButton;
    private JButton plusButton;
    private JButton minusButton;
    private JButton multButton;
    private JButton divideButton;
    private JTextField anzeige;

    public TaschenrechnerView() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(e.toString());
                anzeige.getText();

//                String zahlString = .getText();
//                int zahl = Integer.parseInt(zahlString);
//                anzeige.setText(anzeige.getText() + zahlString);
            }
        };
        sevenButton.addActionListener(listener);
        eightButton.addActionListener(listener);
        nineButton.addActionListener(listener);
        fourButton.addActionListener(listener);
        fiveButton.addActionListener(listener);
        sixButton.addActionListener(listener);
        oneButton.addActionListener(listener);
        twoButton.addActionListener(listener);
        threeButton.addActionListener(listener);
        deleteButton.addActionListener(listener);
        nullButton.addActionListener(listener);
        resultButton.addActionListener(listener);
        plusButton.addActionListener(listener);
        minusButton.addActionListener(listener);
        multButton.addActionListener(listener);
        divideButton.addActionListener(listener);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
