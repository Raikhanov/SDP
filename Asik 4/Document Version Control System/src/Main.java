public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        VersionControl versionControl = new VersionControl();

        document.setContent("Version 1: Initial Content");
        versionControl.saveVersion(document.save());

        document.setContent("Version 2: Updated Content");
        versionControl.saveVersion(document.save());

        System.out.println("Current Content: " + document.getContent());

        document.restore(versionControl.getVersion(0));
        System.out.println("Restored to: " + document.getContent());
    }
}