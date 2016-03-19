/******************************************************************************
 *  Compilaci�n:  javac Matrix.java
 *  Ejecuci�n:    java Matrix
 *
 *  Creaci�n de matrices de largo MxN
 * @author  Francisco Capone
 * @version 1.0
 * @since   2016-03-18
 ******************************************************************************/

public class Matrix {
  private final int M; // N�mero de Filas
  private final int N; // N�mero de Columnas
  private final double[][] dato; // Arreglo de MxN para almacenar los datos

  /**
   * Constructor para generar una matriz de M x N cuyos valores son 0's
   *
   * @param  M  n�mero de filas
   * @param  N n�mero de columnas
  */
  public Matrix(int M, int N) {
    this.M = M;
    this.N = N;
    dato = new double[M][N];
  }

  /**
   * Constructor para generar una matriz de M x N usando n�meros aleatorios entre 0 y 1 para poblarla
   *
   * @param  M  n�mero de filas
   * @param  N n�mero de columnas
  */
  public static Matrix random(int M, int N) {
    Matrix RandomMatrix = new Matrix(M, N);
    for (int i = 0; i < M; i++)
      for (int j = 0; j < N; j++)
        RandomMatrix.dato[i][j] = Math.random();
    return RandomMatrix;
  }

  /**
   * M�todo para insertar un valor en una posici�n espec�fica
   *
   * @param  i �ndice de la fila
   * @param  j �ndice de la columna
   * @param  valor dato a almacenar
  */
  public Matrix insertValue(int i, int j, int valor) {
    Matrix A = this;
    A.dato[i][j] = valor;
    return A;
  }

  /**
   * M�todo para invertir los valores de 2 celdas
   *
   * @param  i �ndice de la fila de celda A
   * @param  j �ndice de la columna de celda A
   * @param  k �ndice de la columna de celda B
   * @param  l �ndice de la columna de celda B
  */
  private void swap(int i, int j, int k, int l) {
    double temp = dato[i][j];
    dato[i][j] = dato[k][l];
    dato[k][l] = temp;
  }

  /**
   * M�todo para mostrar la matriz por pantalla
   *
  */
  public void show() {
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++)
        System.out.printf("%9.0f ", dato[i][j]);
      System.out.println();
    }
    System.out.println();
  }

  public static void main(String[] args) {
    // Creaci�n de una matriz de largo 5x5 con valores aleatorios
    Matrix A = Matrix.random(5, 5);
    // Modificaci�n del valor contenido en la fila de �ndice 3 y columna de �ndice 3
    A.insertValue(3, 3, 69);
    // Mostrar en pantalla la matriz resultante
    A.show();
    // Invertir los valores de 2 celdas (valor de celda 3,3 por celda 4,4)
    A.swap(3, 3, 4, 4);
    // Mostrar en pantalla la matriz resultante
    A.show();
  }
}
