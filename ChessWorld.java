import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Initializes the ChessWorld 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChessWorld extends GWorld
{
    static {      
        // Initialize the world
        GWorld.setWidth(8);  
        GWorld.setHeight(4);
        GWorld.setCellSize(67);
    }

    /**
     * Constructor for objects of class TestWorld.
     * 
     */
    public ChessWorld() {           
       initialize();
    }
    public void initializeFirstLineWhileLoop(){
        int width = GWorld.width();
        int i=0;
        while(i<width){
            Chess newChess = new Chess();
            GWorld.addOneObject(newChess, i, 0);
            i++;
        }
    }
    public void initializeFirstLineDoWhileLoop(){
        int width = GWorld.width();
        int i=0;
        do{
            Chess newChess = new Chess();
            GWorld.addOneObject(newChess, i, 0);
            i++;
        }while(i<width); 
    }
    public void initializeFirstLineForLoop(){
        int width = GWorld.width();
        for(int i=0; i<width; i++){
            Chess newChess = new Chess();
            GWorld.addOneObject(newChess, i, 0);
        }      
    }
    public void initializePattern1(){
    int width = GWorld.width();
    int height = GWorld.height();
    for(int h=0; h<height; h++){
        for(int i=0; i<width; i++){
            Chess newChess = new Chess();
            GWorld.addOneObject(newChess, i, h);
        }
    }
    }
    public void initializePattern2(){
    int width = GWorld.width();
    int height = GWorld.height();
    for(int h=0; h<height; h++){
        for(int i=0; i<width; i++){
            Chess newChess = new Chess();
            if(i%2 == 0 && h%2 == 0){
            GWorld.addOneObject(newChess, i, h);
        }
        if(i%2 == 1 && h%2 == 1){
            GWorld.addOneObject(newChess, i, h);
        }
        }
    }
    }
    public void initializePattern3(){
    int width = GWorld.width();
    int height = GWorld.height();
    for(int h=0; h<height; h++){
        for(int i=0; i<width; i++){
            Chess newChess = new Chess();
        if(i<h+1){
            GWorld.addOneObject(newChess, i, h);
        }
        if(7-i<h+1){
            GWorld.addOneObject(newChess, i, h);
        }
        }
    }
    }
    public void initializePattern4(){
    int width = GWorld.width();
    int height = GWorld.height();
    for(int h=0; h<height; h++){
        for(int i=0; i<width; i++){
            Chess newChess = new Chess();
        if(3-i<h+1 && i<4){
            GWorld.addOneObject(newChess, i, h);
        }
        if(i<h+5 && i>3){
            GWorld.addOneObject(newChess, i, h);
        }
        }
    }
    }
    

    public void initialize() {                 
             //initializeFirstLineWhileLoop();
             //initializeFirstLineDoWhileLoop();
             //initializeFirstLineForLoop();
    }
    public void removeAllChessPieces() {
        GWorld.removeObjectsFromWorld( GWorld.getAllObjects("Chess") );
    }
       

}
