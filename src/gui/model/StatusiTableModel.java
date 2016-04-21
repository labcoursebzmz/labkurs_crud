package gui.model;

import ejb.Statusi;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class StatusiTableModel extends AbstractTableModel{

    String [] columns ={"ID","Emertimi"};
    List<Statusi> lista;
    
    public StatusiTableModel(){}
    
    
    public Statusi getStatusi(int row){
        return lista.get(row);
    }
    
    @Override
    public String getColumnName(int col) {
        return columns[col];
    }
    public StatusiTableModel(List<Statusi> lista){
        this.lista=lista;
    }
    
    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
       return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Statusi s=getStatusi(rowIndex);
        switch(columnIndex){
            case 0:
                return s.getId();
            case 1:
                return s.getEmertimi();
            default:
                return null;
        }
    }
    
    public void add(List<Statusi> data){
        this.lista=data;
    }

    public void remove(int row) {
        lista.remove(row);
    }
}
