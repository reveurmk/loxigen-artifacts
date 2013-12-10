// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver11;

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
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFActionSetNwTtlVer11 implements OFActionSetNwTtl {
    private static final Logger logger = LoggerFactory.getLogger(OFActionSetNwTtlVer11.class);
    // version: 1.1
    final static byte WIRE_VERSION = 2;
    final static int LENGTH = 8;

        private final static short DEFAULT_NW_TTL = (short) 0x0;

    // OF message fields
    private final short nwTtl;
//
    // Immutable default instance
    final static OFActionSetNwTtlVer11 DEFAULT = new OFActionSetNwTtlVer11(
        DEFAULT_NW_TTL
    );

    // package private constructor - used by readers, builders, and factory
    OFActionSetNwTtlVer11(short nwTtl) {
        this.nwTtl = nwTtl;
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.SET_NW_TTL;
    }

    @Override
    public short getNwTtl() {
        return nwTtl;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



    public OFActionSetNwTtl.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFActionSetNwTtl.Builder {
        final OFActionSetNwTtlVer11 parentMessage;

        // OF message fields
        private boolean nwTtlSet;
        private short nwTtl;

        BuilderWithParent(OFActionSetNwTtlVer11 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFActionType getType() {
        return OFActionType.SET_NW_TTL;
    }

    @Override
    public short getNwTtl() {
        return nwTtl;
    }

    @Override
    public OFActionSetNwTtl.Builder setNwTtl(short nwTtl) {
        this.nwTtl = nwTtl;
        this.nwTtlSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



        @Override
        public OFActionSetNwTtl build() {
                short nwTtl = this.nwTtlSet ? this.nwTtl : parentMessage.nwTtl;

                //
                return new OFActionSetNwTtlVer11(
                    nwTtl
                );
        }

    }

    static class Builder implements OFActionSetNwTtl.Builder {
        // OF message fields
        private boolean nwTtlSet;
        private short nwTtl;

    @Override
    public OFActionType getType() {
        return OFActionType.SET_NW_TTL;
    }

    @Override
    public short getNwTtl() {
        return nwTtl;
    }

    @Override
    public OFActionSetNwTtl.Builder setNwTtl(short nwTtl) {
        this.nwTtl = nwTtl;
        this.nwTtlSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }

//
        @Override
        public OFActionSetNwTtl build() {
            short nwTtl = this.nwTtlSet ? this.nwTtl : DEFAULT_NW_TTL;


            return new OFActionSetNwTtlVer11(
                    nwTtl
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFActionSetNwTtl> {
        @Override
        public OFActionSetNwTtl readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 23
            short type = bb.readShort();
            if(type != (short) 0x17)
                throw new OFParseError("Wrong type: Expected=OFActionType.SET_NW_TTL(23), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 8)
                throw new OFParseError("Wrong length: Expected=8(8), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            short nwTtl = U8.f(bb.readByte());
            // pad: 3 bytes
            bb.skipBytes(3);

            OFActionSetNwTtlVer11 actionSetNwTtlVer11 = new OFActionSetNwTtlVer11(
                    nwTtl
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", actionSetNwTtlVer11);
            return actionSetNwTtlVer11;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionSetNwTtlVer11Funnel FUNNEL = new OFActionSetNwTtlVer11Funnel();
    static class OFActionSetNwTtlVer11Funnel implements Funnel<OFActionSetNwTtlVer11> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionSetNwTtlVer11 message, PrimitiveSink sink) {
            // fixed value property type = 23
            sink.putShort((short) 0x17);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            sink.putShort(message.nwTtl);
            // skip pad (3 bytes)
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionSetNwTtlVer11> {
        @Override
        public void write(ChannelBuffer bb, OFActionSetNwTtlVer11 message) {
            // fixed value property type = 23
            bb.writeShort((short) 0x17);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            bb.writeByte(U8.t(message.nwTtl));
            // pad: 3 bytes
            bb.writeZero(3);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionSetNwTtlVer11(");
        b.append("nwTtl=").append(nwTtl);
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
        OFActionSetNwTtlVer11 other = (OFActionSetNwTtlVer11) obj;

        if( nwTtl != other.nwTtl)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + nwTtl;
        return result;
    }

}
