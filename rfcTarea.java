
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */

public class rfcTarea extends javax.swing.JFrame {

    /**
     * Creates new form rfcTarea
     */
    public rfcTarea() {
        initComponents();
        
        ///Variables
        
        
    }
    
    
        String APaterno;
        String Materno;
        String Nombre;
        String Año ;
        String Mes;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        JT_Paterno = new javax.swing.JTextField();
        JT_materno = new javax.swing.JTextField();
        JT_Nombre = new javax.swing.JTextField();
        JT_mesNac = new javax.swing.JTextField();
        JT_añoNac = new javax.swing.JTextField();
        JT_diaNac = new javax.swing.JTextField();
        JB_Calcular = new javax.swing.JButton();
        mostrar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido paterno");

        jLabel3.setText("Apellido materno");

        label5.setText("Año de nacimiento");

        label4.setText("Mes de nacimiento");

        label6.setText("Dia de nacimiento");

        JB_Calcular.setText("Calcular RFC");
        JB_Calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_CalcularMouseClicked(evt);
            }
        });
        JB_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JT_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JT_Paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JT_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JT_mesNac, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(242, 242, 242))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JT_diaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(JB_Calcular)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JT_añoNac, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JT_Paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JT_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4)
                    .addComponent(JT_mesNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label6)
                    .addComponent(JT_diaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_Calcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(JT_añoNac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CalcularActionPerformed
             

         APaterno = JT_Paterno.getText();
         Materno = JT_materno.getText();
         Nombre = JT_Nombre.getText();
         Año = JT_añoNac.getText();
         Mes = JT_mesNac.getText();
        
        String resultadoPaterno = metodosRFC.getlastName(APaterno);
        String resultadoNombre = metodoNombre.getFirstName(Nombre);
        String resultadoMaterno = metodoMaterno.getSecondName(Materno);
        String resultadoAño = metodoAño.getBirthYear(Año);
        
        if(Mes.equals("enero")){
                 mostrar.setText("Aqui esta tu RFC: " + resultadoPaterno + resultadoMaterno + resultadoNombre + resultadoAño + "01" );
                
          } else  if(Mes.equals("febrero")){
                 mostrar.setText("Aqui esta tu RFC: " + resultadoPaterno + resultadoMaterno + resultadoNombre + resultadoAño + "02" );
                
          } else  if(Mes.equals("marzo")){
                 mostrar.setText("Aqui esta tu RFC: " + resultadoPaterno + resultadoMaterno + resultadoNombre + resultadoAño + "03" );
                 
          } else  if(Mes.equals("abril")){
                 mostrar.setText("Aqui esta tu RFC: " + resultadoPaterno + resultadoMaterno + resultadoNombre + resultadoAño + "04" );
                 
          }else  if(Mes.equals("mayo")){
                 mostrar.setText("Aqui esta tu RFC: " + resultadoPaterno + resultadoMaterno + resultadoNombre + resultadoAño + "05" );
                 
          }else  if(Mes.equals("junio")){
                 mostrar.setText("Aqui esta tu RFC: " + resultadoPaterno + resultadoMaterno + resultadoNombre + resultadoAño + "06" );
                 
          }else  if(Mes.equals("julio")){
                 mostrar.setText("Aqui esta tu RFC: " + resultadoPaterno + resultadoMaterno + resultadoNombre + resultadoAño + "07" );
                 
          }else  if(Mes.equals("agosto")){
                 mostrar.setText("Aqui esta tu RFC: " + resultadoPaterno + resultadoMaterno + resultadoNombre + resultadoAño + "08" );
                 
          }else  if(Mes.equals("septiembre")){
                 mostrar.setText("Aqui esta tu RFC: " + resultadoPaterno + resultadoMaterno + resultadoNombre + resultadoAño + "09" );
                 
          }else  if(Mes.equals("octubre")){
                 mostrar.setText("Aqui esta tu RFC: " + resultadoPaterno + resultadoMaterno + resultadoNombre + resultadoAño + "10" );
                 
          }else  if(Mes.equals("noviembre")){
                 mostrar.setText("Aqui esta tu RFC: " + resultadoPaterno + resultadoMaterno + resultadoNombre + resultadoAño + "11" );
                 
          }else  if(Mes.equals("diciembre")){
                 mostrar.setText("Aqui esta tu RFC: " + resultadoPaterno + resultadoMaterno + resultadoNombre + resultadoAño + "12" );
                 
          } else {
              JOptionPane.showMessageDialog(null, "Por favor introduzca el mes. ");
          }
        
    }//GEN-LAST:event_JB_CalcularActionPerformed

    private void JB_CalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_CalcularMouseClicked

    
      
        String APaterno = JT_Paterno.toString();
        
        
        String resultado = metodosRFC.getlastName(APaterno);
        
        
        
        
        
    
  
    }//GEN-LAST:event_JB_CalcularMouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rfcTarea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Calcular;
    private javax.swing.JTextField JT_Nombre;
    private javax.swing.JTextField JT_Paterno;
    private javax.swing.JTextField JT_añoNac;
    private javax.swing.JTextField JT_diaNac;
    private javax.swing.JTextField JT_materno;
    private javax.swing.JTextField JT_mesNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JTextField mostrar;
    // End of variables declaration//GEN-END:variables
}
