
import java.util.Random;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author itamar
 */
public class MainGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        
      
        try {
            MineSweeper game;
            
            game = new  MineSweeper(3, 10, 10);
            game.game();
        } 
        catch (Exception ex ) {
            
            System.out.println(ex.getMessage());

        }

        
        

        // enter minecount colm count and row count 
    }

}
