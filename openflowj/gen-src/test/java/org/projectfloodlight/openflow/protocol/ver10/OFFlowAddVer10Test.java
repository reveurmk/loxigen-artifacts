// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template unit_test.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

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
import java.util.EnumSet;
import java.util.Set;
import com.google.common.collect.Sets;
import java.util.List;
import com.google.common.collect.ImmutableList;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.hamcrest.CoreMatchers;



public class OFFlowAddVer10Test {
    OFFactory factory;

    final static byte[] FLOW_ADD_SERIALIZED =
        new byte[] { 0x1, 0xe, 0x0, 0x70, 0x12, 0x34, 0x56, 0x78, 0x0, 0x30, 0x0, (byte) 0xe2, 0x0, 0x3, 0x1, 0x23, 0x45, 0x67, (byte) 0x89, (byte) 0xab, (byte) 0xcd, (byte) 0xef, 0x1, 0x23, 0x45, 0x67, 0x0, 0x0, 0x0, 0x0, 0x8, 0x0, 0x0, 0x0, 0x0, 0x0, (byte) 0xc0, (byte) 0xa8, 0x3, 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x5, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x2, 0x0, 0x0, 0x0, 0x8, (byte) 0xff, (byte) 0xfb, 0x0, 0x0, (byte) 0xff, (byte) 0xff, 0x0, 0x10, 0x0, 0x0, 0x23, 0x20, 0x0, 0x12, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, (byte) 0xff, (byte) 0xff, 0x0, 0x10, 0x0, 0x5c, 0x16, (byte) 0xc7, 0x0, 0x0, 0x0, 0x2, 0x0, 0x0, 0x0, 0x0 };

    @Before
    public void setup() {
        factory = OFFactoryVer10.INSTANCE;
    }

    @Test
    public void testWrite() {
        OFFlowAdd.Builder builder = factory.buildFlowAdd();
        builder.setXid(0x12345678)
    .setMatch(
        factory.buildMatch()
            .setExact(MatchField.IN_PORT, OFPort.of(3))
            .setExact(MatchField.ETH_TYPE, EthType.IPv4)
            .setExact(MatchField.IPV4_SRC, IPv4Address.of(0xc0a8037f))
            .setExact(MatchField.IPV4_DST, IPv4Address.of(0xffffffff))
            .setExact(MatchField.ETH_SRC, MacAddress.of("01:23:45:67:89:ab"))
            .setExact(MatchField.ETH_DST, MacAddress.of("cd:ef:01:23:45:67"))
            .build()
    )
    .setIdleTimeout(5)
    .setFlags(Sets.immutableEnumSet(OFFlowModFlags.CHECK_OVERLAP))
    .setBufferId(OFBufferId.of(0))
    .setOutPort(OFPort.of(0)) // doesn't make that much sense, but is in the example
    .setActions(
        ImmutableList.of(
            factory.actions().output(OFPort.FLOOD, 0),
            factory.actions().niciraDecTtl(),
            factory.actions().bsnSetTunnelDst(0)
        )
    );;
        OFFlowAdd flowAdd = builder.build();
        ChannelBuffer bb = ChannelBuffers.dynamicBuffer();
        flowAdd.writeTo(bb);
        byte[] written = new byte[bb.readableBytes()];
        bb.readBytes(written);

        assertThat(written, CoreMatchers.equalTo(FLOW_ADD_SERIALIZED));
    }

    @Test
    public void testRead() throws Exception {
        OFFlowAdd.Builder builder = factory.buildFlowAdd();
        builder.setXid(0x12345678)
    .setMatch(
        factory.buildMatch()
            .setExact(MatchField.IN_PORT, OFPort.of(3))
            .setExact(MatchField.ETH_TYPE, EthType.IPv4)
            .setExact(MatchField.IPV4_SRC, IPv4Address.of(0xc0a8037f))
            .setExact(MatchField.IPV4_DST, IPv4Address.of(0xffffffff))
            .setExact(MatchField.ETH_SRC, MacAddress.of("01:23:45:67:89:ab"))
            .setExact(MatchField.ETH_DST, MacAddress.of("cd:ef:01:23:45:67"))
            .build()
    )
    .setIdleTimeout(5)
    .setFlags(Sets.immutableEnumSet(OFFlowModFlags.CHECK_OVERLAP))
    .setBufferId(OFBufferId.of(0))
    .setOutPort(OFPort.of(0)) // doesn't make that much sense, but is in the example
    .setActions(
        ImmutableList.of(
            factory.actions().output(OFPort.FLOOD, 0),
            factory.actions().niciraDecTtl(),
            factory.actions().bsnSetTunnelDst(0)
        )
    );;
        OFFlowAdd flowAddBuilt = builder.build();

        ChannelBuffer input = ChannelBuffers.copiedBuffer(FLOW_ADD_SERIALIZED);

        // FIXME should invoke the overall reader once implemented
        OFFlowAdd flowAddRead = OFFlowAddVer10.READER.readFrom(input);
        assertEquals(FLOW_ADD_SERIALIZED.length, input.readerIndex());

        assertEquals(flowAddBuilt, flowAddRead);
   }

   @Test
   public void testReadWrite() throws Exception {
       ChannelBuffer input = ChannelBuffers.copiedBuffer(FLOW_ADD_SERIALIZED);

       // FIXME should invoke the overall reader once implemented
       OFFlowAdd flowAdd = OFFlowAddVer10.READER.readFrom(input);
       assertEquals(FLOW_ADD_SERIALIZED.length, input.readerIndex());

       // write message again
       ChannelBuffer bb = ChannelBuffers.dynamicBuffer();
       flowAdd.writeTo(bb);
       byte[] written = new byte[bb.readableBytes()];
       bb.readBytes(written);

       assertThat(written, CoreMatchers.equalTo(FLOW_ADD_SERIALIZED));
   }

}
