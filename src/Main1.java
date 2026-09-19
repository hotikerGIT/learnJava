void solve1() {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; ++i) {
        int num = sc.nextInt();
        list.add(num);
    }

    for (int i = 0; i < n; ++i) {
        System.out.print(list.get((n + i - 1) % n) + " ");
    }
}

boolean check(Stack<Integer> st) {
    if (st.size() < 3) return false;

    int same = st.peek();
    for (int i = 0; i < 3; ++i) {
        if (same != st.get(st.size() - 1 - i)) return false;
    }

    return true;
}

void solve2() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Stack<Integer> balls = new Stack<>();
    int res = 0;

    for (int i = 0; i < n; ++i) {
        int num = sc.nextInt();

        while (check(balls) && balls.peek() != num) {
            int same = balls.peek();

            while (!balls.isEmpty() && balls.peek() == same) {
                balls.pop();
                res++;
            }
        }

        balls.add(num);
    }

    while (check(balls)) {
        int same = balls.peek();

        while (!balls.isEmpty() && balls.peek() == same) {
            balls.pop();
            res++;
        }
    }

    System.out.println(res);
}

public class Strings {
    private Set<String> strings;

    public Strings() {
        strings = new HashSet<>();
    }

    public void add(String s) {
        strings.add(s);
    }

    public boolean has(String s) {
        return !strings.isEmpty() && strings.contains(s);
    }
}

void solve3() {
    Strings strings = new Strings();
    Scanner sc = new Scanner(System.in);

    while (true) {
        String type = sc.next();
        if (Objects.equals(type, "#")) break;

        String s = sc.next();

        if (Objects.equals(type, "+")) {
            strings.add(s);
        }

        if (Objects.equals(type, "?")) {
            System.out.println(strings.has(s) ? "YES" : "NO");
        }
    }
}

void solve4() {
    Set<Integer> bst = new HashSet<>();
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    while (num != 0) {
        bst.add(num);
        num = sc.nextInt();
    }

    System.out.println("YES");
}

void solve5() {
    Scanner sc = new Scanner(System.in);

    Map<String, Set<String>> cooperate = new HashMap<>();
    Map<String, String> extend = new HashMap<>();

    extend.put("read", "R");
    extend.put("write", "W");
    extend.put("execute", "X");

    int n = sc.nextInt();
    for (int i = 0; i < n; ++i) {
        String[] data = sc.nextLine().split(" ");

        for (int j = 1; j < data.length; ++j) {
            cooperate.get(data[j]).add(data[0]);
        }
    }

    int m = sc.nextInt();
    for (int i = 0; i < m; ++i) {
        String cmd = sc.next();
        String file = sc.next();

        String short_cmd = extend.get(cmd);

        System.out.println(cooperate.get(short_cmd).contains(file) ? "OK" : "Access denied");
    }
}

void solve6() {
    Map<String, Map<String, Integer>> database = new TreeMap<>();

    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
        String[] data = sc.next().split(" ");
        Map<String, Integer> person = database.get(data[0]);
        person.put(data[1], person.get(data[1]) + Integer.parseInt(data[2]));
    }
}

void main() {
    solve5();
}