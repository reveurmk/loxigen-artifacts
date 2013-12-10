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

class OFTableStatsEntryVer11 implements OFTableStatsEntry {
    private static final Logger logger = LoggerFactory.getLogger(OFTableStatsEntryVer11.class);
    // version: 1.1
    final static byte WIRE_VERSION = 2;
    final static int LENGTH = 88;

        private final static TableId DEFAULT_TABLE_ID = TableId.ALL;
        private final static String DEFAULT_NAME = "";
        private final static int DEFAULT_WILDCARDS = 0x0;
        private final static long DEFAULT_INSTRUCTIONS = 0x0L;
        private final static long DEFAULT_WRITE_ACTIONS = 0x0L;
        private final static long DEFAULT_APPLY_ACTIONS = 0x0L;
        private final static long DEFAULT_CONFIG = 0x0L;
        private final static long DEFAULT_MAX_ENTRIES = 0x0L;
        private final static long DEFAULT_ACTIVE_COUNT = 0x0L;
        private final static U64 DEFAULT_LOOKUP_COUNT = U64.ZERO;
        private final static U64 DEFAULT_MATCHED_COUNT = U64.ZERO;

    // OF message fields
    private final TableId tableId;
    private final String name;
    private final int wildcards;
    private final OFMatchBmap match;
    private final long instructions;
    private final long writeActions;
    private final long applyActions;
    private final long config;
    private final long maxEntries;
    private final long activeCount;
    private final U64 lookupCount;
    private final U64 matchedCount;
//

    // package private constructor - used by readers, builders, and factory
    OFTableStatsEntryVer11(TableId tableId, String name, int wildcards, OFMatchBmap match, long instructions, long writeActions, long applyActions, long config, long maxEntries, long activeCount, U64 lookupCount, U64 matchedCount) {
        this.tableId = tableId;
        this.name = name;
        this.wildcards = wildcards;
        this.match = match;
        this.instructions = instructions;
        this.writeActions = writeActions;
        this.applyActions = applyActions;
        this.config = config;
        this.maxEntries = maxEntries;
        this.activeCount = activeCount;
        this.lookupCount = lookupCount;
        this.matchedCount = matchedCount;
    }

    // Accessors for OF message fields
    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public OFMatchBmap getMatch() {
        return match;
    }

    @Override
    public int getWildcards() {
        return wildcards;
    }

    @Override
    public long getWriteActions() {
        return writeActions;
    }

    @Override
    public long getApplyActions() {
        return applyActions;
    }

