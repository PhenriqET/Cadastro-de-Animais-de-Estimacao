/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author 21123649790
 */
public class FrCadPet extends javax.swing.JPanel {

    /**
     * Creates new form FrCadPet
     */
    public FrCadPet() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCadPets = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNovo = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        lblCancelar = new javax.swing.JLabel();
        lblExcluir = new javax.swing.JLabel();
        lblSalvar = new javax.swing.JLabel();

        lblCadPets.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblCadPets.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadPets.setText("Cadastro de Pets");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(lblCadPets)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblCadPets)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        lblNovo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNovo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNovo.setText("Novo");

        lblEditar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEditar.setText("Editar");

        lblCancelar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCancelar.setText("Cancelar");

        lblExcluir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblExcluir.setText("Excluir");

        lblSalvar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSalvar.setText("Salvar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lblNovo)
                .addGap(18, 18, 18)
                .addComponent(lblEditar)
                .addGap(18, 18, 18)
                .addComponent(lblCancelar)
                .addGap(18, 18, 18)
                .addComponent(lblExcluir)
                .addGap(18, 18, 18)
                .addComponent(lblSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNovo)
                    .addComponent(lblEditar)
                    .addComponent(lblCancelar)
                    .addComponent(lblExcluir)
                    .addComponent(lblSalvar))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCadPets;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblExcluir;
    private javax.swing.JLabel lblNovo;
    private javax.swing.JLabel lblSalvar;
    // End of variables declaration//GEN-END:variables
}
