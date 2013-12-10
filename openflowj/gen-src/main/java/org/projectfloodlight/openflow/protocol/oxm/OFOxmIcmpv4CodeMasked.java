// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_interface.java
// Do not modify

package org.projectfloodlight.openflow.protocol.oxm;

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
import org.jboss.netty.buffer.ChannelBuffer;

public interface OFOxmIcmpv4CodeMasked extends OFObject, OFOxm<ICMPv4Code> {
    long getTypeLen();
    ICMPv4Code getValue();
    ICMPv4Code getMask();
    MatchField<ICMPv4Code> getMatchField();
    boolean isMasked();
    OFOxm<ICMPv4Code> getCanonical();
    OFVersion getVersion();

    void writeTo(ChannelBuffer channelBuffer);

    Builder createBuilder();
    public interface Builder extends OFOxm.Builder<ICMPv4Code> {
        OFOxmIcmpv4CodeMasked build();
        long getTypeLen();
        ICMPv4Code getValue();
        Builder setValue(ICMPv4Code value);
        ICMPv4Code getMask();
        Builder setMask(ICMPv4Code mask);
        MatchField<ICMPv4Code> getMatchField();
        boolean isMasked();
        OFOxm<ICMPv4Code> getCanonical();
        OFVersion getVersion();
    }
}