    @Override
    public U64 getWriteSetfields()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property writeSetfields not supported in version 1.1");
    }

    @Override
    public U64 getApplySetfields()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property applySetfields not supported in version 1.1");
    }

    @Override
    public U64 getMetadataMatch()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property metadataMatch not supported in version 1.1");
    }

    @Override
    public U64 getMetadataWrite()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property metadataWrite not supported in version 1.1");
    }

    @Override
    public long getInstructions() {
        return instructions;
    }

    @Override
    public long getConfig() {
        return config;
    }

    @Override
    public long getMaxEntries() {
        return maxEntries;
    }

    @Override
    public long getActiveCount() {
        return activeCount;
    }

    @Override
    public U64 getLookupCount() {
        return lookupCount;
    }

    @Override
    public U64 getMatchedCount() {
        return matchedCount;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



    public OFTableStatsEntry.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFTableStatsEntry.Builder {
        final OFTableStatsEntryVer11 parentMessage;

        // OF message fields
        private boolean tableIdSet;
        private TableId tableId;
        private boolean nameSet;
        private String name;
        private boolean wildcardsSet;
        private int wildcards;
        private boolean matchSet;
        private OFMatchBmap match;
        private boolean instructionsSet;
        private long instructions;
        private boolean writeActionsSet;
        private long writeActions;
        private boolean applyActionsSet;
        private long applyActions;
        private boolean configSet;
        private long config;
        private boolean maxEntriesSet;
        private long maxEntries;
        private boolean activeCountSet;
        private long activeCount;
        private boolean lookupCountSet;
        private U64 lookupCount;
        private boolean matchedCountSet;
        private U64 matchedCount;

        BuilderWithParent(OFTableStatsEntryVer11 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public OFTableStatsEntry.Builder setTableId(TableId tableId) {
        this.tableId = tableId;
        this.tableIdSet = true;
        return this;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public OFTableStatsEntry.Builder setName(String name) {
        this.name = name;
        this.nameSet = true;
        return this;
    }
    @Override
    public OFMatchBmap getMatch() {
        return match;
    }

    @Override
    public OFTableStatsEntry.Builder setMatch(OFMatchBmap match) {
        this.match = match;
        this.matchSet = true;
        return this;
    }
    @Override
    public int getWildcards() {
        return wildcards;
    }

    @Override
    public OFTableStatsEntry.Builder setWildcards(int wildcards) {
        this.wildcards = wildcards;
        this.wildcardsSet = true;
        return this;
    }
    @Override
    public long getWriteActions() {
        return writeActions;
    }

    @Override
    public OFTableStatsEntry.Builder setWriteActions(long writeActions) {
        this.writeActions = writeActions;
        this.writeActionsSet = true;
        return this;
    }
    @Override
    public long getApplyActions() {
        return applyActions;
    }

    @Override
    public OFTableStatsEntry.Builder setApplyActions(long applyActions) {
        this.applyActions = applyActions;
        this.applyActionsSet = true;
        return this;
    }
    @Override
    public U64 getWriteSetfields()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property writeSetfields not supported in version 1.1");
    }

    @Override
    public OFTableStatsEntry.Builder setWriteSetfields(U64 writeSetfields) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property writeSetfields not supported in version 1.1");
    }
    @Override
    public U64 getApplySetfields()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property applySetfields not supported in version 1.1");
    }

    @Override
    public OFTableStatsEntry.Builder setApplySetfields(U64 applySetfields) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property applySetfields not supported in version 1.1");
    }
    @Override
    public U64 getMetadataMatch()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property metadataMatch not supported in version 1.1");
    }

    @Override
    public OFTableStatsEntry.Builder setMetadataMatch(U64 metadataMatch) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property metadataMatch not supported in version 1.1");
    }
    @Override
    public U64 getMetadataWrite()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property metadataWrite not supported in version 1.1");
    }

    @Override
    public OFTableStatsEntry.Builder setMetadataWrite(U64 metadataWrite) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property metadataWrite not supported in version 1.1");
    }
    @Override
    public long getInstructions() {
        return instructions;
    }

    @Override
    public OFTableStatsEntry.Builder setInstructions(long instructions) {
        this.instructions = instructions;
        this.instructionsSet = true;
        return this;
    }
    @Override
    public long getConfig() {
        return config;
    }

    @Override
    public OFTableStatsEntry.Builder setConfig(long config) {
        this.config = config;
        this.configSet = true;
        return this;
    }
    @Override
    public long getMaxEntries() {
        return maxEntries;
    }

    @Override
    public OFTableStatsEntry.Builder setMaxEntries(long maxEntries) {
        this.maxEntries = maxEntries;
        this.maxEntriesSet = true;
        return this;
    }
    @Override
    public long getActiveCount() {
        return activeCount;
    }

    @Override
    public OFTableStatsEntry.Builder setActiveCount(long activeCount) {
        this.activeCount = activeCount;
        this.activeCountSet = true;
        return this;
    }
    @Override
    public U64 getLookupCount() {
        return lookupCount;
    }

    @Override
    public OFTableStatsEntry.Builder setLookupCount(U64 lookupCount) {
        this.lookupCount = lookupCount;
        this.lookupCountSet = true;
        return this;
    }
    @Override
    public U64 getMatchedCount() {
        return matchedCount;
    }

    @Override
    public OFTableStatsEntry.Builder setMatchedCount(U64 matchedCount) {
        this.matchedCount = matchedCount;
        this.matchedCountSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



        @Override
        public OFTableStatsEntry build() {
                TableId tableId = this.tableIdSet ? this.tableId : parentMessage.tableId;
                if(tableId == null)
                    throw new NullPointerException("Property tableId must not be null");
                String name = this.nameSet ? this.name : parentMessage.name;
                if(name == null)
                    throw new NullPointerException("Property name must not be null");
                int wildcards = this.wildcardsSet ? this.wildcards : parentMessage.wildcards;
                OFMatchBmap match = this.matchSet ? this.match : parentMessage.match;
                if(match == null)
                    throw new NullPointerException("Property match must not be null");
                long instructions = this.instructionsSet ? this.instructions : parentMessage.instructions;
                long writeActions = this.writeActionsSet ? this.writeActions : parentMessage.writeActions;
                long applyActions = this.applyActionsSet ? this.applyActions : parentMessage.applyActions;
                long config = this.configSet ? this.config : parentMessage.config;
                long maxEntries = this.maxEntriesSet ? this.maxEntries : parentMessage.maxEntries;
                long activeCount = this.activeCountSet ? this.activeCount : parentMessage.activeCount;
                U64 lookupCount = this.lookupCountSet ? this.lookupCount : parentMessage.lookupCount;
                if(lookupCount == null)
                    throw new NullPointerException("Property lookupCount must not be null");
                U64 matchedCount = this.matchedCountSet ? this.matchedCount : parentMessage.matchedCount;
                if(matchedCount == null)
                    throw new NullPointerException("Property matchedCount must not be null");

                //
                return new OFTableStatsEntryVer11(
                    tableId,
                    name,
                    wildcards,
                    match,
                    instructions,
                    writeActions,
                    applyActions,
                    config,
                    maxEntries,
                    activeCount,
                    lookupCount,
                    matchedCount
                );
        }

    }

    static class Builder implements OFTableStatsEntry.Builder {
        // OF message fields
        private boolean tableIdSet;
        private TableId tableId;
        private boolean nameSet;
        private String name;
        private boolean wildcardsSet;
        private int wildcards;
        private boolean matchSet;
        private OFMatchBmap match;
        private boolean instructionsSet;
        private long instructions;
        private boolean writeActionsSet;
        private long writeActions;
        private boolean applyActionsSet;
        private long applyActions;
        private boolean configSet;
        private long config;
        private boolean maxEntriesSet;
        private long maxEntries;
        private boolean activeCountSet;
        private long activeCount;
        private boolean lookupCountSet;
        private U64 lookupCount;
        private boolean matchedCountSet;
        private U64 matchedCount;

    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public OFTableStatsEntry.Builder setTableId(TableId tableId) {
        this.tableId = tableId;
        this.tableIdSet = true;
        return this;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public OFTableStatsEntry.Builder setName(String name) {
        this.name = name;
        this.nameSet = true;
        return this;
    }
    @Override
    public OFMatchBmap getMatch() {
        return match;
    }

    @Override
    public OFTableStatsEntry.Builder setMatch(OFMatchBmap match) {
        this.match = match;
        this.matchSet = true;
        return this;
    }
    @Override
    public int getWildcards() {
        return wildcards;
    }

    @Override
    public OFTableStatsEntry.Builder setWildcards(int wildcards) {
        this.wildcards = wildcards;
        this.wildcardsSet = true;
        return this;
    }
    @Override
    public long getWriteActions() {
        return writeActions;
    }

    @Override
    public OFTableStatsEntry.Builder setWriteActions(long writeActions) {
        this.writeActions = writeActions;
        this.writeActionsSet = true;
        return this;
    }
    @Override
    public long getApplyActions() {
        return applyActions;
    }

    @Override
    public OFTableStatsEntry.Builder setApplyActions(long applyActions) {
        this.applyActions = applyActions;
        this.applyActionsSet = true;
        return this;
    }
    @Override
    public U64 getWriteSetfields()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property writeSetfields not supported in version 1.1");
    }

    @Override
    public OFTableStatsEntry.Builder setWriteSetfields(U64 writeSetfields) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property writeSetfields not supported in version 1.1");
    }
    @Override
    public U64 getApplySetfields()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property applySetfields not supported in version 1.1");
    }

    @Override
    public OFTableStatsEntry.Builder setApplySetfields(U64 applySetfields) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property applySetfields not supported in version 1.1");
    }
    @Override
    public U64 getMetadataMatch()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property metadataMatch not supported in version 1.1");
    }

    @Override
    public OFTableStatsEntry.Builder setMetadataMatch(U64 metadataMatch) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property metadataMatch not supported in version 1.1");
    }
    @Override
    public U64 getMetadataWrite()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property metadataWrite not supported in version 1.1");
    }

    @Override
    public OFTableStatsEntry.Builder setMetadataWrite(U64 metadataWrite) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property metadataWrite not supported in version 1.1");
    }
    @Override
    public long getInstructions() {
        return instructions;
    }

    @Override
    public OFTableStatsEntry.Builder setInstructions(long instructions) {
        this.instructions = instructions;
        this.instructionsSet = true;
        return this;
    }
    @Override
    public long getConfig() {
        return config;
    }

    @Override
    public OFTableStatsEntry.Builder setConfig(long config) {
        this.config = config;
        this.configSet = true;
        return this;
    }
    @Override
    public long getMaxEntries() {
        return maxEntries;
    }

    @Override
    public OFTableStatsEntry.Builder setMaxEntries(long maxEntries) {
        this.maxEntries = maxEntries;
        this.maxEntriesSet = true;
        return this;
    }
    @Override
    public long getActiveCount() {
        return activeCount;
    }

    @Override
    public OFTableStatsEntry.Builder setActiveCount(long activeCount) {
        this.activeCount = activeCount;
        this.activeCountSet = true;
        return this;
    }
    @Override
    public U64 getLookupCount() {
        return lookupCount;
    }

    @Override
    public OFTableStatsEntry.Builder setLookupCount(U64 lookupCount) {
        this.lookupCount = lookupCount;
        this.lookupCountSet = true;
        return this;
    }
    @Override
    public U64 getMatchedCount() {
        return matchedCount;
    }

    @Override
    public OFTableStatsEntry.Builder setMatchedCount(U64 matchedCount) {
        this.matchedCount = matchedCount;
        this.matchedCountSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }

