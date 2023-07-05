package com.conejiaraapp.listapendientes.Clases;

import java.util.List;

public class ListaManager
{
    public static List<String> listaDeTareas;

    public void agregarLista(String nombreLista)
    {
        listaDeTareas.add(nombreLista);
    }

    public void editarLista(int indice, String nuevoNombre)
    {
        if (indice >= 0 && indice < listaDeTareas.size())
        {
            listaDeTareas.set(indice, nuevoNombre);
        }
        else
        {
            System.out.println("Índice inválido");
        }
    }
    public void eliminarLista(int indice)
    {
        if (indice >= 0 && indice < listaDeTareas.size())
        {
            listaDeTareas.remove(indice);
        }
        else
        {
            System.out.println("Índice inválido");
        }
    }
}
