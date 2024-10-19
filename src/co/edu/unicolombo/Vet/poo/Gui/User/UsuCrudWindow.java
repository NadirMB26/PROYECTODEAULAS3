
package co.edu.unicolombo.Vet.poo.Gui.User;

import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.EditarUsuCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.EliminarUsuCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.GuardarUsuCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarUsuQueryHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarUsuquery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.EditarUsuCommand;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.EliminarUsuCommand;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarUsuCommand;
import co.edu.unicolombo.poo.Vet.Domain.Model.Usuario;

import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.UsuarioRepository;

import javax.swing.JOptionPane;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IUsuRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries.IBuscarUsuQuery;


public class UsuCrudWindow extends javax.swing.JDialog {
private Usuario usuActual;
    public UsuCrudWindow(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadioRoles = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        PanelDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        FieldName = new javax.swing.JTextField();
        ButtonSave = new javax.swing.JButton();
        ButtonBuscar = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        FieldCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FieldApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FieldDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FieldCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        FieldClave = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        FieldTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        radioCliente = new javax.swing.JRadioButton();
        radioVeterin = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DE USUARIOS");

        PanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos del Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("NOMBRE:");

        ButtonSave.setText("GUARDAR");
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveActionPerformed(evt);
            }
        });

        ButtonBuscar.setText("BUSCAR");
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });

        ButtonEditar.setText("EDITAR");
        ButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarActionPerformed(evt);
            }
        });

        ButtonEliminar.setText("ELIMINAR");
        ButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CEDULA:");

        FieldCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCedulaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("APELLIDO:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("DIRECCION:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("CORREO:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("CLAVE:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("TELEFONO:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("ROL:");

        RadioRoles.add(radioCliente);
        radioCliente.setText("CLIENTE");

        RadioRoles.add(radioVeterin);
        radioVeterin.setText("VETERINARIO");

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addComponent(ButtonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonSave))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioVeterin)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(FieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(FieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(FieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(radioCliente))
                    .addComponent(radioVeterin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonEliminar)
                    .addComponent(ButtonEditar)
                    .addComponent(ButtonBuscar)
                    .addComponent(ButtonSave))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
       if(FieldName.getText().isEmpty()&&FieldCedula.getText().isEmpty()){
          JOptionPane.showMessageDialog(this,"Debes llenar todos los campos");
       }else{
              try {
            String nombre = FieldName.getText();
            String cedula=FieldCedula.getText();
            String apellido=FieldApellido.getText();
            String direccion=FieldDireccion.getText();
            String correo=FieldCorreo.getText();
            String clave=FieldClave.getText();
            String telefono=FieldTelefono.getText();
            String tipo = "";
        

         if(radioVeterin.isSelected()){
           tipo=radioVeterin.getText();
       }else if(radioCliente.isSelected()){
           tipo=radioCliente.getText();
       }else{
           JOptionPane.showMessageDialog(this,"Debes seleccionar un tipo","ALERTA",JOptionPane.ERROR_MESSAGE);
           return;
       }
            var comando = new GuardarUsuCommand(cedula, apellido, nombre,direccion,correo, clave, telefono, tipo);
            var repository=new UsuarioRepository();
            var guardarUsuCommandHandler= new GuardarUsuCommandHandler(repository);
            int total=guardarUsuCommandHandler.createUsu(comando);
            JOptionPane.showMessageDialog(this,"Usuario guardado Correctamente, total "+total);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        } 
              FieldName.setText("");
            
       }
    
    }//GEN-LAST:event_ButtonSaveActionPerformed

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
           try {
            if(usuActual==null){
                JOptionPane.showMessageDialog(this,"Primero busque el rol y editelo");
                return;
            }
            String nombre = FieldName.getText();
            String apellido=FieldApellido.getText();
            String direccion=FieldDireccion.getText();
            String correo=FieldCorreo.getText();
            String clave=FieldClave.getText();
            String telefono=FieldTelefono.getText();
            String tipo = "";
        

         if(radioVeterin.isSelected()){
           tipo=radioVeterin.getText();
       }else if(radioCliente.isSelected()){
           tipo=radioCliente.getText();
       }else{
           JOptionPane.showMessageDialog(this,"Debes seleccionar un tipo","ALERTA",JOptionPane.ERROR_MESSAGE);
           return;
       }
            usuActual.setNombre(nombre);
            usuActual.setApellido(apellido);
            usuActual.setDireccion(direccion);
            usuActual.setCorreo(correo);
            usuActual.setClave(clave);
            usuActual.setTelefono(telefono);
            
            var editarUsuCommand=new EditarUsuCommand(usuActual.getCedula(),
                    usuActual.getApellido(),usuActual.getNombre(),usuActual.getDireccion(),usuActual.getCorreo(),usuActual.getClave(),usuActual.getTelefono(),usuActual.getRol());
          
           var rolRepository=new UsuarioRepository();
           var editarCommandHandler=new EditarUsuCommandHandler(rolRepository);
           editarCommandHandler.editar(editarUsuCommand);
            JOptionPane.showMessageDialog(this,"Rol Editado ");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
    }//GEN-LAST:event_ButtonEditarActionPerformed

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
       try {
            String id=JOptionPane.showInputDialog(this,"Ingrese el ID del Rol");
            int rolId= Integer.parseInt(id);
            IUsuRepository repository=new UsuarioRepository();
            IBuscarUsuQuery queryHandler = new BuscarUsuQueryHandler(repository);
            var query=new BuscarUsuquery(rolId);
            usuActual=queryHandler.obtenerRol(query);
            FieldCedula.setText(usuActual.getCedula());
            FieldName.setText(usuActual.getNombre());
            FieldApellido.setText(usuActual.getApellido());
            FieldDireccion.setText(usuActual.getDireccion());
            FieldCorreo.setText(usuActual.getCorreo());
            FieldTelefono.setText(usuActual.getTelefono());
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed
     try {
            if(usuActual==null){
                JOptionPane.showMessageDialog(this,"Primero busque el rol ");
                return;
            }
           // int eli=rolActual.getId();
            var rolRepository=new UsuarioRepository();  
            var eliminarUsuCommand=new EliminarUsuCommandHandler(rolRepository);
           eliminarUsuCommand.eliminar(usuActual);
            JOptionPane.showMessageDialog(this,"Rol Eliminado ");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
    }//GEN-LAST:event_ButtonEliminarActionPerformed

    private void FieldCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCedulaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UsuCrudWindow dialog = new UsuCrudWindow(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JTextField FieldApellido;
    private javax.swing.JTextField FieldCedula;
    private javax.swing.JTextField FieldClave;
    private javax.swing.JTextField FieldCorreo;
    private javax.swing.JTextField FieldDireccion;
    private javax.swing.JTextField FieldName;
    private javax.swing.JTextField FieldTelefono;
    private javax.swing.JPanel PanelDatos;
    private javax.swing.ButtonGroup RadioRoles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton radioCliente;
    private javax.swing.JRadioButton radioVeterin;
    // End of variables declaration//GEN-END:variables
}