//
        @Override
        public OFTableStatsEntry build() {
            TableId tableId = this.tableIdSet ? this.tableId : DEFAULT_TABLE_ID;
            if(tableId == null)
                throw new NullPointerException("Property tableId must not be null");
            String name = this.nameSet ? this.name : DEFAULT_NAME;
            if(name == null)
                throw new NullPointerException("Property name must not be null");
            int wildcards = this.wildcardsSet ? this.wildcards : DEFAULT_WILDCARDS;
            if(!this.matchSet)
                throw new IllegalStateException("Property match doesn't have default value -- must be set");
            if(match == null)
                throw new NullPointerException("Property match must not be null");
            long instructions = this.instructionsSet ? this.instructions : DEFAULT_INSTRUCTIONS;
            long writeActions = this.writeActionsSet ? this.writeActions : DEFAULT_WRITE_ACTIONS;
            long applyActions = this.applyActionsSet ? this.applyActions : DEFAULT_APPLY_ACTIONS;
            long config = this.configSet ? this.config : DEFAULT_CONFIG;
            long maxEntries = this.maxEntriesSet ? this.maxEntries : DEFAULT_MAX_ENTRIES;
            long activeCount = this.activeCountSet ? this.activeCount : DEFAULT_ACTIVE_COUNT;
            U64 lookupCount = this.lookupCountSet ? this.lookupCount : DEFAULT_LOOKUP_COUNT;
            if(lookupCount == null)
                throw new NullPointerException("Property lookupCount must not be null");
            U64 matchedCount = this.matchedCountSet ? this.matchedCount : DEFAULT_MATCHED_COUNT;
            if(matchedCount == null)
                throw new NullPointerException("Property matchedCount must not be null");


            return new OFTableStatsEntryVer11(
                    tableId,
                    name,
                    wildcards,
                    match,
                    instructions,
                    writeActions,
                    applyActions,
                    config,
                    maxEntries,
                    activeCount,
                    lookupCount,
                    matchedCount
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFTableStatsEntry> {
        @Override
        public OFTableStatsEntry readFrom(ChannelBuffer bb) throws OFParseError {
            TableId tableId = TableId.readByte(bb);
            // pad: 7 bytes
            bb.skipBytes(7);
            String name = ChannelUtils.readFixedLengthString(bb, 32);
            int wildcards = bb.readInt();
            OFMatchBmap match = ChannelUtilsVer11.readOFMatchBmap(bb);
            long instructions = U32.f(bb.readInt());
            long writeActions = U32.f(bb.readInt());
            long applyActions = U32.f(bb.readInt());
            long config = U32.f(bb.readInt());
            long maxEntries = U32.f(bb.readInt());
            long activeCount = U32.f(bb.readInt());
            U64 lookupCount = U64.ofRaw(bb.readLong());
            U64 matchedCount = U64.ofRaw(bb.readLong());

            OFTableStatsEntryVer11 tableStatsEntryVer11 = new OFTableStatsEntryVer11(
                    tableId,
                      name,
                      wildcards,
                      match,
                      instructions,
                      writeActions,
                      applyActions,
                      config,
                      maxEntries,
                      activeCount,
                      lookupCount,
                      matchedCount
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", tableStatsEntryVer11);
            return tableStatsEntryVer11;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFTableStatsEntryVer11Funnel FUNNEL = new OFTableStatsEntryVer11Funnel();
    static class OFTableStatsEntryVer11Funnel implements Funnel<OFTableStatsEntryVer11> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFTableStatsEntryVer11 message, PrimitiveSink sink) {
            message.tableId.putTo(sink);
            // skip pad (7 bytes)
            sink.putUnencodedChars(message.name);
            sink.putInt(message.wildcards);
            message.match.putTo(sink);
            sink.putLong(message.instructions);
            sink.putLong(message.writeActions);
            sink.putLong(message.applyActions);
            sink.putLong(message.config);
            sink.putLong(message.maxEntries);
            sink.putLong(message.activeCount);
            message.lookupCount.putTo(sink);
            message.matchedCount.putTo(sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFTableStatsEntryVer11> {
        @Override
        public void write(ChannelBuffer bb, OFTableStatsEntryVer11 message) {
            message.tableId.writeByte(bb);
            // pad: 7 bytes
            bb.writeZero(7);
            ChannelUtils.writeFixedLengthString(bb, message.name, 32);
            bb.writeInt(message.wildcards);
            ChannelUtilsVer11.writeOFMatchBmap(bb, message.match);
            bb.writeInt(U32.t(message.instructions));
            bb.writeInt(U32.t(message.writeActions));
            bb.writeInt(U32.t(message.applyActions));
            bb.writeInt(U32.t(message.config));
            bb.writeInt(U32.t(message.maxEntries));
            bb.writeInt(U32.t(message.activeCount));
            bb.writeLong(message.lookupCount.getValue());
            bb.writeLong(message.matchedCount.getValue());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFTableStatsEntryVer11(");
        b.append("tableId=").append(tableId);
        b.append(", ");
        b.append("name=").append(name);
        b.append(", ");
        b.append("wildcards=").append(wildcards);
        b.append(", ");
        b.append("match=").append(match);
        b.append(", ");
        b.append("instructions=").append(instructions);
        b.append(", ");
        b.append("writeActions=").append(writeActions);
        b.append(", ");
        b.append("applyActions=").append(applyActions);
        b.append(", ");
        b.append("config=").append(config);
        b.append(", ");
        b.append("maxEntries=").append(maxEntries);
        b.append(", ");
        b.append("activeCount=").append(activeCount);
        b.append(", ");
        b.append("lookupCount=").append(lookupCount);
        b.append(", ");
        b.append("matchedCount=").append(matchedCount);
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
        OFTableStatsEntryVer11 other = (OFTableStatsEntryVer11) obj;

        if (tableId == null) {
            if (other.tableId != null)
                return false;
        } else if (!tableId.equals(other.tableId))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if( wildcards != other.wildcards)
            return false;
        if (match == null) {
            if (other.match != null)
                return false;
        } else if (!match.equals(other.match))
            return false;
        if( instructions != other.instructions)
            return false;
        if( writeActions != other.writeActions)
            return false;
        if( applyActions != other.applyActions)
            return false;
        if( config != other.config)
            return false;
        if( maxEntries != other.maxEntries)
            return false;
        if( activeCount != other.activeCount)
            return false;
        if (lookupCount == null) {
            if (other.lookupCount != null)
                return false;
        } else if (!lookupCount.equals(other.lookupCount))
            return false;
        if (matchedCount == null) {
            if (other.matchedCount != null)
                return false;
        } else if (!matchedCount.equals(other.matchedCount))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((tableId == null) ? 0 : tableId.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + wildcards;
        result = prime * result + ((match == null) ? 0 : match.hashCode());
        result = prime *  (int) (instructions ^ (instructions >>> 32));
        result = prime *  (int) (writeActions ^ (writeActions >>> 32));
        result = prime *  (int) (applyActions ^ (applyActions >>> 32));
        result = prime *  (int) (config ^ (config >>> 32));
        result = prime *  (int) (maxEntries ^ (maxEntries >>> 32));
        result = prime *  (int) (activeCount ^ (activeCount >>> 32));
        result = prime * result + ((lookupCount == null) ? 0 : lookupCount.hashCode());
        result = prime * result + ((matchedCount == null) ? 0 : matchedCount.hashCode());
        return result;
    }

}
