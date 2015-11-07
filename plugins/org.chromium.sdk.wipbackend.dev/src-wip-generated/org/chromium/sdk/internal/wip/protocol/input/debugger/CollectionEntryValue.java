// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.debugger;

/**
 Collection entry.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface CollectionEntryValue {
  /**
   Entry key of a map-like collection, otherwise not provided.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.runtime.RemoteObjectValue key();

  /**
   Entry value.
   */
  org.chromium.sdk.internal.wip.protocol.input.runtime.RemoteObjectValue value();

}
