package com.example.multipledatabaseapp;

//import com.example.multipledatabaseapp.db1.config.DB1;

import com.example.multipledatabaseapp.db1.config.Db1Properties;
import com.example.multipledatabaseapp.db2.config.Db2Properties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@EnableConfigurationProperties(value = {
        Db1Properties.class,
        Db2Properties.class
})
public class MultipleDatabaseAppApplication /*implements Serializable*/ {

//    @Serial
//    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        SpringApplication.run(MultipleDatabaseAppApplication.class, args);

//        MultipleDatabaseAppApplication app = new MultipleDatabaseAppApplication();
//        app.clone();


        String s = "abc";
        StringBuilder sb = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        String sbs = sb.toString();
        System.out.println(sbs);

        String n1 = String.valueOf(12345);
        Map<Character, Integer> fMap = new HashMap<>();
        for (Character c : n1.toCharArray()) {
            int n = Integer.parseInt(c.toString());
            if (fMap.containsKey(c)) {
                fMap.put(c, fMap.get(c) + 1);
            } else {
                fMap.put(c, 1);
            }
        }
        System.out.println(fMap);

        List<String> list = Arrays.asList("a", "b", "c", "d");
        Collections.reverse(list);

        list.sort(Comparator.reverseOrder());

    }


//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    //    @Override
//    public MultipleDatabaseAppApplication clone() {
//        try {
//            return (MultipleDatabaseAppApplication) super.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }
}
