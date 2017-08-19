/**
 *
 *  @author Kotowski Piotr S13830
 *
 */

package zad2;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {
	//E:\ZDJECIA\GRY 1 30
		static String message = "Podaj ścieżkę, czas wyświetlania i rozmiar czcionki oddzielone spacjami";
		static String[] files_string;
		static String path;
		static int time, size;
		static File[] files = null;
		static String[] file_name;
		public static boolean empty = false;
		
		public static void main(String[] args) throws IOException{
			if(args.length == 0){
				getDataFromDialog();
			}else{
				setPath(args[0]);
				setTime(args[1]);
				setSize(args[2]);
			}
			readFiles(getPath());
			Viewer p = new Viewer(files, getTime(), getSize());
			Thread t = new Thread(p);
			t.start();
		}
		
		public static void getDataFromDialog(){
			String data = JOptionPane.showInputDialog(message);
			files_string = data.split(" ");
			setPath(files_string[0]);
			setTime(files_string[1]);
			setSize(files_string[2]);
		}
		
		public static void readFiles(String path){
			Filter filter = new Filter();
			filter.addExtension("jpg");
			filter.addExtension("gif");
			filter.addExtension("png");
			
			File file = new File(path);
			files = file.listFiles(filter);
			if(files.length == 0){
				empty = true;
			}
		}
		
		public static int getSize(){
			return Main.size;
		}
		
		public static int getTime(){
			return Main.time;
		}
		
		public static String getPath(){
			return Main.path;
		}
		
		public static void setSize(String size){
			if(Integer.parseInt(size)<30){
				Main.size = Integer.parseInt(size);
			}else{
				Main.size = 30;
			}
		}
		
		public static void setTime(String time){
			Main.time = Integer.parseInt(time);
		}
		
		public static void setPath(String path){
			Main.path = path;
		}
}
