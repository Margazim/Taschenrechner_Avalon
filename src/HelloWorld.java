import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HelloWorld {
    private JPanel mainPanel;
    private JButton halloButton;
    private JTextField nameField;
    private JLabel nameIn;
    private JCheckBox informalCheckBox;

    public HelloWorld() {
        halloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                print();
            }
        });

        halloButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                Color mintgruen = Color.decode("#ade3d1");
                halloButton.setBackground(mintgruen);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                halloButton.setBackground(Color.white);
            }
        });
        nameField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                print();
            }
        });



    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorld");
        frame.setContentPane(new HelloWorld().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public void print(){
        String name = nameField.getText();
        System.out.println(name);
        boolean informell = informalCheckBox.isSelected();
        if(informell){
            JOptionPane.showMessageDialog(halloButton, "Yo " + name + "!");
        }else{
            JOptionPane.showMessageDialog(halloButton, "Herzlich Willkommen, " + name+"!");
        }
    }


}
