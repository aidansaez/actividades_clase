package tema4.actividad2.ej2_1;

public class ClienteVipMain {
    public static void main(String[] args) {
        ClienteVip clienteVip1 = new ClienteVip("aidan", 98);
        ClienteVip clienteVip2 = new ClienteVip("aidan", 78, "pedro@gmail.com", ClienteVip.TipoVip.GOLD);
        ClienteVip clienteVip3 = new ClienteVip();
        System.out.println(clienteVip1.getNombre() + clienteVip1.getLimiteCredito() + clienteVip1.getEmail());
        System.out.println(clienteVip2.getNombre() + clienteVip2.getLimiteCredito() + clienteVip2.getEmail());
        System.out.println(clienteVip3.getNombre());
    }
}
