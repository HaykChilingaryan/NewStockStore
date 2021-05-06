/*
 * Created by JFormDesigner on Thu Apr 29 16:01:16 AMT 2021
 */

import com.sun.tools.javac.Main;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Zhanna Sargsyan
 */
public class MainGUI extends JFrame {

    public static void main(String[] args) {
        MainGUI main = new MainGUI();
        main.pack();
        main.setVisible(true);
    }

    public MainGUI() {
        initComponents();
        pack();
        this.setVisible(true);
        getContentPane().setBackground(new Color(153, 153, 255));
        this.getIconImage();

    }
    private void storeButtonActionPerformed(ActionEvent e) {
        StoreGUI storeGUI = new StoreGUI();
        storeGUI.pack();
        storeGUI.setVisible(true);
        dispose();
    }

    private void stockButtonActionPerformed(ActionEvent e) {
        StockGUI stock = new StockGUI();
        stock.pack();
        stock.setVisible(true);
        dispose();
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Zhanna Sargsyan
        this.storeButton = new JButton();
        this.stockButton = new JButton();
        this.label2 = new JLabel();
        this.label3 = new JLabel();

        //======== this ========
        setBackground(Color.pink);
        setName("this");
        var contentPane = getContentPane();

        //---- storeButton ----
        this.storeButton.setText("Store");
        this.storeButton.setBackground(Color.yellow);
        this.storeButton.setName("storeButton");
        this.storeButton.addActionListener(e -> storeButtonActionPerformed(e));

        //---- stockButton ----
        this.stockButton.setText("Stock");
        this.stockButton.setBackground(Color.yellow);
        this.stockButton.setName("stockButton");
        this.stockButton.addActionListener(e -> stockButtonActionPerformed(e));

        //---- label2 ----
        this.label2.setIcon(new ImageIcon(getClass().getResource("/icons/037_boxes_warehouse_storage_delivery-512.png")));
        this.label2.setName("label2");

        //---- label3 ----
        this.label3.setIcon(new ImageIcon(getClass().getResource("/icons/shop-512.png")));
        this.label3.setName("label3");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(75, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(this.label2)
                            .addGap(18, 18, 18)
                            .addComponent(this.stockButton, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(this.label3)
                            .addGap(18, 18, 18)
                            .addComponent(this.storeButton, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)))
                    .addGap(94, 94, 94))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(56, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(this.storeButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                        .addComponent(this.label3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(this.stockButton, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                        .addComponent(this.label2))
                    .addGap(98, 98, 98))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Zhanna Sargsyan
    private JButton storeButton;
    private JButton stockButton;
    private JLabel label2;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
