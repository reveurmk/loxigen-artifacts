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

class OFInstructionWriteActionsVer13 implements OFInstructionWriteActions {
    private static final Logger logger = LoggerFactory.getLogger(OFInstructionWriteActionsVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 8;

        private final static List<OFAction> DEFAULT_ACTIONS = ImmutableList.<OFAction>of();

    // OF message fields
    private final List<OFAction> actions;
//
    // Immutable default instance
    final static OFInstructionWriteActionsVer13 DEFAULT = new OFInstructionWriteActionsVer13(
        DEFAULT_ACTIONS
    );

    // package private constructor - used by readers, builders, and factory
    OFInstructionWriteActionsVer13(List<OFAction> actions) {
        this.actions = actions;
    }

    // Accessors for OF message fields
    @Override
    public OFInstructionType getType() {
        return OFInstructionType.WRITE_ACTIONS;
    }

    @Override
    public List<OFAction> getActions() {
        return actions;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFInstructionWriteActions.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFInstructionWriteActions.Builder {
        final OFInstructionWriteActionsVer13 parentMessage;

        // OF message fields
        private boolean actionsSet;
        private List<OFAction> actions;

        BuilderWithParent(OFInstructionWriteActionsVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFInstructionType getType() {
        return OFInstructionType.WRITE_ACTIONS;
    }

    @Override
    public List<OFAction> getActions() {
        return actions;
    }

    @Override
    public OFInstructionWriteActions.Builder setActions(List<OFAction> actions) {
        this.actions = actions;
        this.actionsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFInstructionWriteActions build() {
                List<OFAction> actions = this.actionsSet ? this.actions : parentMessage.actions;
                if(actions == null)
                    throw new NullPointerException("Property actions must not be null");

                //
                return new OFInstructionWriteActionsVer13(
                    actions
                );
        }

    }

    static class Builder implements OFInstructionWriteActions.Builder {
        // OF message fields
        private boolean actionsSet;
        private List<OFAction> actions;

    @Override
    public OFInstructionType getType() {
        return OFInstructionType.WRITE_ACTIONS;
    }

    @Override
    public List<OFAction> getActions() {
        return actions;
    }

    @Override
    public OFInstructionWriteActions.Builder setActions(List<OFAction> actions) {
        this.actions = actions;
        this.actionsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFInstructionWriteActions build() {
            List<OFAction> actions = this.actionsSet ? this.actions : DEFAULT_ACTIONS;
            if(actions == null)
                throw new NullPointerException("Property actions must not be null");


            return new OFInstructionWriteActionsVer13(
                    actions
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFInstructionWriteActions> {
        @Override
        public OFInstructionWriteActions readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 3
            short type = bb.readShort();
            if(type != (short) 0x3)
                throw new OFParseError("Wrong type: Expected=OFInstructionType.WRITE_ACTIONS(3), got="+type);
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
            // pad: 4 bytes
            bb.skipBytes(4);
            List<OFAction> actions = ChannelUtils.readList(bb, length - (bb.readerIndex() - start), OFActionVer13.READER);

            OFInstructionWriteActionsVer13 instructionWriteActionsVer13 = new OFInstructionWriteActionsVer13(
                    actions
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", instructionWriteActionsVer13);
            return instructionWriteActionsVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFInstructionWriteActionsVer13Funnel FUNNEL = new OFInstructionWriteActionsVer13Funnel();
    static class OFInstructionWriteActionsVer13Funnel implements Funnel<OFInstructionWriteActionsVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFInstructionWriteActionsVer13 message, PrimitiveSink sink) {
            // fixed value property type = 3
            sink.putShort((short) 0x3);
            // FIXME: skip funnel of length
            // skip pad (4 bytes)
            FunnelUtils.putList(message.actions, sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFInstructionWriteActionsVer13> {
        @Override
        public void write(ChannelBuffer bb, OFInstructionWriteActionsVer13 message) {
            int startIndex = bb.writerIndex();
            // fixed value property type = 3
            bb.writeShort((short) 0x3);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            // pad: 4 bytes
            bb.writeZero(4);
            ChannelUtils.writeList(bb, message.actions);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFInstructionWriteActionsVer13(");
        b.append("actions=").append(actions);
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
        OFInstructionWriteActionsVer13 other = (OFInstructionWriteActionsVer13) obj;

        if (actions == null) {
            if (other.actions != null)
                return false;
        } else if (!actions.equals(other.actions))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((actions == null) ? 0 : actions.hashCode());
        return result;
    }

}
