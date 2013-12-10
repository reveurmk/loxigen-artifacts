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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnVirtualPortCreateReplyVer11 implements OFBsnVirtualPortCreateReply {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnVirtualPortCreateReplyVer11.class);
    // version: 1.1
    final static byte WIRE_VERSION = 2;
    final static int LENGTH = 24;

        private final static long DEFAULT_XID = 0x0L;
        private final static long DEFAULT_STATUS = 0x0L;
        private final static long DEFAULT_VPORT_NO = 0x0L;

    // OF message fields
    private final long xid;
    private final long status;
    private final long vportNo;
//
    // Immutable default instance
    final static OFBsnVirtualPortCreateReplyVer11 DEFAULT = new OFBsnVirtualPortCreateReplyVer11(
        DEFAULT_XID, DEFAULT_STATUS, DEFAULT_VPORT_NO
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnVirtualPortCreateReplyVer11(long xid, long status, long vportNo) {
        this.xid = xid;
        this.status = status;
        this.vportNo = vportNo;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
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
        return 0x10L;
    }

    @Override
    public long getStatus() {
        return status;
    }

    @Override
    public long getVportNo() {
        return vportNo;
    }



    public OFBsnVirtualPortCreateReply.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnVirtualPortCreateReply.Builder {
        final OFBsnVirtualPortCreateReplyVer11 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean statusSet;
        private long status;
        private boolean vportNoSet;
        private long vportNo;

        BuilderWithParent(OFBsnVirtualPortCreateReplyVer11 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
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
    public OFBsnVirtualPortCreateReply.Builder setXid(long xid) {
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
        return 0x10L;
    }

    @Override
    public long getStatus() {
        return status;
    }

    @Override
    public OFBsnVirtualPortCreateReply.Builder setStatus(long status) {
        this.status = status;
        this.statusSet = true;
        return this;
    }
    @Override
    public long getVportNo() {
        return vportNo;
    }

    @Override
    public OFBsnVirtualPortCreateReply.Builder setVportNo(long vportNo) {
        this.vportNo = vportNo;
        this.vportNoSet = true;
        return this;
    }


        @Override
        public OFBsnVirtualPortCreateReply build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                long status = this.statusSet ? this.status : parentMessage.status;
                long vportNo = this.vportNoSet ? this.vportNo : parentMessage.vportNo;

                //
                return new OFBsnVirtualPortCreateReplyVer11(
                    xid,
                    status,
                    vportNo
                );
        }

    }

    static class Builder implements OFBsnVirtualPortCreateReply.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean statusSet;
        private long status;
        private boolean vportNoSet;
        private long vportNo;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
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
    public OFBsnVirtualPortCreateReply.Builder setXid(long xid) {
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
        return 0x10L;
    }

    @Override
    public long getStatus() {
        return status;
    }

    @Override
    public OFBsnVirtualPortCreateReply.Builder setStatus(long status) {
        this.status = status;
        this.statusSet = true;
        return this;
    }
    @Override
    public long getVportNo() {
        return vportNo;
    }

    @Override
    public OFBsnVirtualPortCreateReply.Builder setVportNo(long vportNo) {
        this.vportNo = vportNo;
        this.vportNoSet = true;
        return this;
    }
//
        @Override
        public OFBsnVirtualPortCreateReply build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            long status = this.statusSet ? this.status : DEFAULT_STATUS;
            long vportNo = this.vportNoSet ? this.vportNo : DEFAULT_VPORT_NO;


            return new OFBsnVirtualPortCreateReplyVer11(
                    xid,
                    status,
                    vportNo
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnVirtualPortCreateReply> {
        @Override
        public OFBsnVirtualPortCreateReply readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 2
            byte version = bb.readByte();
            if(version != (byte) 0x2)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_11(2), got="+version);
            // fixed value property type == 4
            byte type = bb.readByte();
            if(type != (byte) 0x4)
                throw new OFParseError("Wrong type: Expected=OFType.EXPERIMENTER(4), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 24)
                throw new OFParseError("Wrong length: Expected=24(24), got="+length);
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
            // fixed value property subtype == 0x10L
            int subtype = bb.readInt();
            if(subtype != 0x10)
                throw new OFParseError("Wrong subtype: Expected=0x10L(0x10L), got="+subtype);
            long status = U32.f(bb.readInt());
            long vportNo = U32.f(bb.readInt());

            OFBsnVirtualPortCreateReplyVer11 bsnVirtualPortCreateReplyVer11 = new OFBsnVirtualPortCreateReplyVer11(
                    xid,
                      status,
                      vportNo
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnVirtualPortCreateReplyVer11);
            return bsnVirtualPortCreateReplyVer11;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnVirtualPortCreateReplyVer11Funnel FUNNEL = new OFBsnVirtualPortCreateReplyVer11Funnel();
    static class OFBsnVirtualPortCreateReplyVer11Funnel implements Funnel<OFBsnVirtualPortCreateReplyVer11> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnVirtualPortCreateReplyVer11 message, PrimitiveSink sink) {
            // fixed value property version = 2
            sink.putByte((byte) 0x2);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // fixed value property length = 24
            sink.putShort((short) 0x18);
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x10L
            sink.putInt(0x10);
            sink.putLong(message.status);
            sink.putLong(message.vportNo);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnVirtualPortCreateReplyVer11> {
        @Override
        public void write(ChannelBuffer bb, OFBsnVirtualPortCreateReplyVer11 message) {
            // fixed value property version = 2
            bb.writeByte((byte) 0x2);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // fixed value property length = 24
            bb.writeShort((short) 0x18);
            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x10L
            bb.writeInt(0x10);
            bb.writeInt(U32.t(message.status));
            bb.writeInt(U32.t(message.vportNo));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnVirtualPortCreateReplyVer11(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("status=").append(status);
        b.append(", ");
        b.append("vportNo=").append(vportNo);
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
        OFBsnVirtualPortCreateReplyVer11 other = (OFBsnVirtualPortCreateReplyVer11) obj;

        if( xid != other.xid)
            return false;
        if( status != other.status)
            return false;
        if( vportNo != other.vportNo)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime *  (int) (status ^ (status >>> 32));
        result = prime *  (int) (vportNo ^ (vportNo >>> 32));
        return result;
    }

}
