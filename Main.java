import java.util.Scanner;

public class Main {
    void main() {
        Obj1 obj1 = new Obj1();
        Obj2 obj2 = new Obj2();
        Obj3 obj3 = new Obj3();
        for (int i = 1; i <= 3; i++) {
            System.out.println("obj " + i + ":");
            for (int t = -6; t <= 6; t++) {
                double time = t;
                if (i == 1) {
                    obj1.xv = obj1.derivatex(time);
                    obj1.yv = obj1.derivatey(time);
                    System.out.print("t = " + t + " ,(");
                    System.out.printf("%.2f", obj1.xv);
                    System.out.print(", ");
                    System.out.printf("%.2f", obj1.yv);
                    System.out.print(") ");
                } else if (i == 2) {
                    obj2.xv = obj2.derivatex(time);
                    obj2.yv = obj2.derivatey(time);
                    System.out.print("t = " + t + " ,(");
                    System.out.printf("%.2f", obj2.xv);
                    System.out.print(", ");
                    System.out.printf("%.2f", obj2.yv);
                    System.out.print(") ");
                } else {
                    obj3.xv = obj3.derivatex(time);
                    obj3.yv = obj3.derivatey(time);
                    System.out.print("t = " + t + " ,(");
                    System.out.printf("%.2f", obj3.xv);
                    System.out.print(", ");
                    System.out.printf("%.2f", obj3.yv);
                    System.out.print(") ");
                }
            }
            System.out.print("\n");
        }
    }
}

class Obj1 {
    double xv, yv;

    public double fx(double x) {
        return x;
    }

    public double fy (double y) {
        return y * y;
    }

    public double derivatex (double t) {
        double h = 1e-6;
        return ((fx(t + h) - fx(t - h)) / (2 * h));
    }
    public double derivatey (double t) {
        double h = 1e-6;
        return ((fy(t + h) - fy(t - h)) / (2 * h));
    }
}

class Obj2 {
    double xv, yv;

    public double fx(double x) {
        return -x;
    }

    public double fy (double y) {
        return y * y;
    }

    public double derivatex (double t) {
        double h = 1e-6;
        return ((fx(t + h) - fx(t - h)) / (2 * h));
    }
    public double derivatey (double t) {
        double h = 1e-6;
        return ((fy(t + h) - fy(t - h)) / (2 * h));
    }
}

class Obj3 {
    double xv, yv;

    public double fx(double x) {
        return -x/2;
    }

    public double fy (double y) {
        return (y * y) / 4;
    }

    public double derivatex (double t) {
        double h = 1e-6;
        return ((fx(t + h) - fx(t - h)) / (2 * h));
    }
    public double derivatey (double t) {
        double h = 1e-6;
        return ((fy(t + h) - fy(t - h)) / (2 * h));
    }
}