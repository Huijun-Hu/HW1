package composition;
public class Driver {
    public static void main(String[] args) {
        Folder root = new Folder("php_demo1");

        Folder src = new Folder("Source Files");
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        Folder cache = new Folder("cache");
        Folder publicFolders = new Folder("public");

        File access = new File(".htaccess");
        File router = new File(".htrouter.php");
        File index = new File("index.html");
        Folder path = new Folder("Include Path");
        Folder remote = new Folder("Remote Files");

        root.add(src);
        root.add(path);
        root.add(remote);

        src.add(phalcon);
        src.add(app);
        src.add(cache);
        src.add(publicFolders);

        app.add(config);
        app.add(controllers);
        app.add(library);
        app.add(migrations);
        app.add(models);
        app.add(views);

        publicFolders.add(access);
        publicFolders.add(router);
        publicFolders.add(index);

        root.print(0);

        System.out.println("\n$delete app");
        src.delete(app);
        root.print(0);

        System.out.println("\n$delete public");
        src.delete(publicFolders);
        root.print(0);
    }
}
