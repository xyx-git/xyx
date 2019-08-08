package chapter8_printer;

public class Test {

	public static void main(String[] args) {
		Printer printer=new DotMatrixtPrinter();
		printer.printer();
		printer=new InkpetPrinter();
		printer.printer();
		printer=new LaserPrinter();
		printer.printer();
	}

}
