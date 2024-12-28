package View;

import javax.swing.*;
import java.awt.*;

public class GiaoDienView extends JFrame {

    public GiaoDienView() {
        initUI();
    }

    private void initUI() {
        // Thiết lập JFrame
        this.setTitle("Quản Lý Khách Sạn");
        this.setSize(900, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        // Tạo các panel chính
        JPanel northPanel = createNorthPanel();
        JPanel westPanel = createWestPanel();
        JPanel centerPanel = createCenterPanel();

        // Thêm các panel vào JFrame
        this.add(northPanel, BorderLayout.NORTH);
        this.add(westPanel, BorderLayout.WEST);
        this.add(centerPanel, BorderLayout.CENTER);

        this.setVisible(true);
    }

    private JPanel createNorthPanel() {
        JPanel northPanel = new JPanel(new SpringLayout());
        northPanel.setPreferredSize(new Dimension(600, 50));
        northPanel.setBackground(Color.decode("#9FD7F9"));

        JLabel title = new JLabel("QUẢN LÝ KHÁCH SẠN");
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setForeground(Color.decode("#0487D9"));

        JButton btnLogout = new JButton("Đăng Xuất");
        btnLogout.setBackground(Color.decode("#A0E3F2"));

        JButton btnExit = new JButton("Exit");
        btnExit.setBackground(Color.decode("#A0E3F2"));

        SpringLayout layout = (SpringLayout) northPanel.getLayout();
        layout.putConstraint(SpringLayout.WEST, title, 50, SpringLayout.WEST, northPanel);
        layout.putConstraint(SpringLayout.NORTH, title, 10, SpringLayout.NORTH, northPanel);
        layout.putConstraint(SpringLayout.EAST, btnExit, -10, SpringLayout.EAST, northPanel);
        layout.putConstraint(SpringLayout.EAST, btnLogout, -10, SpringLayout.WEST, btnExit);

        northPanel.add(title);
        northPanel.add(btnLogout);
        northPanel.add(btnExit);

        return northPanel;
    }

    private JPanel createWestPanel() {
        JPanel westPanel = new JPanel();
        westPanel.setPreferredSize(new Dimension(200, 450));
        westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.Y_AXIS));
        westPanel.setBackground(Color.decode("#E0FEFE"));
        westPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        // Thêm các nút chức năng vào panel
        westPanel.add(createButtonPanel("       Danh Sách Phòng      ", "#F2CB05"));
        westPanel.add(createButtonPanel("  Danh Sách Khách Hàng  ", "#D90479"));
        westPanel.add(createButtonPanel("               Đặt Phòng             ", "#FF0000"));
        westPanel.add(createButtonPanel("       Trạng Thái Phòng      ", "#00CC33"));
        westPanel.add(createButtonPanel("              Hoá Đơn               ", "#F8DAE9"));
        westPanel.add(createButtonPanel("              Doanh Thu            ", "#00FFFF"));

        return westPanel;
    }

    private JPanel createButtonPanel(String text, String color) {
        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#E0FEFE"));

        JButton button = new JButton(text);
        button.setBackground(Color.decode(color));
        panel.add(button);

        return panel;
    }

    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBackground(Color.decode("#E0FEFE"));
        centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        JLabel imageLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon("src/icons/khachSan.png"); // Đường dẫn ảnh
        Image img = imageIcon.getImage().getScaledInstance(697, 447, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(img));

        centerPanel.add(imageLabel, BorderLayout.CENTER);
        return centerPanel;
    }
}
