package Frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import Frame.FlyFrameBase;
import FlyVO.Flydata;

public class FlyplaneReserve extends JPanel {

	public FlyplaneReserve(Flydata data) {

		setBackground(new Color(153, 204, 255));
		setLayout(null);
		setSize(600, 800);
		
		ImageIcon back = new ImageIcon("sky.jpg");
		JLabel backimg = new JLabel(back);
		backimg.setSize(600, 800);
		backimg.setLocation(0, -20);

		JLabel reserveView = new JLabel(data.getId()+"님의 예약 조회");
		reserveView.setSize(200, 100);
		reserveView.setLocation(250, 15);
		reserveView.setFont(new Font("DX영화자막", Font.BOLD, 14));

		String infotitle[] = { "구간", "출발시간", "도착시간", "출발일", "직항 여부", "비행 시간", "편명" };

		String infodata[][] = {
				{ "구간1", "ICN 서울 T1 08:00 ", "GUM 괌 T1 12:25", "2021-10-12(화)", "직항", "04h20m", "D281" },
				{ "구간2", "GUM 괌 T1 16:00 ", "ICN 서울 T1 18:25", "2021-10-14(목)", "직항", "04h20m", "D284" } };

		JPanel CenterSet = new JPanel();
		CenterSet.setBounds(25, 105, 527, 100);

		DefaultTableModel model = new DefaultTableModel(infodata, infotitle);
		JTable table = new JTable(model);

		// JTable 스크롤
		JScrollPane sp = new JScrollPane(table);

		// 테이블 크기 설정
		sp.setPreferredSize(new Dimension(528, 100));

		CenterSet.add(sp); // 패널에 테이블 추가
		CenterSet.setVisible(true);
		add(CenterSet);

		// 버튼
		JButton btnback = new JButton("뒤로가기");
		btnback.setEnabled(true); // 버튼 활성화
		btnback.setFont(new Font("DX영화자막", Font.BOLD, 14));
		btnback.setSize(100, 80);
		btnback.setLocation(180, 600);
		
		add(reserveView);
		add(btnback);		
		add(backimg);

		btnback.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JComponent comp = (JComponent) e.getSource();
				Window win = SwingUtilities.getWindowAncestor(comp);
				FlyFrameBase.getInstance(new FlyplaneMypage(data));
				win.dispose();

			}
		});

	}
}
