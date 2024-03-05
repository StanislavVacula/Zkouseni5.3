import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.util.List;

public class ZakaznikTableModel extends AbstractTableModel {

    private List<Zakaznik> data;
    public ZakaznikTableModel(List<Zakaznik> data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Zakaznik zakaznik = data.get(rowIndex);
        return switch (columnIndex){
            case 0 -> zakaznik.getJmeno();
            case 1 -> zakaznik.getDatumNarozeni();
            default ->throw new IllegalArgumentException("Požadavek na neexistující číslo sloupce"+columnIndex +" Máme jen sloupce 0 a 1!");
        };
    }
}
