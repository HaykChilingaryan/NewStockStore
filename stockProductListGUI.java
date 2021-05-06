import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.CaretEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
/*
 * Created by JFormDesigner on Tue May 04 16:13:45 AMT 2021
 */


/**
 * @author Zhanna Sargsyan
 */
public class stockProductListGUI extends JFrame {

    public static void main(String[] args) {
        stockProductListGUI soldProduct = new stockProductListGUI();
        soldProduct.pack();
        soldProduct.setVisible(true);
    }

    public stockProductListGUI() {
        initComponents();
        pack();
        this.setVisible(true);
    }

    private void BackButtonActionPerformed(ActionEvent e) {
        StockGUI stock = new StockGUI();
        stock.pack();
        stock.setVisible(true);
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Zhanna Sargsyan
        dialogPane = new JPanel();
        buttonBar = new JPanel();
        BackButton = new JButton();
        scrollPane1 = new JScrollPane();
        StoreProductList = new JList();
        StoreProductListPanel = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBackground(new Color(153, 153, 255));
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border
            .EmptyBorder(0,0,0,0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion",javax.swing.border.TitledBorder.CENTER,javax
            .swing.border.TitledBorder.BOTTOM,new java.awt.Font("D\u0069alog",java.awt.Font.BOLD,
            12),java.awt.Color.red),dialogPane. getBorder()));dialogPane. addPropertyChangeListener(new java.beans
            .PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062order".equals(e.
            getPropertyName()))throw new RuntimeException();}});
            dialogPane.setLayout(new BorderLayout());

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setBackground(new Color(153, 153, 255));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0};

                //---- BackButton ----
                BackButton.setText("Back");
                BackButton.setForeground(Color.yellow);
                BackButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));
                BackButton.addActionListener(e -> BackButtonActionPerformed(e));
                buttonBar.add(BackButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);

            //======== scrollPane1 ========
            {

                //---- StoreProductList ----
                StoreProductList.setBackground(Color.yellow);
                scrollPane1.setViewportView(StoreProductList);
            }
            dialogPane.add(scrollPane1, BorderLayout.CENTER);

            //---- StoreProductListPanel ----
            StoreProductListPanel.setText("Stock Product List");
            StoreProductListPanel.setForeground(Color.yellow);
            StoreProductListPanel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));
            StoreProductListPanel.setHorizontalAlignment(SwingConstants.CENTER);
            dialogPane.add(StoreProductListPanel, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Zhanna Sargsyan
    private JPanel dialogPane;
    private JPanel buttonBar;
    private JButton BackButton;
    private JScrollPane scrollPane1;
    private JList StoreProductList;
    private JLabel StoreProductListPanel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
