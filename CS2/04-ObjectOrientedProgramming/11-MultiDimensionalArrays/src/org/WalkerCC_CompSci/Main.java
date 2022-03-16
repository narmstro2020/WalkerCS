package org.WalkerCC_CompSci;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] ticTacToe1D = new int[9];
        int[][] ticTacToe2D = new int[3][3];
        int[][][] ticTacToe3D = new int [3][3][3];

        boolean[][] mineSweeperBoard = new boolean[10][10];
        Random rand = new Random();

        for(int row = 0; row < 10; row++){
            for(int col = 0; col < 10; col++){
                mineSweeperBoard[row][col] = rand.nextBoolean();
            }
        }

        int num = 5;
        String myString = (num % 2 == 0) ? "Even" : "Odd";


        byte b = (byte) 128;
        System.out.println(b);




    }
}
