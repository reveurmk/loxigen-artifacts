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

public interface OFPortDesc extends OFObject {
    OFPort getPortNo();
    MacAddress getHwAddr();
    String getName();
    Set<OFPortConfig> getConfig();
    Set<OFPortState> getState();
    Set<OFPortFeatures> getCurr();
    Set<OFPortFeatures> getAdvertised();
    Set<OFPortFeatures> getSupported();
    Set<OFPortFeatures> getPeer();
    long getCurrSpeed() throws UnsupportedOperationException;
    long getMaxSpeed() throws UnsupportedOperationException;
    OFVersion getVersion();

    void writeTo(ChannelBuffer channelBuffer);

    Builder createBuilder();
    public interface Builder  {
        OFPortDesc build();
        OFPort getPortNo();
        Builder setPortNo(OFPort portNo);
        MacAddress getHwAddr();
        Builder setHwAddr(MacAddress hwAddr);
        String getName();
        Builder setName(String name);
        Set<OFPortConfig> getConfig();
        Builder setConfig(Set<OFPortConfig> config);
        Set<OFPortState> getState();
        Builder setState(Set<OFPortState> state);
        Set<OFPortFeatures> getCurr();
        Builder setCurr(Set<OFPortFeatures> curr);
        Set<OFPortFeatures> getAdvertised();
        Builder setAdvertised(Set<OFPortFeatures> advertised);
        Set<OFPortFeatures> getSupported();
        Builder setSupported(Set<OFPortFeatures> supported);
        Set<OFPortFeatures> getPeer();
        Builder setPeer(Set<OFPortFeatures> peer);
        long getCurrSpeed() throws UnsupportedOperationException;
        Builder setCurrSpeed(long currSpeed) throws UnsupportedOperationException;
        long getMaxSpeed() throws UnsupportedOperationException;
        Builder setMaxSpeed(long maxSpeed) throws UnsupportedOperationException;
        OFVersion getVersion();
    }
}
