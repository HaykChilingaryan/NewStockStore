import com.sun.tools.javac.Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Tue May 04 16:01:46 AMT 2021
 */



/**
 * @author Zhanna Sargsyan
 */
public class StoreGUI extends JFrame {
    public StoreGUI() {
        initComponents();
        getContentPane().setBackground(new Color(153, 153, 255));
    }

    private void SellProductActionPerformed(ActionEvent e) {
        SellProductGUI sellProduct = new SellProductGUI();
        sellProduct.pack();
        sellProduct.setVisible(true);
        dispose();
    }
    private void RequestProductActionPerformed(ActionEvent e) {
        RequestProductGUI request = new RequestProductGUI();
        request.pack();
        request.setVisible(true);
        dispose();
    }

    public static void main(String[] args) {
        StoreGUI store = new StoreGUI();
        store.setVisible(true);
    }

    private void CancelActionPerformed(ActionEvent e) {
        MainGUI main = new MainGUI();
        main.pack();
        main.setVisible(true);
        this.dispose();
    }


    private void ProductListActionPerformed(ActionEvent e) {
        StoreProductListGUI storeProductList = new StoreProductListGUI();
        storeProductList.pack();
        storeProductList.setVisible(true);
        dispose();
    }

    private void button1ActionPerformed(ActionEvent e) {
        RequestProductGUI request = new RequestProductGUI();
        request.pack();
        request.setVisible(true);
        dispose();
    }

    private void button2ActionPerformed(ActionEvent e) {
        SellProductGUI sellProduct = new SellProductGUI();
        sellProduct.pack();
        sellProduct.setVisible(true);
        dispose();
    }

    

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Zhanna Sargsyan
        SellProductButton = new JButton();
        RequestProductButton = new JButton();
        Cancel = new JButton();
        ProductList = new JButton();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        var contentPane = getContentPane();

        //---- SellProductButton ----
        SellProductButton.setText("Sell a product");
        SellProductButton.setBackground(Color.yellow);
        SellProductButton.addActionListener(e -> button1ActionPerformed(e));

        //---- RequestProductButton ----
        RequestProductButton.setText("Request a product");
        RequestProductButton.setBackground(Color.yellow);
        RequestProductButton.addActionListener(e -> button2ActionPerformed(e));

        //---- Cancel ----
        Cancel.setText("Back");
        Cancel.setBackground(Color.yellow);
        Cancel.addActionListener(e -> CancelActionPerformed(e));

        //---- ProductList ----
        ProductList.setText("Product List");
        ProductList.setBackground(Color.yellow);
        ProductList.addActionListener(e -> ProductListActionPerformed(e));

        //---- label2 ----
        label2.setIcon(new ImageIcon(getClass().getResource("/icons/shopping__business__cart__add__more_-512.png")));

        //---- label3 ----
        label3.setIcon(new ImageIcon(getClass().getResource("/icons/shopping__business__document__pencil_-512.png")));

        //---- label4 ----
        label4.setIcon(new ImageIcon(getClass().getResource("/icons/shopping__business__coins__dollar_-512.png")));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(63, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label4)
                                .addComponent(label2)
                                .addComponent(label3))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(SellProductButton, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addComponent(RequestProductButton, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addComponent(ProductList, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                            .addGap(135, 135, 135))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(Cancel)
                            .addContainerGap())))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(SellProductButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label4))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label2)
                        .addComponent(RequestProductButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(ProductList, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                    .addComponent(Cancel)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Zhanna Sargsyan
    private JButton SellProductButton;
    private JButton RequestProductButton;
    private JButton Cancel;
    private JButton ProductList;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
