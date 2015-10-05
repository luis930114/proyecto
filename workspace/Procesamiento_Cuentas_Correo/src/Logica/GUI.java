package Logica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Component;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Archivos a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		a=new Archivos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(81, 56, 224, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		contentPane.setLayout(null); // AbsoluteLayout

		
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(62, 155, 163, 236);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//		JScrollPane scrollPane = new JScrollPane();
				
				JTextArea textArea = new JTextArea();
				panel.add(textArea);
				textArea.setBounds(2, 2, 138, 231);
		
				JScrollPane scrollPane = new JScrollPane(textArea);
				scrollPane.setBounds(0, 0, 153, 235);
				panel.add(scrollPane);
				scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		setPreferredSize(new Dimension(450, 110));
//		panel.add(scrollPane);
		
//		panel.add(textArea);
		this.setVisible(true);
		
		
		
		JLabel lblResultados = new JLabel("Resultados");
		lblResultados.setBounds(20, 110, 91, 14);
		contentPane.add(lblResultados);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(346, 155, 194, 236);
		contentPane.add(panel_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(0, 0, 179, 231);
		panel_1.add(textArea_1);
		
		JScrollPane scrollPane_1 = new JScrollPane(textArea_1);
		scrollPane_1.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane_1.setBounds(0, 0, 179, 235);
		panel_1.add(scrollPane_1);
		
		JButton btnExaminar = new JButton("EXAMINAR");
		btnExaminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Creamos el objeto JFileChooser
				JFileChooser fc=new JFileChooser();
				 
				//Indicamos lo que podemos seleccionar
				fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				 
				//Creamos el filtro
				FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
				 
				//Le indicamos el filtro
				fc.setFileFilter(filtro);
				 
				//Abrimos la ventana, guardamos la opcion seleccionada por el usuario
				int seleccion=fc.showOpenDialog(contentPane);
				 
				//Si el usuario, pincha en aceptar
				if(seleccion==JFileChooser.APPROVE_OPTION){
				 
				    //Seleccionamos el fichero
				    File fichero=fc.getSelectedFile();
				   
				 
				    //Ecribe la ruta del fichero seleccionado en el campo de texto
				    textField.setText(fichero.getAbsolutePath());
				 
				    try{
//				    	FileReader fr=new FileReader(fichero);
				    	File file=a.leertxt(fichero);
				    	
			
			
				        
				    } catch (Exception e1) {
//				        e1.printStackTrace();
				    }
				}
			}
		});
		
		
		btnExaminar.setBounds(315, 56, 117, 23);
		contentPane.add(btnExaminar);
		
		
		
		JButton btnEjecutar = new JButton("EJECUTAR");
		btnEjecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> datos=null;
				datos=a.AlmacenarContenidoTxt(new File(textField.getText()));
				String acum="";
				for (int i = 0; i < a.contarPorDominios(datos).size(); i++) {
					
					 acum= (a.contarPorDominios(datos).get(i));
					textArea.append("");						
					textArea.append(acum+"\n");
					
				}
				
				
			}
		});
		btnEjecutar.setBounds(91, 87, 107, 23);
		contentPane.add(btnEjecutar);
		
		JButton btnCargar = new JButton("CARGAR");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> prueba=a.AlmacenarContenidoTxt(new File(textField.getText()));
				if(prueba.isEmpty()){
					JOptionPane.showMessageDialog(null, " no se cargo el archivo exitosamente");
				}else{
					JOptionPane.showMessageDialog(null, "se cargo el archivo exitosamente");
				}
			}
		});
		btnCargar.setBounds(207, 87, 117, 23);
		contentPane.add(btnCargar);
		
		JLabel lblNumeroDeDominios = new JLabel("numero de dominios");
		lblNumeroDeDominios.setBounds(62, 141, 117, 14);
		contentPane.add(lblNumeroDeDominios);
		
		JButton btnEjecutarDominiosPor = new JButton("EJECUTAR DOMINIOS POR FACULTAD");
		btnEjecutarDominiosPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<String>datos=a.AlmacenarContenidoTxt(new File(textField.getText()));
				
				String acum="";
//				System.out.println(a.cuentaDominiosfacultades(datos).size());
				ArrayList<String> ar=a.cuentaDominiosfacultades(datos);
				for (int j = 0; j < ar.size(); j++) {
					acum=ar.get(j);
					System.out.println(acum);
					textArea_1.append("");
					textArea_1.append(acum+"\n");
				}
			}
		});
		btnEjecutarDominiosPor.setBounds(344, 89, 247, 23);
		contentPane.add(btnEjecutarDominiosPor);
		
		JLabel lblDominioPorFacultad = new JLabel("dominio por facultad");
		lblDominioPorFacultad.setBounds(346, 141, 215, 14);
		contentPane.add(lblDominioPorFacultad);
		
		
	
		
		
		
		
	}
}