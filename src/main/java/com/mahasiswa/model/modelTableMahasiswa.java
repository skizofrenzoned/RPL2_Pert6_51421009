package com.mahasiswa.model;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class modelTableMahasiswa extends AbstractTableModel{
    private List<modelMahasiswa> mahasiswaList;
    private String[] columnNames = {"ID", "NPM", "Nama", "Semester", "IPK"};
    
    public modelTableMahasiswa(List<modelMahasiswa> mahasiswaList){
        this.mahasiswaList = mahasiswaList;
    }
    
    @Override
    public int getRowCount(){
        return mahasiswaList.size();
    }
    
    @Override
    public int getColumnCount(){
        return columnNames.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        modelMahasiswa mahasiswa = mahasiswaList.get(rowIndex);
        switch(columnIndex){
            case 0:
                return mahasiswa.getId();
            case 1:
                return mahasiswa.getNpm();
            case 2:
                return mahasiswa.getNama();
            case 3:
                return mahasiswa.getSemester();
            case 4:
                return mahasiswa.getIpk();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        return columnNames[column];
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }
    
    public void setMahasiswaList(List<modelMahasiswa> mahasiswaList){
        this.mahasiswaList = mahasiswaList;
        fireTableDataChanged();
    }
}
