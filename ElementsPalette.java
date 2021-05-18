package view.diagram.elements.palette;

import view.core.actions.dnd.OrmTransferableIcon;
// Commit 1 other-feature
import view.diagram.elements.core.ElementCategory;
// Commit 2 other-feature
import view.diagram.elements.core.ElementType;
// Commit 3 other-feature

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ElementsPalette extends JPanel {

  private static final Color BACKGROUND = new Color(219, 207, 217); // TODO: commit 2 feature

  public ElementsPalette() {
    setBackground(BACKGROUND); // TODO: commit 2 feature
    setLayout(new FlowLayout(FlowLayout.LEFT, 20, 12)); // TODO: commit 2 feature

    initElements();
  }

  private void initElements() {
    JLabel paletteName = new JLabel("ORM Elements");
    paletteName.setFont(new Font(null, Font.BOLD, 20));
    // TODO: set new font
    add(paletteName);

    java.util.List<ElementType> elements = new ArrayList<>();
    elements.addAll(ElementType.getInCategory(ElementCategory.OBJECT)); // Commit 3 feature
    elements.addAll(ElementType.getInCategory(ElementCategory.SET_COMPARISON_CONSTRAINT)); // Commit 4 feature

    for(ElementType e : elements) {
      add(new OrmTransferableIcon(() -> e));
    }
  }

}
// Some other feature