/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameHouse;

/**
 *
 * @author user
 */
public class Player {
    private String name;
    private int highScore = 0;
    private int winTicTacToe = 0;
    private int loseTicTacToe = 0;
    private int drawTicTacToe = 0;
    private int winSuit = 0;
    private int loseSuit = 0;
    private int drawSuit = 0;
    
    public Player(){
        
    }
    
    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public int getWinTicTacToe() {
        return winTicTacToe;
    }

    public void setWinTicTacToe(int winTicTacToe) {
        this.winTicTacToe = winTicTacToe;
    }

    public int getLoseTicTacToe() {
        return loseTicTacToe;
    }

    public void setLoseTicTacToe(int loseTicTacToe) {
        this.loseTicTacToe = loseTicTacToe;
    }

    public int getDrawTicTacToe() {
        return drawTicTacToe;
    }

    public void setDrawTicTacToe(int drawTicTacToe) {
        this.drawTicTacToe = drawTicTacToe;
    }

    public int getWinSuit() {
        return winSuit;
    }

    public void setWinSuit(int winSuit) {
        this.winSuit = winSuit;
    }

    public int getLoseSuit() {
        return loseSuit;
    }

    public void setLoseSuit(int loseSuit) {
        this.loseSuit = loseSuit;
    }

    public int getDrawSuit() {
        return drawSuit;
    }

    public void setDrawSuit(int drawSuit) {
        this.drawSuit = drawSuit;
    }

    
    
    
}
