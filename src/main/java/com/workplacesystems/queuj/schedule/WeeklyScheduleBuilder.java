/*
 * Copyright 2010 Workplace Systems PLC (http://www.workplacesystems.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.workplacesystems.queuj.schedule;

import com.workplacesystems.queuj.Schedule;

/**
 *
 * @author dave
 */
public class WeeklyScheduleBuilder extends ScheduleBuilder
{
    private int interval_weeks = 1;
    private int day = 1;
    private int hour = 0;
    private int minute = 0;

    /** Creates a new instance of WeeklyScheduleBuilder */
    WeeklyScheduleBuilder(ScheduleSetter schedule_setter)
    {
        super(schedule_setter);
    }

    public void setIntervalWeeks(int interval_weeks)
    {
        this.interval_weeks = interval_weeks;
    }

    public void setScheduledDay(int day)
    {
        this.day = day;
    }

    public void setScheduledHour(int hour)
    {
        this.hour = hour;
    }

    public void setScheduledMinute(int minute)
    {
        this.minute = minute;
    }

    @Override
    Schedule newSchedule()
    {
        return new WeeklySchedule(interval_weeks, day, hour, minute);
    }
}
