import java.awt.*;
import java.awt.event.*;

class ListBox {
    List list = new List();
    TextField textField = new TextField();
    Button addButton = new Button("Add"), removeButton = new Button("Remove");

    ListBox() {
        list.setBounds(50, 50, 200, 150);
        textField.setBounds(50, 220, 150, 30);
        addButton.setBounds(50, 260, 60, 30);
        removeButton.setBounds(120, 260, 80, 30);
        
        addButton.addActionListener(e -> { if (!textField.getText().isEmpty()) list.add(textField.getText()); textField.setText(""); });
        removeButton.addActionListener(e -> { if (!textField.getText().isEmpty()) list.remove(textField.getText()); textField.setText(""); });
    }

    void addComponents(Frame frame) {
        frame.add(list); frame.add(textField); frame.add(addButton); frame.add(removeButton);
    }
}

public class ListBoxApp {
    public static void main(String[] args) {
        Frame frame = new Frame("List Box App");
        ListBox listBox = new ListBox();
        listBox.addComponents(frame);
        frame.setSize(300, 350);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
