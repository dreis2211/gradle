/*
 * Copyright 2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.api.plugins.quality.internal;

import org.gradle.api.Action;
import org.gradle.api.internal.project.antbuilder.AntBuilderDelegate;

/**
 * Action to be run via the Worker API which executes a Pmd Ant task.
 */
public abstract class PmdAction extends AntWorkAction<PmdActionParameters> {

    @Override
    protected String getActionName() {
        return "pmd";
    }

    @Override
    protected Action<AntBuilderDelegate> getAntAction() {
        return new PmdInvoker(getParameters());
    }
}
