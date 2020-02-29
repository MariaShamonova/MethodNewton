package com.metanit;
import java.text.NumberFormat;

interface Func {
    double count(double x1, double x2, double x3, double x4, double x5, double x6, double x7, double x8, double x9, double x10);
}
public class Main {

    public static void main(String[] args) {

        Func[] funcSys = new Func[10];

        funcSys[0] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> Math.cos(x1 * x2) - Math.exp(-3 * x3) + x4 * Math.pow(x5, 2) - x6 - Math.sinh(2 * x8) * x9 + 2 * x10 + 2.0004339741653854440;
        funcSys[1] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> Math.sin(x1 * x2) + x3 * x7 * x9 - Math.exp(x6 - x10) + 3 * Math.pow(x5, 2) - x6 * (x8 + 1) + 10.886272036407019994;
        funcSys[2] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> x1 - x2 + x3 - x4 + x5 - x6 + x7 - x8 + x9 - x10 - 3.1361904761904761904;
        funcSys[3] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 2 * Math.cos(x4 - x9) + x5 / (x3 + x1) - Math.sin(Math.pow(x2, 2)) + Math.pow(Math.cos(x7 * x10), 2) - x8 - 0.170747270502230475;
        funcSys[4] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> Math.sin(x5) + 2 * x8 * (x3 + x1) - Math.exp(-x7 * (x6 - x10)) + 2 * Math.cos(x2) - 1 / (x4 - x9) - 0.368589627310127786;
        funcSys[5] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> Math.exp(x1 - x4 - x9) + Math.pow(x5, 2) / x8 + 0.5 * Math.cos(3 * x2 * x10) - x3 * x6 + 2.049108601677187511;
        funcSys[6] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> Math.pow(x2, 3) * x7 - Math.sin(x10 / x5 + x8) + (x1  - x6) * Math.cos(x4) + x3 -  0.738043007620279801;
        funcSys[7] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> x5 * Math.pow((x1 - 2 * x6), 2) - 2 * Math.sin(x3 - x9) + 1.5 * x4 - Math.exp(x2 * x7 + x10) + 3.566832198969380904;
        funcSys[8] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 7 / x6 + Math.exp(x5 + x4) - 2 * x2 * x8 * x10 * x7 + 3 * x9 - 3 * x1 - 8.439473450838325749;
        funcSys[9] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> x10 * x1 + x9 * x2 - x8 * x3 + Math.sin(x4 + x5 + x6) * x7 - 0.78238095238095238096;

        Func[][] jacobiMatrix = new Func[10][10];

        jacobiMatrix[0][0] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -x2 * Math.sin(x1 * x2);
        jacobiMatrix[0][1] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -x1 * Math.sin(x1 * x2);
        jacobiMatrix[0][2] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 3 * Math.exp(-3 * x3);
        jacobiMatrix[0][3] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> Math.pow(x5, 2);
        jacobiMatrix[0][4] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 2 * x4 * x5;
        jacobiMatrix[0][5] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -1;
        jacobiMatrix[0][6] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 0;
        jacobiMatrix[0][7] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -2 * Math.cosh(2 * x8) * x9;
        jacobiMatrix[0][8] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -Math.sinh(2 * x8);
        jacobiMatrix[0][9] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 2;

        jacobiMatrix[1][0] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> x2 * Math.cos(x1 * x2);
        jacobiMatrix[1][1] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> x1 * Math.cos(x1 * x2);
        jacobiMatrix[1][2] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> x9 * x7;
        jacobiMatrix[1][3] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 0;
        jacobiMatrix[1][4] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 6 * x5;
        jacobiMatrix[1][5] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -Math.exp(x6 - x10) - x8 - 1;
        jacobiMatrix[1][6] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> x3 * x9;
        jacobiMatrix[1][7] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -x6;
        jacobiMatrix[1][8] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> x3 * x7;
        jacobiMatrix[1][9] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> Math.exp(x6 - x10);

        jacobiMatrix[2][0] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 1;
        jacobiMatrix[2][1] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -1;
        jacobiMatrix[2][2] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 1;
        jacobiMatrix[2][3] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -1;
        jacobiMatrix[2][4] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 1;
        jacobiMatrix[2][5] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -1;
        jacobiMatrix[2][6] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 1;
        jacobiMatrix[2][7] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -1;
        jacobiMatrix[2][8] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 1;
        jacobiMatrix[2][9] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -1;

        jacobiMatrix[3][0] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -x5 / Math.pow(x3 + x1, 2);
        jacobiMatrix[3][1] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -2 * Math.cos(Math.pow(x2, 2)) * x2;
        jacobiMatrix[3][2] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -x5 / Math.pow(x3 + x1, 2);
        jacobiMatrix[3][3] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -2 * Math.sin(x4 - x9);
        jacobiMatrix[3][4] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 1.0 / (x3 + x1);
        jacobiMatrix[3][5] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 0;
        jacobiMatrix[3][6] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -2 * Math.cos(x7 * x10) * Math.sin(x7 * x10) * x10;
        jacobiMatrix[3][7] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -1;
        jacobiMatrix[3][8] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 2 * Math.sin(x4 - x9);
        jacobiMatrix[3][9] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -2 * x7 * Math.cos(x7 * x10) * Math.sin(x7 * x10);

        jacobiMatrix[4][0] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 2 * x8;
        jacobiMatrix[4][1] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -2 * Math.sin(x2);
        jacobiMatrix[4][2] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 2 * x8;
        jacobiMatrix[4][3] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> Math.pow(x4 - x9, -2);
        jacobiMatrix[4][4] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> Math.cos(x5);
        jacobiMatrix[4][5] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> x7 * Math.exp(-x7 * (x6 - x10));
        jacobiMatrix[4][6] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> (x6 - x10) * Math.exp(-x7 * (x6 - x10));
        jacobiMatrix[4][7] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 2 * x3 + 2 * x1;
        jacobiMatrix[4][8] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -Math.pow(x4 - x9, -2);
        jacobiMatrix[4][9] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -x7 * Math.exp(-x7 * (x6 - x10));

        jacobiMatrix[5][0] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> Math.exp(x1 - x4 - x9);
        jacobiMatrix[5][1] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -3.0 / 2.0 * Math.sin(3 * x10 * x2) * x10;
        jacobiMatrix[5][2] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) ->  -x6;
        jacobiMatrix[5][3] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -Math.exp(x1 - x4 - x9);
        jacobiMatrix[5][4] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 2 * x5 / x8;
        jacobiMatrix[5][5] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -x3;
        jacobiMatrix[5][6] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 0;
        jacobiMatrix[5][7] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -Math.pow(x5 / x8, 2);
        jacobiMatrix[5][8] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -Math.exp(x1 - x4 - x9);
        jacobiMatrix[5][9] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -3.0 / 2.0 * Math.sin(3 * x10 * x2) * x2;

