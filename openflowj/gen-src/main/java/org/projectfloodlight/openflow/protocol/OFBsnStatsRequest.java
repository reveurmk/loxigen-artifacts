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
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
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

public interface OFBsnStatsRequest<T extends OFBsnStatsReply> extends OFObject, OFExperimenterStatsRequest<T> {
    OFVersion getVersion();
    OFType getType();
    long getXid();
    OFStatsType getStatsType();
    Set<OFStatsRequestFlags> getFlags();
    long getExperimenter();
    long getSubtype();


    void writeTo(ChannelBuffer channelBuffer);

    Builder<T> createBuilder();
    public interface Builder<T extends OFBsnStatsReply> extends OFExperimenterStatsRequest.Builder<T> {
        OFBsnStatsRequest<T> build();
        OFVersion getVersion();
        OFType getType();
        long getXid();
        Builder<T> setXid(long xid);
        OFStatsType getStatsType();
        Set<OFStatsRequestFlags> getFlags();
        Builder<T> setFlags(Set<OFStatsRequestFlags> flags);
        long getExperimenter();
        long getSubtype();
    }
}
