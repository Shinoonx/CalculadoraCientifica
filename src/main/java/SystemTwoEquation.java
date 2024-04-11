public class SystemTwoEquation {
    public static void main(String[] args) {
            /* ax + by = c;
            x = (c - by)/a
            dx + ey = f
            x = (f -ey)/d

            y = (c- ax)/b
            y = (f - dx)/e

            (f - dx)/e = (c- ax)/b
            fb -dbx = ce - aex
            (fb -ce) = x(db - ae)
            x = (fb -ce)/ (db -ae)

            (C -BY)/A = (F-EY)D
            (DC - BDY) = (FA -EAY)
            (DC - FA) = Y(BD - EA)
            Y = (DC -FA)/(BD -EA)
             */

        double A = 2;
        double B = 2;
        double C = 6;
        double D = 4;
        double E = 8;
        double F = 6;
        double x = ResolverX(A, B, C, D, E, F);
        double y = ResolverY(A, B, C, D, E, F);

        System.out.println("La solución es: x = " + x + ", y = " + y);
    }


    public static double ResolverX(double A, double B ,double C ,double D, double E, double F) {
        if ( C*B - A*E != 0 ) {
            return (F * B - C * E) / (D * B - A * E);
        } else {
            return 0;
        }
    }
    // X = (FB -CE)/ (CB -AE)
    // Y = (DC -FA)/(BD -EA)

    public static double ResolverY(double A, double B, double C, double D, double E, double F) {
        if ((B * D - E * A) != 0) {
            return (D * C - F * A) / (B * D - E * A);
        } else {
            return 0;
        }
    }
}

