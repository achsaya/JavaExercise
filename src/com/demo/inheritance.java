package com.demo;
import java.util.Scanner;
import java.util.Arrays;


class meanmode {
    int a[] = new int[4];
    int n;
    int i, sum = 0;

    public float mean(int[] a, int n) {
        for (i = 0; i < n; i++)
            sum += a[i];
        float mean = sum / n;
        return mean;
    }


    public float mode(int[] a, int n) {
        int maxvalue = 0;
        int maxcount = 0;
        for (i = 0; i < n; ++i) {
            int count = 0;
            for (int j = 0; j < n; ++j) {
                if (a[j] == a[i])
                    ++count;
            }

            if (count > maxcount) {
                maxcount = count;
                maxvalue = a[i];
            }
        }
        return maxvalue;
    }
}

class medianstd extends meanmode {
        public double median(int[] a, int n) {
            Arrays.sort(a);
            if (n % 2 != 0)
                return a[n / 2];

            return (double) (a[(n - 1) / 2] + a[n / 2]) / 2.0;

        }

        public double std(int[] a, int n) {
            double sum = 0, mean, sq, res, standardDeviation = 0;

            for (int i = 0; i < n; i++) {
                sum = sum + a[i];
            }

            mean = sum / (n);

            for (int i = 0; i < n; i++) {

                standardDeviation
                        = standardDeviation + Math.pow((a[i] - mean), 2);

            }

            sq = standardDeviation / n;
            res = Math.sqrt(sq);
            return res;
        }
    }

    public class inheritance {
        public static void main(String[] args) {
            medianstd d = new medianstd();
            Scanner sc = new Scanner(System.in);
            int[] a = new int[4];
            int i = 0;
            System.out.println("Enter the elements of the array: ");
            for (i = 0; i < 4; i++) {
//reading array elements from the user
                a[i] = sc.nextInt();
            }
            System.out.println("MEAN: "+d.mean(a, 4));
            System.out.println("MODE: "+d.mode(a, 4));
            System.out.println("MEDIAN: "+d.median(a, 4));
            System.out.println("STD "+d.std(a, 4));

        }
    }

