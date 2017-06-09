class Program {
	public static void main(String args[]) {
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	int h;
	int g;
	int s;
	int summa;
	summa=13768;
	a=summa/5000;
	b=(summa-5000*a)/1000;
	c= (summa-5000*a-1000*b)/500;
	d=(summa-5000*a-1000*b-500*c)/100;
	e=(summa-5000*a-1000*b-500*c-100*d)/50;
	f=(summa-5000*a-1000*b-500*c-100*d-50*e)/10;
	h=(summa-5000*a-1000*b-500*c-100*d-50*e-10*f)/5;
	g=(summa-5000*a-1000*b-500*c-100*d-50*e-10*f-5*h)/2;
	s=(summa-5000*a-1000*b-500*c-100*d-50*e-10*f-5*h-g*2);
	
	System.out.println("5000 = " + a);
		System.out.println("1000 = " + b);
		System.out.println("500 = " + c);
		System.out.println("100 = " + d);
		System.out.println("50 = " + e);
		System.out.println("10 = " + f);
		System.out.println("5 = " + h);
		System.out.println("2 = " + g);
		System.out.println("1 = " + s);
	}
}