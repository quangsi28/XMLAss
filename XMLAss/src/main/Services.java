package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.CardLayout;

public class Services extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnDone;
	private JButton btnCancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Services frame = new Services();
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
	public Services() {
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 664, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		table = new JTable();
		table.setBounds(5, 5, 638, 293);
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{"STT", "Loại dịch vụ", "Địa chỉ lắp đặt", "Số điện thoại", "Gói cước/Tốc độ", "Phí hòa mạng", "Ghi chú"}
				},
				new String[] {
						"STT", "Loại dịch vụ", "Địa chỉ lắp đặt", "Số điện thoại", "Gói cước/Tốc độ", "Phí hòa mạng", "Ghi chú"
				}));
		
		
		contentPane.add(table);
		
		btnDone = new JButton("Done");
		btnDone.setBounds(554, 316, 89, 23);
		contentPane.add(btnDone);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(455, 316, 89, 23);
		contentPane.add(btnCancel);
	}

}
