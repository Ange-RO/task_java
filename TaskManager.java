import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TaskManager implements TaskOperations {

static TaskManager taskManager = new TaskManager();
static Scanner scanner = new Scanner(System.in);
static ArrayList<Task> taskList = new ArrayList<>();// tableau de type <Task>
static int id = 1;

@Override
   public void addTask(){
System.out.println("Entrez le titre de la tâche");
String title = scanner.nextLine();
Task task = new Task(id++, title);
taskList.add(task);
System.out.println (task.getTitle() + "Ajouté avec succes");
   }

 @Override
    public void displayTask() {
     System.out.println("Liste des tâches");

for (Task task : taskList){
   System.out.println (task.getTitle());
}
    }
public void sauvegarder(){
    String tasksFil = "tasks.txt";
    try(BufferedWriter writer = new BufferedWriter(new FileWriter(taskFil))){ 
    writer.write(taskList.toString());
} catch (IOException e){
    e.printStackTrace();
}

// public void menu(){} 


    public static void main(String[] args) {
        taskManager.addTask();
        
    }

    
}
}
