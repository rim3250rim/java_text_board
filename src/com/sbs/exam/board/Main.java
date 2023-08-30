package com.sbs.exam.board;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==게시판 v 0.1");
        System.out.println("==프로그램 시작 ==");

        while (true) {
            System.out.printf("명령");
            String cmd = scanner.nextLine();
            System.out.printf("입력된명령어 : %s\n", cmd);

        if (cmd.equals("exit")) {
            break;
        }
    }
            System.out.println("==프로그램 종료==");
            scanner.close();

    }

}