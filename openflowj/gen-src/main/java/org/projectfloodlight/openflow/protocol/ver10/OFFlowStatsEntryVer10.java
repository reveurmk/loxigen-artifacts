// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

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

class OFFlowStatsEntryVer10 implements OFFlowStatsEntry {
    private static final Logger logger = LoggerFactory.getLogger(OFFlowStatsEntryVer10.class);
    // version: 1.0
    final static byte WIRE_VERSION = 1;
    final static int MINIMUM_LENGTH = 88;

        private final static TableId DEFAULT_TABLE_ID = TableId.ALL;
        private final static Match DEFAULT_MATCH = OFFactoryVer10.MATCH_WILDCARD_ALL;
        private final static long DEFAULT_DURATION_SEC = 0x0L;
        private final static long DEFAULT_DURATION_NSEC = 0x0L;
        private final static int DEFAULT_PRIORITY = 0x0;
        private final static int DEFAULT_IDLE_TIMEOUT = 0x0;
        private final static int DEFAULT_HARD_TIMEOUT = 0x0;
        private final static U64 DEFAULT_COOKIE = U64.ZERO;
        private final static U64 DEFAULT_PACKET_COUNT = U64.ZERO;
        private final static U64 DEFAULT_BYTE_COUNT = U64.ZERO;
        private final static List<OFAction> DEFAULT_ACTIONS = ImmutableList.<OFAction>of();

    // OF message fields
    private final TableId tableId;
    private final Match match;
    private final long durationSec;
    private final long durationNsec;
    private final int priority;
    private final int idleTimeout;
    private final int hardTimeout;
    private final U64 cookie;
    private final U64 packetCount;
    private final U64 byteCount;
    private final List<OFAction> actions;
//
    // Immutable default instance
    final static OFFlowStatsEntryVer10 DEFAULT = new OFFlowStatsEntryVer10(
        DEFAULT_TABLE_ID, DEFAULT_MATCH, DEFAULT_DURATION_SEC, DEFAULT_DURATION_NSEC, DEFAULT_PRIORITY, DEFAULT_IDLE_TIMEOUT, DEFAULT_HARD_TIMEOUT, DEFAULT_COOKIE, DEFAULT_PACKET_COUNT, DEFAULT_BYTE_COUNT, DEFAULT_ACTIONS
    );

    // package private constructor - used by readers, builders, and factory
    OFFlowStatsEntryVer10(TableId tableId, Match match, long durationSec, long durationNsec, int priority, int idleTimeout, int hardTimeout, U64 cookie, U64 packetCount, U64 byteCount, List<OFAction> actions) {
        this.tableId = tableId;
        this.match = match;
        this.durationSec = durationSec;
        this.durationNsec = durationNsec;
        this.priority = priority;
        this.idleTimeout = idleTimeout;
        this.hardTimeout = hardTimeout;
        this.cookie = cookie;
        this.packetCount = packetCount;
        this.byteCount = byteCount;
        this.actions = actions;
    }

    // Accessors for OF message fields
    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public long getDurationSec() {
        return durationSec;
    }

    @Override
    public long getDurationNsec() {
        return durationNsec;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public int getIdleTimeout() {
        return idleTimeout;
    }

    @Override
    public int getHardTimeout() {
        return hardTimeout;
    }

    @Override
    public U64 getCookie() {
        return cookie;
    }

    @Override
    public U64 getPacketCount() {
        return packetCount;
    }

    @Override
    public U64 getByteCount() {
        return byteCount;
    }

    @Override
    public Match getMatch() {
        return match;
    }

    @Override
    public List<OFInstruction> getInstructions()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property instructions not supported in version 1.0");
    }

    @Override
    public List<OFAction> getActions() {
        return actions;
    }

    @Override
    public int getFlags()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property flags not supported in version 1.0");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }



