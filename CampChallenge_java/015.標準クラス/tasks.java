/* 


 
 * To change this license header, choose License Headers in Project Properties. 


 
 * To change this template file, choose Tools | Templates 


 
 * and open the template in the editor. 


 
 */

import java.util.*;

import java.text.*;

import java.io.*;

/**
 * *
 *
 *
 *
 *
 *
 *
 * @author
 *
 *
 */
public class tasks {

    void task1() {

        Calendar cal1 = Calendar.getInstance();                                 //カレンダー型のcal1インスタンスを生成 

        cal1.clear();                                                           //クラスが保持していた時刻を消去 

        cal1.set(2016, 1, 1, 0, 0, 0);                                               //指定時刻を設定 

        long ts1 = cal1.getTimeInMillis();                                      //設定時刻とエポックの差を取得し, long型のts1に代入 

        System.out.println(ts1);

    }

    void task2() {

        Date d2 = new Date();

        SimpleDateFormat f1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        String s = f1.format(d2);

        System.out.println(s);

    }

    void task3() {

        Calendar cal3 = Calendar.getInstance();

        cal3.clear();

        cal3.set(2017, 8, 15, 10, 0, 0);

        Date d3 = cal3.getTime();

        SimpleDateFormat f3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String out = f3.format(d3);

        System.out.println(out);

    }

    void task4() {

        Calendar cal4j = Calendar.getInstance();        //1月用のインスタンスを生成 

        Calendar cal4d = Calendar.getInstance();        //12月用のインスタンスを生成 

        cal4j.clear();                                  //保持されている時刻を消去 

        cal4j.set(2015, 1, 1, 0, 0, 0);                      //1月の時刻を設定 

        cal4d.clear();

        cal4d.set(2015, 12, 31, 23, 59, 59);

        long ts4j = cal4j.getTimeInMillis();            //1月のタイムスタンプを取得 

        long ts4d = cal4d.getTimeInMillis();            //12月のタイムスタンプを取得 

        long datediff = (ts4d - ts4j);                  //1月と12月の差分を取得 

        datediff = datediff / 1000;                     //単位変換(ms→s)用 

        System.out.println(datediff);

    }

    void task5() {

        String myname = "岩倉洸介";

        System.out.println(myname.length());

    }

    void task6() {

        String address = "kt165czop@gmail.com";

        System.out.println(address.substring(11));

    }

    void task7() {

        String message = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";

        String message1 = (message.replace("I", "い"));

        String message2 = (message1.replace("U", "う"));

        System.out.println(message2);

    }

    void task8() throws Exception {

        String file3 = "/Users/SHO/Desktop/dr/file3.txt";

        FileWriter fw = new FileWriter(file3);

        PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

        pw.println("私の名前は岩倉洸介です。");

        pw.println("生年月日は平成5年3月16日です。");

        pw.println("好きなものは甘いもの, 嫌いなものは魚介類です。");

        pw.close();

        System.out.println("書き込みが完了しました");

    }

    void task9() throws Exception {

        String file3 = "/Users/Fleshgod4618/Desktop/dr/file3.txt";

        FileReader fr = new FileReader(file3);

        BufferedReader br = new BufferedReader(fr);

        String line;

        int count = 0;

        while ((line = br.readLine()) != null) {

            System.out.println(count + "行目：" + line
            );

        }

        br.close();

        fr.close();

    }

}
