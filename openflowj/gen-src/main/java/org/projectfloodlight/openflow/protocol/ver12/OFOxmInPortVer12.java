// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver12;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFOxmInPortVer12 implements OFOxmInPort {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmInPortVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 8;

        private final static OFPort DEFAULT_VALUE = OFPort.ANY;

    // OF message fields
    private final OFPort value;
//
    // Immutable default instance
    final static OFOxmInPortVer12 DEFAULT = new OFOxmInPortVer12(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmInPortVer12(OFPort value) {
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80000004L;
    }

    @Override
    public OFPort getValue() {
        return value;
    }

    @Override
    public MatchField<OFPort> getMatchField() {
        return MatchField.IN_PORT;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<OFPort> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public OFPort getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



    public OFOxmInPort.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmInPort.Builder {
        final OFOxmInPortVer12 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFPort value;

        BuilderWithParent(OFOxmInPortVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80000004L;
    }

    @Override
    public OFPort getValue() {
        return value;
    }

    @Override
    public OFOxmInPort.Builder setValue(OFPort value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<OFPort> getMatchField() {
        return MatchField.IN_PORT;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<OFPort> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public OFPort getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



        @Override
        public OFOxmInPort build() {
                OFPort value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmInPortVer12(
                    value
                );
        }

    }

    static class Builder implements OFOxmInPort.Builder {
        // OF message fields
        private boolean valueSet;
        private OFPort value;

    @Override
    public long getTypeLen() {
        return 0x80000004L;
    }

    @Override
    public OFPort getValue() {
        return value;
    }

    @Override
    public OFOxmInPort.Builder setValue(OFPort value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<OFPort> getMatchField() {
        return MatchField.IN_PORT;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<OFPort> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public OFPort getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

//
        @Override
        public OFOxmInPort build() {
            OFPort value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmInPortVer12(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmInPort> {
        @Override
        public OFOxmInPort readFrom(ChannelBuffer bb) throws OFParseError {
            // fixed value property typeLen == 0x80000004L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80000004)
                throw new OFParseError("Wrong typeLen: Expected=0x80000004L(0x80000004L), got="+typeLen);
            OFPort value = OFPort.read4Bytes(bb);

            OFOxmInPortVer12 oxmInPortVer12 = new OFOxmInPortVer12(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmInPortVer12);
            return oxmInPortVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmInPortVer12Funnel FUNNEL = new OFOxmInPortVer12Funnel();
    static class OFOxmInPortVer12Funnel implements Funnel<OFOxmInPortVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmInPortVer12 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80000004L
            sink.putInt((int) 0x80000004);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmInPortVer12> {
        @Override
        public void write(ChannelBuffer bb, OFOxmInPortVer12 message) {
            // fixed value property typeLen = 0x80000004L
            bb.writeInt((int) 0x80000004);
            message.value.write4Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmInPortVer12(");
        b.append("value=").append(value);
        b.append(")");
        return b.toString();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFOxmInPortVer12 other = (OFOxmInPortVer12) obj;

        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

}
