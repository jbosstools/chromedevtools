// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.console;

/**
 Stack entry for console errors and assertions.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface CallFrameValue {
  /**
   JavaScript function name.
   */
  String functionName();

  /**
   JavaScript script id.
   */
  String scriptId();

  /**
   JavaScript script name or url.
   */
  String url();

  /**
   JavaScript script line number.
   */
  long lineNumber();

  /**
   JavaScript script column number.
   */
  long columnNumber();

}
