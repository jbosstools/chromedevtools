// Copyright (c) 2010 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.debug.ui.actions;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.chromium.debug.core.model.VmResource;
import org.chromium.debug.core.util.ScriptTargetMapping;
import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareEditorInput;
import org.eclipse.compare.CompareUI;
import org.eclipse.compare.IModificationDate;
import org.eclipse.compare.IStreamContentAccessor;
import org.eclipse.compare.ITypedElement;
import org.eclipse.compare.structuremergeviewer.DiffNode;
import org.eclipse.compare.structuremergeviewer.Differencer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;

/**
 * A very preliminary implementation of action that should let user compare his script with
 * its current state on remote VM.
 */
public class CompareChangesAction extends V8ScriptAction {
  @Override
  protected void execute(List<? extends ScriptTargetMapping> filePairList, Shell shell) {
    ScriptTargetMapping filePair = getSingleFilePair(filePairList);
    LiveEditCompareInput input =
        new LiveEditCompareInput(filePair.getFile(), filePair.getVmResource());
    CompareUI.openCompareEditor(input);
  }

  public static class LiveEditCompareInput extends CompareEditorInput {
    private final IFile file;
    private final VmResource script;

    public LiveEditCompareInput(IFile file, VmResource vmResource) {
      super(createCompareConfiguration());
      this.file = file;
      this.script = vmResource;
    }

    private static CompareConfiguration createCompareConfiguration() {
      return new CompareConfiguration();
    }

    @Override
    public DiffNode prepareInput(IProgressMonitor monitor) {

      abstract class CompareItem implements ITypedElement, IStreamContentAccessor,
          IModificationDate {
        public Image getImage() {
          return null;
        }
        public String getType() {
          return TEXT_TYPE;
        }
        public long getModificationDate() {
          return 0;
        }
      }
      CompareItem left = new CompareItem() {
        public String getName() {
          return "Local file " + file.getName(); //$NON-NLS-1$
        }
        public InputStream getContents() throws CoreException {
          return file.getContents();
        }
      };
      CompareItem right = new CompareItem() {
        public String getName() {
          return "File in VM " + script.getFileName(); //$NON-NLS-1$
        }
        public InputStream getContents() throws CoreException {
          String source = script.getScript().getSource();
//          int pos = source.length() / 2;
//          source = source.substring(0, pos) + " extra " + source.substring(pos);
          return new ByteArrayInputStream(source.getBytes());
        }
      };

      DiffNode diffNode = new DiffNode(null, Differencer.PSEUDO_CONFLICT, null, left, right);
      return diffNode;
    }
  }
}
