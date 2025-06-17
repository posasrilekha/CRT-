import java.util.PriorityQueue;
class Task implements Comparable<Task> {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return name + " (priority: " + priority + ")";
    }
}
public class TaskPriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        taskQueue.offer(new Task("Write report", 3));
        taskQueue.offer(new Task("Fix bugs", 1));
        taskQueue.offer(new Task("Email client", 2));

        System.out.println("Tasks in order of priority:");

        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
    }
}
