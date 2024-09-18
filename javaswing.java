import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.util.Random;


public class javaswing {

    public static void main(String[] args) {
        
        // Create the JFrame
        JFrame frame = new JFrame();
        frame.setTitle("Random Bar Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Close With X Button
        frame.setResizable(false);//Resizable Window
        frame.setSize(500, 500);  // Adjust size 

        // Use BorderLayout to position the grid and button
        frame.setLayout(new BorderLayout());

        // Create and add the GridPanel to the center
        GridPanel gridPanel = new GridPanel();
        frame.add(gridPanel, BorderLayout.CENTER);
        
        // Create and add the Redraw button to the bottom
        JButton redrawButton = new JButton("Redraw");
        frame.add(redrawButton, BorderLayout.SOUTH);


        // Add action listener to redraw button
        redrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gridPanel.repaint();  // Request panel to repaint
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}

class GridPanel extends JPanel {

    private Graphics2D g2d;
    public static Random random;
    

    @Override
   public void paintComponent(Graphics g) {
        super.paintComponent(g);  // Ensures proper panel rendering

        g2d = (Graphics2D) g;
        random = new Random();
        drawGrid();
        drawRect();
    }

    public void drawGrid(){

        int rows = 10;  // Number of rows
        int cols = 10;  // Number of columns
        int panelWidth = getWidth();  // Width of the panel
        int panelHeight = getHeight();  // Height of the panel

        // Calculate the size of each cell so that they are square
        int cellSize = Math.min(panelWidth / cols, panelHeight / rows);

        // Calculate grid dimensions
        int gridWidth = cellSize * cols;
        int gridHeight = cellSize * rows;

        // Center the grid in the panel
        int xOffset = (panelWidth - gridWidth) / 2;
        int yOffset = (panelHeight - gridHeight) / 2;

        // Draw the grid
        g2d.setColor(Color.BLACK);  // Set the grid color
        for (int row = 0; row <= rows; row++) {
            for (int col = 0; col <= cols; col++) {
                int x = xOffset + col * cellSize;
                int y = yOffset + row * cellSize;

                // Draw vertical and horizontal grid lines
                g2d.drawLine(x, yOffset, x, yOffset + gridHeight);  // Vertical lines
                g2d.drawLine(xOffset, y, xOffset + gridWidth, y);   // Horizontal lines

            }
        }
        
    }

    public static Color getRandomColor() {

        int red = random.nextInt(256);   // 0 to 255
        int green = random.nextInt(256); // 0 to 255
        int blue = random.nextInt( 256);  // 0 to 255

        // Create and return a new Color object with the random RGB values
        return new Color(red, green, blue);
    }

    //code to implement
    public void drawRect() {

        float thickness = 10.0f; // Line thickness of 5 pixels
        g2d.setStroke(new BasicStroke(thickness));

        Color randomColor = getRandomColor();
        
        randomColor = getRandomColor();
         g2d.setColor(randomColor);            
        Line2D.Double line = new Line2D.Double(50.0,  random.nextInt(8,427), 50.0, 436.0);
         g2d.draw(line);
         
        //get random color
         randomColor = getRandomColor();
         g2d.setColor(randomColor);
         Line2D.Double line3 = new Line2D.Double(100.0, random.nextInt(8,427), 100.0, 436.0); //bigger height means lower down
         g2d.draw(line3);

         randomColor  = getRandomColor();
         g2d.setColor(randomColor);
         Line2D.Double line4 = new Line2D.Double(150.0, random.nextInt(8,427), 150.0, 436.0);
         g2d.draw(line4);
         
         randomColor = getRandomColor();
         g2d.setColor(randomColor);
         Line2D.Double line5 = new Line2D.Double(200.0, random.nextInt(8,427), 200.0, 436.0);
         g2d.draw(line5);

         randomColor = getRandomColor();
         g2d.setColor(randomColor);
         Line2D.Double line6 = new Line2D.Double(250.0, random.nextInt(8,427), 250, 436.0);
         g2d.draw(line6);

         randomColor = getRandomColor();
         g2d.setColor(randomColor);
         Line2D.Double line7 = new Line2D.Double(300.0, random.nextInt(8,427), 300.0, 436.0);
         g2d.draw(line7);

         randomColor = getRandomColor();
         g2d.setColor(randomColor);
         Line2D.Double line8 = new Line2D.Double(350.0, random.nextInt(8,427), 350.0, 436.0);
         g2d.draw(line8);

         randomColor = getRandomColor();
         g2d.setColor(randomColor);
         Line2D.Double line9 = new Line2D.Double(400.0, random.nextInt(8,427), 400.0, 436.0);
         g2d.draw(line9);  

         randomColor = getRandomColor();
         g2d.setColor(randomColor);
         Line2D.Double line10 = new Line2D.Double(450.0, random.nextInt(8,427), 450.0, 436.0);
         g2d.draw(line10);
        
    }


}