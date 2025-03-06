import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class ERDiagram extends JFrame {
    
    public ERDiagram() {
        setTitle("Diagrama ER - Sistema Policial");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new DiagramPanel());
        setLocationRelativeTo(null);
    }

    class DiagramPanel extends JPanel {
        // Colores
        final Color ENTITY_COLOR = new Color(173, 216, 230);
        final Color RELATION_COLOR = new Color(255, 182, 193);

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // Dibujar entidades
            drawEntity(g2d, 100, 50, "EntidadBancaria", new String[]{"codigo_entidad (PK)", "domicilio_central"});
            drawEntity(g2d, 100, 200, "Sucursal", new String[]{"codigo_sucursal (PK)", "domicilio", "num_empleados", "codigo_entidad (FK)"});
            drawEntity(g2d, 500, 50, "Vigilante", new String[]{"codigo_vigilante (PK)", "edad"});
            drawEntity(g2d, 100, 400, "Persona", new String[]{"clave_persona (PK)", "nombre_completo", "num_banda (FK)"});
            drawEntity(g2d, 500, 400, "Banda", new String[]{"num_banda (PK)", "num_miembros"});
            drawEntity(g2d, 800, 250, "Juez", new String[]{"clave_interna (PK)", "nombre", "años_servicio"});

            // Dibujar relaciones
            drawRelationship(g2d, 300, 125, 300, 175, "1", "N");  // EntidadBancaria-Sucursal
            drawLineWithLabel(g2d, 250, 250, 500, 125, "Contrata (M:N)", Color.BLUE);  // Sucursal-Vigilante
            drawLineWithLabel(g2d, 300, 450, 500, 450, "Pertenece (N:1)", Color.RED);  // Persona-Banda
            drawLineWithLabel(g2d, 300, 400, 300, 250, "Atraca (M:N)", Color.GREEN);  // Persona-Sucursal
            drawLineWithLabel(g2d, 450, 325, 800, 300, "Caso (1:1)", Color.MAGENTA);  // Atraca-Juez
            
            // Leyenda
            drawLegend(g2d);
        }

        private void drawEntity(Graphics2D g, int x, int y, String name, String[] attributes) {
            // Rectángulo
            g.setColor(ENTITY_COLOR);
            g.fillRect(x, y, 200, 100);
            g.setColor(Color.BLACK);
            g.drawRect(x, y, 200, 100);

            // Nombre
            g.setFont(new Font("Arial", Font.BOLD, 12));
            g.drawString(name, x + 10, y + 20);

            // Atributos
            g.setFont(new Font("Arial", Font.PLAIN, 11));
            for(int i = 0; i < attributes.length; i++) {
                g.drawString(attributes[i], x + 10, y + 40 + (i * 15));
            }
        }

        private void drawRelationship(Graphics2D g, int x1, int y1, int x2, int y2, String left, String right) {
            // Línea
            g.draw(new Line2D.Double(x1, y1, x2, y2));
            
            // Cardinalidad
            g.drawString(left, x1 - 15, y1 + 5);
            g.drawString(right, x2 + 5, y2 + 5);
        }

        private void drawLineWithLabel(Graphics2D g, int x1, int y1, int x2, int y2, String label, Color color) {
            g.setColor(color);
            g.drawLine(x1, y1, x2, y2);
            
            // Etiqueta
            int midX = (x1 + x2)/2;
            int midY = (y1 + y2)/2;
            g.drawString(label, midX, midY);
        }

        private void drawLegend(Graphics2D g) {
            g.setColor(Color.BLACK);
            g.drawRect(800, 50, 300, 150);
            
            String[] items = {
                "Leyenda:",
                "Azul: Contrata (Sucursal-Vigilante)",
                "Rojo: Pertenece (Persona-Banda)",
                "Verde: Atraca (Persona-Sucursal)",
                "Magenta: Caso (Atraca-Juez)"
            };
            
            for(int i = 0; i < items.length; i++) {
                g.drawString(items[i], 810, 80 + (i * 20));
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ERDiagram().setVisible(true);
        });
    }
}