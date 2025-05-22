package supriya;

import java.util.Scanner;

class Multiplication extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + "*5=" + (i * 5));
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

class Prime extends Thread {
    int limit;

    Prime(int limit) {
        this.limit = limit;
    }

    public void run() {
        int j;
        try {
            int n = 2, i = 1;
            while (i <= limit) {
                int f = 1;
                for (j = 2; j <= n / 2; j++) {
                    if (n % j == 0) {
                        f = 0;
                        break;
                    }
                }
                if (f == 1) {
                    System.out.println("Prime number: " + n);
                    i++;
                }
                n++;
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

class MultiPrime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = sc.nextInt();

        Multiplication m = new Multiplication();
        m.start();

        try {
            m.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Prime p = new Prime(limit);
        p.start();

        sc.close();
    }
}
