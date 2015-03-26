/*
 * Copyright (c) 2015 IBM Corp.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    IBM Corp - initial API and implementation and initial documentation
 */
package com.i2group.connector.acxiom.request;

/**
 * Interface for IHeader builder.
 * 
 * @param <T>
 *            the type of header to build.
 */
public interface IHeaderBuilder<T>
{
    /**
     * Builds a header of the type specified.
     * 
     * @return See above.
     */
    T build();
}
