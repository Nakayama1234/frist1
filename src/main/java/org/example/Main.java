package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, List<String>> introduction = new HashMap<>();

        List<String> teamtheYuta = new ArrayList<>();
        teamtheYuta.add("趣味:筋トレ");
        teamtheYuta.add("出身:熊本県");
        teamtheYuta.add("好きな食べ物:馬刺し");
        teamtheYuta.add("仕事:建設");
        introduction.put("ゆうたさん", teamtheYuta);

        List<String> teamtheSatosi = new ArrayList<>();
        teamtheSatosi.add("趣味:ギター");
        teamtheSatosi.add("出身:福岡県");
        teamtheSatosi.add("好きな食べ物:明太子");
        teamtheSatosi.add("仕事:畜産");
        introduction.put("さとしさん", teamtheSatosi);

        List<String>  teamtheKenta = new ArrayList<>();
        teamtheKenta.add("趣味:旅行");
        teamtheKenta.add("出身:東京都");
        teamtheKenta.add("好きな食べ物:東京バナナ");
        teamtheKenta.add("仕事:エンジニア");
        introduction.put("けんたさん",  teamtheKenta);

        for (Map.Entry<String, List<String>> entry : introduction.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            System.out.println("自己紹介: " + key);
            System.out.println("プロフィール: " + value);
        }
    }
}

