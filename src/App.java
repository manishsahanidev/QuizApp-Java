import javax.swing.SwingUtilities;

import database.Category;
import screens.CreateQuestionScreenGui;
import screens.QuizScreenGui;
import screens.TitleScreenGui;

public class App {

	public static void main(String[] args) {
		// ensure gui executed on event dispatch thread (edt)
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new TitleScreenGui().setVisible(true);
			}
		});

	}

}