        jacobiMatrix[6][0] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> Math.cos(x4);
        jacobiMatrix[6][1] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 3 * x7 * Math.pow(x2, 2);
        jacobiMatrix[6][2] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 1;
        jacobiMatrix[6][3] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> (x6 - x1) * Math.sin(x4);
        jacobiMatrix[6][4] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> x10 / Math.pow(x5, 2) * Math.cos(x10 / x5 + x8);
        jacobiMatrix[6][5] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -Math.cos(x4);
        jacobiMatrix[6][6] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> Math.pow(x2, 3);
        jacobiMatrix[6][7] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -Math.cos(x10 / x5 + x8);
        jacobiMatrix[6][8] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 0;
        jacobiMatrix[6][9] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -Math.cos(x10 / x5 + x8) / x5;

        jacobiMatrix[7][0] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 2 * x5 * (x1 - 2 * x6);
        jacobiMatrix[7][1] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -x7 * Math.exp(x2 * x7 + x10);
        jacobiMatrix[7][2] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -2 * Math.cos(x3 - x9);
        jacobiMatrix[7][3] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 1.5;
        jacobiMatrix[7][4] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> Math.pow(x1 - 2 * x6, 2);
        jacobiMatrix[7][5] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 4 * x5 * (2 * x6 - x1);
        jacobiMatrix[7][6] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -x2 * Math.exp(x2 * x7 + x10);
        jacobiMatrix[7][7] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 0;
        jacobiMatrix[7][8] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 2 * Math.cos(x3 - x9);
        jacobiMatrix[7][9] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -Math.exp(x2 * x7 + x10);

