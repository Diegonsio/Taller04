package datos;

import modelo.Persona;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;

public class GestorCSV {

    private String file=("data.csv"); //SET FILE PATH
    private ArrayList<Persona> personas = new ArrayList<>();


    public void addPersona(Persona personas){
        String line=(personas.getNombre()+";"+personas.getApellido());
        tryWrite(line);
    }


    /**
     * datos.GestorCSV, clase encargada de acceder directamente al archivo CSV y parsear los datos a un Arreglo
     */
    public GestorCSV(){
        tryRead();
    }

    private void tryWrite(String line){
        String text="null";
        try {
            text=new String(Files.readAllBytes(Path.of(file)));
            text =text+ "\n" + line;
            Files.write(Path.of(file), text.getBytes(), new OpenOption[0]);
        } catch (Exception ex) {
            System.out.println("Error, no se pudo agregar la nueva línea.");
        }
    }

    private String tryRead(){
        String text="null";
        try {
            reader(new BufferedReader(new FileReader(file)));
        } catch (Exception ex) {
            System.out.println("Error, no se pudo leer el archivo.");
            System.out.println(ex.getMessage());
        }
        return text;
    }

    private void reader(BufferedReader csvReader) throws Exception{
        String row;
        while ((row = csvReader.readLine()) != null){
            String[] data = row.split(",");
            interpreter(data);
        }
        csvReader.close();
    }


    private void interpreter(String[] data){
        personas.add(new Persona(data[1].split(" ")[0],data[1].split(" ")[1]));
    }


    public ArrayList<Persona> getPersonas(){
        return this.personas;
    }

}
