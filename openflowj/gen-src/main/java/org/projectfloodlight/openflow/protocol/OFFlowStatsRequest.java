// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_interface.java
// Do not modify

package org.projectfloodlight.openflow.protocol;

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
import org.jboss.netty.buffer.ChannelBuffer;

public interface OFFlowStatsRequest extends OFObject, OFStatsRequest<OFFlowStatsReply>, OFRequest<OFFlowStatsReply> {
    OFVersion getVersion();
    OFType getType();
    long getXid();
    OFStatsType getStatsType();
    Set<OFStatsRequestFlags> getFlags();
    TableId getTableId();
    OFPort getOutPort();
    OFGroup getOutGroup() throws UnsupportedOperationException;
    U64 getCookie() throws UnsupportedOperationException;
    U64 getCookieMask() throws UnsupportedOperationException;
    Match getMatch();

    void writeTo(ChannelBuffer channelBuffer);

    Builder createBuilder();
    public interface Builder extends OFStatsRequest.Builder<OFFlowStatsReply> {
        OFFlowStatsRequest build();
        OFVersion getVersion();
        OFType getType();
        long getXid();
        Builder setXid(long xid);
        OFStatsType getStatsType();
        Set<OFStatsRequestFlags> getFlags();
        Builder setFlags(Set<OFStatsRequestFlags> flags);
        TableId getTableId();
        Builder setTableId(TableId tableId);
        OFPort getOutPort();
        Builder setOutPort(OFPort outPort);
        OFGroup getOutGroup() throws UnsupportedOperationException;
        Builder setOutGroup(OFGroup outGroup) throws UnsupportedOperationException;
        U64 getCookie() throws UnsupportedOperationException;
        Builder setCookie(U64 cookie) throws UnsupportedOperationException;
        U64 getCookieMask() throws UnsupportedOperationException;
        Builder setCookieMask(U64 cookieMask) throws UnsupportedOperationException;
        Match getMatch();
        Builder setMatch(Match match);
    }
}
