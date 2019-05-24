package ListaNotas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JList;

public class PanelNotas extends JPanel {
	private JTextField txtNota;
	private JTextField txtFecha;
	private String LineaTexto;

	/**
	 * Create the panel.
	 */
	public PanelNotas() {
		setLayout(null);
		
		txtNota = new JTextField();
		txtNota.setBounds(49, 78, 391, 20);
		add(txtNota);
		txtNota.setColumns(10);
		
		JLabel lblListadodeNotas = new JLabel("Listado de Notas");
		lblListadodeNotas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblListadodeNotas.setBounds(154, 11, 149, 20);
		add(lblListadodeNotas);
		
		JComboBox comboTipo = new JComboBox();
		comboTipo.setBounds(49, 113, 136, 20);
		add(comboTipo);
		comboTipo.addItem("Normal");
		comboTipo.addItem("Importante");
		comboTipo.addItem("Urgente");
		
		JLabel lblTexto = new JLabel("Fecha:");
		lblTexto.setBounds(10, 46, 46, 14);
		add(lblTexto);
		
		JLabel label = new JLabel("Texto:");
		label.setBounds(10, 81, 46, 14);
		add(label);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(49, 43, 73, 20);
		add(txtFecha);
		txtFecha.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Tipo:");
		lblNewLabel.setBounds(10, 116, 46, 14);
		add(lblNewLabel);
		
		JList listaNotas = new JList();
		listaNotas.setBounds(10, 183, 430, 223);
		add(listaNotas);
		
		JButton btnAnadir = new JButton("A\u00F1adir");
		btnAnadir.setFont(new Font("Calibri", Font.BOLD, 11));
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				listaNotas.addElement();
				listaNotas.addElement(txt);
				listaNotas.addElement();
			}
		});
		btnAnadir.setBounds(10, 149, 75, 23);
		add(btnAnadir);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Calibri", Font.BOLD, 11));
		btnModificar.setBounds(95, 149, 90, 23);
		add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Calibri", Font.BOLD, 11));
		btnBorrar.setBounds(195, 149, 75, 23);
		add(btnBorrar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Calibri", Font.BOLD, 11));
		btnGuardar.setBounds(280, 149, 75, 23);
		add(btnGuardar);
		
		JButton btnNewButton = new JButton("Listar");
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(365, 149, 75, 23);
		add(btnNewButton);
		
	}
}