    public OFFlowStatsEntry.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFFlowStatsEntry.Builder {
        final OFFlowStatsEntryVer10 parentMessage;

        // OF message fields
        private boolean tableIdSet;
        private TableId tableId;
        private boolean matchSet;
        private Match match;
        private boolean durationSecSet;
        private long durationSec;
        private boolean durationNsecSet;
        private long durationNsec;
        private boolean prioritySet;
        private int priority;
        private boolean idleTimeoutSet;
        private int idleTimeout;
        private boolean hardTimeoutSet;
        private int hardTimeout;
        private boolean cookieSet;
        private U64 cookie;
        private boolean packetCountSet;
        private U64 packetCount;
        private boolean byteCountSet;
        private U64 byteCount;
        private boolean actionsSet;
        private List<OFAction> actions;

        BuilderWithParent(OFFlowStatsEntryVer10 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public OFFlowStatsEntry.Builder setTableId(TableId tableId) {
        this.tableId = tableId;
        this.tableIdSet = true;
        return this;
    }
    @Override
    public long getDurationSec() {
        return durationSec;
    }

    @Override
    public OFFlowStatsEntry.Builder setDurationSec(long durationSec) {
        this.durationSec = durationSec;
        this.durationSecSet = true;
        return this;
    }
    @Override
    public long getDurationNsec() {
        return durationNsec;
    }

    @Override
    public OFFlowStatsEntry.Builder setDurationNsec(long durationNsec) {
        this.durationNsec = durationNsec;
        this.durationNsecSet = true;
        return this;
    }
    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public OFFlowStatsEntry.Builder setPriority(int priority) {
        this.priority = priority;
        this.prioritySet = true;
        return this;
    }
    @Override
    public int getIdleTimeout() {
        return idleTimeout;
    }

    @Override
    public OFFlowStatsEntry.Builder setIdleTimeout(int idleTimeout) {
        this.idleTimeout = idleTimeout;
        this.idleTimeoutSet = true;
        return this;
    }
    @Override
    public int getHardTimeout() {
        return hardTimeout;
    }

    @Override
    public OFFlowStatsEntry.Builder setHardTimeout(int hardTimeout) {
        this.hardTimeout = hardTimeout;
        this.hardTimeoutSet = true;
        return this;
    }
    @Override
    public U64 getCookie() {
        return cookie;
    }

    @Override
    public OFFlowStatsEntry.Builder setCookie(U64 cookie) {
        this.cookie = cookie;
        this.cookieSet = true;
        return this;
    }
    @Override
    public U64 getPacketCount() {
        return packetCount;
    }

    @Override
    public OFFlowStatsEntry.Builder setPacketCount(U64 packetCount) {
        this.packetCount = packetCount;
        this.packetCountSet = true;
        return this;
    }
    @Override
    public U64 getByteCount() {
        return byteCount;
    }

    @Override
    public OFFlowStatsEntry.Builder setByteCount(U64 byteCount) {
        this.byteCount = byteCount;
        this.byteCountSet = true;
        return this;
    }
    @Override
    public Match getMatch() {
        return match;
    }

    @Override
    public OFFlowStatsEntry.Builder setMatch(Match match) {
        this.match = match;
        this.matchSet = true;
        return this;
    }
    @Override
    public List<OFInstruction> getInstructions()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property instructions not supported in version 1.0");
    }

    @Override
    public OFFlowStatsEntry.Builder setInstructions(List<OFInstruction> instructions) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property instructions not supported in version 1.0");
    }
    @Override
    public List<OFAction> getActions() {
        return actions;
    }

