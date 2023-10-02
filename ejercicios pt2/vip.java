public class vip {
    public static void main(String[] args) {
        
        Persona[] personas = new Persona[3];

        personas[0] = new Persona("Maria", 45, true);
        personas[1] = new Persona("Carlos", 26, false);
        personas[2] = new Persona("Roberto", 15, true);

        for (Persona persona : personas) {
            if (revisarInvitacion(persona.getEdad(), persona.getInvitacion())) {

                System.out.println("La persona " + persona.getNombre() + " puede ingresar");
            } else {
                System.out.println("la edad " + persona.getEdad());
                System.out.println("invitacion " + persona.getInvitacion());
                System.out.println("La persona " + persona.getNombre() + " no puede ingresar");
            }
        }
    }

    public static boolean revisarInvitacion(int edad, boolean invitacion) {
        return edad >= 18 && invitacion;
    }

    static class Persona {
        private String nombre;
        private int edad;
        private boolean invitacion;

        public Persona(String nombre, int edad, boolean invitacion) {
            this.nombre = nombre;
            this.edad = edad;
            this.invitacion = invitacion;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public boolean getPermiso() {
            return invitacion;
        }

    }

}