import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Thu May 06 15:04:22 AMT 2021
 */



/**
 * @author Zhanna Sargsyan
 */
public class RequestProductExceptionGUI extends JFrame {
    public RequestProductExceptionGUI() {
        initComponents();
        getContentPane().setBackground(new Color(255,255,153));
        pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        RequestProductExceptionGUI requested = new RequestProductExceptionGUI();
        requested.pack();
        requested.setVisible(true);
    }

    private void button1ActionPerformed(ActionEvent e) {
        StockGUI stock = new StockGUI();
        stock.pack();
        stock.setVisible(true);
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Zhanna Sargsyan
        label1 = new JLabel();
        label2 = new JLabel();
        Request = new JButton();
        label3 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("No sell product ");
        label1.setForeground(new Color(210, 43, 31));
        label1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));

        //---- label2 ----
        label2.setText("Please, request the product ");
        label2.setForeground(new Color(210, 43, 31));
        label2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));

        //---- Request ----
        Request.setText("Request");
        Request.setBackground(new Color(87, 178, 74));
        Request.addActionListener(e -> button1ActionPerformed(e));

        //---- label3 ----
        label3.setIcon(new ImageIcon(getClass().getResource("/icons/error-bug-stop-icon-33-B1.png")));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(0, 84, Short.MAX_VALUE)
                    .addComponent(Request, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
                    .addGap(79, 79, 79))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(166, 166, 166)
                            .addComponent(label3))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(97, 97, 97)
                            .addComponent(label2))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(142, 142, 142)
                            .addComponent(label1)))
                    .addContainerGap(99, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(label3)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(label1)
                    .addGap(18, 18, 18)
                    .addComponent(label2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                    .addComponent(Request)
                    .addGap(51, 51, 51))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Zhanna Sargsyan
    private JLabel label1;
    private JLabel label2;
    private JButton Request;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
