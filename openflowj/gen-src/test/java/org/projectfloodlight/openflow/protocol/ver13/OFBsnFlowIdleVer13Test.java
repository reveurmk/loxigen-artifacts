// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template unit_test.java
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
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.hamcrest.CoreMatchers;



public class OFBsnFlowIdleVer13Test {
    OFFactory factory;

    final static byte[] BSN_FLOW_IDLE_SERIALIZED =
        new byte[] { 0x4, 0x4, 0x0, 0x38, 0x12, 0x34, 0x56, 0x78, 0x0, 0x5c, 0x16, (byte) 0xc7, 0x0, 0x0, 0x0, 0x28, (byte) 0xfe, (byte) 0xdc, (byte) 0xba, (byte) 0x98, 0x76, 0x54, 0x32, 0x10, 0x42, 0x68, 0x14, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x1, 0x0, 0x16, (byte) 0x80, 0x0, 0x1, 0x8, 0x0, 0x0, 0x0, 0x4, 0x0, 0x0, 0x0, 0x5, (byte) 0x80, 0x0, 0x2a, 0x2, 0x0, 0x1, 0x0, 0x0 };

    @Before
    public void setup() {
        factory = OFFactoryVer13.INSTANCE;
    }

    @Test
    public void testWrite() {
        OFBsnFlowIdle.Builder builder = factory.buildBsnFlowIdle();
        builder.setXid(0x12345678)
    .setCookie(U64.parseHex("FEDCBA9876543210"))
    .setPriority(17000)
    .setTableId(TableId.of(20))
    .setMatch(
        factory.buildMatch()
            .setMasked(MatchField.IN_PORT, OFPort.of(4), OFPort.of(5))
            .setExact(MatchField.ARP_OP, ArpOpcode.of(1))
                .build()
    );;
        OFBsnFlowIdle bsnFlowIdle = builder.build();
        ChannelBuffer bb = ChannelBuffers.dynamicBuffer();
        bsnFlowIdle.writeTo(bb);
        byte[] written = new byte[bb.readableBytes()];
        bb.readBytes(written);

        assertThat(written, CoreMatchers.equalTo(BSN_FLOW_IDLE_SERIALIZED));
    }

    @Test
    public void testRead() throws Exception {
        OFBsnFlowIdle.Builder builder = factory.buildBsnFlowIdle();
        builder.setXid(0x12345678)
    .setCookie(U64.parseHex("FEDCBA9876543210"))
    .setPriority(17000)
    .setTableId(TableId.of(20))
    .setMatch(
        factory.buildMatch()
            .setMasked(MatchField.IN_PORT, OFPort.of(4), OFPort.of(5))
            .setExact(MatchField.ARP_OP, ArpOpcode.of(1))
                .build()
    );;
        OFBsnFlowIdle bsnFlowIdleBuilt = builder.build();

        ChannelBuffer input = ChannelBuffers.copiedBuffer(BSN_FLOW_IDLE_SERIALIZED);

        // FIXME should invoke the overall reader once implemented
        OFBsnFlowIdle bsnFlowIdleRead = OFBsnFlowIdleVer13.READER.readFrom(input);
        assertEquals(BSN_FLOW_IDLE_SERIALIZED.length, input.readerIndex());

        assertEquals(bsnFlowIdleBuilt, bsnFlowIdleRead);
   }

   @Test
   public void testReadWrite() throws Exception {
       ChannelBuffer input = ChannelBuffers.copiedBuffer(BSN_FLOW_IDLE_SERIALIZED);

       // FIXME should invoke the overall reader once implemented
       OFBsnFlowIdle bsnFlowIdle = OFBsnFlowIdleVer13.READER.readFrom(input);
       assertEquals(BSN_FLOW_IDLE_SERIALIZED.length, input.readerIndex());

       // write message again
       ChannelBuffer bb = ChannelBuffers.dynamicBuffer();
       bsnFlowIdle.writeTo(bb);
       byte[] written = new byte[bb.readableBytes()];
       bb.readBytes(written);

       assertThat(written, CoreMatchers.equalTo(BSN_FLOW_IDLE_SERIALIZED));
   }

}
