package first;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea; // Corrected the import statement

public class ScrollPane {
	
	
	private static void createAndShowGUI(){
		
		final JFrame frame = new JFrame("Scroll Pane");
		
		frame.setSize(500,500);
		// Moved setVisible to the end after adding components
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(new FlowLayout());
		
		JTextArea textArea = new JTextArea(20, 20);
		JScrollPane scrollableTextArea = new JScrollPane(textArea);
		
		// Fixed the method name for scroll policies (setHorizontalScrollBarPolicy and setVerticalScrollBarPolicy)
		scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		frame.getContentPane().add(scrollableTextArea);
		
		// Moved setVisible to the end after adding components
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		
		// Use SwingUtilities.invokeLater to ensure Swing components are accessed on the event dispatch thread
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
