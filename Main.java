class Main{
	public static void main(String args[]){
		Retangulo ret;
		ret = new Retangulo(15,15);

		System.out.println("| " ret.altura + " x "+ ret.largura + " |");
		System.out.println("Area = " + ret.Area());
		System.out.println("Perimetro = " + ret.Perimetro());
	}
}
