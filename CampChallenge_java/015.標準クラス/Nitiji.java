/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Fleshgod4618
 */
public class Nitiji {

    public static void main(String[] args) throws Exception {
        //本日の日時を表示する
        Date now = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
        String s = f.format(now);
        System.out.println(s);
        //指定日時の文字列を解析しDate型として得る
        Date d = f.parse("2011/9/22 01:23:45");
    }
}
