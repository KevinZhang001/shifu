/**
 * Copyright [2012-2014] eBay Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ml.shifu.shifu.di.service;

import com.google.inject.Inject;
import ml.shifu.shifu.container.RawValueObject;
import ml.shifu.shifu.container.obj.ColumnConfig;
import ml.shifu.shifu.di.spi.StatsProcessor;

import java.util.List;
import java.util.Map;

public class StatsService {

    private StatsProcessor statsProcessor;


    @Inject
    public StatsService(StatsProcessor processor) {
        this.statsProcessor = processor;
    }

    public void setParams(Map<String, Object> params) {
        this.statsProcessor.setParams(params);
    }

    public void exec(ColumnConfig columnConfig, List<RawValueObject> rvoList) {
        this.statsProcessor.process(columnConfig, rvoList);
    }
}