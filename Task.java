public class Task {
    //les attributs de la class
    private int id;
    private String title;
    private boolean statut;

//Initialiser les attributs de la class
public Task(int id, String title) {
    this.id = id;
    this.title = title;
    this.statut = false;
}

public int getId(){
    return this.id;
}
public void setId(int id) {
this.id = id;
}
public String getTitle(){
    return this.title;
}
public void setTitle(String title) {
this.title = title;
}
public boolean getStatut(){
    return this.statut;
}
public void setId(boolean statut) {
this.statut = statut;
}

}