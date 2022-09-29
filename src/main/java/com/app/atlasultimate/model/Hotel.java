package com.app.atlasultimate.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "hotel")
@Getter
@Setter
@EqualsAndHashCode
public class Hotel extends Usuario{
    @Column(name = "pais")
    private String pais;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "num_habitaciones")
    private Integer numHabitaciones;
    @Column(name = "disponibilidad")
    private LocalDate FechaDisponible;
    @Column(name = "ubicacion")
    private String ubicacion;
    @Column(name = "web")
    private String pagWeb;
    @Column(name = "terraza")
    private Boolean terraza;
    @Column(name = "piscina")
    private  Boolean piscina;
    @Column(name = "patio")
    private Boolean patioInterior;
    @Column(name = "espectaculos")
    private Boolean espectaculos;
    @Column(name = "comedor")
    private Boolean comedor;
    @Column(name = "tours")
    private Boolean tours;
    @Column(name = "aparcamiento")
    private Boolean aparcamiento;
    @Column(name = "servicio_transporte")
    private Boolean servicioTransporte;
    @Column(name = "recepcion")
    private Boolean recepcion;
    @Column(name = "estrellas")
    private Integer estrellas;
    @Column(name = "valoracion_media")
    private Double valoracionMedia;
    @Column(name = "servicio_limpieza")
    private Boolean servicioLimpieza;
    @Column(name = "servicio_habitaciones")
    private Boolean servicioHabitaciones;
    @Column(name = "accesibilidad")
    private Boolean accesibilidad;
    @Column(name = "idiomas")
    private String listaIdiomas;
    @Column(name = "mascotas")
    private Boolean mascotas;


}
