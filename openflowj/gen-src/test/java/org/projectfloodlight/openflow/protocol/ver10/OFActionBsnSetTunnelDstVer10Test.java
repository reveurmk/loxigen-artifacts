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
import java.util.Set;
import org.junit.Test;
import org.junit.Before;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.hamcrest.CoreMatchers;



public class OFActionBsnSetTunnelDstVer10Test {
    OFActions factory;

    final static byte[] ACTION_BSN_SET_TUNNEL_DST_SERIALIZED =
        new byte[] { (byte) 0xff, (byte) 0xff, 0x0, 0x10, 0x0, 0x5c, 0x16, (byte) 0xc7, 0x0, 0x0, 0x0, 0x2, 0x12, 0x34, 0x56, 0x78 };

    @Before
    public void setup() {
        factory = OFActionsVer10.INSTANCE;
    }

   // FIXME: No java stanza in test_data for this class. Add for more comprehensive unit testing

   @Test
   public void testReadWrite() throws Exception {
       ChannelBuffer input = ChannelBuffers.copiedBuffer(ACTION_BSN_SET_TUNNEL_DST_SERIALIZED);

       // FIXME should invoke the overall reader once implemented
       OFActionBsnSetTunnelDst actionBsnSetTunnelDst = OFActionBsnSetTunnelDstVer10.READER.readFrom(input);
       assertEquals(ACTION_BSN_SET_TUNNEL_DST_SERIALIZED.length, input.readerIndex());

       // write message again
       ChannelBuffer bb = ChannelBuffers.dynamicBuffer();
       actionBsnSetTunnelDst.writeTo(bb);
       byte[] written = new byte[bb.readableBytes()];
       bb.readBytes(written);

       assertThat(written, CoreMatchers.equalTo(ACTION_BSN_SET_TUNNEL_DST_SERIALIZED));
   }

}
