/*
 * Copyright 2019 MovingBlocks
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
package org.terasology.wildAnimalsMadness.assets;

import org.terasology.assets.AssetData;

/**
 * Every group is described by a GroupData asset.
 */
public class GroupData implements AssetData {

    public String groupLabel;
    public Boolean needsHive;
    public String behavior;

    public GroupData() {
    }

    public GroupData(String groupLabel, Boolean needsHive, String behavior) {
        this.groupLabel = groupLabel;
        this.needsHive = needsHive;
        this.behavior = behavior;
    }

    public String getGroupLabel() {
        return groupLabel;
    }

    public void setGroupLabel(String groupLabel) {
        this.groupLabel = groupLabel;
    }

    public Boolean getNeedsHive() {
        return needsHive;
    }

    public void setNeedsHive(Boolean needsHive) {
        this.needsHive = needsHive;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

}
