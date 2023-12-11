package laborator10;

import jdk.internal.jimage.ImageStrings;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SwingControlDemo {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JPanel controlPanel;
    private Label statusLabel;

    public SwingControlDemo() {
        prepareGUI();
    }

    public static void main(String[] args) {
        SwingControlDemo swingControlDemo = new SwingControlDemo();
        swingControlDemo.showLabelDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java Swing Examples");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        JLabel statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showLabelDemo() {
        headerLabel.setText("Nume: ");
        JLabel label = new JLabel("", JLabel.CENTER);
        label.setText("");
        label.setOpaque(true);
        label.setBackground(Color.GRAY);
        label.setForeground(Color.WHITE);
        controlPanel.add(label);
        mainFrame.setVisible(true);
        headerLabel.setText("Control in action: JTextField");

        JLabel  namelabel= new JLabel("Nume: ", JLabel.RIGHT);
        final JTextField userText = new JTextField(6);
        final JCheckBox chkApple = new JCheckBox("LABEL");
        final JCheckBox chkMango = new JCheckBox("Mango");
        final JRadioButton radApple = new JRadioButton("", true);
        final JRadioButton radMango = new JRadioButton("");
        final JRadioButton radPeer = new JRadioButton("LABEL");

        chkApple.setMnemonic(KeyEvent.VK_C);
        chkMango.setMnemonic(KeyEvent.VK_M);
        radPeer.setMnemonic(KeyEvent.VK_P);


        chkApple.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("LABEL Checkbox: "
                        + (e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        chkMango.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Mango Checkbox: "
                        + (e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        chkApple.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Peer Checkbox: "
                        + (e.getStateChange()==1?"checked":"unchecked"));
            }
        });


        radApple.setMnemonic(KeyEvent.VK_C);
        radMango.setMnemonic(KeyEvent.VK_M);
        radPeer.setMnemonic(KeyEvent.VK_P);

        radApple.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Apple RadioButton: "
                        + (e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        radMango.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Mango RadioButton: "
                        + (e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        radPeer.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Peer RadioButton: "
                        + (e.getStateChange()==1?"checked":"unchecked"));
            }
        });

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            private Label statusLabel;
            public void actionPerformed(ActionEvent e) {
                String data = "Username " + userText.getText();

                statusLabel.setText(data);
            }
        });
        ButtonGroup group = new ButtonGroup();

        group.add(radApple);
        group.add(radMango);
        group.add(radPeer);


        controlPanel.add(namelabel);
        controlPanel.add(userText);
        controlPanel.add(loginButton);
        controlPanel.add(chkApple);
        controlPanel.add(radPeer);
        controlPanel.add(radApple);
        controlPanel.add(radMango);
        mainFrame.setVisible(true);

    }

}


