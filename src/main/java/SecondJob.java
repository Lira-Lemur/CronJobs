import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SecondJob implements Job {
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        Employer employer = new Employer("AA", "BB", 12, "Dev");
        MainClass.employers.add(employer);

        System.out.println("One item is added!");
    }
}
