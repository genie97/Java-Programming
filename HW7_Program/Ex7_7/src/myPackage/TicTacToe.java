package myPackage;

import java.util.Scanner;

public class TicTacToe {
	public char[][] gameBoard = new char [3][3];
	TicTacToe(){
		int k=1;
		for(int i=0;i<gameBoard.length;i++){
			for(int j=0;j<gameBoard[0].length;j++){
				gameBoard[i][j] = Character.forDigit(k,10);
				k++;
			}
		}
	}
	public int whoseTurn(int player){
		return player%2;
	}
	public int addMove(int player, int f){
		if(whoseTurn(player)==0){
			for(int i=0;i<gameBoard.length;i++){
				for(int j=0;j<gameBoard[0].length;j++){
					if(gameBoard[i][j]==Character.forDigit(f,10)){
						gameBoard[i][j]='X';
						if(whoseWin(player)==1)
							return 1;
						else
							return 0;
					}
				}
			}
		}
		else{
			for(int i=0;i<gameBoard.length;i++){
				for(int j=0;j<gameBoard[0].length;j++){
					if(gameBoard[i][j]==Character.forDigit(f,10)){
						gameBoard[i][j]='O';
						if(whoseWin(player)==1)
							return 1;
						else
							return 0;
					}
				}
			}
		}
		return 0;
	}
	public void display(){
		for(int i=0;i<gameBoard.length;i++){
			for(int j=0;j<gameBoard[0].length;j++){
				System.out.print(" " + gameBoard[i][j]);
			}
			System.out.println();
		}	
	}
	public void initialize(){
		int k=1;
		for(int i=0;i<gameBoard.length;i++){
			for(int j=0;j<gameBoard[0].length;j++){
				gameBoard[i][j] = Character.forDigit(k,10);
				k++;
			}
		}
	}
	public int whoseWin(int player){
		if(whoseTurn(player)==0)
			player='X';
		else
			player='O';
		for(int i=0;i<3;i++){
			if((gameBoard[i][0]==player)&&(gameBoard[i][1]==player)&&(gameBoard[i][2])==player){
				System.out.println("Player" + ((player%2)+1) + " is win");
				display();
				initialize();
				return 1;
			}
			if((gameBoard[0][i]==player)&&(gameBoard[1][i]==player)&&(gameBoard[2][i])==player){
				System.out.println("Player" + ((player%2)+1) + " is win");
				display();
				initialize();
				return 1;
			}
		}
		if((gameBoard[0][0]==player)&&(gameBoard[1][1]==player)&&(gameBoard[2][2])==player){
			System.out.println("Player" + ((player%2)+1) + " is win");
			display();
			initialize();
			return 1;
		}
		if((gameBoard[0][2]==player)&&(gameBoard[1][1]==player)&&(gameBoard[2][0])==player){
			System.out.println("Player" + ((player%2)+1) + " is win");
			display();
			initialize();
			return 1;
		}
		return 0;
	}
}
