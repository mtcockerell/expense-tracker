package edu.tcu.cs.expensetracker.controller;

import edu.tcu.cs.expensetracker.domain.Activity;
import edu.tcu.cs.expensetracker.service.ActivityService;

import java.util.List;

public class ActivityController {
    private ActivityService service = new ActivityService();

    /*
     * Controller passes the id of activity to ActivityService
     */
    public void deleteActivity(int id) {
        service.deleteActivity(id);
    }

    /*
     * Controller is calling ActivityService's editActivity method and passing act to it.
     */
    public void editActivity(String activityId, Activity act) {
        service.update(activityId, act);
    }

    /*
     * Controller is invoking the addActivity method of ActivityService
     *
     */
    public void addActivity(Activity act) {
        service.addActivity(act);
    }

    /*
     * Controller passes start and end date to ActivityService
     * and returns the result to MainView
     */
    public List<Activity> select(String startDate, String endDate) {
        return service.select(startDate, endDate);
    }

    /*
     * Controller is calling ActivityService's selectAll method.
     */
    public List<Activity> selectAll() {
        return service.selectAll();
    }
}
