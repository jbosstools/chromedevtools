// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/branches/chromium/2490/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.debugger;

/**
 Scope description.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface ScopeValue {
  /**
   Scope type.
   */
  Type type();

  /**
   Object representing the scope. For <code>global</code> and <code>with</code> scopes it represents the actual object; for the rest of the scopes, it is artificial transient object enumerating scope variables as its properties.
   */
  org.chromium.sdk.internal.wip.protocol.input.runtime.RemoteObjectValue object();

  /**
   Scope type.
   */
  public enum Type {
    GLOBAL,
    LOCAL,
    WITH,
    CLOSURE,
    CATCH,
    BLOCK,
    SCRIPT,
  }
}