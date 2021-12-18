package com.example.fastfood.casos_uso;

import android.database.Cursor;

import com.example.fastfood.modelos.Producto;
import com.example.fastfood.modelos.Sucursal;

import java.util.ArrayList;


public class CasoUsoProducto {
    public ArrayList<Producto> llenarListaProductos(Cursor cursor){
        ArrayList<Producto> List = new ArrayList<>();
        if (cursor.getCount() == 0){
            return List;
        }else{
            while  (cursor.moveToNext()){
                Producto producto = new Producto(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getBlob(4)
                );
                List.add(producto);
            }
            return List;
        }
    }
}
