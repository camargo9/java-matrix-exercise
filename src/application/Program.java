import entities.PositionX;

void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int m = sc.nextInt();
    int n = sc.nextInt();

    int[][] mat = new int[m][n];

    // Definindo valores da matriz
    for (int i=0; i<mat.length; i++) {
        for (int j=0; j<mat[i].length; j++) {
            mat[i][j] = sc.nextInt();
        }
    }

    // Lendo um número da matriz
    int x = sc.nextInt();
    List<PositionX> positionsList = new ArrayList<>();

    for (int i=0; i<mat.length; i++) {
        for (int j=0; j<mat[i].length; j++) {
            if (mat[i][j] == x) {
                positionsList.add(new PositionX(i, j));
            }
        }
    }

    // Imprimindo Up, Right, Down, Left
    for (PositionX pos : positionsList) {
        System.out.println("==========================");
        System.out.printf("Position: %d.%d\n", pos.getLine(), pos.getColumn());

        if (pos.getLine() > 0) {
            System.out.println("Up: " + mat[pos.getLine() - 1][pos.getColumn()]);
        }

        if (pos.getColumn() + 1 < mat[pos.getLine()].length) {
            System.out.println("Right: " + mat[pos.getLine()][pos.getColumn() + 1]);
        }

        if (pos.getLine() + 1 < mat.length) {
            System.out.println("Down: " + mat[pos.getLine() + 1][pos.getColumn()]);
        }

        if (pos.getColumn() > 0) {
            System.out.println("Left: " + mat[pos.getLine()][pos.getColumn() - 1]);
        }
    }

    sc.close();
}