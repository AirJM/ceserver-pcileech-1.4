/*
 * This file is part of ceserver-pcileech by Isabella Flores
 *
 * Copyright © 2021-2022 Isabella Flores
 *
 * It is licensed to you under the terms of the
 * GNU Affero General Public License, Version 3.0.
 * Please see the file LICENSE for more information.
 */

package iflores.ceserver.pcileech;

public class WinApiException extends RuntimeException {

    public WinApiException(String message, int errno) {
        super(message + " (errno=" + errno + ")");
    }

}
