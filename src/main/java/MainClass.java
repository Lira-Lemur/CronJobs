import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    static List<Employer> employers = new ArrayList<Employer>();

    public static void main(String[] args) throws Exception {

        JobKey jobKey1 = new JobKey("job1", "group1");
        JobDetail job1 = JobBuilder.newJob(FirstJob.class).withIdentity(jobKey1).build();

        JobKey jobKey2 = new JobKey("job2", "group2");
        JobDetail job2 = JobBuilder.newJob(SecondJob.class).withIdentity(jobKey2).build();

        Trigger trigger1 = TriggerBuilder.newTrigger()
                .withIdentity("cronTrigger1", "group1")
                .withSchedule(CronScheduleBuilder.cronSchedule("0 * * * * ?")).build();

        Trigger trigger2 = TriggerBuilder.newTrigger()
                .withIdentity("cronTrigger2", "group2")
                .withSchedule(CronScheduleBuilder.cronSchedule("0/30 * * * * ?")).build();

        Scheduler scheduler = new StdSchedulerFactory().getScheduler();

        scheduler.start();

        scheduler.scheduleJob(job1, trigger1);
        scheduler.scheduleJob(job2, trigger2);

        Thread.sleep(100000);
        scheduler.shutdown();
    }
}
