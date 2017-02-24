package model;

import java.util.Date;

/**
 * Created by dario on 20.02.2017.
 */
public class TaskList {

    private String description;
    private Date dueDate;
    private Status status;

    public TaskList(String description, Date dueDate, Status status){
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Status getStatus() {
        return status;
    }

    public String toString(){
       return ("Description: " + this.description + "\nDue date: " + this.getDueDate() + "\nStatus: " + this.getStatus()) + "\n";
    }
}
