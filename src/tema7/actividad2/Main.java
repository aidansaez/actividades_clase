package tema7.actividad2;

import java.util.*;

public class Main {
    public static void imprimirLista(LinkedList<Cancion> lista) {
        Iterator<Cancion> it = lista.iterator();
        int i = 1;
        System.out.println("Lista de Reproducción:");
        while (it.hasNext()) {
            System.out.println(i++ + ". " + it.next());
        }
    }

    public static void imprimirMenu() {
        System.out.println("""
                0. Salir de la lista de reproducción
                1. Reproducir siguiente canción en la lista
                2. Reproducir la canción previa de la lista
                3. Repetir la canción actual
                4. Imprimir la lista de canciones en la playlist
                5. Volver a imprimir el menú.
                6. Eliminar cancion actual
                7. Imprimir todos los albumes con sus canciones
                8. Imprimir canciones por album""");
    }

    public static void play(LinkedList<Cancion> listaRep, ArrayList<Album> albumes) {
        Scanner sc = new Scanner(System.in);
        ListIterator<Cancion> it = (ListIterator<Cancion>) listaRep.iterator();
        int opc;
        boolean continuar = true;
        boolean haciaAdelante = true;
        imprimirMenu();

        do {
            System.out.print("Elige una opción: ");
            opc = sc.nextInt();

            switch (opc) {
                case 0:
                    continuar = false;
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    if (!haciaAdelante) {
                        if (it.hasNext()) {
                            it.next();
                        }
                    }

                    if (it.hasNext()) {
                        System.out.println(it.next());
                    } else System.out.println("Has llegado al final, no hay más canciones");

                    haciaAdelante = true;
                    break;
                case 2:
                    if (haciaAdelante) {
                        if (it.hasPrevious()) {
                            it.previous();
                        }
                    }

                    if (it.hasPrevious()) {
                        System.out.println(it.previous());
                    } else System.out.println("Has llegado al principio, no hay más canciones");

                    haciaAdelante = false;
                    break;
                case 3:
                    if (haciaAdelante) {
                        it.previous();
                        System.out.println(it.next());
                    } else {
                        it.next();
                        System.out.println(it.previous());
                    }
                    break;
                case 4:
                    imprimirLista(listaRep);
                    break;
                case 5:
                    imprimirMenu();
                    break;
                case 6:
                    if (!listaRep.isEmpty()) {
                        it.remove();
                        System.out.println("borrao ✅");
                        if (it.hasNext()) {
                            System.out.println(it.next());
                        } else {
                            System.out.println(it.previous());
                            haciaAdelante = false;
                        }
                    } else System.out.println("La lista esta vacía");
                    break;
                case 7:
                    for (int i = 0; i < albumes.size(); i++) {
                        System.out.println("Album: " + albumes.get(i).getNombre());
                        System.out.println("Canciones: ");
                        for (int j = 0; j < albumes.get(i).getCanciones().size(); j++) {
                            System.out.println("- " + albumes.get(i).getCanciones().get(j).toString());
                        }
                        System.out.println();
                    }
                    break;
                case 8:
                    System.out.println("Albumes: ");
                    for (int i = 0; i < albumes.size(); i++) {
                        System.out.println("- " + albumes.get(i).getNombre());
                    }

                    boolean nombreValido =  false;
                    Album album = null;

                    do {
                        System.out.print("Que album quieres imprimir? ");

                        if (sc.hasNextLine()) { // Limpia el buffer si hay datos pendientes
                            sc.nextLine();
                        }

                        String nombreAlbum = sc.nextLine();

                        for (int i = 0; i < albumes.size(); i++) {
                            album = albumes.get(i);
                            if (album.getNombre().equalsIgnoreCase(nombreAlbum)) {
                                nombreValido = true;
                                break;
                            }
                        }

                    } while (!nombreValido);

                    System.out.println("Album: " + album.getNombre());
                    for (int i = 0; i < album.getCanciones().size(); i++) {
                        System.out.println("- " + album.getCanciones().get(i).toString());
                    }
            }

            System.out.println();
        } while (continuar);
    }

    public static void main(String[] args) {
        ArrayList<Album> albumes = new ArrayList<>();
        Album dTMF = new Album("DEBi TiRAR MAs FoTOS", "Bad bunny");
        Album pM = new Album("Primera Musa", "Omar Courtz");

        LinkedList<Cancion> listaRep = new LinkedList<>();

        dTMF.addSong("KETU TeCRÉ", 4.10);
        dTMF.addSong("NUEVAYoL", 3.03);
        dTMF.addSong("VOY A LLeVARTE PA PR", 2.36);
        dTMF.addSong("BAILE INoLVIDABLE", 6.07);

        pM.addSong("P I E N S O E N S E X O", 3.33);
        pM.addSong("UNA NOTi", 2.30);
        pM.addSong("P o l v o s Q u e N o S e O l v i d a n", 3.04);
        pM.addSong("A L O C A - T", 2.58);

        albumes.add(dTMF);
        albumes.add(pM);

        dTMF.addToPlaylist("NUEVAYoL", listaRep);
        dTMF.addToPlaylist(1, listaRep);
        dTMF.addToPlaylist(3, listaRep);
        dTMF.addToPlaylist(4, listaRep);
        pM.addToPlaylist(1, listaRep);
        pM.addToPlaylist(2, listaRep);
        pM.addToPlaylist(3, listaRep);
        pM.addToPlaylist(4, listaRep);

        listaRep.sort(new Cancion(1, "a"));

        play(listaRep, albumes);
    }
}
