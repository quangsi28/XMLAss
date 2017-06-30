package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Form {

	private JFrame frame;
	private JTextField tfSoHopdong;
	private JTextField tfMaKh;
	private JTextField tfMaDaily;
	private JTextField tfNgayTao;
	private JTextField tfTenKh;
	private JTextField tfNguoiDaidien;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField;
	private JTextField textField_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_6;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form window = new Form();
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
	public Form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 828, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tfSoHopdong = new JTextField();
		tfSoHopdong.setText("");
		tfSoHopdong.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Hợp đồng sử dụng dịch vụ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1 = new JLabel("Hợp đồng số:");
		
		tfMaKh = new JTextField();
		tfMaKh.setText("");
		tfMaKh.setColumns(10);
		
		JLabel lblMKhchHng = new JLabel("Mã khách hàng:");
		
		JLabel lblNewLabel_2 = new JLabel("Mã CH/Đại lý:");
		
		tfMaDaily = new JTextField();
		tfMaDaily.setColumns(10);
		
		JLabel lblNgyKKt = new JLabel("Ngày ký kết:");
		
		tfNgayTao = new JTextField();
		tfNgayTao.setText("dd/mm/YYY");
		tfNgayTao.setColumns(10);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Bên A", null, panel, null);
		
		JLabel lblNewLabel_3 = new JLabel("Tên Khách hàng/chủ Hợp đồng:");
		
		tfTenKh = new JTextField();
		tfTenKh.setColumns(10);
		
		JLabel lblNgiiDin = new JLabel("Người đại diện:");
		
		tfNguoiDaidien = new JTextField();
		tfNguoiDaidien.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		
		JLabel lblSGiyChng = new JLabel("Số Giấy Chứng nhận ĐKDN/Quyết định thành lập/Giấy phép thành lập:");
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		JLabel lblNiCp = new JLabel("Nơi cấp:");
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		JLabel label = new JLabel("Chức vụ:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNgySinh = new JLabel("Ngày sinh:");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JRadioButton rdbtnNam = new JRadioButton("Nam   /");
		buttonGroup.add(rdbtnNam);
		
		JRadioButton rdbtnN = new JRadioButton("Nữ");
		buttonGroup.add(rdbtnN);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel lblNgyCp = new JLabel("Ngày cấp:");
		
		JLabel lblaChTheo = new JLabel("Địa chỉ theo CMND/Giấy Chứng nhận ĐKDN/Quyết định thành lập/Giấy phép thành lập:");
		
		JLabel lblSNh = new JLabel("Số nhà:");
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		JLabel lblng = new JLabel("Đường:");
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		JLabel lblT = new JLabel("Tổ");
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		
		JLabel lblPhngx = new JLabel("Phường/Xã");
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		
		JLabel lblQunhuyn = new JLabel("Quận/Huyện:");
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		
		JLabel lblTnhtp = new JLabel("Tỉnh/TP");
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		
		JLabel lblinThoi = new JLabel("Điện thoại:");
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		
		JLabel lblFax = new JLabel("Fax");
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		
		JLabel lblMSThu = new JLabel("Mã số thuế");
		
		JPanel panel_3 = new JPanel();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addComponent(lblNewLabel_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfTenKh, GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNgiiDin)
								.addComponent(label))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblNgySinh)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(rdbtnNam)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnN))
								.addComponent(tfNguoiDaidien, GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblaChTheo))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblSGiyChng)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblNiCp)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblNgyCp)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblSNh)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblng)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblT)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_13, 106, 106, 106)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblPhngx)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_14, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(386)
									.addComponent(lblTnhtp)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_16, GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblQunhuyn)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblinThoi)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblFax)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblEmail)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_19, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblMSThu)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 460, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(tfTenKh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNgiiDin)
						.addComponent(tfNguoiDaidien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(9)
							.addComponent(label))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(8)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblNgySinh)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(rdbtnNam)
									.addComponent(rdbtnN))
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(6)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSGiyChng)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNiCp)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNgyCp)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblaChTheo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSNh)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblng)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblT)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPhngx)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQunhuyn)
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTnhtp))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblinThoi)
						.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFax)
						.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail)
						.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMSThu))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{30, 30, 30, 30, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{20, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		textField_20 = new JTextField();
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField_20 = new GridBagConstraints();
		gbc_textField_20.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_20.anchor = GridBagConstraints.NORTH;
		gbc_textField_20.insets = new Insets(0, 0, 0, 5);
		gbc_textField_20.gridx = 0;
		gbc_textField_20.gridy = 0;
		panel_3.add(textField_20, gbc_textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField_21 = new GridBagConstraints();
		gbc_textField_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_21.anchor = GridBagConstraints.NORTH;
		gbc_textField_21.insets = new Insets(0, 0, 0, 5);
		gbc_textField_21.gridx = 1;
		gbc_textField_21.gridy = 0;
		panel_3.add(textField_21, gbc_textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField_22 = new GridBagConstraints();
		gbc_textField_22.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_22.anchor = GridBagConstraints.NORTH;
		gbc_textField_22.insets = new Insets(0, 0, 0, 5);
		gbc_textField_22.gridx = 2;
		gbc_textField_22.gridy = 0;
		panel_3.add(textField_22, gbc_textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField_23 = new GridBagConstraints();
		gbc_textField_23.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_23.anchor = GridBagConstraints.NORTH;
		gbc_textField_23.insets = new Insets(0, 0, 0, 5);
		gbc_textField_23.gridx = 3;
		gbc_textField_23.gridy = 0;
		panel_3.add(textField_23, gbc_textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField_24 = new GridBagConstraints();
		gbc_textField_24.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_24.insets = new Insets(0, 0, 0, 5);
		gbc_textField_24.anchor = GridBagConstraints.NORTH;
		gbc_textField_24.gridx = 4;
		gbc_textField_24.gridy = 0;
		panel_3.add(textField_24, gbc_textField_24);
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField_25 = new GridBagConstraints();
		gbc_textField_25.insets = new Insets(0, 0, 0, 5);
		gbc_textField_25.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_25.gridx = 5;
		gbc_textField_25.gridy = 0;
		panel_3.add(textField_25, gbc_textField_25);
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField_26 = new GridBagConstraints();
		gbc_textField_26.insets = new Insets(0, 0, 0, 5);
		gbc_textField_26.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_26.gridx = 6;
		gbc_textField_26.gridy = 0;
		panel_3.add(textField_26, gbc_textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField_27 = new GridBagConstraints();
		gbc_textField_27.insets = new Insets(0, 0, 0, 5);
		gbc_textField_27.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_27.gridx = 7;
		gbc_textField_27.gridy = 0;
		panel_3.add(textField_27, gbc_textField_27);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField_28 = new GridBagConstraints();
		gbc_textField_28.insets = new Insets(0, 0, 0, 5);
		gbc_textField_28.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_28.gridx = 8;
		gbc_textField_28.gridy = 0;
		panel_3.add(textField_28, gbc_textField_28);
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField_29 = new GridBagConstraints();
		gbc_textField_29.insets = new Insets(0, 0, 0, 5);
		gbc_textField_29.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_29.gridx = 9;
		gbc_textField_29.gridy = 0;
		panel_3.add(textField_29, gbc_textField_29);
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField_30 = new GridBagConstraints();
		gbc_textField_30.insets = new Insets(0, 0, 0, 5);
		gbc_textField_30.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_30.gridx = 10;
		gbc_textField_30.gridy = 0;
		panel_3.add(textField_30, gbc_textField_30);
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField_31 = new GridBagConstraints();
		gbc_textField_31.insets = new Insets(0, 0, 0, 5);
		gbc_textField_31.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_31.gridx = 11;
		gbc_textField_31.gridy = 0;
		panel_3.add(textField_31, gbc_textField_31);
		textField_31.setColumns(10);
		
		textField_32 = new JTextField();
		textField_32.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField_32 = new GridBagConstraints();
		gbc_textField_32.insets = new Insets(0, 0, 0, 5);
		gbc_textField_32.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_32.gridx = 12;
		gbc_textField_32.gridy = 0;
		panel_3.add(textField_32, gbc_textField_32);
		textField_32.setColumns(10);
		
		textField_33 = new JTextField();
		textField_33.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField_33 = new GridBagConstraints();
		gbc_textField_33.insets = new Insets(0, 0, 0, 5);
		gbc_textField_33.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_33.gridx = 13;
		gbc_textField_33.gridy = 0;
		panel_3.add(textField_33, gbc_textField_33);
		textField_33.setColumns(10);
		
		textField_34 = new JTextField();
		textField_34.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField_34 = new GridBagConstraints();
		gbc_textField_34.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_34.gridx = 14;
		gbc_textField_34.gridy = 0;
		panel_3.add(textField_34, gbc_textField_34);
		textField_34.setColumns(10);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{46, 139, 0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNewLabel_5 = new JLabel("Số CMND/Hộ chiếu:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 0;
		panel_2.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 0;
		panel_2.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Nơi cấp:");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 2;
		gbc_lblNewLabel_8.gridy = 0;
		panel_2.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 3;
		gbc_textField_4.gridy = 0;
		panel_2.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Ngày cấp:");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 4;
		gbc_lblNewLabel_11.gridy = 0;
		panel_2.add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 0);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 5;
		gbc_textField_7.gridy = 0;
		panel_2.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Số hộ khẩu/Giấy tờ khác");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 1;
		panel_2.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 0, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 1;
		panel_2.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Nơi cấp:");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_9.gridx = 2;
		gbc_lblNewLabel_9.gridy = 1;
		panel_2.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 0, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 3;
		gbc_textField_5.gridy = 1;
		panel_2.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Ngày cấp:");
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_12.gridx = 4;
		gbc_lblNewLabel_12.gridy = 1;
		panel_2.add(lblNewLabel_12, gbc_lblNewLabel_12);
		
		textField_8 = new JTextField();
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 5;
		gbc_textField_8.gridy = 1;
		panel_2.add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Bên B", null, panel_1, null);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(lblNewLabel_1))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNgyKKt, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(tfNgayTao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(493, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(tfSoHopdong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(lblMKhchHng)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfMaKh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfMaDaily, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(16))))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(tfSoHopdong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMKhchHng)
								.addComponent(tfMaKh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2)
								.addComponent(tfMaDaily, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNgyKKt)
						.addComponent(tfNgayTao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addComponent(tabbedPane)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
	}
}
