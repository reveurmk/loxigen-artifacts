// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const.java
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

public enum OFTableFeaturePropType {
     INSTRUCTIONS,
     INSTRUCTIONS_MISS,
     NEXT_TABLES,
     NEXT_TABLES_MISS,
     WRITE_ACTIONS,
     WRITE_ACTIONS_MISS,
     APPLY_ACTIONS,
     APPLY_ACTIONS_MISS,
     MATCH,
     WILDCARDS,
     WRITE_SETFIELD,
     WRITE_SETFIELD_MISS,
     APPLY_SETFIELD,
     APPLY_SETFIELD_MISS,
     EXPERIMENTER,
     EXPERIMENTER_MISS;
}
