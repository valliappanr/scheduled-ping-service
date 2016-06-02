package ping;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by vuswati on 02/06/2016.
 */
public class PingJob implements Job {

    @Autowired
    private PingJobService jobService;

    public void execute(JobExecutionContext context) throws JobExecutionException {
        jobService.executeSampleJob();
    }
}
