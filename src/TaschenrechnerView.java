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
    private TaschenrechnerModel model;


    public TaschenrechnerView() {
        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(anzeige.getText() + oneButton.getText());
            }
        });
        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(anzeige.getText() + twoButton.getText());
            }
        });
        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(anzeige.getText() + threeButton.getText());
            }
        });
        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(anzeige.getText() + fourButton.getText());
            }
        });
        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(anzeige.getText() + fiveButton.getText());
            }
        });
        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(anzeige.getText() + sixButton.getText());
            }
        });
        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(anzeige.getText() + sevenButton.getText());
            }
        });
        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(anzeige.getText() + eightButton.getText());
            }
        });
        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(anzeige.getText() + nineButton.getText());
            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //anzeige.setText(anzeige.getText() + plusButton.getText());
                model.setErsterOperand(getInt());
                model.setOperator("+");
                anzeige.setText(null);

            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setErsterOperand(getInt());
                model.setOperator("-");
                anzeige.setText(null);
            }
        });
        multButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setErsterOperand(getInt());
                model.setOperator("*");
                anzeige.setText(null);
            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setErsterOperand(getInt());
                model.setOperator("/");
                anzeige.setText(null);
            }
        });
        nullButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(anzeige.getText() + nullButton.getText());
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
                model.setZweiterOperand(getInt());
                anzeige.setText(String.valueOf(model.getErgebnis()));
                anzeige.setText(null);
                model.zuruecksetzen();
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

    public int getInt(){
        return Integer.parseInt(anzeige.getText());
    }

}
