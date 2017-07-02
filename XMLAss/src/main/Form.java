package main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import main.Object.HopDong;

public class Form {

	//Region desktop
	private JFrame frame;
	private JTextField tfSoHopdong;
	private JTextField tfMaKh;
	private JTextField tfMaDaily;
	private JTextField tfNgayTao;
	private JTextField tfTenKh;
	private JTextField tfNguoiDaidien;
	private JTextField tfSoCMND;
	private JTextField tfSoHoKhau;
	private JTextField tfNoiCapCMND;
	private JTextField tfNoiCapSoHoKhau;
	private JTextField tfNgayCapSoCMND;
	private JTextField tfNgayCapSoHoKhau;
	private JTextField tfSoGiayChungNhan;
	private JTextField tfNoiCapGiayChungNhan;
	private JTextField tfChucVu;
	private JTextField tfNgaySinh;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField tfNgayCapGiayChungNhan;
	private JTextField tfSoNha;
	private JTextField tfDuong;
	private JTextField tfTo;
	private JTextField tfPhuongXa;
	private JTextField tfQuanHuyen;
	private JTextField tfTinhThanhPho;
	private JTextField tfDienThoai;
	private JTextField tfFax;
	private JTextField tfEmail;
	private JTextField tfMST1;
	private JTextField tfMST2;
	private JTextField tfMST3;
	private JTextField tfMST4;
	private JTextField tfMST5;
	private JTextField tfMST6;
	private JTextField tfMST7;
	private JTextField tfMST8;
	private JTextField tfMST9;
	private JTextField tfMST10;
	private JTextField tfMST11;
	private JTextField tfMST12;
	private JTextField tfMST13;
	private JTextField tfMST14;
	private JTextField tfMST15;
	private JTextField tfBNguoiDaiDien;
	private JTextField tfBDiaChi;
	private JTextField tfBDienthoai;
	private JTextField tfBFax;
	private JTextField tfBMST1;
	private JTextField tfBMST2;
	private JTextField tfBMST3;
	private JTextField tfBMST4;
	private JTextField tfBMST5;
	private JTextField tfBMST6;
	private JTextField tfBMST7;
	private JTextField tfBMST8;
	private JTextField tfBMST9;
	private JTextField tfBMST10;
	private JTextField tfBMST11;
	private JTextField tfBMST12;
	private JTextField tfBMST13;
	private JTextField tfBMST14;
	private JTextField tfBMST15;
	private JLabel lblTiKhonGiao;
	private JTable tbBTaiKhoanGiaoDich;
	private JLabel lblnVTh;
	private JLabel lblMSThu;
	private JTable tbBDonViThuHuong;
	//Endregion

	public HopDong hopDong;
	
	
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
		frame.setBounds(100, 100, 828, 530);
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

		JPanel PnlBenA = new JPanel();
		tabbedPane.addTab("Bên A", null, PnlBenA, null);

		JLabel lblNewLabel_3 = new JLabel("Tên Khách hàng/chủ Hợp đồng:");

		tfTenKh = new JTextField();
		tfTenKh.setColumns(10);

		JLabel lblNgiiDin = new JLabel("Người đại diện:");

		tfNguoiDaidien = new JTextField();
		tfNguoiDaidien.setColumns(10);

		JPanel panel_2 = new JPanel();

		JLabel lblSGiyChng = new JLabel("Số Giấy Chứng nhận ĐKDN/Quyết định thành lập/Giấy phép thành lập:");

		tfSoGiayChungNhan = new JTextField();
		tfSoGiayChungNhan.setColumns(10);

		JLabel lblNiCp = new JLabel("Nơi cấp:");

		tfNoiCapGiayChungNhan = new JTextField();
		tfNoiCapGiayChungNhan.setColumns(10);

		JLabel label = new JLabel("Chức vụ:");

		tfChucVu = new JTextField();
		tfChucVu.setColumns(10);

		JLabel lblNgySinh = new JLabel("Ngày sinh:");

		tfNgaySinh = new JTextField();
		tfNgaySinh.setText("dd/mm/yyyy");
		tfNgaySinh.setColumns(10);

		JRadioButton rdbtnNam = new JRadioButton("Nam   /");
		buttonGroup.add(rdbtnNam);

