package tema7.actividad5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    static Map<String, CuerpoCeleste> sistemaSolar = new HashMap<>();
    static Set<CuerpoCeleste> planetas = new HashSet<>();
    public static void main(String[] args) {
        // PLANETAS
        CuerpoCeleste Mercurio = new Planeta("Mercurio", 88, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Mercurio", Mercurio);
        planetas.add(Mercurio);

        CuerpoCeleste Venus = new Planeta("Venus", 225, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Venus", Venus);
        planetas.add(Venus);

        CuerpoCeleste LaTierra = new Planeta("La Tierra", 365, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("La Tierra", LaTierra);
        planetas.add(LaTierra);

        CuerpoCeleste Marte = new Planeta("Marte", 687, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Marte", Marte);
        planetas.add(Marte);

        CuerpoCeleste Jupiter = new Planeta("Jupiter", 4332, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Jupiter", Jupiter);
        planetas.add(Jupiter);

        CuerpoCeleste Saturno = new Planeta("Saturno", 10759, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Saturno", Saturno);
        planetas.add(Saturno);

        CuerpoCeleste Urano = new Planeta("Urano", 30660, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Urano", Urano);
        planetas.add(Urano);

        CuerpoCeleste Neptuno = new Planeta("Neptuno", 165, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Neptuno", Neptuno);
        planetas.add(Neptuno);

        CuerpoCeleste Pluton = new Planeta("Pluton", 248, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Pluton", Pluton);
        planetas.add(Pluton);

        // LUNAS
        CuerpoCeleste Luna = new Luna("Luna", 27, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Luna", Luna);
        LaTierra.addSatelite(Luna);

        CuerpoCeleste Deimos = new Luna("Deimos", 1.3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Deimos", Deimos);
        Marte.addSatelite(Deimos);

        CuerpoCeleste Phobos = new Luna("Phobos", 0.3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Phobos", Phobos);
        Marte.addSatelite(Phobos);

        CuerpoCeleste Io = new Luna("Io", 1.8, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Io", Io);
        Jupiter.addSatelite(Io);

        CuerpoCeleste Europa = new Luna("Europa", 3.5, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Europa", Europa);
        Jupiter.addSatelite(Europa);

        CuerpoCeleste Ganymede = new Luna("Ganymede", 7.1, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Ganymede", Ganymede);
        Jupiter.addSatelite(Ganymede);

        CuerpoCeleste Callisto = new Luna("Callisto", 16.7, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Callisto", Callisto);
        Jupiter.addSatelite(Callisto);

        System.out.println("Planetas:");
        for (CuerpoCeleste p : planetas) {
            System.out.println(p);
        }

        System.out.println("\nLunas de Marte:");
        for (CuerpoCeleste luna : Marte.getSatelites()) {
            System.out.println(luna);
        }

        Set<CuerpoCeleste> lunas = new HashSet<>();
        for (CuerpoCeleste p : planetas) {
            lunas.addAll(p.getSatelites());
        }

        System.out.println("\nTodas las lunas:");
        for (CuerpoCeleste luna : lunas) {
            System.out.println(luna);
        }

        Pluton = new Planeta("Pluton", 884, CuerpoCeleste.TipoCuerpoCeleste.PLANETA_ENANO);
        planetas.add(Pluton);

        System.out.println("\nPlanetas:");
        for (CuerpoCeleste p : planetas) {
            System.out.println(p);
        }

        System.out.println("\nDiferencia de lunas");
        lunas.removeAll(Jupiter.getSatelites());
        System.out.println(lunas);
    }
}
