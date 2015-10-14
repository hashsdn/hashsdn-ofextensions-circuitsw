/*
 * Calient Technologies and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.ofextensions.circuitsw.impl;

import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ProviderContext;
import org.opendaylight.controller.sal.binding.api.BindingAwareProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CircuitswProvider implements BindingAwareProvider, AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(CircuitswProvider.class);

    @Override
    public void onSessionInitiated(ProviderContext session) {
        LOG.info("CircuitswProvider Session Initiated");
    }

    @Override
    public void close() throws Exception {
        LOG.info("CircuitswProvider Closed");
    }

}
