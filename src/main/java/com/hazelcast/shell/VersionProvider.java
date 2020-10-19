package com.hazelcast.shell;

/*
 * Copyright 2020 Hazelcast Inc.
 *
 * Licensed under the Hazelcast Community License (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://hazelcast.com/hazelcast-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

import picocli.CommandLine;

import java.io.IOException;
import java.util.Properties;

/**
 * Implementation of {@link CommandLine.IVersionProvider} for providing version information.
 */
class VersionProvider implements CommandLine.IVersionProvider {

    public VersionProvider() {
    }

    @Override
    public String[] getVersion() {
        return new String[]{"1.0"};
    }
}