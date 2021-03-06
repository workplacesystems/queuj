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

package com.workplacesystems.queuj.resilience;

import java.util.GregorianCalendar;

import com.workplacesystems.queuj.Occurrence;
import com.workplacesystems.queuj.Resilience;

/**
 *
 * @author dave
 */
public class CatchUp extends Resilience
{
    // Increase the number when an incompatible change is made
    private static final long serialVersionUID = CatchUp.class.getName().hashCode() + 1;

    /** Creates a new instance of CatchUp */
    public CatchUp()
    {
    }

    @Override
    protected GregorianCalendar getAdjustedNextRunTime(Occurrence occurrence, GregorianCalendar schedule_start, int run_count, GregorianCalendar now)
    {
        return occurrence.getNextRunTime(schedule_start, run_count);
    }
}
