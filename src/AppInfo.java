public class AppInfo {
    private String name; //nazwa programu
    private String version; //wersja

    public AppInfo(String name, String version) {
        this.name = name;
        this.version = version;
    }

    //wyswietla info o prgmie
    public void show() {
        System.out.println("Program: " + name);
        System.out.println("Wersja: " + version);
    }
}