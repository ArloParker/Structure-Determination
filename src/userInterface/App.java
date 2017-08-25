package userInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class App {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
;
		
		JLabel lblNmrStructureDetermination = new JLabel("NMR structure Determination");
		GridBagConstraints gbc_lblNmrStructureDetermination = new GridBagConstraints();
		gbc_lblNmrStructureDetermination.insets = new Insets(0, 0, 5, 5);
		gbc_lblNmrStructureDetermination.gridx = 2;
		gbc_lblNmrStructureDetermination.gridy = 0;
		frame.getContentPane().add(lblNmrStructureDetermination, gbc_lblNmrStructureDetermination);
		
		JLabel lblIntegration = new JLabel("Integration");
		GridBagConstraints gbc_lblIntegration = new GridBagConstraints();
		gbc_lblIntegration.insets = new Insets(0, 0, 5, 5);
		gbc_lblIntegration.anchor = GridBagConstraints.EAST;
		gbc_lblIntegration.gridx = 2;
		gbc_lblIntegration.gridy = 4;
		frame.getContentPane().add(lblIntegration, gbc_lblIntegration);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 4;
		frame.getContentPane().add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblMultiplicy = new JLabel("Multiplicy");
		GridBagConstraints gbc_lblMultiplicy = new GridBagConstraints();
		gbc_lblMultiplicy.insets = new Insets(0, 0, 5, 5);
		gbc_lblMultiplicy.anchor = GridBagConstraints.EAST;
		gbc_lblMultiplicy.gridx = 2;
		gbc_lblMultiplicy.gridy = 5;
		frame.getContentPane().add(lblMultiplicy, gbc_lblMultiplicy);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 3;
		gbc_textField_4.gridy = 5;
		frame.getContentPane().add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblDelta = new JLabel("Delta");
		GridBagConstraints gbc_lblDelta = new GridBagConstraints();
		gbc_lblDelta.insets = new Insets(0, 0, 5, 5);
		gbc_lblDelta.gridx = 2;
		gbc_lblDelta.gridy = 6;
		frame.getContentPane().add(lblDelta, gbc_lblDelta);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 6;
		frame.getContentPane().add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		GridBagConstraints gbc_btnCalculate = new GridBagConstraints();
		gbc_btnCalculate.insets = new Insets(0, 0, 5, 5);
		gbc_btnCalculate.gridx = 3;
		gbc_btnCalculate.gridy = 8;
		frame.getContentPane().add(btnCalculate, gbc_btnCalculate);
		
	
		
	

	}

}
