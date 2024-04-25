package structural.composite.file;

public class File extends IFolder{
    public File(String tenFile, String ngayTao) {
        super(tenFile, ngayTao);
    }

    @Override
    public void addItem(IFolder file) {

    }

    @Override
    public void removeItem(IFolder file) {

    }

    @Override
    public String getStringTreeFolder() {
        return ten;
    }
}
