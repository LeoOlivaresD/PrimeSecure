package com.duoc.primesecure.entites;
public class Mensajes {
    private Integer idMensaje;
    private Integer idUsuario;
    private String mensaje;

    public Mensajes() {
    }

    public Mensajes(Integer idMensaje, Integer idUsuario, String mensaje) {
        this.idMensaje = idMensaje;
        this.idUsuario = idUsuario;
        this.mensaje = mensaje;
    }

    public Integer getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(Integer idMensaje) {
        this.idMensaje = idMensaje;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Mensajes{" + "idMensaje=" + idMensaje + ", idUsuario=" + idUsuario + ", mensaje=" + mensaje + '}';
    }
    
}
