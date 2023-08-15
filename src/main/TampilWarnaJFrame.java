package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TampilWarnaJFrame extends JFrame {
    private JButton ubahWarnaJButton;
    private Color warna = Color.LIGHT_GRAY;
    private JPanel warnaJPanel;

    // membangun GUI
    public TampilWarnaJFrame() {
        super("Menggunakan JColorChooser");

        // mencipatakan ubahWarnaJButton dan mendftarkan event-handlernya
        ubahWarnaJButton = new JButton("Ubah Warna");
        ubahWarnaJButton.addActionListener(
                new ActionListener() { // inner class tak-bernama
                    // menampilkan JColorChooser ketika pengguna menklik tombol
                    public void actionPerformed(ActionEvent event) {
                        warna = JColorChooser.showDialog(TampilWarnaJFrame.this, "Pilih sebuah wara", warna);

                        // menetapkan warna default, jika tidak ada warna yg dipilih
                        if (warna == null) {
                            warna = Color.LIGHT_GRAY;
                        }

                        // mengubah warna latar dari content page
                        // warnaJPanel.setBackground(warna);
                        warnaJPanel = new JPanel();
                        warnaJPanel.setBackground(warna);
                    }
                });

        warnaJPanel = new JPanel();

        // menambahkan colorJPanel
        add(warnaJPanel, BorderLayout.CENTER);
        // menambahkan tombol
        add(ubahWarnaJButton, BorderLayout.SOUTH);

        // menetapkan ukuran frame
        setSize(400, 130);
        // menampilkan frame
        setVisible(true);
    }
}
