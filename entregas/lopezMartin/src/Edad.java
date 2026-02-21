import java.time.LocalDate;
import java.time.Period;

class Edad{

    private Period tiempoDeVida;

    public Edad(LocalDate fechaDeNacimiento){
        this.tiempoDeVida = Period.between(fechaDeNacimiento, LocalDate.now());
    }
}