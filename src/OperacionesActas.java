import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class OperacionesActas {

    /**
     *
     */
    private Set<Acta> listaActas = new HashSet<>();

    private BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public void Menu() throws IOException {

        int opcion = 0;

        while (opcion != 5) {

            System.out.println("Selecione una opcion");
            System.out.println("1- Agregar acta");
            System.out.println("2- Consultar actas");
            System.out.println("3- Modificar un acta");
            System.out.println("4- Eliminar un acta");
            System.out.println("5- Salir");
            System.out.println("Ingrese una opcion:");

            opcion = Integer.parseInt(entrada.readLine());

            switch (opcion) {
                case 1:
                    agregarActa();
                    break;
                case 2:
                    consultarActas();
                    break;
                case 3:
                    modificarActa();
                    break;
                case 4:
                    eliminarActa();
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        }

    }

    private void agregarActa() {
        Acta acta = new Acta();

        try {
            String sexo = "";
            int nroDpto = 0;
            int nroCosto = 0;

            System.out.println("Ingrese numero de acta:");
            acta.setNroActa(Integer.parseInt(entrada.readLine()));

            System.out.println("Ingrese numero de tomo:");
            acta.setNroTomo(Integer.parseInt(entrada.readLine()));

            System.out.println("Ingrese el nro de folio:");
            acta.setNroFolio(Integer.parseInt(entrada.readLine()));

            System.out.println("Ingrese nombre Completo:");
            acta.setNombrePersona(entrada.readLine());

            while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                System.out.println("Ingrese el sexo:");
                sexo = entrada.readLine();
            }
            acta.setSexoPersona(sexo);


            while (nroDpto < 1 || nroDpto > 17) {
                System.out.println("Ingrese el nro del dpto. (1-17):");
                nroDpto = Integer.parseInt(entrada.readLine());

            }
            acta.setDepartamento(nroDpto);

            
            while (nroCosto < 1) {
                System.out.println("Ingrese el costo del documento (mayor o igual a 0):");
                nroCosto = Integer.parseInt(entrada.readLine());
            }
            acta.setCosto(nroCosto);

            if (listaActas.add(acta)) {
                System.out.println("Acta agregada");
                return;
            } else {
                System.err.println("Acta ya existe");
            }

        } catch (Exception e) {
            System.err.println("Error inesperado : " + e.getMessage());
        }

    }

    private void eliminarActa() {
        Acta actaELiminar = new Acta();

        try {
            int nroDpto = 0;
            System.out.println("Ingrese numero de acta:");
            actaELiminar.setNroActa(Integer.parseInt(entrada.readLine()));

            System.out.println("Ingrese numero de tomo:");
            actaELiminar.setNroTomo(Integer.parseInt(entrada.readLine()));

            System.out.println("Ingrese el nro de folio:");
            actaELiminar.setNroFolio(Integer.parseInt(entrada.readLine()));

            while (nroDpto < 1 || nroDpto > 17) {
                System.out.println("Ingrese el nro del dpto. (1-17):");
                nroDpto = Integer.parseInt(entrada.readLine());

            }
            actaELiminar.setDepartamento(nroDpto);

            
            boolean actaELiminada = listaActas.removeIf(ac -> ac.equalsForRemove(actaELiminar));
            if (actaELiminada) {
                System.out.println("Acta Eliminada");
                return;
            } else {
                System.err.println("No se pudo eliminar el Acta");
            }

        } catch (Exception e) {
            System.err.println("Error inesperado : " + e.getMessage());
        }

    }

    private void modificarActa() {
        // TODO Auto-generated method stub

    }

    private void consultarActas() {
        // TODO Auto-generated method stub

    }
}
