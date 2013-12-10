// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_set_serializer.java
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
import org.projectfloodlight.openflow.protocol.OFMeterFlags;
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import java.util.EnumSet;
import java.util.Collections;


public class OFMeterFlagsSerializerVer13 {

    public final static short KBPS_VAL = (short) 0x1;
    public final static short PKTPS_VAL = (short) 0x2;
    public final static short BURST_VAL = (short) 0x4;
    public final static short STATS_VAL = (short) 0x8;

    public static Set<OFMeterFlags> readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, Set<OFMeterFlags> set) {
        bb.writeShort(toWireValue(set));
    }

    public static void putTo(Set<OFMeterFlags> set, PrimitiveSink sink) {
        sink.putShort(toWireValue(set));
    }


    public static Set<OFMeterFlags> ofWireValue(short val) {
        EnumSet<OFMeterFlags> set = EnumSet.noneOf(OFMeterFlags.class);

        if((val & KBPS_VAL) != 0)
            set.add(OFMeterFlags.KBPS);
        if((val & PKTPS_VAL) != 0)
            set.add(OFMeterFlags.PKTPS);
        if((val & BURST_VAL) != 0)
            set.add(OFMeterFlags.BURST);
        if((val & STATS_VAL) != 0)
            set.add(OFMeterFlags.STATS);
        return Collections.unmodifiableSet(set);
    }

    public static short toWireValue(Set<OFMeterFlags> set) {
        short wireValue = 0;

        for(OFMeterFlags e: set) {
            switch(e) {
                case KBPS:
                    wireValue |= KBPS_VAL;
                    break;
                case PKTPS:
                    wireValue |= PKTPS_VAL;
                    break;
                case BURST:
                    wireValue |= BURST_VAL;
                    break;
                case STATS:
                    wireValue |= STATS_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFMeterFlags in version 1.3: " + e);
            }
        }
        return wireValue;
    }

}