        jacobiMatrix[8][0] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -3;
        jacobiMatrix[8][1] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -2 * x8 * x10 * x7;
        jacobiMatrix[8][2] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 0;
        jacobiMatrix[8][3] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> Math.exp(x5 + x4);
        jacobiMatrix[8][4] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> Math.exp(x5 + x4);
        jacobiMatrix[8][5] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -7 / Math.pow(x6, 2);
        jacobiMatrix[8][6] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -2 * x2 * x8 * x10;
        jacobiMatrix[8][7] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -2 * x2 * x7 * x10;
        jacobiMatrix[8][8] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> 3;
        jacobiMatrix[8][9] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -2 * x2 * x7 * x8;

        jacobiMatrix[9][0] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> x10;
        jacobiMatrix[9][1] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> x9;
        jacobiMatrix[9][2] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -x8;
        jacobiMatrix[9][3] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> x7 * Math.cos(x4 + x5 + x6);
        jacobiMatrix[9][4] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> x7 * Math.cos(x4 + x5 + x6);
        jacobiMatrix[9][5] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> x7 * Math.cos(x4 + x5 + x6);
        jacobiMatrix[9][6] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> Math.sin(x4 + x5 + x6);
        jacobiMatrix[9][7] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> -x3;
        jacobiMatrix[9][8] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> x2;
        jacobiMatrix[9][9] = (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) -> x1;


        standartMethod(funcSys, jacobiMatrix, false);
        System.out.println();
        modifiedMethod(funcSys, jacobiMatrix, false);
        System.out.println();
        moreModified(funcSys, jacobiMatrix, false);
        System.out.println();
        modifiedWithK(funcSys, jacobiMatrix, false);

        System.out.println("x[4] = -0.2");
        System.out.println();

