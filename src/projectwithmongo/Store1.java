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
public class Store1 extends Store {

    int Proton;
    double Massnumber;
    String Atomic;
    int numberofelectorns;
    int energylevel;

    @Override
    public int getAtomic(String Atomic) {

        String ss;
        ss = super.Atomic(Atomic);

        if (ss.equals("H")) {

            Proton = 1;

        } else if (ss.equals("He")) {

            Proton = 2;

        } else if (ss.equals("Li")) {

            Proton = 3;

        } else if (ss.equals("Be")) {
            Proton = 4;

        } else if (ss.equals("B")) {
            Proton = 5;

        } else if (ss.equals("C")) {
            Proton = 6;

        } else if (ss.equals("N")) {
            Proton = 7;

        } else if (ss.equals("O")) {
            Proton = 8;

        } else if (ss.equals("F")) {
            Proton = 9;

        } else if (ss.equals("Ne")) {
            Proton = 10;

        } else if (ss.equals("Na")) {
            Proton = 11;

        } else if (ss.equals("Mg")) {
            Proton = 12;

        } else if (ss.equals("Al")) {
            Proton = 13;
        } else if (ss.equals("Si")) {
            Proton = 14;
        } else if (ss.equals("P")) {
            Proton = 15;
        } else if (ss.equals("S")) {
            Proton = 16;
        } else if (ss.equals("Cl")) {
            Proton = 17;

        } else if (ss.equals("Ar")) {
            Proton = 18;
        } else if (ss.equals("K")) {
            Proton = 19;

        } else if (ss.equals("Ca")) {
            Proton = 20;

        } else if (ss.equals("Sc")) {

            Proton = 21;

        } else if (ss.equals("Ti")) {
            Proton = 22;
        } else if (ss.equals("V")) {
            Proton = 23;
        } else if (ss.equals("Cr")) {
            Proton = 24;
        } else if (ss.equals("Mn")) {
            Proton = 25;
        } else if (ss.equals("Fe")) {
            Proton = 26;
        } else if (ss.equals("Co")) {
            Proton = 27;
        } else if (ss.equals("Ni")) {
            Proton = 28;
        } else if (ss.equals("Cu")) {
            Proton = 29;
        } else if (ss.equals("Zn")) {
            Proton = 30;
        } else if (ss.equals("Ga")) {
            Proton = 31;
        } else if (ss.equals("Ge")) {
            Proton = 32;
        } else if (ss.equals("As")) {
            Proton = 33;
        } else if (ss.equals("Se")) {
            Proton = 34;
        } else if (ss.equals("Br")) {
            Proton = 35;
        } else if (ss.equals("Kr")) {
            Proton = 36;
        } else if (ss.equals("Rb")) {

            Proton = 37;

        } else if (ss.equals("Sr")) {
            Proton = 38;
        } else if (ss.equals("Y")) {
            Proton = 39;
        } else if (ss.equals("Zr")) {
            Proton = 40;
        } else if (ss.equals("Nb")) {
            Proton = 41;
        } else if (ss.equals("Mo")) {
            Proton = 42;
        } else if (ss.equals("Tc")) {
            Proton = 43;
        } else if (ss.equals("Ru")) {
            Proton = 44;
        } else if (ss.equals("Rh")) {
            Proton = 45;
        } else if (ss.equals("Pd")) {
            Proton = 46;
        } else if (ss.equals("Ag")) {
            Proton = 47;
        } else if (ss.equals("Cd")) {
            Proton = 48;
        } else if (ss.equals("In")) {
            Proton = 49;
        } else if (ss.equals("Sn")) {
            Proton = 50;
        } else if (ss.equals("Sb")) {
            Proton = 51;
        } else if (ss.equals("Te")) {
            Proton = 52;
        } else if (ss.equals("I")) {
            Proton = 53;
        } else if (ss.equals("Xe")) {
            Proton = 54;
        }
        return Proton;

    }

