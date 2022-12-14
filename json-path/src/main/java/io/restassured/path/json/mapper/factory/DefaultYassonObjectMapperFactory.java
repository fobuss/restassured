/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.restassured.path.json.mapper.factory;

import org.eclipse.yasson.JsonBindingProvider;

import javax.json.bind.Jsonb;
import java.lang.reflect.Type;

public class DefaultYassonObjectMapperFactory implements JsonbObjectMapperFactory {
    
    private static Object cachedJsonb = null;
    
	@Override
	public Jsonb create(Type cls, String charset) {
	    if (cachedJsonb == null) {
	        cachedJsonb = new JsonBindingProvider().create().build();
	    }
	    return (Jsonb) cachedJsonb;
	}
}
