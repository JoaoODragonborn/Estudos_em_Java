package collections;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(5, "Rafaela");
		usuarios.put(3, "Rebeca");
		
		System.out.println(usuarios.size());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		
		usuarios.put(3, "Ribossomos");
		
		System.out.println(usuarios.values());
		
		System.out.println(usuarios.get(2));
		
		for(int chave: usuarios.keySet()) {
			System.out.print(chave);
		}
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " - ");
			System.out.println(registro.getValue());
		}
	}
}
