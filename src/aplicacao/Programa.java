package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidade.Circulo;
import entidade.Retangulo;
import entidade.Shape;

public class Programa {

	public static void main(String[] args) {
		
		Retangulo ret = new Retangulo(2.0, 3.0);
		List <Shape>lista = new ArrayList<Shape>();
		
		List <Circulo>listaCir = new ArrayList<>();
		
		Circulo cir = new Circulo(2);
		lista.add(ret);
		lista.add(cir);
		listaCir.add(cir);
	System.out.println("Soma das áreas: "+ somaArea(lista));
	
	System.out.println("Soma das áreas: "+ somaArea(listaCir));
		
	
		
		

	}

	public static double somaArea(List<? extends Shape> lista2) {
		double soma = 0;
		for (Shape x : lista2) {
			soma = soma + x.area();
		}
		return soma;
	}

}
