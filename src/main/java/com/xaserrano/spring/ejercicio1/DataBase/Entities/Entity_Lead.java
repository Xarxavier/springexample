package com.xaserrano.spring.ejercicio1.DataBase.Entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "`lead`", schema = "leads", catalog = "")
public class Entity_Lead {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "SSID")
    private String ssid;
    @Basic
    @Column(name = "Email")
    private String email;
    @Basic
    @Column(name = "Nombre")
    private String nombre;
    @Basic
    @Column(name = "Direccion")
    private String direccion;
    @Basic
    @Column(name = "`codpostal`")
    private String codPostal;
    @Basic
    @Column(name = "Telefono")
    private String telefono;
    @Basic
    @Column(name = "Privacidad")
    private String privacidad;
    @Basic
    @Column(name = "Referer")
    private String referer;
    @Basic
    @Column(name = "G_Campaing")
    private String gCampaing;
    @Basic
    @Column(name = "G_Source")
    private String gSource;
    @Basic
    @Column(name = "G_Medio")
    private String gMedio;
    @Basic
    @Column(name = "G_Terms")
    private String gTerms;
    @Basic
    @Column(name = "Product")
    private String product;
    @Basic
    @Column(name = "createdat")
    private Timestamp createdAt;
    @Basic
    @Column(name = "Send")
    private int send;
    @Basic
    @Column(name = "errorreason")
    public String errorReason;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(String privacidad) {
        this.privacidad = privacidad;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public String getgCampaing() {
        return gCampaing;
    }

    public void setgCampaing(String gCampaing) {
        this.gCampaing = gCampaing;
    }

    public String getgSource() {
        return gSource;
    }

    public void setgSource(String gSource) {
        this.gSource = gSource;
    }

    public String getgMedio() {
        return gMedio;
    }

    public void setgMedio(String gMedio) {
        this.gMedio = gMedio;
    }

    public String getgTerms() {
        return gTerms;
    }

    public void setgTerms(String gTerms) {
        this.gTerms = gTerms;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public int getSend() {
        return send;
    }

    public void setSend(int send) {
        this.send = send;
    }

    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entity_Lead that = (Entity_Lead) o;

        if (id != that.id) return false;
        if (send != that.send) return false;
        if (ssid != null ? !ssid.equals(that.ssid) : that.ssid != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;
        if (codPostal != null ? !codPostal.equals(that.codPostal) : that.codPostal != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (privacidad != null ? !privacidad.equals(that.privacidad) : that.privacidad != null) return false;
        if (referer != null ? !referer.equals(that.referer) : that.referer != null) return false;
        if (gCampaing != null ? !gCampaing.equals(that.gCampaing) : that.gCampaing != null) return false;
        if (gSource != null ? !gSource.equals(that.gSource) : that.gSource != null) return false;
        if (gMedio != null ? !gMedio.equals(that.gMedio) : that.gMedio != null) return false;
        if (gTerms != null ? !gTerms.equals(that.gTerms) : that.gTerms != null) return false;
        if (product != null ? !product.equals(that.product) : that.product != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (errorReason != null ? !errorReason.equals(that.errorReason) : that.errorReason != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (ssid != null ? ssid.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (codPostal != null ? codPostal.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (privacidad != null ? privacidad.hashCode() : 0);
        result = 31 * result + (referer != null ? referer.hashCode() : 0);
        result = 31 * result + (gCampaing != null ? gCampaing.hashCode() : 0);
        result = 31 * result + (gSource != null ? gSource.hashCode() : 0);
        result = 31 * result + (gMedio != null ? gMedio.hashCode() : 0);
        result = 31 * result + (gTerms != null ? gTerms.hashCode() : 0);
        result = 31 * result + (product != null ? product.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + send;
        result = 31 * result + (errorReason != null ? errorReason.hashCode() : 0);
        return result;
    }
}
