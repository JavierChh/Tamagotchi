public class Tamagotchi {
    //Si el tamagotchi a fallecido hacerle un funeral
    private String nombre;
    private int salud;
    private int hambre;
    private int felicidad;

    public Tamagotchi(String nombre) {
        this.nombre = nombre;
        this.salud = 100;
        this.hambre = 0;
        this.felicidad = 100;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getSalud(){
        return this.salud;
    }

    public int getHambre(){
        return this.hambre;
    }

    public int getFelicidad(){
        return this.felicidad;
    }

    public void alimentar(){
        if(hambre > 0){
            hambre -= 20;
            if (hambre < 0){
                hambre = 0;
            }
            System.out.println( nombre + "ha sido alimentado. Hambre: " + hambre);
        }else{
            System.out.println(nombre + " no tiene hambre.");
        }
    }

    public void jugar(){
        if(felicidad < 100){
            felicidad += 20;
            if(felicidad > 100){
                felicidad = 100;
            }
            hambre += 10;
            if(hambre > 100){
                hambre = 100;
            }
            System.out.println(nombre + "ha jugado contigo. Felidad: " + felicidad + ", Hambre: " + hambre);
        }
        else{
            System.out.println(nombre + " ya está muy feliz.");
        }
    }

    public void dormir(){
        salud += 10;
        if(salud > 100){
            salud = 100;
        }
        hambre += 5;
        if (hambre > 100){
            hambre = 100;
        }
        System.out.println(nombre + " ha dormido. Salud: " + salud + ", Hambre: " + hambre);
    }

    public void comprobarEstado() {
        System.out.println("Estado de " + nombre + ":");
        System.out.println("Salud: " + salud);
        System.out.println("Hambre: " + hambre);
        System.out.println("Felicidad: " + felicidad);

        
    }

    public void pasarTiempo() {
        hambre += 10;
        felicidad -= 10;
        if (hambre > 100){
            hambre = 100;
        } 
        if (felicidad < 0){
            felicidad = 0;
        } 
        System.out.println("El tiempo ha pasado...");
        comprobarEstado();
    }

    public boolean isCriticalState(){
        if(salud == 0 || hambre == 100 || felicidad == 0){
            return true;
        }
        else{
            return false;
        }    
    }

}
