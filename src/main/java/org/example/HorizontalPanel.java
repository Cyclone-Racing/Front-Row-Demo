package org.example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class HorizontalPanel extends JPanel {

    static HorizontalPanel instance = new HorizontalPanel();
    private GroupLayout layout;
    private JButton buttonA;
    private JButton buttonB;
    private JButton buttonC;

    private HorizontalPanel() {
        super();

        layout = new GroupLayout(this);

        setLayout(layout);
        setBorder(new EmptyBorder(10, 10, 10, 10));

        layout.setAutoCreateGaps(false);
        layout.setAutoCreateContainerGaps(false);


        buttonA = new JButton("Button A");
        buttonA.addActionListener(event -> {
            System.out.println(buttonA.getText());
        });

        buttonB = new JButton("Button B");
        buttonB.addActionListener(event -> {
            System.out.println(buttonB.getText());
        });

        buttonC = new JButton("Not Henry's Work");
        buttonC.addActionListener(event -> {
            System.out.println(buttonC.getText());
        });

        add(buttonA);
        add(buttonB);
        add(buttonC);

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addComponent(buttonA)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED,
                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonB)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED,
                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonC)
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(buttonC)
                                .addComponent(buttonA)
                                .addComponent(buttonB)
                        )
        );
    }
}
