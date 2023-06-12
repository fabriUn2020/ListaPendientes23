package com.conejiaraapp.listapendientes.Clases;
import java.util.Date;
public class ElementoLista
{
    private String titulo;
    private String descripcion;

    private  Date fechaVencimiento = new Date();

    private String prioridad;

    //Crear variable para fecha de vencimiento chagtp puede dar una ayuda
    //Crear variable para prioridad
    //Tambien completar los getters y setters

    //Al crear las variables completar el contructor
    public ElementoLista(String titulo, String descripcion,Date fechaVencimiento,String prioridad)
    {
        this.titulo = titulo;
        this.setDescripcion(descripcion);
        this.fechaVencimiento= fechaVencimiento;
        this.prioridad = prioridad;
    }

    //Aqui van los getters y setters
    public String getTitulo()
    {
        return titulo;
    }

    public String getDescripcion()
    {
        return descripcion;
    }
    public Date getFechadeVencimiento()
    {
        return fechaVencimiento;
    }
    public String getPrioridad()
    {
        return prioridad;
    }
    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }
}
