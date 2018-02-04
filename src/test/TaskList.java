package test;

import java.util.Date;

/**
 * Created by dario on 21.06.2017.
 */
public class TaskList {
    String description;
    Date date;
    Status status;

    public TaskList(String description, Date date, Status status) {
        this.description = description;
        this.date = date;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return date;
    }

    public void setDueDate(Date date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
