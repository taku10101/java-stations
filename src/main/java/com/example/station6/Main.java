package com.example.station6;

public class Main {
    public static void main(String[] args) {
        int[] users = new int[5]; // 要素数が5個のint型の配列を作る
        users[0] = 23; // ユーザーAの年齢
        users[1] = 36; // ユーザーBの年齢
        users[2] = 31; // ユーザーCの年齢
        users[3] = 48; // ユーザーDの年齢
        users[4] = 58; // ユーザーEの年齢

        int all = 0; // 全ての年齢を足した値を格納する変数
        for (int i = 0; i < users.length; i++) {
            all += users[i];
        }

        double average = (double) all / 5; // 平均年齢を求める
        System.out.println(average);
    }}