		JRadioButton rdbtnN = new JRadioButton("Nữ");
		buttonGroup.add(rdbtnN);

		tfNgayCapGiayChungNhan = new JTextField();
		tfNgayCapGiayChungNhan.setColumns(10);

		JLabel lblNgyCp = new JLabel("Ngày cấp:");

		JLabel lblaChTheo = new JLabel("Địa chỉ theo CMND/Giấy Chứng nhận ĐKDN/Quyết định thành lập/Giấy phép thành lập:");

		JLabel lblSNh = new JLabel("Số nhà:");

		tfSoNha = new JTextField();
		tfSoNha.setColumns(10);

		JLabel lblng = new JLabel("Đường:");

		tfDuong = new JTextField();
		tfDuong.setColumns(10);

		JLabel lblT = new JLabel("Tổ");

		tfTo = new JTextField();
		tfTo.setColumns(10);

		JLabel lblPhngx = new JLabel("Phường/Xã");

		tfPhuongXa = new JTextField();
		tfPhuongXa.setColumns(10);

		JLabel lblQunhuyn = new JLabel("Quận/Huyện:");

		tfQuanHuyen = new JTextField();
		tfQuanHuyen.setColumns(10);

		JLabel lblTnhtp = new JLabel("Tỉnh/TP");

		tfTinhThanhPho = new JTextField();
		tfTinhThanhPho.setColumns(10);

		JLabel lblinThoi = new JLabel("Điện thoại:");

		tfDienThoai = new JTextField();
		tfDienThoai.setColumns(10);

		JLabel lblFax = new JLabel("Fax");

		tfFax = new JTextField();
		tfFax.setColumns(10);

		JLabel lblEmail = new JLabel("Email");

		tfEmail = new JTextField();
		tfEmail.setColumns(10);

		JPanel panel_3 = new JPanel();

