// José Gustavo Victor Pinheiro Alencar 14793765
// Manassés Arange de Moura 15474205
// Carolina Gomes Guerreiro 15445453



import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt(); 
        int n2 = scanner.nextInt(); 
        int n3 = scanner.nextInt(); 
        int n4 = scanner.nextInt(); 
        List<Map<String, String>> records = Files.lines(Paths.get("dados.csv"))
                .map(line -> line.split(","))
                .map(values -> {
                    Map<String, String> map = new HashMap<>();
                    map.put("Country", values[0]);
                    map.put("Confirmed", values[1]);
                    map.put("Deaths", values[2]);
                    map.put("Recovered", values[3]);
                    map.put("Active", values[4]);
                    return map;
                })
                .collect(Collectors.toList());

        // soma do Active aonde Confirmed >= n1
        int somaActive = records.stream()
                .filter(r -> Integer.parseInt(r.get("Confirmed")) >= n1)
                .mapToInt(r -> Integer.parseInt(r.get("Active")))
                .sum();
        System.out.println(somaActive);

        // wntre os n2 maiores Active, somar Deaths dos n3 com menor Confirmed
        List<Map<String, String>> topActive = records.stream()
                .sorted((a, b) -> Integer.compare(
                        Integer.parseInt(b.get("Active")),
                        Integer.parseInt(a.get("Active"))))
                .limit(n2)
                .collect(Collectors.toList());

        int somaDeaths = topActive.stream()
                .sorted(Comparator.comparingInt(r -> Integer.parseInt(r.get("Confirmed"))))
                .limit(n3)
                .mapToInt(r -> Integer.parseInt(r.get("Deaths")))
                .sum();
        System.out.println(somaDeaths);

        // top n4 Confirmed, nomes em ordem alfabética
        List<String> topConfirmed = records.stream()
                .sorted((a, b) -> Integer.compare(
                        Integer.parseInt(b.get("Confirmed")),
                        Integer.parseInt(a.get("Confirmed"))))
                .limit(n4)
                .map(r -> r.get("Country"))
                .sorted()
                .collect(Collectors.toList());

        topConfirmed.forEach(System.out::println);
    }
}
