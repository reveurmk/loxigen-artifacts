// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver14;

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
import org.jboss.netty.buffer.ChannelBuffer;

abstract class OFBsnStatsReplyVer14 {
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 24;


    public final static OFBsnStatsReplyVer14.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFBsnStatsReply> {
        @Override
        public OFBsnStatsReply readFrom(ChannelBuffer bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 5
            byte version = bb.readByte();
            if(version != (byte) 0x5)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_14(5), got="+version);
            // fixed value property type == 19
            byte type = bb.readByte();
            if(type != (byte) 0x13)
                throw new OFParseError("Wrong type: Expected=OFType.STATS_REPLY(19), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            U32.f(bb.readInt());
            // fixed value property statsType == 65535
            short statsType = bb.readShort();
            if(statsType != (short) 0xffff)
                throw new OFParseError("Wrong statsType: Expected=OFStatsType.EXPERIMENTER(65535), got="+statsType);
            OFStatsReplyFlagsSerializerVer14.readFrom(bb);
            // pad: 4 bytes
            bb.skipBytes(4);
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            int subtype = bb.readInt();
            bb.readerIndex(start);
            switch(subtype) {
               default:
                   throw new OFParseError("Unknown value for discriminator subtype of class OFBsnStatsReplyVer14: " + subtype);
            }
        }
    }
}