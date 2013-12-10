// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_set_serializer.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver12;

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
import org.projectfloodlight.openflow.protocol.OFTableConfig;
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import java.util.EnumSet;
import java.util.Collections;


public class OFTableConfigSerializerVer12 {

    public final static int TABLE_MISS_CONTROLLER_VAL = 0x0;
    public final static int TABLE_MISS_CONTINUE_VAL = 0x1;
    public final static int TABLE_MISS_DROP_VAL = 0x2;
    public final static int TABLE_MISS_MASK_VAL = 0x3;

    public static Set<OFTableConfig> readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readInt());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, Set<OFTableConfig> set) {
        bb.writeInt(toWireValue(set));
    }

    public static void putTo(Set<OFTableConfig> set, PrimitiveSink sink) {
        sink.putInt(toWireValue(set));
    }


    public static Set<OFTableConfig> ofWireValue(int val) {
        EnumSet<OFTableConfig> set = EnumSet.noneOf(OFTableConfig.class);

        if((val & TABLE_MISS_MASK_VAL) == TABLE_MISS_CONTROLLER_VAL)
            set.add(OFTableConfig.TABLE_MISS_CONTROLLER);
        else if((val & TABLE_MISS_MASK_VAL) == TABLE_MISS_CONTINUE_VAL)
            set.add(OFTableConfig.TABLE_MISS_CONTINUE);
        else if((val & TABLE_MISS_MASK_VAL) == TABLE_MISS_DROP_VAL)
            set.add(OFTableConfig.TABLE_MISS_DROP);
        return Collections.unmodifiableSet(set);
    }

    public static int toWireValue(Set<OFTableConfig> set) {
        int wireValue = 0;

        for(OFTableConfig e: set) {
            switch(e) {
                case TABLE_MISS_CONTROLLER:
                    wireValue |= TABLE_MISS_CONTROLLER_VAL;
                    break;
                case TABLE_MISS_CONTINUE:
                    wireValue |= TABLE_MISS_CONTINUE_VAL;
                    break;
                case TABLE_MISS_DROP:
                    wireValue |= TABLE_MISS_DROP_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFTableConfig in version 1.2: " + e);
            }
        }
        return wireValue;
    }

}
