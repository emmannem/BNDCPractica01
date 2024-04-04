/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.bdncpractica01;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author JMRes
 * @param <T>
 */
public class ProductoTableModel<T> extends AbstractTableModel {

    private String[] columnNames = {"Clave", "Nombre",
        "Precio de Venta", "Precio de Compra"};
    private List<Producto> lstData;

    public ProductoTableModel(List<Producto> lstData) {
        this.lstData = lstData;
    }

    @Override
    public int getRowCount() {
        return lstData.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto producto = lstData.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return producto.getId();
            case 1:
                return producto.getDescripcion();
            case 2:
                return producto.getPrecioventa();
            case 3:
                return producto.getPreciocompra();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
