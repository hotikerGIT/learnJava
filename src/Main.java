void solve1() {
    Scanner sc = new Scanner(System.in);
    int x = 1 << sc.nextInt();

    System.out.println(x);
}

void solve2() {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    double x = sc.nextDouble();
    double y = sc.nextDouble();

    if (y >= 0) {
        System.out.println(y <= 2 - x * x ? "YES" : "NO");
    } else {
        System.out.println((y <= 2 - x * x) & (y > x) ? "YES" : "NO");
    }
}

void solve3() {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();

    int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    if (x > 12 || x < 1 || y < 1 || y > month[x - 1]) {
        System.out.println(-1);
        return;
    }

    int day_sum = y;
    for (int i = 1; i < x; ++i) {
        day_sum += month[i - 1];
    }

    System.out.println(365 - day_sum);
}

void solve4() {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt(); int y = sc.nextInt(); int z = sc.nextInt();

    if (x <= y && x <= z) {
        if (y <= z) {
            System.out.println(x + " " + y + " " + z);
        } else {
            System.out.println(x + " " + z + " " + y);
        }

        return;
    }

    if (y <= x && y <= z) {
        if (x <= z) {
            System.out.println(y + " " + x + " " + z);
        } else {
            System.out.println(y + " " + z + " " + x);
        }

        return;
    }

    if (x <= y) {
        System.out.println(z + " " + x + " " + y);
    } else {
        System.out.println(z + " " + y + " " + x);
    }
}

void solve5() {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); int b = sc.nextInt();

    boolean is_negative_prod = (a < 0) ^ (b < 0);

    int abs_a = a < 0 ? -a : a;
    int abs_b = b < 0 ? -b : b;

    int prod = 0;
    for (int i = 0; i < abs_a; ++i) {
        prod += abs_b;
    }

    prod = is_negative_prod ? -prod : prod;
    System.out.println(prod);
}

void solve6() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    boolean[] bits = new boolean[32];
    int last_one = 0;

    for (int i = 0; i < 32; ++i) {
        bits[i] = (n & 1) == 1;
        n >>= 1;

        if (bits[i]) {
            last_one = i;
        }
    }

    for (int i = 0; i <= last_one; ++i) {
        System.out.print(bits[i] ? 1 : 0);
    }
}

void solve7() {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = sc.nextInt();

    switch (s) {
        case "North":
            System.out.println(0 + " " + n);
            break;

        case "South":
            System.out.println(0 + " " + -n);
            break;

        case "East":
            System.out.println(n + " " + 0);
            break;

        case "West":
            System.out.println(-n + " " + 0);
            break;
    }
}

void solve8() {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    for (char c : alphabet.toCharArray()) {
        int cnt = 0;

        for (char check : s.toCharArray()) {
            cnt += check == c ? 1 : 0;
        }

        if (cnt == 2) {
            System.out.println(c);
        }
    }
}

void main() {
    solve7();
}