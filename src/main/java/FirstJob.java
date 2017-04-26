import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class FirstJob implements Job {

    public void execute(JobExecutionContext context)
            throws JobExecutionException {

        System.out.println("See ya after 59 seconds");

        for (Employer e : MainClass.employers) {
            System.out.println("First Name = " + e.getFirstName() + e.hashCode() + "\nLast Name = " + e.getLastName() + e.hashCode() + "\nAge= " + e.getAge() + "\nPosition = " + e.getPosition());
            System.out.println("-----------------------------------------------------------");
        }

    }
}