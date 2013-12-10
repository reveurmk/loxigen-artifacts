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

class OFOxmBsnInPorts128Ver12 implements OFOxmBsnInPorts128 {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmBsnInPorts128Ver12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 20;

        private final static OFBitMask128 DEFAULT_VALUE = OFBitMask128.NONE;

    // OF message fields
    private final OFBitMask128 value;
//
    // Immutable default instance
    final static OFOxmBsnInPorts128Ver12 DEFAULT = new OFOxmBsnInPorts128Ver12(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmBsnInPorts128Ver12(OFBitMask128 value) {
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x30020L;
    }

    @Override
    public OFBitMask128 getValue() {
        return value;
    }

    @Override
    public MatchField<OFBitMask128> getMatchField() {
        return MatchField.BSN_IN_PORTS_128;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<OFBitMask128> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public OFBitMask128 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



    public OFOxmBsnInPorts128.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmBsnInPorts128.Builder {
        final OFOxmBsnInPorts128Ver12 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFBitMask128 value;

        BuilderWithParent(OFOxmBsnInPorts128Ver12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x30020L;
    }

    @Override
    public OFBitMask128 getValue() {
        return value;
    }

    @Override
    public OFOxmBsnInPorts128.Builder setValue(OFBitMask128 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<OFBitMask128> getMatchField() {
        return MatchField.BSN_IN_PORTS_128;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<OFBitMask128> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public OFBitMask128 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



        @Override
        public OFOxmBsnInPorts128 build() {
                OFBitMask128 value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmBsnInPorts128Ver12(
                    value
                );
        }

    }

    static class Builder implements OFOxmBsnInPorts128.Builder {
        // OF message fields
        private boolean valueSet;
        private OFBitMask128 value;

    @Override
    public long getTypeLen() {
        return 0x30020L;
    }

    @Override
    public OFBitMask128 getValue() {
        return value;
    }

    @Override
    public OFOxmBsnInPorts128.Builder setValue(OFBitMask128 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<OFBitMask128> getMatchField() {
        return MatchField.BSN_IN_PORTS_128;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<OFBitMask128> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public OFBitMask128 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

//
        @Override
        public OFOxmBsnInPorts128 build() {
            OFBitMask128 value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmBsnInPorts128Ver12(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmBsnInPorts128> {
        @Override
        public OFOxmBsnInPorts128 readFrom(ChannelBuffer bb) throws OFParseError {
            // fixed value property typeLen == 0x30020L
            int typeLen = bb.readInt();
            if(typeLen != 0x30020)
                throw new OFParseError("Wrong typeLen: Expected=0x30020L(0x30020L), got="+typeLen);
            OFBitMask128 value = OFBitMask128.read16Bytes(bb);

            OFOxmBsnInPorts128Ver12 oxmBsnInPorts128Ver12 = new OFOxmBsnInPorts128Ver12(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmBsnInPorts128Ver12);
            return oxmBsnInPorts128Ver12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmBsnInPorts128Ver12Funnel FUNNEL = new OFOxmBsnInPorts128Ver12Funnel();
    static class OFOxmBsnInPorts128Ver12Funnel implements Funnel<OFOxmBsnInPorts128Ver12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmBsnInPorts128Ver12 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x30020L
            sink.putInt(0x30020);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmBsnInPorts128Ver12> {
        @Override
        public void write(ChannelBuffer bb, OFOxmBsnInPorts128Ver12 message) {
            // fixed value property typeLen = 0x30020L
            bb.writeInt(0x30020);
            message.value.write16Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmBsnInPorts128Ver12(");
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
        OFOxmBsnInPorts128Ver12 other = (OFOxmBsnInPorts128Ver12) obj;

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
