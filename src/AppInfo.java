public class AppInfo {
    private String name;
    private String version;

    public AppInfo(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public void show() {
        System.out.println("Program: " + name);
        System.out.println("Wersja: " + version);
    }
}