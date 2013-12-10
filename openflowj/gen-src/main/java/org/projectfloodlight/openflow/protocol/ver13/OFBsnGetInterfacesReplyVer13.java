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
import java.util.List;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnGetInterfacesReplyVer13 implements OFBsnGetInterfacesReply {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnGetInterfacesReplyVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 16;

        private final static long DEFAULT_XID = 0x0L;
        private final static List<OFBsnInterface> DEFAULT_INTERFACES = ImmutableList.<OFBsnInterface>of();

    // OF message fields
    private final long xid;
    private final List<OFBsnInterface> interfaces;
//
    // Immutable default instance
    final static OFBsnGetInterfacesReplyVer13 DEFAULT = new OFBsnGetInterfacesReplyVer13(
        DEFAULT_XID, DEFAULT_INTERFACES
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnGetInterfacesReplyVer13(long xid, List<OFBsnInterface> interfaces) {
        this.xid = xid;
        this.interfaces = interfaces;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0xaL;
    }

    @Override
    public List<OFBsnInterface> getInterfaces() {
        return interfaces;
    }



    public OFBsnGetInterfacesReply.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnGetInterfacesReply.Builder {
        final OFBsnGetInterfacesReplyVer13 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean interfacesSet;
        private List<OFBsnInterface> interfaces;

        BuilderWithParent(OFBsnGetInterfacesReplyVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnGetInterfacesReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0xaL;
    }

    @Override
    public List<OFBsnInterface> getInterfaces() {
        return interfaces;
    }

    @Override
    public OFBsnGetInterfacesReply.Builder setInterfaces(List<OFBsnInterface> interfaces) {
        this.interfaces = interfaces;
        this.interfacesSet = true;
        return this;
    }


        @Override
        public OFBsnGetInterfacesReply build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                List<OFBsnInterface> interfaces = this.interfacesSet ? this.interfaces : parentMessage.interfaces;
                if(interfaces == null)
                    throw new NullPointerException("Property interfaces must not be null");

                //
                return new OFBsnGetInterfacesReplyVer13(
                    xid,
                    interfaces
                );
        }

    }

    static class Builder implements OFBsnGetInterfacesReply.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean interfacesSet;
        private List<OFBsnInterface> interfaces;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnGetInterfacesReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0xaL;
    }

    @Override
    public List<OFBsnInterface> getInterfaces() {
        return interfaces;
    }

    @Override
    public OFBsnGetInterfacesReply.Builder setInterfaces(List<OFBsnInterface> interfaces) {
        this.interfaces = interfaces;
        this.interfacesSet = true;
        return this;
    }
//
        @Override
        public OFBsnGetInterfacesReply build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            List<OFBsnInterface> interfaces = this.interfacesSet ? this.interfaces : DEFAULT_INTERFACES;
            if(interfaces == null)
                throw new NullPointerException("Property interfaces must not be null");


            return new OFBsnGetInterfacesReplyVer13(
                    xid,
                    interfaces
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnGetInterfacesReply> {
        @Override
        public OFBsnGetInterfacesReply readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 4
            byte version = bb.readByte();
            if(version != (byte) 0x4)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_13(4), got="+version);
            // fixed value property type == 4
            byte type = bb.readByte();
            if(type != (byte) 0x4)
                throw new OFParseError("Wrong type: Expected=OFType.EXPERIMENTER(4), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            // fixed value property subtype == 0xaL
            int subtype = bb.readInt();
            if(subtype != 0xa)
                throw new OFParseError("Wrong subtype: Expected=0xaL(0xaL), got="+subtype);
            List<OFBsnInterface> interfaces = ChannelUtils.readList(bb, length - (bb.readerIndex() - start), OFBsnInterfaceVer13.READER);

            OFBsnGetInterfacesReplyVer13 bsnGetInterfacesReplyVer13 = new OFBsnGetInterfacesReplyVer13(
                    xid,
                      interfaces
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnGetInterfacesReplyVer13);
            return bsnGetInterfacesReplyVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnGetInterfacesReplyVer13Funnel FUNNEL = new OFBsnGetInterfacesReplyVer13Funnel();
    static class OFBsnGetInterfacesReplyVer13Funnel implements Funnel<OFBsnGetInterfacesReplyVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnGetInterfacesReplyVer13 message, PrimitiveSink sink) {
            // fixed value property version = 4
            sink.putByte((byte) 0x4);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0xaL
            sink.putInt(0xa);
            FunnelUtils.putList(message.interfaces, sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnGetInterfacesReplyVer13> {
        @Override
        public void write(ChannelBuffer bb, OFBsnGetInterfacesReplyVer13 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 4
            bb.writeByte((byte) 0x4);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0xaL
            bb.writeInt(0xa);
            ChannelUtils.writeList(bb, message.interfaces);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnGetInterfacesReplyVer13(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("interfaces=").append(interfaces);
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
        OFBsnGetInterfacesReplyVer13 other = (OFBsnGetInterfacesReplyVer13) obj;

        if( xid != other.xid)
            return false;
        if (interfaces == null) {
            if (other.interfaces != null)
                return false;
        } else if (!interfaces.equals(other.interfaces))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((interfaces == null) ? 0 : interfaces.hashCode());
        return result;
    }

}