    @Override
    public double getMass(String Atomic) {

        String ss;
        ss = super.Atomic(Atomic);

        switch (ss) {
            case "H":
                Massnumber = 1.008;
                Proton = 7;
                break;
            case "He":
                Massnumber = 4.0026;
                break;
            case "Li":
                Massnumber = 6.94;
                break;
            case "Be":
                Massnumber = 9.0122;
                break;
            case "B":
                Massnumber = 10.81;
                break;
            case "C":
                Massnumber = 12.011;
                break;
            case "N":
                Massnumber = 14.007;
                break;
            case "O":
                Massnumber = 15.999;
                break;
            case "F":
                Massnumber = 18.998;
                break;
            case "Ne":
                Massnumber = 20.180;
                break;
            case "Na":
                Massnumber = 22.990;
                break;
            case "Mg":
                Massnumber = 24.305;
                break;
            case "Al":
                Massnumber = 26.982;
                break;
            case "Si":
                Massnumber = 28.085;
                break;
            case "P":
                Massnumber = 30.974;
                break;
            case "s":
                Massnumber = 32.06;
                break;
            case "Cl":
                Massnumber = 35.45;
                break;
            case "Ar":
                Massnumber = 39.95;
                break;
            case "K":
                Massnumber = 39.098;
                break;
            case "Ca":
                Massnumber = 40.078;
                break;

            case "Sc":

                Massnumber = 44.956;
                break;

            case "Ti":
                Massnumber = 47.867;
                break;

            case "V":
                Massnumber = 50.942;
                break;
            case "Cr":
                Massnumber = 51.996;
                break;
            case "Mn":
                Massnumber = 54.938;
                break;
            case "Fe":
                Massnumber = 55.845;
                break;
            case "Co":
                Massnumber = 58.933;
                break;
            case "Ni":
                Massnumber = 58.693;
                break;

            case "Cu":
                Massnumber = 63.546;
                break;
            case "Zn":
                Massnumber = 65.380;
                break;
            case "Ga":
                Massnumber = 69.723;
                break;
            case "Ge":
                Massnumber = 72.630;
                break;
            case "As":
                Massnumber = 74.922;
                break;
            case "Se":
                Massnumber = 78.971;
                break;
            case "Br":
                Massnumber = 79.904;
                break;
            case "Kr":
                Massnumber = 83.798;
                break;

            case "Rb":

                Massnumber = 85.468;
                break;

            case "Sr":
                Massnumber = 87.62;
                break;

            case "Y":
                Massnumber = 88.906;
                break;
            case "Zr":
                Massnumber = 91.224;
                break;
            case "Nb":
                Massnumber = 92.906;
                break;
            case "Mo":
                Massnumber = 95.95;
                break;
            case "Tc":
                Massnumber = 97.00;
                break;
            case "Ru":
                Massnumber = 101.07;
                break;

            case "Rh":
                Massnumber = 102.91;
                break;
            case "Pd":
                Massnumber = 106.42;
                break;
            case "Ag":
                Massnumber = 107.87;
                break;
            case "Cd":
                Massnumber = 112.41;
                break;
            case "In":
                Massnumber = 114.82;
                break;
            case "Sn":
                Massnumber = 118.71;
                break;
            case "Sb":
                Massnumber = 121.76;
                break;
            case "Te":
                Massnumber = 127.60;
                break;
            case "I":
                Massnumber = 126.90;
                break;
            case "Xe":
                Massnumber = 131.29;
                break;
            default:
                System.out.println("not here");
                break;
        }
        return Massnumber;

    }

