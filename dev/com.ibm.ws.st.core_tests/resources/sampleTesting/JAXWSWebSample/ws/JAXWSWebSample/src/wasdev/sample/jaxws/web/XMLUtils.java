/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package wasdev.sample.jaxws.web;

public class XMLUtils {

    public static String escapeXML(String xml) {
        if (xml == null) {
            return null;
        }
        xml = xml.replace("&", "&amp;");
        xml = xml.replace("<", "&lt;");
        xml = xml.replace(">", "&gt;");
        xml = xml.replace(" ", "&nbsp;");
        xml = xml.replace("\t", "&nbsp; &nbsp; ");
        return xml;
    }
}