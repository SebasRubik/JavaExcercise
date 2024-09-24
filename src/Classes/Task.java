package Classes;

public class Task implements Comparable<Task>{

    private String title;
    private String desc;
    private Priority priority;

    public Task(String title, String desc, Priority priority){
        this.title = title;
        this.desc = desc;
        this.priority = priority;
    }

    public String getTittle(){
        return title;
    }

    public void setTitle (String title){
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return this.priority.compareTo(other.priority);
    }
}
