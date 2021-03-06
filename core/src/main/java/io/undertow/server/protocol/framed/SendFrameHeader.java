/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2014 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.undertow.server.protocol.framed;

import org.xnio.Pooled;

import java.nio.ByteBuffer;

/**
 * @author Stuart Douglas
 */
public class SendFrameHeader {

    private final int reminingInBuffer;
    private final Pooled<ByteBuffer> byteBuffer;

    public SendFrameHeader(int reminingInBuffer, Pooled<ByteBuffer> byteBuffer) {
        this.byteBuffer = byteBuffer;
        this.reminingInBuffer = reminingInBuffer;
    }

    public SendFrameHeader(Pooled<ByteBuffer> byteBuffer) {
        this.byteBuffer = byteBuffer;
        this.reminingInBuffer = 0;
    }

    public Pooled<ByteBuffer> getByteBuffer() {
        return byteBuffer;
    }

    public int getReminingInBuffer() {
        return reminingInBuffer;
    }
}
