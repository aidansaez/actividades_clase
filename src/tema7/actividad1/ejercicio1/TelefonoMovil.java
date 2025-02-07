package tema7.actividad1.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class TelefonoMovil {
    private String myNumber;
    private ArrayList<Contacto> myContacts = new ArrayList<>();

    public TelefonoMovil(ArrayList<Contacto> myContacts, String myNumber) {
        this.myContacts = new ArrayList<>();
        this.myNumber = myNumber;
    }

    public TelefonoMovil() {

    }

    public boolean addNewContact(Contacto contacto) {
        if (!myContacts.contains(contacto)) {
            myContacts.add(contacto);
            return true;
        } else return false;
    }

    public boolean updateContact(Contacto antiguoContacto, Contacto newContacto) {
        int index = myContacts.indexOf(antiguoContacto);
        if (index != -1) {
            myContacts.set(index, newContacto);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contacto contacto) {
        if (myContacts.contains(contacto)) {
            myContacts.remove(contacto);
            return true;
        } else return false;
    }

    public int findContact(Contacto contacto) {
        if (myContacts.contains(contacto)) {
            return myContacts.indexOf(contacto);
        } else return -1;
    }

    public int findContactPorNombre(String nombre) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contacto contacto = myContacts.get(i);
            if (contacto.nombre.equalsIgnoreCase(nombre)){
                return myContacts.indexOf(contacto);
            }
        }
        return -1;
    }

    public int findContactPorTlf(String tlf) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contacto contacto = myContacts.get(i);
            if (contacto.phoneNumber.equals(tlf)){
                return myContacts.indexOf(contacto);
            }
        }

        return -1;
    }

    public int findContactPorClaves(Contacto contacto) {
        if (myContacts.contains(contacto)) {
            return myContacts.indexOf(contacto);
        }

        return -1;
    }

    public Contacto queryContact(String nombre) {
        if (myContacts.contains(new Contacto(nombre))) {
            return myContacts.get(myContacts.indexOf(new Contacto(nombre)));
        } else return null;
    }

    public void printContactos() {
        if (myContacts.isEmpty()) {
            System.out.println("No hay contactos");
        } else {
            System.out.println("Lista de Contactos:");
            for (int i = 0; i < myContacts.size(); i++) {
                Contacto contacto = myContacts.get(i);
                System.out.println((i + 1) + ". " + contacto.nombre + " -> " + contacto.phoneNumber);
            }
        }
    }

    public void ordenar() {
        Collections.sort(myContacts);
    }

    public void borrarTodo() {
        for (int i = myContacts.size() - 1; i >= 0; i--) {
            myContacts.remove(i);
        }
        System.out.println("Borrado correctamente");
    }

    public void contarContactos() {
        int num = 0;
        for (int i = 0; i < myContacts.size(); i++) {
            num++;
        }
        System.out.println("Hay " + num + " contactos 👤");
    }
}
