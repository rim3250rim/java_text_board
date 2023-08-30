package com.sbs.exam.board;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("==게시판 v 0.1");
        System.out.println("==프로그램 시작 ==");
        System.out.printf("명령");
        String cmd = scanner.nextLine();
        System.out.printf("입력된명령어 : %s\n", cmd);
        System.out.println("==프로그램 종료==");

        scanner.close();
    }
}