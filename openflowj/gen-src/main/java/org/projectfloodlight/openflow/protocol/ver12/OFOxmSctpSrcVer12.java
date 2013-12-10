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

class OFOxmSctpSrcVer12 implements OFOxmSctpSrc {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmSctpSrcVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 6;

        private final static TransportPort DEFAULT_VALUE = TransportPort.NONE;

    // OF message fields
    private final TransportPort value;
//
    // Immutable default instance
    final static OFOxmSctpSrcVer12 DEFAULT = new OFOxmSctpSrcVer12(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmSctpSrcVer12(TransportPort value) {
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80002202L;
    }

    @Override
    public TransportPort getValue() {
        return value;
    }

    @Override
    public MatchField<TransportPort> getMatchField() {
        return MatchField.SCTP_SRC;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<TransportPort> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public TransportPort getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



    public OFOxmSctpSrc.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmSctpSrc.Builder {
        final OFOxmSctpSrcVer12 parentMessage;

        // OF message fields
        private boolean valueSet;
        private TransportPort value;

        BuilderWithParent(OFOxmSctpSrcVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80002202L;
    }

    @Override
    public TransportPort getValue() {
        return value;
    }

    @Override
    public OFOxmSctpSrc.Builder setValue(TransportPort value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<TransportPort> getMatchField() {
        return MatchField.SCTP_SRC;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<TransportPort> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public TransportPort getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



        @Override
        public OFOxmSctpSrc build() {
                TransportPort value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmSctpSrcVer12(
                    value
                );
        }

    }

    static class Builder implements OFOxmSctpSrc.Builder {
        // OF message fields
        private boolean valueSet;
        private TransportPort value;

    @Override
    public long getTypeLen() {
        return 0x80002202L;
    }

    @Override
    public TransportPort getValue() {
        return value;
    }

    @Override
    public OFOxmSctpSrc.Builder setValue(TransportPort value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<TransportPort> getMatchField() {
        return MatchField.SCTP_SRC;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<TransportPort> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public TransportPort getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

//
        @Override
        public OFOxmSctpSrc build() {
            TransportPort value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmSctpSrcVer12(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmSctpSrc> {
        @Override
        public OFOxmSctpSrc readFrom(ChannelBuffer bb) throws OFParseError {
            // fixed value property typeLen == 0x80002202L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80002202)
                throw new OFParseError("Wrong typeLen: Expected=0x80002202L(0x80002202L), got="+typeLen);
            TransportPort value = TransportPort.read2Bytes(bb);

            OFOxmSctpSrcVer12 oxmSctpSrcVer12 = new OFOxmSctpSrcVer12(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmSctpSrcVer12);
            return oxmSctpSrcVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmSctpSrcVer12Funnel FUNNEL = new OFOxmSctpSrcVer12Funnel();
    static class OFOxmSctpSrcVer12Funnel implements Funnel<OFOxmSctpSrcVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmSctpSrcVer12 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80002202L
            sink.putInt((int) 0x80002202);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmSctpSrcVer12> {
        @Override
        public void write(ChannelBuffer bb, OFOxmSctpSrcVer12 message) {
            // fixed value property typeLen = 0x80002202L
            bb.writeInt((int) 0x80002202);
            message.value.write2Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmSctpSrcVer12(");
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
        OFOxmSctpSrcVer12 other = (OFOxmSctpSrcVer12) obj;

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
