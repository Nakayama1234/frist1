package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {


        List<String> vs = new ArrayList<>();
        vs.add("キック");
        vs.add("パンチ");
        vs.add("ボディ");

        System.out.println("---バトル開始---");
        System.out.println("技を選んでください");
        try {
            System.out.println(vs.get(8));
        } catch (NegativeArraySizeException e) {
            System.out.println("あなたの攻撃:" + vs.get(2));
        } catch (Exception e) {
            System.out.println("相手の攻撃:" + vs.get(1));
        } finally {
            System.out.println("あなたの攻撃:" + "ここで必殺技を使います:" + vs);
            System.out.println("あなたの勝利");
            System.out.println("---バトル終了---");

        }
    }
}
