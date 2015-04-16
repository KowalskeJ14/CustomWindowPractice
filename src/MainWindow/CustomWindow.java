
package MainWindow;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;


public class CustomWindow extends JFrame implements ActionListener {
    private JLabel lblPrompt;
    private JLabel lblOutput;
    private JButton btnSayHello;
    private JTextField txtInput;
    // Below is an implementation!!!
    // Can handle any instance on 
    private Container c;
    private JPanel panel;
    
    
    public CustomWindow() {
        lblPrompt = new JLabel("Enter your name:");
        lblOutput = new JLabel();
        btnSayHello = new JButton("Say Hello");
        txtInput = new JTextField(20);
        panel = new JPanel();
        c = this.getContentPane();
        
        panel.add(lblPrompt);
        panel.add(txtInput);
        panel.add(btnSayHello);
        c.add(panel, BorderLayout.NORTH);
        c.add(lblOutput,BorderLayout.SOUTH);
        
        btnSayHello.addActionListener(this);
        
        setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    
}
