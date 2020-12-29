package gab.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.PortableInterceptor.DISCARDING;

import gab.entities.Auto;
import gab.entities.Moto;
import gab.entities.Vehiculo;

public class App {

	public static void main(String[] args) {
		List <Vehiculo> lista = new ArrayList<>();
		cargaDatos(lista);
		
		System.out.println("-------------------------------------");
		Vehiculo masCaro = lista.stream().max(Comparator.comparingDouble(Vehiculo::getPrecio)).get();
		Vehiculo masBarato = lista.stream().min(Comparator.comparingDouble(Vehiculo::getPrecio)).get();
		List <Vehiculo> letraY = lista.stream()
				.filter(x->x.getMarca().contains("Y"))
				.collect(Collectors.toList());
		
		System.out.println("Vehiculo mas caro " + masCaro.getMarca()+ " " + masCaro.getModelo());
		System.out.println("Vehiculo mas barato " + masBarato.getMarca()+ " " + masBarato.getModelo());		
		letraY.forEach(x->System.out.println("Vehiculo que contiene en el modelo la letra 'Y': " + x.getMarca()+ " " + x.getModelo() + " " + x.getPrecio()));
		
		System.out.println("-------------------------------------");
		System.out.println("Vehiculo ordenados por precio de mayor a menor");
		lista.stream().sorted(Comparator.comparingDouble(Vehiculo::getPrecio).reversed())
					  .forEach(x->System.out.println(x.getMarca() + " " + x.getModelo()));
		System.out.println("-------------------------------------");
	}
	
	private static void cargaDatos (List<Vehiculo> lista) {
		lista.add(new Auto("Peugeot", "206", 200000.00, 4));
		lista.add(new Auto("Peugeot", "208", 250000.00, 5));
		lista.add(new Moto("Honda", "Titan", 60000.00, "125cc"));
		lista.add(new Moto("Yamaha", "YBR", 80500.50, "160cc"));
		
	}

}
