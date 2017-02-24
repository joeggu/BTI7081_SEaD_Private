package test;

import model.Status;
import model.TaskList;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by dario on 20.02.2017.
 */
public class TestIt {
    public static void main(String[] args) {
        List<TaskList> taskLists = new ArrayList<>();

        Date date = new Date();
        TaskList task1 = new TaskList("Task1", date, Status.IN_PROGRESS);
        TaskList task2 = new TaskList("Task2", date, Status.OPEN);
        Date date2 = new Date(2017, 03, 20);
        TaskList task3 = new TaskList("Task3", date2, Status.DONE);
        Date date3 = new Date(2017, 03, 22);
        TaskList task4 = new TaskList("Task4", date3, Status.OPEN);
        Date date4 = new Date(2017, 04, 20);
        TaskList task5 = new TaskList("Task5", date4, Status.DONE);
        Date date5 = new Date(2017, 02, 20);
        TaskList task6 = new TaskList("Task6", date5, Status.OPEN);
        Date date6 = new Date(2017, 03, 27);
        TaskList task7 = new TaskList("Task7", date6, Status.DONE);

        taskLists.add(task1);
        taskLists.add(task2);
        taskLists.add(task3);
        taskLists.add(task4);
        taskLists.add(task5);
        taskLists.add(task6);
        taskLists.add(task7);

        System.out.println("---------- Nach Status sortiert: ----------");
        taskLists.stream().sorted((t1,t2)-> t1.getStatus().compareTo(t2.getStatus())).forEach(System.out::println);

        System.out.println("---------- Nach DueDate sortiert: ----------");
        taskLists.stream().sorted((t1,t2)->t1.getDueDate().compareTo(t2.getDueDate())).forEach(System.out::println);

        System.out.println("---------- Nach Status/DueDate sortiert: ----------");
        taskLists.stream().sorted((t1,t2)->t1.getStatus().compareTo(t2.getStatus())).sorted((t1,t2)-> t1.getDueDate().compareTo(t2.getDueDate())).forEach(System.out::println);

    }
}
