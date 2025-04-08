package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.TipoDireccion;

public class Direccion {
    private TipoDireccion tipoDireccion;
    private String tipo;
    private String callePrincipal;
    private String calleSecundaria;
    private String numeracion;
    private String ciudad;
    private String provincia;
    private String pais;

    public Direccion() {}

    public Direccion(TipoDireccion tipoDireccion,String tipo, String callePrincipal, String calleSecundaria, String numeracion, String ciudad, String provincia, String pais) {
        this.tipoDireccion=tipoDireccion;
        this.tipo = tipo;
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.numeracion = numeracion;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
    }

    public TipoDireccion getTipoDireccion() {
        return tipoDireccion;
    }

    public void setTipoDireccion(TipoDireccion tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "tipoDireccion=" + tipoDireccion +
                ", tipo='" + tipo + '\'' +
                ", callePrincipal='" + callePrincipal + '\'' +
                ", calleSecundaria='" + calleSecundaria + '\'' +
                ", numeracion='" + numeracion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", provincia='" + provincia + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
