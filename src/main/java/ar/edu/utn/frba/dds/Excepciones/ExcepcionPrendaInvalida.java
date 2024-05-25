package ar.edu.utn.frba.dds.Excepciones;

public class ExcepcionPrendaInvalida extends RuntimeException {
  public ExcepcionPrendaInvalida(String mensaje) {
    super("Error en la creacion de PRENDA: " + mensaje);
  }
}