        standartMethod(funcSys, jacobiMatrix, true);
        System.out.println();
        modifiedMethod(funcSys, jacobiMatrix, true);
        System.out.println();
        moreModified(funcSys, jacobiMatrix, true);
        System.out.println();
        modifiedWithK(funcSys, jacobiMatrix, true);
    }


    private static void standartMethod(Func[] funcSys, Func[][] jacobiMatrix, boolean last) {
        System.out.println("Standart: ");
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(10);
        nf.setGroupingUsed(false);


        //Начальное приближение
        double[] x = {0.5, 0.5, 1.5, -1.0, -0.5, 1.5, 0.5, -0.5, 1.5, -1.5};
        if (last) x[4] = -0.2;

        double[] newX = new double[10];
        double[][] jacobian = new double[10][10];
        double[] funcs = new double[10];
        int counter = 0;
        double norm = 1;

        double start = System.nanoTime();
        while(norm > 0.000001) {
            //Подсчет количества итераций
            counter += 1;

            for (int i = 0; i < 10; ++i) {

                funcs[i] = -1 * funcSys[i].count(x[0], x[1], x[2], x[3], x[4], x[5], x[6], x[7], x[8], x[9]);
                for (int j = 0; j < 10; ++j) {
                    jacobian[i][j] = jacobiMatrix[i][j].count(x[0], x[1], x[2], x[3], x[4], x[5], x[6], x[7], x[8], x[9]);
                }
            }
            double[] delta = array_sys(jacobian, funcs);
            for (int i = 0; i < 10; ++i) newX[i] = delta[i] + x[i];

            norm = Math.abs(x[0] - newX[0]);
            for (int i = 0; i < 10; ++i) {
                double t = Math.abs(x[i] - newX[i]);
                if (t > norm) norm = t;
                x[i] = newX[i];
            }
        }
        double end = System.nanoTime() - start;
        System.out.println(counter + " iters");
        System.out.println(end / 1000000 + " millis");
        for (double i : x) System.out.print(nf.format(i) + "   ");
        System.out.println();
    }

    private static void modifiedMethod(Func[] funcSys, Func[][] jacobiMatrix, boolean last) {
        System.out.println("Modified: ");
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(10);
        nf.setGroupingUsed(false);

        double[] x = {0.5, 0.5, 1.5, -1.0, -0.5, 1.5, 0.5, -0.5, 1.5, -1.5};
        if (last) x[4] = -0.2;

        double[] newX = new double[10];
        double[][] jacobian = new double[10][10];
        double[] funcs = new double[10];
        int counter = 0;
        double norm = 1;

        double start = System.nanoTime();

        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
                jacobian[i][j] = jacobiMatrix[i][j].count(x[0], x[1], x[2], x[3], x[4], x[5], x[6], x[7], x[8], x[9]);
            }
        }
        int n = jacobian.length;
        double[][] P = new double[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i == j) P[i][i] = 1;
                else P[i][j] = 0;
            }
        }
        int[] count = {0};
        double[][] C = array_LUP(jacobian, P, count);
        double[][] L = new double[n][n];
        double[][] U = new double[n][n];
        array_countLU(C, L, U);

        while(norm > 0.000001) {
            counter += 1;
            for (int i = 0; i < 10; ++i) {
                funcs[i] = -1 * funcSys[i].count(x[0], x[1], x[2], x[3], x[4], x[5], x[6], x[7], x[8], x[9]);
            }
            double[] b = MV(P, funcs);
            double[] delta = array_countSystem(L, U, b);
            for (int i = 0; i < 10; ++i) newX[i] = delta[i] + x[i];

            norm = Math.abs(x[0] - newX[0]);
            for (int i = 0; i < 10; ++i) {
                double t = Math.abs(x[i] - newX[i]);
                if (t > norm) norm = t;
                x[i] = newX[i];
            }
        }
        double end = System.nanoTime() - start;
        System.out.println(counter + " iters");
        System.out.println(end / 1000000 + " millis");
        for (double i : x) System.out.print(nf.format(i) + "   ");
        System.out.println();
    }

    private static void moreModified(Func[] funcSys, Func[][] jacobiMatrix, boolean last) {
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(10);
        nf.setGroupingUsed(false);

        double[] newX = new double[10];
        double[][] jacobian = new double[10][10];
        double[] funcs = new double[10];
        double minTime = 1000;
        int iter = 0;
        int st;
        int stop;
        if (last) {
            st = 5;
            stop = 10;
        }
        else {
            st = 2;
            stop = 7;
        }
        for (int k = st; k < stop; ++k) {
            System.out.println("Fix after " + k + " step: ");
            double[] x = {0.5, 0.5, 1.5, -1.0, -0.5, 1.5, 0.5, -0.5, 1.5, -1.5};
            if (last) x[4] = -0.2;

            boolean err = false;
            int counter = 0;
            double norm = 1;
            double start = System.nanoTime();

            for (int i = 0; i < 10; ++i) {
                for (int j = 0; j < 10; ++j) {
                    jacobian[i][j] = jacobiMatrix[i][j].count(x[0], x[1], x[2], x[3], x[4], x[5], x[6], x[7], x[8], x[9]);
                }
            }
            int n = jacobian.length;
            double[][] P = new double[n][n];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    if (i == j) P[i][i] = 1;
                    else P[i][j] = 0;
                }
            }
            int[] count = {0};
            double[][] C = array_LUP(jacobian, P, count);
            double[][] L = new double[n][n];
            double[][] U = new double[n][n];
            array_countLU(C, L, U);

            while(norm > 0.000001) {
                counter += 1;
                for (int i = 0; i < 10; ++i) {
                    funcs[i] = -1 * funcSys[i].count(x[0], x[1], x[2], x[3], x[4], x[5], x[6], x[7], x[8], x[9]);
                }
                if (counter <= k && counter > 0) {
                    for (int i = 0; i < 10; ++i) {
                        for (int j = 0; j < 10; ++j) {
                            jacobian[i][j] = jacobiMatrix[i][j].count(x[0], x[1], x[2], x[3], x[4], x[5], x[6], x[7], x[8], x[9]);
                        }
                    }
                    for (int i = 0; i < n; ++i) {
                        for (int j = 0; j < n; ++j) {
                            if (i == j) P[i][i] = 1;
                            else P[i][j] = 0;
                        }
                    }
                    C = array_LUP(jacobian, P, count);
                    array_countLU(C, L, U);
                }
                double[] b = MV(P, funcs);
                double[] delta = array_countSystem(L, U, b);
                for (int i = 0; i < 10; ++i) newX[i] = delta[i] + x[i];

                norm = Math.abs(x[0] - newX[0]);
                for (int i = 0; i < 10; ++i) {
                    double t = Math.abs(x[i] - newX[i]);
                    if (t > norm) norm = t;
                    x[i] = newX[i];
                }
                if (counter > 200) {
                    System.out.println("Error");
                    System.out.println();
                    err = true;
                    break;
                }
            }
            double end = (System.nanoTime() - start) / 1000000;
            if (!err) {
                System.out.println(counter + " iters");
                System.out.println(end + " millis");
                for (double i : x) System.out.print(nf.format(i) + "   ");
                System.out.println();
                System.out.println();
            }

            if (end < minTime && !last) {
                minTime = end;
                iter = k;
            }
        }
        if (!last) System.out.println("The best:  " + iter + " standart iters. Time: " + minTime + " ms");
    }

    private static void modifiedWithK(Func[] funcSys, Func[][] jacobiMatrix, boolean last) {

        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(10);
        nf.setGroupingUsed(false);

        double[] newX = new double[10];
        double[][] jacobian = new double[10][10];
        double[] funcs = new double[10];

        for (int k = 2; k < 10; ++k) {
            System.out.println("Count every " + k + " iters:");
            int counter = 0;
            double[] x = {0.5, 0.5, 1.5, -1.0, -0.5, 1.5, 0.5, -0.5, 1.5, -1.5};
            if (last) x[4] = -0.2;
            double norm = 1;
            int iters = 0;
            double start = System.nanoTime();
            for (int i = 0; i < 10; ++i) {
                for (int j = 0; j < 10; ++j) {
                    jacobian[i][j] = jacobiMatrix[i][j].count(x[0], x[1], x[2], x[3], x[4], x[5], x[6], x[7], x[8], x[9]);
                }
            }
            int n = jacobian.length;
            double[][] P = new double[n][n];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    if (i == j) P[i][i] = 1;
                    else P[i][j] = 0;
                }
            }
            int[] count = {0};
            double[][] C = array_LUP(jacobian, P, count);
            double[][] L = new double[n][n];
            double[][] U = new double[n][n];
            array_countLU(C, L, U);

            while(norm > 0.000001) {
                iters += 1;
                for (int i = 0; i < 10; ++i) {
                    funcs[i] = -1 * funcSys[i].count(x[0], x[1], x[2], x[3], x[4], x[5], x[6], x[7], x[8], x[9]);
                }
                if (counter == k) {
                    for (int i = 0; i < 10; ++i) {
                        for (int j = 0; j < 10; ++j) {
                            jacobian[i][j] = jacobiMatrix[i][j].count(x[0], x[1], x[2], x[3], x[4], x[5], x[6], x[7], x[8], x[9]);
                        }
                    }
                    for (int i = 0; i < n; ++i) {
                        for (int j = 0; j < n; ++j) {
                            if (i == j) P[i][i] = 1;
                            else P[i][j] = 0;
                        }
                    }
                    C = array_LUP(jacobian, P, count);
                    array_countLU(C, L, U);
                    counter = 0;
                }
                double[] b = MV(P, funcs);
                double[] delta = array_countSystem(L, U, b);
                for (int i = 0; i < 10; ++i) newX[i] = delta[i] + x[i];

                norm = Math.abs(x[0] - newX[0]);
                for (int i = 0; i < 10; ++i) {
                    double t = Math.abs(x[i] - newX[i]);
                    if (t > norm) norm = t;
                    x[i] = newX[i];
                }
                counter += 1;
            }
            double end = (System.nanoTime() - start) / 1000000;
            System.out.println(iters + " iterations");
            System.out.println(end + " millis");
            for (double i : x) System.out.print(nf.format(i) + "   ");
            System.out.println();
            System.out.println();
        }
    }

    private static double[][] array_LUP(double[][] A, double[][] P, int[] counter) {
        int n = A.length;
        double[][] C = new double[n][n];
        for (int i = 0; i < n; ++i) C[i] = A[i].clone();

        for (int i = 0; i < n; ++i) {
            double max = 0;
            int index = i;
            for (int j = i; j < n; ++j) {
                if (Math.abs(A[j][i]) > max) {
                    max = Math.abs(A[j][i]);
                    index = j;
                }
            }
            if (index != i) {
                counter[0] += 1;
                double[] temp = P[i];
                P[i] = P[index];
                P[index] = temp;
                double[] tempV = C[i];
                C[i] = C[index];
                C[index] = tempV;
            }
            for (int j = i + 1; j < n; ++j) {
                C[j][i] = C[j][i] / C[i][i];
            }
            for (int j = i + 1; j < n; ++j) {
                for (int k = i + 1; k < n; ++k) {
                    C[j][k] -= C[j][i] * C[i][k];
                }
            }
        }
        return C;
    }

    private static void array_countLU(double[][] C, double[][] L, double[][] U) {
        int n = C.length;
        for (int i = 0; i < n; ++i) C[i][i] += 1;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j <= i; ++j) {
                if (i == j) L[i][j] = 1;
                else L[i][j] = C[i][j];
            }
            for (int j = i; j < n; ++j) {
                if (i == j) U[i][i] = C[i][i] - 1;
                else U[i][j] = C[i][j];
            }
        }
    }

    private static double[] array_countSystem(double[][] L, double[][] U, double[] b) {
        int n = L.length;
        double[] x = new double[n];
        double[] y = new double[n];

        for (int i = 0; i < n; ++i) {
            double sum = 0;
            for (int j = 0; j < i; ++j) {
                sum += L[i][j] * y[j];
            }
            y[i] = b[i] - sum;
        }

        for (int i = n - 1; i >= 0; --i) {
            double sum = 0;
            for (int j = i + 1; j < n; ++j) {
                sum += U[i][j] * x[j];
            }
            x[i] = (y[i] - sum) / U[i][i];
        }
        return x;
    }

    private static double[] MV(double[][] A, double[] b) {
        int n = A.length;
        double[] res = new double[n];
        for (int i = 0; i < n; ++i) {
            double sum = 0;
            for (int j = 0; j < n; ++j) {
                sum += A[i][j] * b[j];
            }
            res[i] = sum;
        }
        return res;
    }

    private static double[] array_sys(double[][] jacobi, double[]f) {
        int n = jacobi.length;
        //Создаем единичную матрицу P 10х10
        double[][] P = new double[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i == j) P[i][i] = 1;
                else P[i][j] = 0;
            }
        }
        int[] counter = {0};
        double[][] C = array_LUP(jacobi, P, counter);
        double[][] L = new double[n][n];
        double[][] U = new double[n][n];
        array_countLU(C, L, U);
        double[] b = MV(P, f);
        double[] res = array_countSystem(L, U, b);

        return res;
    }





}