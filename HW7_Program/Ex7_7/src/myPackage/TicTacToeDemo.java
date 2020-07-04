package myPackage;

import java.util.Scanner;

public class TicTacToeDemo {
	public static void main(String[] args){
		TicTacToe g = new TicTacToe();
		int opt,put,player;
		Scanner key = new Scanner(System.in);
		while(true){
			System.out.println("1.start 2.exit");
			opt=key.nextInt();
			switch(opt){
			case 1:
				player=0;
				while(true){
					System.out.println("player "+((player%2)+1)+" put in");
					put=key.nextInt();
					if(g.addMove(player, put)==1)
						break;
					g.display();
					player++;
				}
				break;
			case 2:
				System.exit(1);
				break;
			default:
				System.out.println("Type the between 1 and 2");	
			}
		}
	}
}
