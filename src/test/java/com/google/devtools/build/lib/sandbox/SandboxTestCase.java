// Copyright 2015 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.google.devtools.build.lib.sandbox;

import com.google.devtools.build.lib.testutil.TestUtils;
import com.google.devtools.build.lib.vfs.FileSystem;
import com.google.devtools.build.lib.vfs.FileSystemUtils;
import com.google.devtools.build.lib.vfs.Path;
import com.google.devtools.build.lib.vfs.util.FileSystems;
import org.junit.Before;

/** Common parts of all sandbox tests. */
public class SandboxTestCase {
  protected FileSystem fileSystem;
  protected Path testRoot;

  @Before
  public final void createTestRoot() throws Exception {
    fileSystem = FileSystems.getNativeFileSystem();
    testRoot = fileSystem.getPath(TestUtils.tmpDir());
    FileSystemUtils.deleteTreesBelow(testRoot);
  }
}