    @Override
    public double[] isotopic(String string) {

        String ss;
        ss = super.Atomic(string);

        double[] result = new double[10];
        if (ss.equals("H")) {

            result[0] = 1.008;
            result[1] = 2.01410;

        } else if (ss.equals("He")) {

            result[0] = 4.002;
            result[1] = 3.0160;

        }

        if (ss.equals("Li")) {

            result[0] = 6.94;
            result[1] = 6.015;

        } else if (ss.equals("Be")) {
            result[0] = 9.0122;

        } else if (ss.equals("B")) {
            result[0] = 10.81;
            result[1] = 10.012;
        } else if (ss.equals("C")) {
            result[0] = 12.011;
            result[1] = 13.003;
        } else if (ss.equals("N")) {
            result[0] = 14.007;
            result[1] = 15.000;
        } else if (ss.equals("O")) {
            result[0] = 15.994;
            result[1] = 16.999;
            result[3] = 17.999;
        } else if (ss.equals("F")) {
            result[0] = 18.998;

        } else if (ss.equals("Ne")) {
            result[0] = 20.180;
            result[1] = 21.991;
            result[2] = 20.993;
        } else if (ss.equals("Na")) {
            result[0] = 22.989;

        } else if (ss.equals("Mg")) {

            result[0] = 24.305;
            result[1] = 25.982;
            result[2] = 24.985;
        } else if (ss.equals("Al")) {
            result[0] = 26.982;

        } else if (ss.equals("Si")) {
            result[0] = 28.085;
            result[1] = 28.976;
            result[2] = 29.973;
        } else if (ss.equals("P")) {
            result[0] = 30.974;
        } else if (ss.equals("s")) {
            result[0] = 32.06;
            result[1] = 33.967;
            result[2] = 32.971;
            result[3] = 35.967;
        } else if (ss.equals("Cl")) {
            result[0] = 35.45;
            result[1] = 36.965;
        } else if (ss.equals("Ar")) {
            result[0] = 39.95;
            result[1] = 35.967;
            result[2] = 37.962;
        } else if (ss.equals("K")) {
            result[0] = 39.098;
            result[1] = 40.961;
            result[2] = 39.963;
        } else if (ss.equals("Ca")) {
            result[0] = 40.078;
            result[1] = 43.955;
            result[2] = 41.958;
            result[3] = 47.952;
            result[4] = 42.958;
            result[5] = 45.953;

        } else if (ss.equals("Sc")) {

            result[0] = 44.956;

        } else if (ss.equals("Ti")) {
            result[0] = 47.867;
            result[1] = 45.952;
            result[2] = 46.951;
            result[3] = 48.947;
            result[4] = 49.944;
        } else if (ss.equals("V")) {
            result[0] = 50.942;
            result[1] = 49.947;
        } else if (ss.equals("Cr")) {
            result[0] = 51.996;
            result[1] = 52.940;
            result[2] = 49.946;
            result[3] = 53.938;
        } else if (ss.equals("Mn")) {
            result[0] = 54.938;
        } else if (ss.equals("Fe")) {
            result[0] = 55.845;
            result[1] = 53.939;
            result[2] = 56.935;
            result[3] = 57.933;
        } else if (ss.equals("Co")) {
            result[0] = 58.933;
        } else if (ss.equals("Ni")) {
            result[0] = 58.693;
            result[1] = 59.930;
            result[2] = 61.928;
            result[3] = 60.931;
            result[4] = 63.927;
        } else if (ss.equals("Cu")) {
            result[0] = 63.546;
            result[1] = 64.927;
        } else if (ss.equals("Zn")) {
            result[0] = 65.38;
            result[1] = 65.926;
            result[2] = 67.924;
            result[3] = 66.927;
            result[4] = 69.925;
        } else if (ss.equals("Ga")) {
            result[0] = 69.723;
            result[1] = 70.924;
        } else if (ss.equals("Ge")) {
            result[0] = 72.630;
            result[1] = 71.922;
            result[2] = 69.924;
            result[3] = 75.921;
            result[4] = 72.923;
        } else if (ss.equals("As")) {
            result[0] = 74.922;
        } else if (ss.equals("Se")) {
            result[0] = 78.971;
            result[1] = 77.917;
            result[2] = 75.919;
            result[3] = 81.916;
            result[4] = 76.919;
            result[5] = 73.922;
        } //chechk Br mass number   
        else if (ss.equals("Br")) {
            result[0] = 79.904;
        } else if (ss.equals("Kr")) {
            result[0] = 83.798;
            result[1] = 85.910;
            result[2] = 81.913;
            result[3] = 82.914;
            result[4] = 79.916;
            result[5] = 77.920;
        }

        if (ss.equals("Rb")) {

            result[0] = 85.468;
            result[1] = 86.909;
        } else if (ss.equals("Sr")) {
            result[0] = 87.62;
            result[1] = 85.909;
            result[2] = 86.908;
            result[3] = 83.913;
        } else if (ss.equals("Y")) {
            Massnumber = 88.906;

        } else if (ss.equals("Zr")) {
            result[0] = 91.224;
            result[1] = 93.906;
            result[2] = 91.905;
            result[3] = 90.905;
            result[4] = 95.908;

        } else if (ss.equals("Nb")) {
            result[0] = 92.906;
        } else if (ss.equals("Mo")) {
            result[0] = 95.95;
            result[1] = 97.905;
            result[2] = 94.905;
            result[3] = 91.906;
            result[4] = 99.907;
            result[5] = 96.906;
            result[6] = 93.905;
        } else if (ss.equals("Tc")) {
            result[0] = 97;
        } //check
        else if (ss.equals("Ru")) {
            result[0] = 101.07;
            result[1] = 101.904;
            result[2] = 103.905;
            result[3] = 100.905;
            result[4] = 98.905;
            result[5] = 99.904;
            result[6] = 95.907;
            result[7] = 97.905;
        } else if (ss.equals("Rh")) {
            result[0] = 102.91;
        } else if (ss.equals("Pd")) {
            result[0] = 106.42;
            result[1] = 107.903;
            result[2] = 104.905;
            result[3] = 109.905;
            result[4] = 103.904;
            result[5] = 101.905;
        } else if (ss.equals("Ag")) {
            result[0] = 106.905;
            result[1] = 108.904;
        } else if (ss.equals("Cd")) {
            result[0] = 113.903;
            result[1] = 111.902;
            result[2] = 110.904;
            result[3] = 109.903;
            result[4] = 112.904;
            result[5] = 115.904;
            result[6] = 105.906;
            result[7] = 107.904;
        } else if (ss.equals("In")) {
            result[0] = 114.903;
            result[1] = 112.904;
        } else if (ss.equals("Sn")) {
            result[0] = 119.902;
            result[1] = 117.901;
            result[2] = 115.901;
            result[3] = 118.903;
            result[4] = 116.902;
            result[5] = 123.905;
            result[6] = 121.903;
            result[7] = 111.904;
            result[8] = 113.902;
            result[9] = 114.903;

        } else if (ss.equals("Sb")) {
            result[0] = 120.903;
            result[1] = 122.904;
        } else if (ss.equals("Te")) {
            result[0] = 129.906;
            result[1] = 127.904;
            result[2] = 125.903;
            result[3] = 124.904;
            result[4] = 123.902;
            result[5] = 121.903;
            result[6] = 122.904;
            result[7] = 119.904;
        } else {

            System.out.println("not here");
        }

        return (result);

    }
    int i;

    @Override
    public int count(double[] result) {
        int count = 0;
        while (result[i] != 0) {
            count++;
            i++;
        }
        return count;

    }

}
