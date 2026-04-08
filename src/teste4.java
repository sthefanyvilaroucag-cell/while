void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("escolha um numero");
    int numerousuario = sc.nextInt();
    int resultado = 0;
    int num = 1;

    while (num <= numerousuario){
        IO.println(resultado);
        resultado = resultado + num;
        num++;

    }




}