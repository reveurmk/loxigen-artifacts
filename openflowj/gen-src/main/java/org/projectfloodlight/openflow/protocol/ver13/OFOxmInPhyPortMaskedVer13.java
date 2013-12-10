// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver13;

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

class OFOxmInPhyPortMaskedVer13 implements OFOxmInPhyPortMasked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmInPhyPortMaskedVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 12;

        private final static OFPort DEFAULT_VALUE = OFPort.ANY;
        private final static OFPort DEFAULT_VALUE_MASK = OFPort.ANY;

    // OF message fields
    private final OFPort value;
    private final OFPort mask;
//
    // Immutable default instance
    final static OFOxmInPhyPortMaskedVer13 DEFAULT = new OFOxmInPhyPortMaskedVer13(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmInPhyPortMaskedVer13(OFPort value, OFPort mask) {
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80000308L;
    }

    @Override
    public OFPort getValue() {
        return value;
    }

    @Override
    public OFPort getMask() {
        return mask;
    }

    @Override
    public MatchField<OFPort> getMatchField() {
        return MatchField.IN_PHY_PORT;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<OFPort> getCanonical() {
        if (OFPort.NO_MASK.equals(mask)) {
            return new OFOxmInPhyPortVer13(value);
        } else if(OFPort.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFOxmInPhyPortMasked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmInPhyPortMasked.Builder {
        final OFOxmInPhyPortMaskedVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFPort value;
        private boolean maskSet;
        private OFPort mask;

        BuilderWithParent(OFOxmInPhyPortMaskedVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80000308L;
    }

    @Override
    public OFPort getValue() {
        return value;
    }

    @Override
    public OFOxmInPhyPortMasked.Builder setValue(OFPort value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFPort getMask() {
        return mask;
    }

    @Override
    public OFOxmInPhyPortMasked.Builder setMask(OFPort mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<OFPort> getMatchField() {
        return MatchField.IN_PHY_PORT;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<OFPort> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFOxmInPhyPortMasked build() {
                OFPort value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                OFPort mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmInPhyPortMaskedVer13(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmInPhyPortMasked.Builder {
        // OF message fields
        private boolean valueSet;
        private OFPort value;
        private boolean maskSet;
        private OFPort mask;

    @Override
    public long getTypeLen() {
        return 0x80000308L;
    }

    @Override
    public OFPort getValue() {
        return value;
    }

    @Override
    public OFOxmInPhyPortMasked.Builder setValue(OFPort value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFPort getMask() {
        return mask;
    }

    @Override
    public OFOxmInPhyPortMasked.Builder setMask(OFPort mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<OFPort> getMatchField() {
        return MatchField.IN_PHY_PORT;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<OFPort> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFOxmInPhyPortMasked build() {
            OFPort value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            OFPort mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmInPhyPortMaskedVer13(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmInPhyPortMasked> {
        @Override
        public OFOxmInPhyPortMasked readFrom(ChannelBuffer bb) throws OFParseError {
            // fixed value property typeLen == 0x80000308L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80000308)
                throw new OFParseError("Wrong typeLen: Expected=0x80000308L(0x80000308L), got="+typeLen);
            OFPort value = OFPort.read4Bytes(bb);
            OFPort mask = OFPort.read4Bytes(bb);

            OFOxmInPhyPortMaskedVer13 oxmInPhyPortMaskedVer13 = new OFOxmInPhyPortMaskedVer13(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmInPhyPortMaskedVer13);
            return oxmInPhyPortMaskedVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmInPhyPortMaskedVer13Funnel FUNNEL = new OFOxmInPhyPortMaskedVer13Funnel();
    static class OFOxmInPhyPortMaskedVer13Funnel implements Funnel<OFOxmInPhyPortMaskedVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmInPhyPortMaskedVer13 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80000308L
            sink.putInt((int) 0x80000308);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmInPhyPortMaskedVer13> {
        @Override
        public void write(ChannelBuffer bb, OFOxmInPhyPortMaskedVer13 message) {
            // fixed value property typeLen = 0x80000308L
            bb.writeInt((int) 0x80000308);
            message.value.write4Bytes(bb);
            message.mask.write4Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmInPhyPortMaskedVer13(");
        b.append("value=").append(value);
        b.append(", ");
        b.append("mask=").append(mask);
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
        OFOxmInPhyPortMaskedVer13 other = (OFOxmInPhyPortMaskedVer13) obj;

        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        if (mask == null) {
            if (other.mask != null)
                return false;
        } else if (!mask.equals(other.mask))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + ((mask == null) ? 0 : mask.hashCode());
        return result;
    }

}
