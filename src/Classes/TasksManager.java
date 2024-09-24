package Classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class TasksManager {

    List<Task> toDoTasks;

    public TasksManager(){
        this.toDoTasks = new ArrayList<Task>();
    }

    public TasksManager(List<Task> toDoTasks){
        this.toDoTasks = toDoTasks;
    }

    public void addTask(String title, String desc, Priority priority){
        toDoTasks.add(new Task(title,desc,priority));
    }

    public void deleteCompletedTask(String title){
        for (Task task : toDoTasks) {
            if(task.getTittle().equalsIgnoreCase(title)){
                toDoTasks.remove(task);
            }
        }
    }

    public void sortTasks(){
        for(int i = 0; i < toDoTasks.size(); i++){
            Task aux;
            for(int j = i; j < toDoTasks.size(); j++){
                if(toDoTasks.get(i).compareTo(toDoTasks.get(j)) < 0){
                    aux = toDoTasks.get(i);
                    toDoTasks.set(i,toDoTasks.get(j));
                    toDoTasks.set(j, aux);
                }
            }
        }
    }

    public void showTasks(){
        for (Task task : toDoTasks) { 
            System.out.println("Title: " + task.getTittle());
            System.out.println("Desc: " + task.getDesc());
            System.out.println("Priority: " + task.getPriority());
            System.out.println('\n');
       }
    }

    public void writeFile(){
        try{
            FileWriter fileWriter = new FileWriter("src/sources/tasks.txt");
            for (Task task : toDoTasks) {
                fileWriter.write("Title: " + task.getTittle() + "\n" + "Desc: " + task.getDesc() + '\n' + "Pirority: " + task.getPriority() + "\n\n");
            }
        fileWriter.close();
        } catch(IOException e){
            System.out.println(e);
        }

    }

    public void readFile(){
        try(BufferedReader br = new BufferedReader(new FileReader("src/sources/tasks.txt"))){
            String line;
            while((line = br.readLine()) != null){
                if(line.startsWith("Title: ")){
                    String title = line.substring(7);
                    String desc = br.readLine().substring(6);
                    String priority = br.readLine().substring(10);
                    toDoTasks.add(new Task(title,desc,Priority.valueOf(priority)));

                }
            }

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
