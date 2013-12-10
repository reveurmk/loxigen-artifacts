// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
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
import org.projectfloodlight.openflow.protocol.OFType;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;

public class OFTypeSerializerVer12 {

    public final static byte HELLO_VAL = (byte) 0x0;
    public final static byte ERROR_VAL = (byte) 0x1;
    public final static byte ECHO_REQUEST_VAL = (byte) 0x2;
    public final static byte ECHO_REPLY_VAL = (byte) 0x3;
    public final static byte EXPERIMENTER_VAL = (byte) 0x4;
    public final static byte FEATURES_REQUEST_VAL = (byte) 0x5;
    public final static byte FEATURES_REPLY_VAL = (byte) 0x6;
    public final static byte GET_CONFIG_REQUEST_VAL = (byte) 0x7;
    public final static byte GET_CONFIG_REPLY_VAL = (byte) 0x8;
    public final static byte SET_CONFIG_VAL = (byte) 0x9;
    public final static byte PACKET_IN_VAL = (byte) 0xa;
    public final static byte FLOW_REMOVED_VAL = (byte) 0xb;
    public final static byte PORT_STATUS_VAL = (byte) 0xc;
    public final static byte PACKET_OUT_VAL = (byte) 0xd;
    public final static byte FLOW_MOD_VAL = (byte) 0xe;
    public final static byte GROUP_MOD_VAL = (byte) 0xf;
    public final static byte PORT_MOD_VAL = (byte) 0x10;
    public final static byte TABLE_MOD_VAL = (byte) 0x11;
    public final static byte STATS_REQUEST_VAL = (byte) 0x12;
    public final static byte STATS_REPLY_VAL = (byte) 0x13;
    public final static byte BARRIER_REQUEST_VAL = (byte) 0x14;
    public final static byte BARRIER_REPLY_VAL = (byte) 0x15;
    public final static byte QUEUE_GET_CONFIG_REQUEST_VAL = (byte) 0x16;
    public final static byte QUEUE_GET_CONFIG_REPLY_VAL = (byte) 0x17;
    public final static byte ROLE_REQUEST_VAL = (byte) 0x18;
    public final static byte ROLE_REPLY_VAL = (byte) 0x19;

    public static OFType readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readByte());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, OFType e) {
        bb.writeByte(toWireValue(e));
    }

    public static void putTo(OFType e, PrimitiveSink sink) {
        sink.putByte(toWireValue(e));
    }

    public static OFType ofWireValue(byte val) {
        switch(val) {
            case HELLO_VAL:
                return OFType.HELLO;
            case ERROR_VAL:
                return OFType.ERROR;
            case ECHO_REQUEST_VAL:
                return OFType.ECHO_REQUEST;
            case ECHO_REPLY_VAL:
                return OFType.ECHO_REPLY;
            case EXPERIMENTER_VAL:
                return OFType.EXPERIMENTER;
            case FEATURES_REQUEST_VAL:
                return OFType.FEATURES_REQUEST;
            case FEATURES_REPLY_VAL:
                return OFType.FEATURES_REPLY;
            case GET_CONFIG_REQUEST_VAL:
                return OFType.GET_CONFIG_REQUEST;
            case GET_CONFIG_REPLY_VAL:
                return OFType.GET_CONFIG_REPLY;
            case SET_CONFIG_VAL:
                return OFType.SET_CONFIG;
            case PACKET_IN_VAL:
                return OFType.PACKET_IN;
            case FLOW_REMOVED_VAL:
                return OFType.FLOW_REMOVED;
            case PORT_STATUS_VAL:
                return OFType.PORT_STATUS;
            case PACKET_OUT_VAL:
                return OFType.PACKET_OUT;
            case FLOW_MOD_VAL:
                return OFType.FLOW_MOD;
            case GROUP_MOD_VAL:
                return OFType.GROUP_MOD;
            case PORT_MOD_VAL:
                return OFType.PORT_MOD;
            case TABLE_MOD_VAL:
                return OFType.TABLE_MOD;
            case STATS_REQUEST_VAL:
                return OFType.STATS_REQUEST;
            case STATS_REPLY_VAL:
                return OFType.STATS_REPLY;
            case BARRIER_REQUEST_VAL:
                return OFType.BARRIER_REQUEST;
            case BARRIER_REPLY_VAL:
                return OFType.BARRIER_REPLY;
            case QUEUE_GET_CONFIG_REQUEST_VAL:
                return OFType.QUEUE_GET_CONFIG_REQUEST;
            case QUEUE_GET_CONFIG_REPLY_VAL:
                return OFType.QUEUE_GET_CONFIG_REPLY;
            case ROLE_REQUEST_VAL:
                return OFType.ROLE_REQUEST;
            case ROLE_REPLY_VAL:
                return OFType.ROLE_REPLY;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFType in version 1.2: " + val);
        }
    }


    public static byte toWireValue(OFType e) {
        switch(e) {
            case HELLO:
                return HELLO_VAL;
            case ERROR:
                return ERROR_VAL;
            case ECHO_REQUEST:
                return ECHO_REQUEST_VAL;
            case ECHO_REPLY:
                return ECHO_REPLY_VAL;
            case EXPERIMENTER:
                return EXPERIMENTER_VAL;
            case FEATURES_REQUEST:
                return FEATURES_REQUEST_VAL;
            case FEATURES_REPLY:
                return FEATURES_REPLY_VAL;
            case GET_CONFIG_REQUEST:
                return GET_CONFIG_REQUEST_VAL;
            case GET_CONFIG_REPLY:
                return GET_CONFIG_REPLY_VAL;
            case SET_CONFIG:
                return SET_CONFIG_VAL;
            case PACKET_IN:
                return PACKET_IN_VAL;
            case FLOW_REMOVED:
                return FLOW_REMOVED_VAL;
            case PORT_STATUS:
                return PORT_STATUS_VAL;
            case PACKET_OUT:
                return PACKET_OUT_VAL;
            case FLOW_MOD:
                return FLOW_MOD_VAL;
            case GROUP_MOD:
                return GROUP_MOD_VAL;
            case PORT_MOD:
                return PORT_MOD_VAL;
            case TABLE_MOD:
                return TABLE_MOD_VAL;
            case STATS_REQUEST:
                return STATS_REQUEST_VAL;
            case STATS_REPLY:
                return STATS_REPLY_VAL;
            case BARRIER_REQUEST:
                return BARRIER_REQUEST_VAL;
            case BARRIER_REPLY:
                return BARRIER_REPLY_VAL;
            case QUEUE_GET_CONFIG_REQUEST:
                return QUEUE_GET_CONFIG_REQUEST_VAL;
            case QUEUE_GET_CONFIG_REPLY:
                return QUEUE_GET_CONFIG_REPLY_VAL;
            case ROLE_REQUEST:
                return ROLE_REQUEST_VAL;
            case ROLE_REPLY:
                return ROLE_REPLY_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFType in version 1.2: " + e);
        }
    }

}
