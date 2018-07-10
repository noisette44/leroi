package fr.elco.leroipinpin;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.repeatSecondlyForever;
import static org.quartz.TriggerBuilder.newTrigger;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SchedulerMain
{
	final static Logger logger = LoggerFactory.getLogger(SchedulerMain.class);

	public static void main(String[] args)
		throws Exception
	{

		Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
		scheduler.start();
		JobDetail jobDetail = newJob(PriceJob.class).build();
		Trigger trigger = newTrigger().startNow().withSchedule(repeatSecondlyForever(10)).build();
		scheduler.scheduleJob(jobDetail, trigger);
	}

	public static class PriceJob
		implements Job
	{
		public void execute(JobExecutionContext jobExecutionContext)
		{

			try {
				logger.info("!!! GO !!!");
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		}
	}
}
