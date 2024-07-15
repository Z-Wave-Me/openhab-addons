/**
 * Copyright (c) 2010-2024 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.bluetooth.bluegiga.internal.command.attributedb;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.binding.bluetooth.bluegiga.internal.BlueGigaResponse;

/**
 * Class to implement the BlueGiga command <b>userReadResponse</b>.
 * <p>
 * This command is used to respond to an attribute Read request by a remote device, but only for
 * attributes which have been configured with the user property. Attributes which have the
 * user property enabled allow the attribute value to be requested from the application
 * instead of the Smart stack automatically responding with Bluetooth the data in it's local
 * GATT database. This command is normally used in response to a User Read Request event, which
 * is generated when a remote device tries to read an attribute with a user property enabled. The
 * response to User Read Request events must happen within 30 seconds or otherwise a timeout
 * will occur.
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
@NonNullByDefault
public class BlueGigaUserReadResponseResponse extends BlueGigaResponse {
    public static final int COMMAND_CLASS = 0x02;
    public static final int COMMAND_METHOD = 0x03;

    /**
     * Response constructor
     */
    public BlueGigaUserReadResponseResponse(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        event = (inputBuffer[0] & 0x80) != 0;

        // Deserialize the fields
    }

    @Override
    public String toString() {
        return "BlueGigaUserReadResponseResponse []";
    }
}
