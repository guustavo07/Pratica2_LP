public class MatrizDiagonal {
    public static void main(String[] args) {
        int impar=1, diagonalPrincipal=0;
        int [][] matriz = new int [50][50];
        for(int i=0; i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz [i][j] = 0;
                if(i==j){
                    matriz[i][j] = impar;
                    diagonalPrincipal+=matriz[i][j];
                }
                impar+=2;
                System.out.printf("%d\t", matriz[i][j]); // pular coluna
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
        System.out.printf("A soma da diagonal principal é: %d", diagonalPrincipal);
    }
}