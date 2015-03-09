class Retangulo {
    public double altura, largura;

    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public double Area(){
        double area;
        area = this.altura * this.largura;
        return area;
    }

    public double Perimetro(){
        double perimetro;
        perimetro = (this.altura*2) + (this.largura*2);
        return perimetro;
    }
}
