import javax.swing.JOptionPane;

public class HitungSikuForm extends javax.swing.JFrame {

    public HitungSikuForm() {
        initComponents();
    }

    private void initComponents() {

        alasLabel = new javax.swing.JLabel();
        tinggiLabel = new javax.swing.JLabel();
        alasField = new javax.swing.JTextField();
        tinggiField = new javax.swing.JTextField();
        hitungButton = new javax.swing.JButton();
        hasilLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hitung Siku");

        alasLabel.setText("Alas : ");

        tinggiLabel.setText("Tinggi : ");

        hitungButton.setText("Hitung");
        hitungButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alasLabel)
                    .addComponent(tinggiLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hitungButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(alasField, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                        .addComponent(tinggiField))
                    .addComponent(hasilLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alasLabel)
                    .addComponent(alasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tinggiLabel)
                    .addComponent(tinggiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hitungButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hasilLabel)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }

    private void hitungButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double alas = Double.parseDouble(alasField.getText());
            double tinggi = Double.parseDouble(tinggiField.getText());
            double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
            hasilLabel.setText("Sisi Miring: " + String.format("%.2f", sisiMiring));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Angka Yang Anda Masukkan Tidak Valid!");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HitungSikuForm().setVisible(true);
            }
        });
    }

    private javax.swing.JTextField alasField;
    private javax.swing.JLabel alasLabel;
    private javax.swing.JLabel hasilLabel;
    private javax.swing.JButton hitungButton;
    private javax.swing.JTextField tinggiField;
    private javax.swing.JLabel tinggiLabel;

}