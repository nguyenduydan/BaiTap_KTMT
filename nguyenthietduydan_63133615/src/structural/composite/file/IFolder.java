package structural.composite.file;

public abstract class IFolder {
    String ten, ngayTao;
    String path;
    String temp = "";

    public IFolder(String tenThuMuc, String ngayTao) {
        this.ten = tenThuMuc;
        this.ngayTao = ngayTao;
        this.path = tenThuMuc;
    }

    //Khai báo phương thức trừu tượng
    public abstract void addItem (IFolder file);
    public abstract void removeItem (IFolder file);

    public abstract String getStringTreeFolder ();

    public String getPath(){
        return path;
    }
}
