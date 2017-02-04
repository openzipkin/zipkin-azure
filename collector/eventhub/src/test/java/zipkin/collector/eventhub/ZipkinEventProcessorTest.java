/**
 * Copyright 2017 The OpenZipkin Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package zipkin.collector.eventhub;

import org.junit.Test;
import zipkin.storage.InMemoryStorage;
import static org.junit.Assert.assertEquals;


public class ZipkinEventProcessorTest {

  static final String dummyEventHubConnectionString = "endpoint=sb://someurl.net;SharedAccessKeyName=dumbo;SharedAccessKey=uius7y8ewychsih";

  @Test
  public void canCreateZipkinEventProcessor() {
    ZipkinEventProcessor zipkinEventProcessor = new ZipkinEventProcessor(getBuilder());
  }

  private EventHubCollector.Builder getBuilder() {
    return EventHubCollector.builder()
        .storage(new InMemoryStorage());

  }
}
