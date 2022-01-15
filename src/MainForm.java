import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;



public class MainForm {
    private JPanel mainPanel;
    private JTextField name;
    private JTextField secondName;
    private JTextField thirdName;
    private JLabel nameLabel;
    private JLabel secondNameLabel;
    private JLabel thirdNameLabel;
    private JButton collapseButton;
    private JPanel beforeCollapseJpanel;
    private JLabel fullName;


    public MainForm() {

        collapseButton.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                if ((name.getText().equals("") || name.getText().equals("Введите имя!"))) {
                    name.setText("Введите имя!");
                } else if (secondName.getText().equals("") || secondName.getText().equals("Введите фамилию!")){
                    secondName.setText("Введите фамилию!");
                }else if(thirdName.getText().equals("") || thirdName.getText().equals("Введите отчество!")){
                    thirdName.setText("Введите отчество!");
                } else {
                    if (!beforeCollapseJpanel.isVisible()) {
                        beforeCollapseJpanel.setVisible(true);
                        collapseButton.setText("Collapse");
                        fullName.setVisible(false);
                    } else {
                        beforeCollapseJpanel.setVisible(false);
                        collapseButton.setText("Expand");
                        String full = secondName.getText() + " " + name.getText() + " " +  thirdName.getText();
                        fullName.setText(full);
                        fullName.setVisible(true);
                    }
                }

            }
        });

    }

    public JPanel getMainPanel(){
        return mainPanel;
    }
}
