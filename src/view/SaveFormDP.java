package view;

import entities.DurableProducts;
import entities.PerishableProducts;
import entities.StateSalesTax;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import oop.persistance.controller.ControllerName;
import oop.persistance.controller.DurableHandler;
import oop.persistance.controller.HandlerFactory;
import oop.persistance.controller.PerishableHandler;

/**
 *
 * @author --G--
 */
public class SaveFormDP extends javax.swing.JFrame {

    List<ProductCreateEventListener> listeners;

    /**
     * Creates new form SaveFormDP
     */
    public SaveFormDP() {
        initComponents();
        listeners = new ArrayList<>();

    }

    private void notifyListeners(DurableProducts product) {
        for (ProductCreateEventListener listener : listeners) {
            listener.productCreated(product);
        }
    }

    public void addListener(ProductCreateEventListener listener) {
        listeners.add(listener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtGrossWeight = new javax.swing.JTextField();
        jtArticleNum = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        jtName = new javax.swing.JTextField();
        jtBrand = new javax.swing.JTextField();
        jtFamily = new javax.swing.JTextField();
        jtNettoPrice = new javax.swing.JTextField();
        jtTaxId = new javax.swing.JTextField();
        jtQantity = new javax.swing.JTextField();
        jtAmountUnit = new javax.swing.JTextField();
        jtCriticalQuantity = new javax.swing.JTextField();
        jtWaranty = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Durable save");
        setResizable(false);

        jtGrossWeight.setText("40.32");

        jtArticleNum.setText("DP12345678");

        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        jtName.setText("Liszt");

        jtBrand.setText("Nagyi");

        jtFamily.setText("Gabona");

        jtNettoPrice.setText("960");

        jtTaxId.setText("27");

        jtQantity.setText("40");

        jtAmountUnit.setText("kg");

        jtCriticalQuantity.setText("10");

        jtWaranty.setText("12");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtName, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNettoPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtTaxId, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtQantity, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtAmountUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCriticalQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtWaranty, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtGrossWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtArticleNum, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btSave)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jtArticleNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtFamily, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtNettoPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtTaxId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtQantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtAmountUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtCriticalQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtWaranty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtGrossWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btSave)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed

        DurableHandler handler = (DurableHandler) HandlerFactory.
                createHandler(ControllerName.Durable);
        DurableProducts product = productcreator();
        handler.create(product, Integer.parseInt(jtTaxId.getText()));
        notifyListeners(product);
        this.dispose();
    }//GEN-LAST:event_btSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.
                    getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SaveFormDP.class
                    .getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaveFormDP.class
                    .getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaveFormDP.class
                    .getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaveFormDP.class
                    .getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaveFormDP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSave;
    private javax.swing.JTextField jtAmountUnit;
    private javax.swing.JTextField jtArticleNum;
    private javax.swing.JTextField jtBrand;
    private javax.swing.JTextField jtCriticalQuantity;
    private javax.swing.JTextField jtFamily;
    private javax.swing.JTextField jtGrossWeight;
    private javax.swing.JTextField jtName;
    private javax.swing.JTextField jtNettoPrice;
    private javax.swing.JTextField jtQantity;
    private javax.swing.JTextField jtTaxId;
    private javax.swing.JTextField jtWaranty;
    // End of variables declaration//GEN-END:variables

    private DurableProducts productcreator() {
        DurableProducts result = new DurableProducts(jtArticleNum.
                getText(), jtName.getText(),
                jtFamily.getText(), Integer.parseInt(jtNettoPrice.getText()),
                Integer.parseInt(jtQantity.getText()), jtAmountUnit.getText(),
                Integer.parseInt(jtCriticalQuantity.getText()), Integer.
                parseInt(jtWaranty.getText()),
                BigDecimal.valueOf(Double.parseDouble(jtGrossWeight.getText())));
        result.setBrand(jtBrand.getText());
        StateSalesTax sst = new StateSalesTax(Integer.
                parseInt(jtTaxId.getText()));
        result.setTaxId(
                sst);
        return result;
    }
}
