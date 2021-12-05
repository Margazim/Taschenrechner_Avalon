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
        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(oneButton.getText());
            }
        });
        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(twoButton.getText());
            }
        });
        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(threeButton.getText());
            }
        });
        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(fourButton.getText());
            }
        });
        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(fiveButton.getText());
            }
        });
        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(sixButton.getText());
            }
        });
        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(sevenButton.getText());
            }
        });
        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(eightButton.getText());
            }
        });
        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(nineButton.getText());
            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(plusButton.getText());
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(minusButton.getText());
            }
        });
        multButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(multButton.getText());
            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(divideButton.getText());
            }
        });
        nullButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(nullButton.getText());
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(null);
            }
        });
        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String calculation = anzeige.getText();

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TaschenrechnerView");
        frame.setContentPane(new TaschenrechnerView().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
