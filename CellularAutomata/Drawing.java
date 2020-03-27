package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;


public class Drawing {

    public static void drawGrid(Canvas canvas, int [][]grid,int N,int size){
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
         for(int i=0;i<N;i++){
             for(int j=0;j<size;j++){
                 if(grid[i][j]==1) gc.fillRect(5*j,5*i,5,5);
             }
         }
    }
}