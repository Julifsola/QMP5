package ar.edu.utn.frba.dds.Excepciones;

public class ExcepcionColorInvalido extends RuntimeException {
  public ExcepcionColorInvalido(String mensaja) {
    super("Error en la asignacion de COLOR: " + mensaja);
  }
}