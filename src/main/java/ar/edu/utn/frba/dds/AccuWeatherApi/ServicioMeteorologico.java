package ar.edu.utn.frba.dds.AccuWeatherApi;

public interface ServicioMeteorologico {
  EstadoDelTiempo obtenerCondicionesClimaticas(String direccion);
}