    @Override
    public OFFlowStatsEntry.Builder setActions(List<OFAction> actions) {
        this.actions = actions;
        this.actionsSet = true;
        return this;
    }
    @Override
    public int getFlags()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property flags not supported in version 1.0");
    }

    @Override
    public OFFlowStatsEntry.Builder setFlags(int flags) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property flags not supported in version 1.0");
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }



        @Override
        public OFFlowStatsEntry build() {
                TableId tableId = this.tableIdSet ? this.tableId : parentMessage.tableId;
                if(tableId == null)
                    throw new NullPointerException("Property tableId must not be null");
                Match match = this.matchSet ? this.match : parentMessage.match;
                if(match == null)
                    throw new NullPointerException("Property match must not be null");
                long durationSec = this.durationSecSet ? this.durationSec : parentMessage.durationSec;
                long durationNsec = this.durationNsecSet ? this.durationNsec : parentMessage.durationNsec;
                int priority = this.prioritySet ? this.priority : parentMessage.priority;
                int idleTimeout = this.idleTimeoutSet ? this.idleTimeout : parentMessage.idleTimeout;
                int hardTimeout = this.hardTimeoutSet ? this.hardTimeout : parentMessage.hardTimeout;
                U64 cookie = this.cookieSet ? this.cookie : parentMessage.cookie;
                if(cookie == null)
                    throw new NullPointerException("Property cookie must not be null");
                U64 packetCount = this.packetCountSet ? this.packetCount : parentMessage.packetCount;
                if(packetCount == null)
                    throw new NullPointerException("Property packetCount must not be null");
                U64 byteCount = this.byteCountSet ? this.byteCount : parentMessage.byteCount;
                if(byteCount == null)
                    throw new NullPointerException("Property byteCount must not be null");
                List<OFAction> actions = this.actionsSet ? this.actions : parentMessage.actions;
                if(actions == null)
                    throw new NullPointerException("Property actions must not be null");

                //
                return new OFFlowStatsEntryVer10(
                    tableId,
                    match,
                    durationSec,
                    durationNsec,
                    priority,
                    idleTimeout,
                    hardTimeout,
                    cookie,
                    packetCount,
                    byteCount,
                    actions
                );
        }

    }

    static class Builder implements OFFlowStatsEntry.Builder {
        // OF message fields
        private boolean tableIdSet;
        private TableId tableId;
        private boolean matchSet;
        private Match match;
        private boolean durationSecSet;
        private long durationSec;
        private boolean durationNsecSet;
        private long durationNsec;
        private boolean prioritySet;
        private int priority;
        private boolean idleTimeoutSet;
        private int idleTimeout;
        private boolean hardTimeoutSet;
        private int hardTimeout;
        private boolean cookieSet;
        private U64 cookie;
        private boolean packetCountSet;
        private U64 packetCount;
        private boolean byteCountSet;
        private U64 byteCount;
        private boolean actionsSet;
        private List<OFAction> actions;

    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public OFFlowStatsEntry.Builder setTableId(TableId tableId) {
        this.tableId = tableId;
        this.tableIdSet = true;
        return this;
    }
    @Override
    public long getDurationSec() {
        return durationSec;
    }

    @Override
    public OFFlowStatsEntry.Builder setDurationSec(long durationSec) {
        this.durationSec = durationSec;
        this.durationSecSet = true;
        return this;
    }
    @Override
    public long getDurationNsec() {
        return durationNsec;
    }

    @Override
    public OFFlowStatsEntry.Builder setDurationNsec(long durationNsec) {
        this.durationNsec = durationNsec;
        this.durationNsecSet = true;
        return this;
    }
    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public OFFlowStatsEntry.Builder setPriority(int priority) {
        this.priority = priority;
        this.prioritySet = true;
        return this;
    }
    @Override
    public int getIdleTimeout() {
        return idleTimeout;
    }

    @Override
    public OFFlowStatsEntry.Builder setIdleTimeout(int idleTimeout) {
        this.idleTimeout = idleTimeout;
        this.idleTimeoutSet = true;
        return this;
    }
    @Override
    public int getHardTimeout() {
        return hardTimeout;
    }

    @Override
    public OFFlowStatsEntry.Builder setHardTimeout(int hardTimeout) {
        this.hardTimeout = hardTimeout;
        this.hardTimeoutSet = true;
        return this;
    }
    @Override
    public U64 getCookie() {
        return cookie;
    }

    @Override
    public OFFlowStatsEntry.Builder setCookie(U64 cookie) {
        this.cookie = cookie;
        this.cookieSet = true;
        return this;
    }
    @Override
    public U64 getPacketCount() {
        return packetCount;
    }

    @Override
    public OFFlowStatsEntry.Builder setPacketCount(U64 packetCount) {
        this.packetCount = packetCount;
        this.packetCountSet = true;
        return this;
    }
    @Override
    public U64 getByteCount() {
        return byteCount;
    }

    @Override
    public OFFlowStatsEntry.Builder setByteCount(U64 byteCount) {
        this.byteCount = byteCount;
        this.byteCountSet = true;
        return this;
    }
    @Override
    public Match getMatch() {
        return match;
    }

    @Override
    public OFFlowStatsEntry.Builder setMatch(Match match) {
        this.match = match;
        this.matchSet = true;
        return this;
    }
    @Override
    public List<OFInstruction> getInstructions()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property instructions not supported in version 1.0");
    }

    @Override
    public OFFlowStatsEntry.Builder setInstructions(List<OFInstruction> instructions) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property instructions not supported in version 1.0");
    }
    @Override
    public List<OFAction> getActions() {
        return actions;
    }

    @Override
    public OFFlowStatsEntry.Builder setActions(List<OFAction> actions) {
        this.actions = actions;
        this.actionsSet = true;
        return this;
    }
    @Override
    public int getFlags()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property flags not supported in version 1.0");
    }

    @Override
    public OFFlowStatsEntry.Builder setFlags(int flags) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property flags not supported in version 1.0");
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

