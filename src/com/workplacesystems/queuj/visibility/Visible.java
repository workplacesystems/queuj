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

package com.workplacesystems.queuj.visibility;

import com.workplacesystems.queuj.QueueOwner;
import com.workplacesystems.queuj.Process;
import com.workplacesystems.queuj.Visibility;
import com.workplacesystems.queuj.utils.User;

/**
 *
 * @author dave
 */
public class Visible extends Visibility
{
    // Increase the number when an incompatible change is made
    private static final long serialVersionUID = Visible.class.getName().hashCode() + 1;

    /** Creates a new instance of Invisible */
    public Visible()
    {
    }

    @Override
    public boolean isVisible(Process process, User user, QueueOwner active_partition)
    {
        return false;
    }
}
