/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.autoconfigure.security.oauth2.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;

/**
 * Common base class providing beans for authorization code clients. Does not work if
 * nested inside a <code>@Configuration</code> class because it is considered as
 * configuration.
 */
abstract class BaseConfiguration {

	@Bean
	@ConfigurationProperties("security.oauth2.client")
	@Primary
	public AuthorizationCodeResourceDetails oauth2RemoteResource() {
		AuthorizationCodeResourceDetails details = new AuthorizationCodeResourceDetails();
		return details;
	}

}