//
        @Override
        public OFFlowStatsEntry build() {
            TableId tableId = this.tableIdSet ? this.tableId : DEFAULT_TABLE_ID;
            if(tableId == null)
                throw new NullPointerException("Property tableId must not be null");
            Match match = this.matchSet ? this.match : DEFAULT_MATCH;
            if(match == null)
                throw new NullPointerException("Property match must not be null");
            long durationSec = this.durationSecSet ? this.durationSec : DEFAULT_DURATION_SEC;
            long durationNsec = this.durationNsecSet ? this.durationNsec : DEFAULT_DURATION_NSEC;
            int priority = this.prioritySet ? this.priority : DEFAULT_PRIORITY;
            int idleTimeout = this.idleTimeoutSet ? this.idleTimeout : DEFAULT_IDLE_TIMEOUT;
            int hardTimeout = this.hardTimeoutSet ? this.hardTimeout : DEFAULT_HARD_TIMEOUT;
            U64 cookie = this.cookieSet ? this.cookie : DEFAULT_COOKIE;
            if(cookie == null)
                throw new NullPointerException("Property cookie must not be null");
            U64 packetCount = this.packetCountSet ? this.packetCount : DEFAULT_PACKET_COUNT;
            if(packetCount == null)
                throw new NullPointerException("Property packetCount must not be null");
            U64 byteCount = this.byteCountSet ? this.byteCount : DEFAULT_BYTE_COUNT;
            if(byteCount == null)
                throw new NullPointerException("Property byteCount must not be null");
            List<OFAction> actions = this.actionsSet ? this.actions : DEFAULT_ACTIONS;
            if(actions == null)
                throw new NullPointerException("Property actions must not be null");


            return new OFFlowStatsEntryVer10(
                    tableId,
                    match,
                    durationSec,
                    durationNsec,
                    priority,
                    idleTimeout,
                    hardTimeout,
                    cookie,
                    packetCount,
                    byteCount,
                    actions
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFFlowStatsEntry> {
        @Override
        public OFFlowStatsEntry readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
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
            TableId tableId = TableId.readByte(bb);
            // pad: 1 bytes
            bb.skipBytes(1);
            Match match = ChannelUtilsVer10.readOFMatch(bb);
            long durationSec = U32.f(bb.readInt());
            long durationNsec = U32.f(bb.readInt());
            int priority = U16.f(bb.readShort());
            int idleTimeout = U16.f(bb.readShort());
            int hardTimeout = U16.f(bb.readShort());
            // pad: 6 bytes
            bb.skipBytes(6);
            U64 cookie = U64.ofRaw(bb.readLong());
            U64 packetCount = U64.ofRaw(bb.readLong());
            U64 byteCount = U64.ofRaw(bb.readLong());
            List<OFAction> actions = ChannelUtils.readList(bb, length - (bb.readerIndex() - start), OFActionVer10.READER);

            OFFlowStatsEntryVer10 flowStatsEntryVer10 = new OFFlowStatsEntryVer10(
                    tableId,
                      match,
                      durationSec,
                      durationNsec,
                      priority,
                      idleTimeout,
                      hardTimeout,
                      cookie,
                      packetCount,
                      byteCount,
                      actions
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", flowStatsEntryVer10);
            return flowStatsEntryVer10;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFFlowStatsEntryVer10Funnel FUNNEL = new OFFlowStatsEntryVer10Funnel();
    static class OFFlowStatsEntryVer10Funnel implements Funnel<OFFlowStatsEntryVer10> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFFlowStatsEntryVer10 message, PrimitiveSink sink) {
            // FIXME: skip funnel of length
            message.tableId.putTo(sink);
            // skip pad (1 bytes)
            message.match.putTo(sink);
            sink.putLong(message.durationSec);
            sink.putLong(message.durationNsec);
            sink.putInt(message.priority);
            sink.putInt(message.idleTimeout);
            sink.putInt(message.hardTimeout);
            // skip pad (6 bytes)
            message.cookie.putTo(sink);
            message.packetCount.putTo(sink);
            message.byteCount.putTo(sink);
            FunnelUtils.putList(message.actions, sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFFlowStatsEntryVer10> {
        @Override
        public void write(ChannelBuffer bb, OFFlowStatsEntryVer10 message) {
            int startIndex = bb.writerIndex();
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            message.tableId.writeByte(bb);
            // pad: 1 bytes
            bb.writeZero(1);
            message.match.writeTo(bb);
            bb.writeInt(U32.t(message.durationSec));
            bb.writeInt(U32.t(message.durationNsec));
            bb.writeShort(U16.t(message.priority));
            bb.writeShort(U16.t(message.idleTimeout));
            bb.writeShort(U16.t(message.hardTimeout));
            // pad: 6 bytes
            bb.writeZero(6);
            bb.writeLong(message.cookie.getValue());
            bb.writeLong(message.packetCount.getValue());
            bb.writeLong(message.byteCount.getValue());
            ChannelUtils.writeList(bb, message.actions);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFFlowStatsEntryVer10(");
        b.append("tableId=").append(tableId);
        b.append(", ");
        b.append("match=").append(match);
        b.append(", ");
        b.append("durationSec=").append(durationSec);
        b.append(", ");
        b.append("durationNsec=").append(durationNsec);
        b.append(", ");
        b.append("priority=").append(priority);
        b.append(", ");
        b.append("idleTimeout=").append(idleTimeout);
        b.append(", ");
        b.append("hardTimeout=").append(hardTimeout);
        b.append(", ");
        b.append("cookie=").append(cookie);
        b.append(", ");
        b.append("packetCount=").append(packetCount);
        b.append(", ");
        b.append("byteCount=").append(byteCount);
        b.append(", ");
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
        OFFlowStatsEntryVer10 other = (OFFlowStatsEntryVer10) obj;

        if (tableId == null) {
            if (other.tableId != null)
                return false;
        } else if (!tableId.equals(other.tableId))
            return false;
        if (match == null) {
            if (other.match != null)
                return false;
        } else if (!match.equals(other.match))
            return false;
        if( durationSec != other.durationSec)
            return false;
        if( durationNsec != other.durationNsec)
            return false;
        if( priority != other.priority)
            return false;
        if( idleTimeout != other.idleTimeout)
            return false;
        if( hardTimeout != other.hardTimeout)
            return false;
        if (cookie == null) {
            if (other.cookie != null)
                return false;
        } else if (!cookie.equals(other.cookie))
            return false;
        if (packetCount == null) {
            if (other.packetCount != null)
                return false;
        } else if (!packetCount.equals(other.packetCount))
            return false;
        if (byteCount == null) {
            if (other.byteCount != null)
                return false;
        } else if (!byteCount.equals(other.byteCount))
            return false;
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

        result = prime * result + ((tableId == null) ? 0 : tableId.hashCode());
        result = prime * result + ((match == null) ? 0 : match.hashCode());
        result = prime *  (int) (durationSec ^ (durationSec >>> 32));
        result = prime *  (int) (durationNsec ^ (durationNsec >>> 32));
        result = prime * result + priority;
        result = prime * result + idleTimeout;
        result = prime * result + hardTimeout;
        result = prime * result + ((cookie == null) ? 0 : cookie.hashCode());
        result = prime * result + ((packetCount == null) ? 0 : packetCount.hashCode());
        result = prime * result + ((byteCount == null) ? 0 : byteCount.hashCode());
        result = prime * result + ((actions == null) ? 0 : actions.hashCode());
        return result;
    }

}
