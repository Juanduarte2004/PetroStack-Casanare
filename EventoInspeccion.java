import java.time.LocalDateTime;

public class EventoInspeccion {
    private int id;
    private Pozo pozo;
    private TipoEvento tipoEvento;
    private String descripcion;
    private LocalDateTime fechaHora;

    public EventoInspeccion(int id, Pozo pozo, TipoEvento tipoEvento,
                           String descripcion, LocalDateTime fechaHora) {
        this.id = id;
        this.pozo = pozo;
        this.tipoEvento = tipoEvento;
        this.descripcion = descripcion;
        this.fechaHora = fechaHora;
    }

    public String toString() {
        return "ID: " + id +
                " | Pozo: " + pozo.getCodigo() +
                " | Municipio: " + pozo.getMunicipio() +
                " | Tipo: " + tipoEvento +
                " | Desc: " + descripcion +
                " | Fecha: " + fechaHora;
    }
}