import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Fri May 07 10:12:50 AMT 2021
 */



/**
 * @author Zhanna Sargsyan
 */
public class NumberFormatExceptionGUI extends JFrame {

    public NumberFormatExceptionGUI() {
        initComponents();
        getContentPane().setBackground(new Color(255,255,153));
        pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        NumberFormatExceptionGUI exception = new NumberFormatExceptionGUI();
        exception.pack();
        exception.setVisible(true);
    }

    private void BackButtonActionPerformed(ActionEvent e) {
        MainGUI main = new MainGUI();
        main.pack();
        main.setVisible(true);
        this.dispose();
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Zhanna Sargsyan
        InvalidInput = new JLabel();
        BackButton = new JButton();
        Try = new JLabel();
        label3 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();

        //---- InvalidInput ----
        InvalidInput.setText("Invalid input");
        InvalidInput.setBackground(new Color(210, 43, 31));
        InvalidInput.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));
        InvalidInput.setForeground(new Color(210, 43, 31));

        //---- BackButton ----
        BackButton.setText("Home page");
        BackButton.setBackground(new Color(87, 178, 74));
        BackButton.addActionListener(e -> BackButtonActionPerformed(e));

        //---- Try ----
        Try.setText("Try again");
        Try.setBackground(new Color(210, 43, 31));
        Try.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));
        Try.setForeground(new Color(210, 43, 31));

        //---- label3 ----
        label3.setIcon(new ImageIcon(getClass().getResource("/icons/error-bug-stop-icon-33-B1.png")));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(153, 153, 153)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(Try))
                                .addComponent(InvalidInput)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(BackButton, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(168, 168, 168)
                            .addComponent(label3)))
                    .addContainerGap(130, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(label3)
                    .addGap(18, 18, 18)
                    .addComponent(InvalidInput)
                    .addGap(18, 18, 18)
                    .addComponent(Try)
                    .addGap(54, 54, 54)
                    .addComponent(BackButton)
                    .addContainerGap(46, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Zhanna Sargsyan
    private JLabel InvalidInput;
    private JButton BackButton;
    private JLabel Try;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
