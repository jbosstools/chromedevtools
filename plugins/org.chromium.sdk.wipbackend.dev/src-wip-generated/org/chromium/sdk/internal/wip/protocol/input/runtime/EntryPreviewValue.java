// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.runtime;

@org.chromium.sdk.internal.protocolparser.JsonType
public interface EntryPreviewValue {
  /**
   Preview of the key. Specified for map-like collection entries.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.sdk.internal.wip.protocol.input.runtime.ObjectPreviewValue key();

  /**
   Preview of the value.
   */
  org.chromium.sdk.internal.wip.protocol.input.runtime.ObjectPreviewValue value();

}
