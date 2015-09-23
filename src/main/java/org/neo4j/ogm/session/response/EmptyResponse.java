/*
 * Copyright (c) 2002-2015 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with
 * separate copyright notices and license terms. Your use of the source
 * code for these subcomponents is subject to the terms and
 * conditions of the subcomponent's license, as noted in the LICENSE file.
 *
 */

package org.neo4j.ogm.session.response;

/**
 * @author Vince Bickers
 */
public class EmptyResponse implements Response<String> {
    @Override
    public String next() {
        return null;
    }

    @Override
    public void close() {
    }

    @Override
    public void expect(ResponseRecord record) {
    }

    @Override
    public String[] columns() {
        return new String[0];
    }
    @Override
    public int rowId() {
        return -1;
    }
}
