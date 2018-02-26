/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
 * %%
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
 * #L%
 */
package gwt.material.design.client.pwa.serviceworker;

import gwt.material.design.client.pwa.base.PwaFeature;
import gwt.material.design.client.pwa.serviceworker.js.ServiceWorker;
import gwt.material.design.client.pwa.serviceworker.js.ServiceWorkerRegistration;

public interface ServiceWorkerManager extends PwaFeature {

    /**
     * Update the Service Worker Registration
     */
    void update();

    /**
     * Get the Service Worker Registration after the ServiceWorker container has been successfully
     * registered
     */
    ServiceWorkerRegistration getServiceWorkerRegistration();


    ServiceWorker getServiceWorker();

    /**
     * Returns true if Browser supported service worker.
     */
    boolean isServiceWorkerSupported();
}