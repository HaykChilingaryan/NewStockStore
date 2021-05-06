import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed May 05 16:41:37 PDT 2021
 */



/**
 * @author Hayk
 */
public class StoreProductListGUI extends JFrame {

    public StoreProductListGUI() {
        initComponents();
        getContentPane().setBackground(new Color(153, 153, 255));
        pack();
        StoreProductList.setModel(new DefaultComboBoxModel(Store.productList.toArray()));
        this.setVisible(true);
    }

    public static void main(String[] args) {
        StoreProductListGUI productList = new StoreProductListGUI();
        productList.pack();
        productList.setVisible(true);
    }

    private void BackButtonActionPerformed(ActionEvent e) {
        StoreGUI store = new StoreGUI();
        store.pack();
        store.setVisible(true);
        this.dispose();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Zhanna Sargsyan
        label1 = new JLabel();
        StoreProductList = new JList();
        BackButton = new JButton();

        //======== this ========
        setBackground(new Color(153, 153, 255));
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Store Product List");
        label1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));
        label1.setForeground(Color.yellow);

        //---- StoreProductList ----
        StoreProductList.setSelectionBackground(new Color(153, 153, 255));
        StoreProductList.setBackground(Color.yellow);

        //---- BackButton ----
        BackButton.setText("Back");
        BackButton.setForeground(Color.black);
        BackButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        BackButton.setBackground(Color.yellow);
        BackButton.addActionListener(e -> BackButtonActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(0, 215, Short.MAX_VALUE)
                    .addComponent(BackButton, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                    .addGap(14, 14, 14))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(102, Short.MAX_VALUE)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                    .addGap(69, 69, 69))
                .addComponent(StoreProductList, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)
                    .addComponent(StoreProductList, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                    .addComponent(BackButton)
                    .addGap(15, 15, 15))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Zhanna Sargsyan
    private JLabel label1;
    private JList StoreProductList;
    private JButton BackButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
