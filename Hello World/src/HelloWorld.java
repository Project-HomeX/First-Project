import javax.swing.*;

public class HelloWorld {
	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setSize(400,400);
		final JLabel label = new JLabel("Hello World");
		frame.getContentPane().add(label);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
