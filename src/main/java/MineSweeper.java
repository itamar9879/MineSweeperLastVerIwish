
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author itamar
 */
public class MineSweeper implements ActionListener {

    public final int MAXROWS = 50;
    public final int MAXCOULMN = 50;
    public final int MAXMINES = 40;
    public int rowCount;
    public int columnCount;
    public int Board[][];
    
    public int mineCount;

// constractor
    /**
     * constrictor of the game.
     *
     * @param mineCount count of mines on board to be set in the board
     * @param columnCount count of column in the board.
     * @param rowCount count of rows in the board.
     * @throws java.lang.Exception
     */
    public MineSweeper(int mineCount, int columnCount, int rowCount) throws Exception {

       // validValues(mineCount, columnCount, rowCount);

        this.mineCount = mineCount;
        this.columnCount = columnCount;
        this.rowCount = rowCount;

    }
    // Check neighbors
    public void neighbors(int x,int y)
    {
        int mineclose=0;
        for( int i = x-1;i<=x+1;i++)
            for (int j=y-1;j<=y+1;j++)
            {
                if (this.Board[i][j] != 0)
                {
                    mineclose++;
                }
            }
       
    }
    

    /**
     *  checks if the values are valid 
     * @param mineCount count of mines on board to be set in the board
     * @param columnCount count of column in the board.
     * @param rowCount count of rows in the board.
     */
    static public void validValues(int mineCount, int columCount, int rowCount) throws Exception {

        if (rowCount == 0 || columCount == 0 || mineCount == 0) {
            throw new ArithmeticException("you cannot enter zero ");
        }

        if (columCount * rowCount < mineCount) {
            throw new Exception("Too much mines Bro slow down ! ");
        }
        if (mineCount > 40) {
            throw new IllegalArgumentException("Too much mines Bro Slow Fucking down!!! step bro <3 ");
        }
        if (rowCount > 50) {
            throw new IllegalArgumentException("Bitch what ? are you eran catz?");
        }
        if (columCount > 50) {
            throw new IllegalArgumentException("Bitch what ? are you eran catz?");
        }

    }
    public void createBoard () 
    {
        int randx;
        int randy;
         Random rnd = new Random();
           this.Board = new int[rowCount][columnCount];
        int mineCounter=this.mineCount;
         while (mineCounter!=0)
         {
       
               
                randy = rnd.nextInt(rowCount);
                randx = rnd.nextInt(columnCount);
                if (this.Board[randx][randy] == -1 )
                {
                   
                    continue;
                    
                }
                Board[randx][randy] = -1;
                mineCounter--;
         }
                
         
    
    }
            
            
    
   
    public void game()
    {
       createBoard();
       PrintBoard();
       
    }
    public void PrintBoard ()
    {
        for(int i = 0; i <this.rowCount;i++)
       {
           for(int j = 0;j<this.columnCount;j++)
           {
               System.out.print(" "+ Board[i][j]);
           }
           System.out.println();
    }
    }
    
    

// getters and setters
    public int getMineCount() {
        return mineCount;
    }

    public void setMineCount(int mineCount) {
        this.mineCount = mineCount;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public int[][] getBoard() {
        return Board;
    }

    public void setBoard(int[][] Board) {
        this.Board = Board;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
