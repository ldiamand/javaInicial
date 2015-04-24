import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;


public class FileTest {

	public static void main(String[] args) 
			throws IOException {
		
		File f1 = new File("hola.bin");
		
		if (f1.exists()) {
			System.out.println("Existe");
		} else {
			System.out.println("No Existe");
			f1.createNewFile();
			
			FileReader fr = new FileReader(f1);
		}
		
		File f2 = new File("chau.txt");
		
		if (!f2.exists()) {
			f2.mkdir();
		}
		
		if (f2.isDirectory()) {
			System.out.println("Es un directorio");
		}
		if (f2.isFile()) {
			System.out.println("Es un archivo");
		}
		
		File dirRoot = new File("/");
		
		File f3 = new File("/boot/grub", "grub.cfg");
		
		if (dirRoot.canWrite()) {
			f3.createNewFile();
		} else {
			System.out.println("No puedo escribir");
		}
		
		System.out.println(dirRoot.canRead());
		System.out.println(dirRoot.canExecute());
		
		System.out.println(f1.length());
		
		File f4 = new File(dirRoot, "vmlinuz");
		System.out.println(f4.getAbsolutePath());
		System.out.println(f4.getCanonicalPath());
		
		System.out.println(f3.getParent());
		System.out.println(f1.getParent());
		
		File [] roots = File.listRoots();
		
		File [] cont = dirRoot.listFiles();
		for (File file : cont) {
			System.out.println(file.getAbsolutePath() 
					+ "[" + (file.isFile() ? "Archivo" : "Directorio") + "]");
		}
		
		System.out.println("-------------------------------------------");
		
		File [] cont2 = dirRoot.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".img");
			}
		});
		
		for (File file : cont2) {
			System.out.println(file.getAbsolutePath());
		}
	}
}
