package view.diagram.elements.palette;

import view.core.actions.dnd.OrmTransferableIcon;
// Commit 5 master
import view.diagram.elements.core.ElementCategory;
// Commit 5 master
import view.diagram.elements.core.ElementType;
// Commit 5 master

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ElementsPalette extends JPanel {

  private static final Color BACKGROUND = new Color(219, 207, 217); // TODO: commit 2 master

  public ElementsPalette() {
    setBackground(BACKGROUND); // TODO: commit 2 master
    setLayout(new FlowLayout(FlowLayout.LEFT, 20, 12)); // TODO: commit 2 master

    initElements();
  }

  private void initElements() { // Commit 3 master
    JLabel paletteName = new JLabel("ORM Elements");
    paletteName.setFont(new Font(null, Font.BOLD, 20));
    add(paletteName);

    java.util.List<ElementType> elements = new ArrayList<>(); // Commit 4 master
    elements.addAll(ElementType.getInCategory(ElementCategory.OBJECT));
    elements.addAll(ElementType.getInCategory(ElementCategory.SET_COMPARISON_CONSTRAINT));

    for(ElementType e : elements) {
      add(new OrmTransferableIcon(() -> e));
      // TODO: set tooltip for icon
    }
  }

}
