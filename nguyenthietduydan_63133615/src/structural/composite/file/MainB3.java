package structural.composite.file;

public class MainB3 {
    public static void main(String[] args) {
        Folder folder = new Folder("Data (D:)","23/4/2003");
        Folder folder1 = new Folder("TaiLieu","23/4/2003");
        Folder folder2 = new Folder("Design Pattern","23/4/2003");
        Folder folder3 = new Folder("LapTrinhThietBiDiDong","23/4/2003");
        Folder folder4 = new Folder("Lap Trinh Java","23/4/2003");

        folder.addItem(folder1);
        folder1.addItem(folder2);
        folder1.addItem(folder3);
        folder1.addItem(folder4);

        File file = new File("CreationalPattern.pptx","25/4/2022");
        File file1 = new File("StructuralPattern.pptx","25/4/2022");
        File file2 = new File("LapTrinhJavaCoBan.docx","25/4/2022");
        File file3 = new File("LapTrinhJavaNangCao.pdf","25/4/2022");
        File file4 = new File("NgonNguLapTrinhC.pdf","25/4/2022");
        File file5 = new File("CoBan.pptx","25/4/2022");
        File file6 = new File("NangCao.pptx","25/4/2022");
        folder2.addItem(file);
        folder1.addItem(file4);
        folder2.addItem(file1);
        folder2.addItem(file2);
        folder2.addItem(file3);
        folder3.addItem(file5);
        folder3.addItem(file6);

        System.out.println(folder.getStringTreeFolder());
        System.out.println(file.getPath());
    }
}