		lblMSThu = new JLabel("Mã số thuế");
		GroupLayout gl_PnlBenA = new GroupLayout(PnlBenA);
		gl_PnlBenA.setHorizontalGroup(
				gl_PnlBenA.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_PnlBenA.createSequentialGroup()
								.addGroup(gl_PnlBenA.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_PnlBenA.createSequentialGroup()
												.addGap(10)
												.addComponent(lblNewLabel_3)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(tfTenKh, GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE))
										.addGroup(gl_PnlBenA.createSequentialGroup()
												.addContainerGap()
												.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE))
										.addGroup(gl_PnlBenA.createSequentialGroup()
												.addContainerGap()
												.addGroup(gl_PnlBenA.createParallelGroup(Alignment.LEADING)
														.addComponent(lblNgiiDin)
														.addComponent(label))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_PnlBenA.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_PnlBenA.createSequentialGroup()
																.addComponent(tfChucVu, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
																.addGap(18)
																.addComponent(lblNgySinh)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(tfNgaySinh, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
																.addGap(18)
																.addComponent(rdbtnNam)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(rdbtnN))
														.addComponent(tfNguoiDaidien, GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)))
										.addGroup(gl_PnlBenA.createSequentialGroup()
												.addContainerGap()
												.addComponent(lblaChTheo))
										.addGroup(gl_PnlBenA.createSequentialGroup()
												.addContainerGap()
												.addGroup(gl_PnlBenA.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_PnlBenA.createSequentialGroup()
																.addComponent(lblSGiyChng)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(tfSoGiayChungNhan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(lblNiCp)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(tfNoiCapGiayChungNhan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(lblNgyCp)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(tfNgayCapGiayChungNhan, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
														.addGroup(gl_PnlBenA.createSequentialGroup()
																.addComponent(lblSNh)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(tfSoNha, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(lblng)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(tfDuong, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(lblT)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(tfTo, 106, 106, 106)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(lblPhngx)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(tfPhuongXa, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
														.addGroup(gl_PnlBenA.createSequentialGroup()
																.addGap(386)
																.addComponent(lblTnhtp)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(tfTinhThanhPho, GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))))
										.addGroup(gl_PnlBenA.createSequentialGroup()
												.addContainerGap()
												.addComponent(lblQunhuyn)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(tfQuanHuyen, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_PnlBenA.createSequentialGroup()
												.addContainerGap()
												.addComponent(lblinThoi)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(tfDienThoai, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(lblFax)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(tfFax, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(lblEmail)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(tfEmail, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
										.addGroup(gl_PnlBenA.createSequentialGroup()
												.addGap(9)
												.addComponent(lblMSThu)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 460, GroupLayout.PREFERRED_SIZE)))
								.addContainerGap()));
		gl_PnlBenA.setVerticalGroup(
				gl_PnlBenA.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PnlBenA.createSequentialGroup()
								.addGap(11)
								.addGroup(gl_PnlBenA.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_3)
										.addComponent(tfTenKh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_PnlBenA.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNgiiDin)
										.addComponent(tfNguoiDaidien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PnlBenA.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_PnlBenA.createSequentialGroup()
												.addGap(9)
												.addComponent(label))
										.addGroup(gl_PnlBenA.createSequentialGroup()
												.addGap(8)
												.addGroup(gl_PnlBenA.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_PnlBenA.createParallelGroup(Alignment.BASELINE)
																.addComponent(lblNgySinh)
																.addComponent(tfNgaySinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addComponent(rdbtnNam)
																.addComponent(rdbtnN))
														.addComponent(tfChucVu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGap(6)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_PnlBenA.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblSGiyChng)
										.addComponent(tfSoGiayChungNhan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNiCp)
										.addComponent(tfNoiCapGiayChungNhan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNgyCp)
										.addComponent(tfNgayCapGiayChungNhan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblaChTheo)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_PnlBenA.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblSNh)
										.addComponent(tfSoNha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblng)
										.addComponent(tfDuong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblT)
										.addComponent(tfTo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblPhngx)
										.addComponent(tfPhuongXa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_PnlBenA.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblQunhuyn)
										.addComponent(tfQuanHuyen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(tfTinhThanhPho, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTnhtp))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_PnlBenA.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblinThoi)
										.addComponent(tfDienThoai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblFax)
										.addComponent(tfFax, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblEmail)
										.addComponent(tfEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_PnlBenA.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblMSThu)
										.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(40, Short.MAX_VALUE)));
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 30, 30, 30, 30, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_3.rowHeights = new int[] { 20, 0 };
		gbl_panel_3.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel_3.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panel_3.setLayout(gbl_panel_3);

		tfMST1 = new JTextField();
		tfMST1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfMST1 = new GridBagConstraints();
		gbc_tfMST1.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMST1.anchor = GridBagConstraints.NORTH;
		gbc_tfMST1.insets = new Insets(0, 0, 0, 5);
		gbc_tfMST1.gridx = 0;
		gbc_tfMST1.gridy = 0;
		panel_3.add(tfMST1, gbc_tfMST1);
		tfMST1.setColumns(10);

		tfMST2 = new JTextField();
		tfMST2.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfMST2 = new GridBagConstraints();
		gbc_tfMST2.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMST2.anchor = GridBagConstraints.NORTH;
		gbc_tfMST2.insets = new Insets(0, 0, 0, 5);
		gbc_tfMST2.gridx = 1;
		gbc_tfMST2.gridy = 0;
		panel_3.add(tfMST2, gbc_tfMST2);
		tfMST2.setColumns(10);

		tfMST3 = new JTextField();
		tfMST3.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfMST3 = new GridBagConstraints();
		gbc_tfMST3.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMST3.anchor = GridBagConstraints.NORTH;
		gbc_tfMST3.insets = new Insets(0, 0, 0, 5);
		gbc_tfMST3.gridx = 2;
		gbc_tfMST3.gridy = 0;
		panel_3.add(tfMST3, gbc_tfMST3);
		tfMST3.setColumns(10);

		tfMST4 = new JTextField();
		tfMST4.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfMST4 = new GridBagConstraints();
		gbc_tfMST4.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMST4.anchor = GridBagConstraints.NORTH;
		gbc_tfMST4.insets = new Insets(0, 0, 0, 5);
		gbc_tfMST4.gridx = 3;
		gbc_tfMST4.gridy = 0;
		panel_3.add(tfMST4, gbc_tfMST4);
		tfMST4.setColumns(10);

		tfMST5 = new JTextField();
		tfMST5.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfMST5 = new GridBagConstraints();
		gbc_tfMST5.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMST5.insets = new Insets(0, 0, 0, 5);
		gbc_tfMST5.anchor = GridBagConstraints.NORTH;
		gbc_tfMST5.gridx = 4;
		gbc_tfMST5.gridy = 0;
		panel_3.add(tfMST5, gbc_tfMST5);
		tfMST5.setColumns(10);

		tfMST6 = new JTextField();
		tfMST6.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfMST6 = new GridBagConstraints();
		gbc_tfMST6.insets = new Insets(0, 0, 0, 5);
		gbc_tfMST6.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMST6.gridx = 5;
		gbc_tfMST6.gridy = 0;
		panel_3.add(tfMST6, gbc_tfMST6);
		tfMST6.setColumns(10);

		tfMST7 = new JTextField();
		tfMST7.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfMST7 = new GridBagConstraints();
		gbc_tfMST7.insets = new Insets(0, 0, 0, 5);
		gbc_tfMST7.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMST7.gridx = 6;
		gbc_tfMST7.gridy = 0;
		panel_3.add(tfMST7, gbc_tfMST7);
		tfMST7.setColumns(10);

		tfMST8 = new JTextField();
		tfMST8.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfMST8 = new GridBagConstraints();
		gbc_tfMST8.insets = new Insets(0, 0, 0, 5);
		gbc_tfMST8.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMST8.gridx = 7;
		gbc_tfMST8.gridy = 0;
		panel_3.add(tfMST8, gbc_tfMST8);
		tfMST8.setColumns(10);

		tfMST9 = new JTextField();
		tfMST9.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfMST9 = new GridBagConstraints();
		gbc_tfMST9.insets = new Insets(0, 0, 0, 5);
		gbc_tfMST9.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMST9.gridx = 8;
		gbc_tfMST9.gridy = 0;
		panel_3.add(tfMST9, gbc_tfMST9);
		tfMST9.setColumns(10);

		tfMST10 = new JTextField();
		tfMST10.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfMST10 = new GridBagConstraints();
		gbc_tfMST10.insets = new Insets(0, 0, 0, 5);
		gbc_tfMST10.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMST10.gridx = 9;
		gbc_tfMST10.gridy = 0;
		panel_3.add(tfMST10, gbc_tfMST10);
		tfMST10.setColumns(10);

		tfMST11 = new JTextField();
		tfMST11.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfMST11 = new GridBagConstraints();
		gbc_tfMST11.insets = new Insets(0, 0, 0, 5);
		gbc_tfMST11.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMST11.gridx = 10;
		gbc_tfMST11.gridy = 0;
		panel_3.add(tfMST11, gbc_tfMST11);
		tfMST11.setColumns(10);

		tfMST12 = new JTextField();
		tfMST12.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfMST12 = new GridBagConstraints();
		gbc_tfMST12.insets = new Insets(0, 0, 0, 5);
		gbc_tfMST12.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMST12.gridx = 11;
		gbc_tfMST12.gridy = 0;
		panel_3.add(tfMST12, gbc_tfMST12);
		tfMST12.setColumns(10);

		tfMST13 = new JTextField();
		tfMST13.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfMST13 = new GridBagConstraints();
		gbc_tfMST13.insets = new Insets(0, 0, 0, 5);
		gbc_tfMST13.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMST13.gridx = 12;
		gbc_tfMST13.gridy = 0;
		panel_3.add(tfMST13, gbc_tfMST13);
		tfMST13.setColumns(10);

		tfMST14 = new JTextField();
		tfMST14.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfMST14 = new GridBagConstraints();
		gbc_tfMST14.insets = new Insets(0, 0, 0, 5);
		gbc_tfMST14.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMST14.gridx = 13;
		gbc_tfMST14.gridy = 0;
		panel_3.add(tfMST14, gbc_tfMST14);
		tfMST14.setColumns(10);

		tfMST15 = new JTextField();
		tfMST15.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfMST15 = new GridBagConstraints();
		gbc_tfMST15.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMST15.gridx = 14;
		gbc_tfMST15.gridy = 0;
		panel_3.add(tfMST15, gbc_tfMST15);
		tfMST15.setColumns(10);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 46, 139, 0, 0, 0, 0, 0 };
		gbl_panel_2.rowHeights = new int[] { 0, 0, 0 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);

		JLabel lblNewLabel_5 = new JLabel("Số CMND/Hộ chiếu:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 0;
		panel_2.add(lblNewLabel_5, gbc_lblNewLabel_5);

		tfSoCMND = new JTextField();
		GridBagConstraints gbc_tfSoCMND = new GridBagConstraints();
		gbc_tfSoCMND.insets = new Insets(0, 0, 5, 5);
		gbc_tfSoCMND.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfSoCMND.gridx = 1;
		gbc_tfSoCMND.gridy = 0;
		panel_2.add(tfSoCMND, gbc_tfSoCMND);
		tfSoCMND.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("Nơi cấp:");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 2;
		gbc_lblNewLabel_8.gridy = 0;
		panel_2.add(lblNewLabel_8, gbc_lblNewLabel_8);

		tfNoiCapCMND = new JTextField();
		GridBagConstraints gbc_tfNoiCapCMND = new GridBagConstraints();
		gbc_tfNoiCapCMND.anchor = GridBagConstraints.NORTH;
		gbc_tfNoiCapCMND.insets = new Insets(0, 0, 5, 5);
		gbc_tfNoiCapCMND.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNoiCapCMND.gridx = 3;
		gbc_tfNoiCapCMND.gridy = 0;
		panel_2.add(tfNoiCapCMND, gbc_tfNoiCapCMND);
		tfNoiCapCMND.setColumns(10);

		JLabel lblNewLabel_11 = new JLabel("Ngày cấp:");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 4;
		gbc_lblNewLabel_11.gridy = 0;
		panel_2.add(lblNewLabel_11, gbc_lblNewLabel_11);

		tfNgayCapSoCMND = new JTextField();
		GridBagConstraints gbc_tfNgayCapSoCMND = new GridBagConstraints();
		gbc_tfNgayCapSoCMND.insets = new Insets(0, 0, 5, 0);
		gbc_tfNgayCapSoCMND.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNgayCapSoCMND.gridx = 5;
		gbc_tfNgayCapSoCMND.gridy = 0;
		panel_2.add(tfNgayCapSoCMND, gbc_tfNgayCapSoCMND);
		tfNgayCapSoCMND.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Số hộ khẩu/Giấy tờ khác");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 1;
		panel_2.add(lblNewLabel_6, gbc_lblNewLabel_6);

		tfSoHoKhau = new JTextField();
		GridBagConstraints gbc_tfSoHoKhau = new GridBagConstraints();
		gbc_tfSoHoKhau.insets = new Insets(0, 0, 0, 5);
		gbc_tfSoHoKhau.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfSoHoKhau.gridx = 1;
		gbc_tfSoHoKhau.gridy = 1;
		panel_2.add(tfSoHoKhau, gbc_tfSoHoKhau);
		tfSoHoKhau.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("Nơi cấp:");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_9.gridx = 2;
		gbc_lblNewLabel_9.gridy = 1;
		panel_2.add(lblNewLabel_9, gbc_lblNewLabel_9);

		tfNoiCapSoHoKhau = new JTextField();
		GridBagConstraints gbc_tfNoiCapSoHoKhau = new GridBagConstraints();
		gbc_tfNoiCapSoHoKhau.insets = new Insets(0, 0, 0, 5);
		gbc_tfNoiCapSoHoKhau.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNoiCapSoHoKhau.gridx = 3;
		gbc_tfNoiCapSoHoKhau.gridy = 1;
		panel_2.add(tfNoiCapSoHoKhau, gbc_tfNoiCapSoHoKhau);
		tfNoiCapSoHoKhau.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("Ngày cấp:");
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_12.gridx = 4;
		gbc_lblNewLabel_12.gridy = 1;
		panel_2.add(lblNewLabel_12, gbc_lblNewLabel_12);

		tfNgayCapSoHoKhau = new JTextField();
		GridBagConstraints gbc_tfNgayCapSoHoKhau = new GridBagConstraints();
		gbc_tfNgayCapSoHoKhau.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNgayCapSoHoKhau.gridx = 5;
		gbc_tfNgayCapSoHoKhau.gridy = 1;
		panel_2.add(tfNgayCapSoHoKhau, gbc_tfNgayCapSoHoKhau);
		tfNgayCapSoHoKhau.setColumns(10);
		PnlBenA.setLayout(gl_PnlBenA);

		JPanel PnlBenB = new JPanel();
		tabbedPane.addTab("Bên B", null, PnlBenB, null);

		JLabel lblNgiiDin_1 = new JLabel("Người đại diện:");

		tfBNguoiDaiDien = new JTextField();
		tfBNguoiDaiDien.setColumns(10);

		JLabel lblaCh = new JLabel("Địa chỉ:");

		tfBDiaChi = new JTextField();
		tfBDiaChi.setColumns(10);

		JLabel lblinThoi_1 = new JLabel("Điện thoại:");

		tfBDienthoai = new JTextField();
		tfBDienthoai.setColumns(10);

		JLabel lblFax_1 = new JLabel("Fax");

		tfBFax = new JTextField();
		tfBFax.setColumns(10);

		JPanel panel_4 = new JPanel();
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[] { 30, 30, 30, 30, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_4.rowHeights = new int[] { 20, 0 };
		gbl_panel_4.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel_4.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panel_4.setLayout(gbl_panel_4);

		tfBMST1 = new JTextField();
		tfBMST1.setHorizontalAlignment(SwingConstants.CENTER);
		tfBMST1.setColumns(10);
		GridBagConstraints gbc_tfBMST1 = new GridBagConstraints();
		gbc_tfBMST1.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfBMST1.anchor = GridBagConstraints.NORTH;
		gbc_tfBMST1.insets = new Insets(0, 0, 0, 5);
		gbc_tfBMST1.gridx = 0;
		gbc_tfBMST1.gridy = 0;
		panel_4.add(tfBMST1, gbc_tfBMST1);

		tfBMST2 = new JTextField();
		tfBMST2.setHorizontalAlignment(SwingConstants.CENTER);
		tfBMST2.setColumns(10);
		GridBagConstraints gbc_tfBMST2 = new GridBagConstraints();
		gbc_tfBMST2.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfBMST2.anchor = GridBagConstraints.NORTH;
		gbc_tfBMST2.insets = new Insets(0, 0, 0, 5);
		gbc_tfBMST2.gridx = 1;
		gbc_tfBMST2.gridy = 0;
		panel_4.add(tfBMST2, gbc_tfBMST2);

		tfBMST3 = new JTextField();
		tfBMST3.setHorizontalAlignment(SwingConstants.CENTER);
		tfBMST3.setColumns(10);
		GridBagConstraints gbc_tfBMST3 = new GridBagConstraints();
		gbc_tfBMST3.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfBMST3.anchor = GridBagConstraints.NORTH;
		gbc_tfBMST3.insets = new Insets(0, 0, 0, 5);
		gbc_tfBMST3.gridx = 2;
		gbc_tfBMST3.gridy = 0;
		panel_4.add(tfBMST3, gbc_tfBMST3);

		tfBMST4 = new JTextField();
		tfBMST4.setHorizontalAlignment(SwingConstants.CENTER);
		tfBMST4.setColumns(10);
		GridBagConstraints gbc_tfBMST4 = new GridBagConstraints();
		gbc_tfBMST4.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfBMST4.anchor = GridBagConstraints.NORTH;
		gbc_tfBMST4.insets = new Insets(0, 0, 0, 5);
		gbc_tfBMST4.gridx = 3;
		gbc_tfBMST4.gridy = 0;
		panel_4.add(tfBMST4, gbc_tfBMST4);

		tfBMST5 = new JTextField();
		tfBMST5.setHorizontalAlignment(SwingConstants.CENTER);
		tfBMST5.setColumns(10);
		GridBagConstraints gbc_tfBMST5 = new GridBagConstraints();
		gbc_tfBMST5.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfBMST5.anchor = GridBagConstraints.NORTH;
		gbc_tfBMST5.insets = new Insets(0, 0, 0, 5);
		gbc_tfBMST5.gridx = 4;
		gbc_tfBMST5.gridy = 0;
		panel_4.add(tfBMST5, gbc_tfBMST5);

		tfBMST6 = new JTextField();
		tfBMST6.setHorizontalAlignment(SwingConstants.CENTER);
		tfBMST6.setColumns(10);
		GridBagConstraints gbc_tfBMST6 = new GridBagConstraints();
		gbc_tfBMST6.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfBMST6.insets = new Insets(0, 0, 0, 5);
		gbc_tfBMST6.gridx = 5;
		gbc_tfBMST6.gridy = 0;
		panel_4.add(tfBMST6, gbc_tfBMST6);

		tfBMST7 = new JTextField();
		tfBMST7.setHorizontalAlignment(SwingConstants.CENTER);
		tfBMST7.setColumns(10);
		GridBagConstraints gbc_tfBMST7 = new GridBagConstraints();
		gbc_tfBMST7.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfBMST7.insets = new Insets(0, 0, 0, 5);
		gbc_tfBMST7.gridx = 6;
		gbc_tfBMST7.gridy = 0;
		panel_4.add(tfBMST7, gbc_tfBMST7);

		tfBMST8 = new JTextField();
		tfBMST8.setHorizontalAlignment(SwingConstants.CENTER);
		tfBMST8.setColumns(10);
		GridBagConstraints gbc_tfBMST8 = new GridBagConstraints();
		gbc_tfBMST8.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfBMST8.insets = new Insets(0, 0, 0, 5);
		gbc_tfBMST8.gridx = 7;
		gbc_tfBMST8.gridy = 0;
		panel_4.add(tfBMST8, gbc_tfBMST8);

		tfBMST9 = new JTextField();
		tfBMST9.setHorizontalAlignment(SwingConstants.CENTER);
		tfBMST9.setColumns(10);
		GridBagConstraints gbc_tfBMST9 = new GridBagConstraints();
		gbc_tfBMST9.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfBMST9.insets = new Insets(0, 0, 0, 5);
		gbc_tfBMST9.gridx = 8;
		gbc_tfBMST9.gridy = 0;
		panel_4.add(tfBMST9, gbc_tfBMST9);

		tfBMST10 = new JTextField();
		tfBMST10.setHorizontalAlignment(SwingConstants.CENTER);
		tfBMST10.setColumns(10);
		GridBagConstraints gbc_tfBMST10 = new GridBagConstraints();
		gbc_tfBMST10.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfBMST10.insets = new Insets(0, 0, 0, 5);
		gbc_tfBMST10.gridx = 9;
		gbc_tfBMST10.gridy = 0;
		panel_4.add(tfBMST10, gbc_tfBMST10);

		tfBMST11 = new JTextField();
		tfBMST11.setHorizontalAlignment(SwingConstants.CENTER);
		tfBMST11.setColumns(10);
		GridBagConstraints gbc_tfBMST11 = new GridBagConstraints();
		gbc_tfBMST11.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfBMST11.insets = new Insets(0, 0, 0, 5);
		gbc_tfBMST11.gridx = 10;
		gbc_tfBMST11.gridy = 0;
		panel_4.add(tfBMST11, gbc_tfBMST11);

		tfBMST12 = new JTextField();
		tfBMST12.setHorizontalAlignment(SwingConstants.CENTER);
		tfBMST12.setColumns(10);
		GridBagConstraints gbc_tfBMST12 = new GridBagConstraints();
		gbc_tfBMST12.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfBMST12.insets = new Insets(0, 0, 0, 5);
		gbc_tfBMST12.gridx = 11;
		gbc_tfBMST12.gridy = 0;
		panel_4.add(tfBMST12, gbc_tfBMST12);

		tfBMST13 = new JTextField();
		tfBMST13.setHorizontalAlignment(SwingConstants.CENTER);
		tfBMST13.setColumns(10);
		GridBagConstraints gbc_tfBMST13 = new GridBagConstraints();
		gbc_tfBMST13.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfBMST13.insets = new Insets(0, 0, 0, 5);
		gbc_tfBMST13.gridx = 12;
		gbc_tfBMST13.gridy = 0;
		panel_4.add(tfBMST13, gbc_tfBMST13);

		tfBMST14 = new JTextField();
		tfBMST14.setHorizontalAlignment(SwingConstants.CENTER);
		tfBMST14.setColumns(10);
		GridBagConstraints gbc_tfBMST14 = new GridBagConstraints();
		gbc_tfBMST14.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfBMST14.insets = new Insets(0, 0, 0, 5);
		gbc_tfBMST14.gridx = 13;
		gbc_tfBMST14.gridy = 0;
		panel_4.add(tfBMST14, gbc_tfBMST14);

		tfBMST15 = new JTextField();
		tfBMST15.setHorizontalAlignment(SwingConstants.CENTER);
		tfBMST15.setColumns(10);
		GridBagConstraints gbc_tfBMST15 = new GridBagConstraints();
		gbc_tfBMST15.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfBMST15.gridx = 14;
		gbc_tfBMST15.gridy = 0;
		panel_4.add(tfBMST15, gbc_tfBMST15);

		JLabel label_1 = new JLabel("Mã số thuế");

		lblTiKhonGiao = new JLabel("Tài khoản giao dịch:");

		tbBTaiKhoanGiaoDich = new JTable();
		tbBTaiKhoanGiaoDich.setRowSelectionAllowed(false);
		tbBTaiKhoanGiaoDich.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Số", "Ngân hàng"
				}) {
			boolean[] columnEditables = new boolean[] {
					false, false
			};

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});

		lblnVTh = new JLabel("Đơn vị thụ hưởng:");
		
		tbBDonViThuHuong = new JTable();
		tbBDonViThuHuong.setRowSelectionAllowed(false);
		GroupLayout gl_PnlBenB = new GroupLayout(PnlBenB);
		gl_PnlBenB.setHorizontalGroup(
			gl_PnlBenB.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PnlBenB.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNgiiDin_1)
					.addGap(10)
					.addComponent(tfBNguoiDaiDien, GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_PnlBenB.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblaCh)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tfBDiaChi, GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_PnlBenB.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblinThoi_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tfBDienthoai, GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(lblFax_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(tfBFax, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_PnlBenB.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 460, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(260, Short.MAX_VALUE))
				.addGroup(gl_PnlBenB.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTiKhonGiao)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(tbBTaiKhoanGiaoDich, GroupLayout.PREFERRED_SIZE, 453, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(219, Short.MAX_VALUE))
				.addGroup(gl_PnlBenB.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblnVTh)
					.addGap(18)
					.addComponent(tbBDonViThuHuong, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(219, Short.MAX_VALUE))
		);
		gl_PnlBenB.setVerticalGroup(
			gl_PnlBenB.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PnlBenB.createSequentialGroup()
					.addGroup(gl_PnlBenB.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PnlBenB.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNgiiDin_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_PnlBenB.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblaCh)
								.addComponent(tfBDiaChi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_PnlBenB.createSequentialGroup()
							.addGap(5)
							.addComponent(tfBNguoiDaiDien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_PnlBenB.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PnlBenB.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblinThoi_1)
							.addComponent(tfBDienthoai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_PnlBenB.createParallelGroup(Alignment.BASELINE)
							.addComponent(tfBFax, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblFax_1)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_PnlBenB.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PnlBenB.createSequentialGroup()
							.addGap(6)
							.addComponent(label_1))
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_PnlBenB.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTiKhonGiao)
						.addComponent(tbBTaiKhoanGiaoDich, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_PnlBenB.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblnVTh)
						.addComponent(tbBDonViThuHuong, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(52, Short.MAX_VALUE))
		);
		PnlBenB.setLayout(gl_PnlBenB);

		JButton btnTiepTheo = new JButton("Tiếp theo");
		btnTiepTheo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Services services = new Services();
				services.setVisible(true);
				// JDialog jDialog = new JDialog(services.getOwner());
				// jDialog.setModal(true);
				// jDialog.setVisible(true);
				frame.setFocusable(false);
				frame.setEnabled(false);
			}
		});

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.TRAILING)
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
												.addContainerGap(640, Short.MAX_VALUE))
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(tfSoHopdong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGap(29)
												.addComponent(lblMKhchHng)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(tfMaKh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
												.addComponent(lblNewLabel_2)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(tfMaDaily, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGap(16))))
						.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
								.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap(724, Short.MAX_VALUE)
								.addComponent(btnTiepTheo)
								.addContainerGap())
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
								.addContainerGap()));
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
								.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
								.addComponent(btnTiepTheo)
								.addContainerGap()));
		frame.getContentPane().setLayout(groupLayout);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
	}
}
