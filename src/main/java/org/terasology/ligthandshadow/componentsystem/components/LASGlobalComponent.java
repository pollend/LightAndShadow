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
package org.terasology.ligthandshadow.componentsystem.components;

import org.terasology.entitySystem.Component;
import org.terasology.network.Replicate;

/**
 * Place holder component to indicate an entity being the LAS Global Entity.
 * @see org.terasology.ligthandshadow.componentsystem.controllers.LASGlobalSystem
 */
@Replicate
public class LASGlobalComponent implements Component {
}