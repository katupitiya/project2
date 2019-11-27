/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwithmongo;

/**
 *
 * @author User
 */
public class Rules extends Store1 {

    int electron;

    public String equationforelectorn() {

        return "Number of nutrons = Mass number - Number of protons";
    }

    public int findelectron(String pp) {

        electron = (int) super.getAtomic(pp);
        return electron;

    }

    public long findnutron(String pp) {

        long nutron = (Math.round(super.getMass(pp)) - (super.getAtomic(pp)));
        return nutron;

    }

    public double[] findnutroniso(String pp) {

        double[] nutron = (super.isotopic(pp));

        return nutron;

    }

    int value, mainc = 1, value1, value2, value3;
    int level;
    String hh;

    public String Electron_configuration(String Atomic) {

        value = findelectron(super.Atomic(Atomic));

        if (value > 0) {
            level = 1;
            // System.out.println(level);

            if (value > 2) {

                hh = "s";
                System.out.println(2);
                level = 2;
                value1 = value - 2;

                if (value1 > 2) {
                    hh = "p";
                    System.out.println(2);
                    value2 = value1 - 2;

                    if ((value2) > 6) {
                        hh = "s";
                        System.out.println(6);
                        value3 = value2 - 6;
                        // System.out.println(value3);

                        if (value3 > 2) {
                            //3p
                            hh = "p";
                            System.out.println(2);
                            value2 = value3 - 2;

                            //4s
                            if (value2 > 6) {
                                hh = "s";
                                System.out.println(6);
                                value3 = value2 - 6;

                                //3d
                                if (value3 > 2) {
                                    hh = "p";
                                    System.out.println(2);
                                    value2 = value3 - 2;

                                    if (value2 > 10) {

                                        System.out.println(10);
                                        value3 = value2 - 10;

                                        if (value3 > 6) {
                                            System.out.println(6);
                                            value2 = value3 - 6;
                                            System.out.println(value2);
                                        } else {
                                            System.out.println(value3);
                                        }

                                    } else {
                                        hh = "d";
                                        System.out.println(value2);

                                    }
                                } else {
                                    System.out.println(value3);
                                }

                            } else {
                                System.out.println(value2);
                            }

                        } else {
                            System.out.println(value3);
                        }
                    } else {

                        System.out.println(value2);
                    }
                } else {

                    System.out.println(value1);
                }
            } else {
                hh = "s";
                System.out.println(value);
            }

        }
        return hh;

    }

    public void Checksblock(String Atomic) {

        Rules block2 = new Rules();
        String block = block2.Electron_configuration(Atomic);

        switch (block) {
            case "s":
                System.out.println("s block");
                break;
            case "p":
                System.out.println("p block");
                break;
            case "d":
                System.out.println("d block");
                break;
            default:
                break;
        }

    }

}
