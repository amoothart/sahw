/*
 * Copyright (C) 2014 Kinvey, Inc. (support@kinvey.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amooth.model_adapters;

interface KinveyModelAdapter<K, I> {
    public K kinveyFromInternal(I entity);
    public I internalFromKinvey(K entity);
}
