package br.com.dio.ui.custom.button;

import javax.swing.*;
import java.awt.event.ActionListener;

public class buttonCheckStatusButton extends JButton {
    public void CheckGamerStatusButton(final ActionListener actionListener){
        this.setText("Verificar jogo");
        this.addActionListener(actionListener);
    }
}
