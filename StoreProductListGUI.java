import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed May 05 16:41:37 PDT 2021
 */



/**
 * @author Hayk
 */
public class StoreProductListGUI extends JFrame {
    public static void main(String[] args) {
        StoreProductListGUI productList = new StoreProductListGUI();
        productList.pack();
        productList.setVisible(true);
    }
    public StoreProductListGUI() {
        initComponents();
        pack();
        StoreProductList.setModel(new DefaultComboBoxModel(Store.productList.toArray()));
        this.setVisible(true);
    }

    private void BackButtonActionPerformed(ActionEvent e) {
        StoreGUI store = new StoreGUI();
        store.pack();
        store.setVisible(true);
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Hayk
        label1 = new JLabel();
        StoreProductList = new JList();
        BackButton = new JButton();

        //======== this ========
        setBackground(Color.magenta);
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("Store Product List");
        label1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));
        label1.setForeground(Color.yellow);
        contentPane.add(label1, "cell 3 0");
        contentPane.add(StoreProductList, "cell 0 2 2 3");

        //---- BackButton ----
        BackButton.setText("Back");
        BackButton.setForeground(Color.yellow);
        BackButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));
        BackButton.addActionListener(e -> BackButtonActionPerformed(e));
        contentPane.add(BackButton, "cell 0 10");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Hayk
    private JLabel label1;
    private JList StoreProductList;
    private JButton BackButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
