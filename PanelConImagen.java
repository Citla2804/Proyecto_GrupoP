import javax.swing.*;
import java.awt.*;

public class PanelConImagen extends JPanel {
    private Image imagen;

    public PanelConImagen(String rutaImagen, Color colorFondo) {
        this.imagen = new ImageIcon(rutaImagen).getImage();
        setBackground(colorFondo);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
    }

    public static void main(String[] args) {
        JFrame marco = new JFrame("Paneles con Imágenes");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLayout(new GridLayout(1, 3));

        PanelConImagen panel1 = new PanelConImagen("ruta/a/imagen1.jpg", Color.RED);
        PanelConImagen panel2 = new PanelConImagen("ruta/a/imagen2.jpg", Color.BLUE);
        PanelConImagen panel3 = new PanelConImagen("ruta/a/imagen3.jpg", Color.GREEN);

        marco.add(panel1);
        marco.add(panel2);
        marco.add(panel3);

        marco.setSize(900, 300);
        marco.setVisible(true);
    }
}
