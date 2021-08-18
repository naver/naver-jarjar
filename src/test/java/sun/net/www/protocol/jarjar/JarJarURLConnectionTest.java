/*
 * Copyright (c) 2021-present NAVER Corp. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  NAVER designates this
 * particular file as subject to the "Classpath" exception as provided
 * in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package sun.net.www.protocol.jarjar;

import static org.junit.Assert.*;

import java.net.URL;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JarJarURLConnectionTest {

	private static final Logger LOG = LoggerFactory.getLogger(JarJarURLConnectionTest.class);

	@Test
	public void test() throws Exception {

		URL url = new URL("jar:jarjar:file:/C:/mylibs/Outer.jar^/Inner.jar!/test.xml");

		LOG.debug("{}", url);
		assertEquals("jar:jarjar:file:/C:/mylibs/Outer.jar^/Inner.jar!/test.xml", url.toString());
	}

}
