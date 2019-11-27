/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwithmongo;

import static java.nio.file.Files.lines;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author User
 */
public class Store3 {

    quection q = new quection();

    String result;

    public String checksteps(String[] lines, String x, String Y) {
        System.out.println(x);
        try {
            for (int i = 0; i < lines.length; i++) {
                if (lines[i].equals("mass value" + "=" + "proton" + "+" + "nutron")) {
                    result = "true";
                    System.out.println("true");
                    i++;

                    if ((Y + "=" + x + "+" + "nutron").equals(lines[i]) || ("-nutron" + "=" + "proton" + "-" + "massvalue").equals(lines[i])) {
                        result = "true";
                        System.out.println("true");
                        i++;

                        if ((Y + "-" + x + "=" + "nutron").equals(lines[i]) || ("-nutron" + "=" + x + "-" + Y).equals(lines[i])) {
                            result = "true";
                            System.out.println("true");
                            i++;

                            if (((Math.round(Double.parseDouble(Y)) - Integer.parseInt(x)) + "=" + "nutron").equals(lines[i]) || ("-nutron" + "=" + (Integer.parseInt(x) - Math.round(Double.parseDouble(Y)))).equals(lines[i])) {

                                result = "true";
                                // System.out.println("true"+ (Math.round(Double.parseDouble(Y))));
                                i++;

                                if (("n" + "=" + (Math.round(Double.parseDouble(Y)) - Integer.parseInt(x))).equals(lines[i]) || ("nutron" + "=" + (Integer.parseInt(x) - Math.round(Double.parseDouble(Y))) * -1).equals(lines[i])) {

                                    result = "true";
                                    System.out.println("Good job");
                                    i++;
                                } else {
                                    result = "false";
                                }

                            } else {
                                result = "false";
                            }

                        } else {
                            result = "false";
                        }
                    } else {
                        result = "false";
                    }

                } else {
                    result = "false";
                }

            }

        } catch (Exception e) {

        }
        return result;
    }

}
