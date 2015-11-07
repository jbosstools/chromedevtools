// Generated source.
// Generator: org.chromium.sdk.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.chromium.sdk.internal.wip.protocol.input.page;

/**
 Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) is about to open.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface JavascriptDialogOpeningEventData {
  /**
   Message that will be displayed by the dialog.
   */
  String message();

  /**
   Dialog type.
   */
  org.chromium.sdk.internal.wip.protocol.input.page.DialogTypeEnum type();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.page.JavascriptDialogOpeningEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.sdk.internal.wip.protocol.input.page.JavascriptDialogOpeningEventData>("Page.javascriptDialogOpening", org.chromium.sdk.internal.wip.protocol.input.page.JavascriptDialogOpeningEventData.class) {
    @Override public org.chromium.sdk.internal.wip.protocol.input.page.JavascriptDialogOpeningEventData parse(org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parsePageJavascriptDialogOpeningEventData(obj);
    }
  };
}
