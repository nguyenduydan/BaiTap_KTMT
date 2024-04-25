package structural.composite.file;

import java.util.ArrayList;
import java.util.List;

public class Folder extends IFolder{
    List<IFolder> children = new ArrayList<>();
    public Folder(String tenThuMuc, String ngayTao) {
        super(tenThuMuc, ngayTao);
    }

    @Override
    public void addItem(IFolder file) {
        children.add(file);
        file.path = this.path + "\\" + file.path;
    }

    @Override
    public void removeItem(IFolder file) {
        children.remove(file);
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.temp).append(ten);
        //Ghép cây con vào
        for(var v: children){
            v.temp = this.temp + "\t";
            builder.append("\n").append(v.getStringTreeFolder());
        }
        this.temp = "";
        return builder.toString();
    }
}
