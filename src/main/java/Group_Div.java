import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;

public class Group_Div {
    public static void main(String[] args){
        if(args.length != 0 && args.length == 3){
           if(isNumeric(args[0])){

           }
            reading_file(args[1]);
            reading_file(args[2]);


            //System.out.println(args[i] + "\n");
            }else{
            System.out.println("Debe enviar el numero de estudiantes, y los directorios de los archivos como parametros");
        }
    }

    public static void reading_file(String path){
        int counter = 0;
        try {
            //Reading files from path in the second arg
            File myFile = new File(path);
            Scanner reader = new Scanner(myFile);
            while(reader.hasNextLine()){
                String lines = reader.nextLine();
                System.out.println(lines);
            }

        }catch (FileNotFoundException e){
            System.out.println("Error:" + e);
        }
    }

    public static boolean isNumeric(String num) {
        if (num == null) {
            return false;
        }
        try {
            int n = Integer.parseInt(num);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static void group_num(int n){
        //Todo
    }
}

