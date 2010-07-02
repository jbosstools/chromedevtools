// Copyright (c) 2010 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.debug.core;

import org.chromium.debug.core.util.ChromiumDebugPluginUtil;
import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;

/**
 * Implementation of additional properties for files that are JavaScript sources.
 */
public class FilePropertyTester extends PropertyTester {
  private static final String IS_JS_FILE = "isJsFile"; //$NON-NLS-1$

  public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
    IFile file = (IFile) receiver;
    if (IS_JS_FILE.equals(property)) {
      return testIsJsFile(file, args, expectedValue);
    } else {
      throw new RuntimeException("Unrecognized property name"); //$NON-NLS-1$
    }
  }

  private boolean testIsJsFile(IFile file, Object[] args, Object expectedValue) {
    return ChromiumDebugPluginUtil.SUPPORTED_EXTENSIONS.contains(file.getFileExtension());
  }
}