/*
 * Copyright 2011-2013 the original author or authors.
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
package org.springframework.data.redis.connection;

import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.jredis.JredisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.connection.srp.SrpConnectionFactory;

/**
 * Utilities for examining a {@link RedisConnection}
 *
 * @author Jennifer Hickey
 *
 */
public abstract class ConnectionUtils {

	public static boolean isAsync(RedisConnectionFactory connectionFactory) {
		return (connectionFactory instanceof LettuceConnectionFactory)
				|| (connectionFactory instanceof SrpConnectionFactory);
	}

	public static boolean isSrp(RedisConnectionFactory connectionFactory) {
		return connectionFactory instanceof SrpConnectionFactory;
	}

	public static boolean isJredis(RedisConnectionFactory connectionFactory) {
		return connectionFactory instanceof JredisConnectionFactory;
	}

	public static boolean isLettuce(RedisConnectionFactory connectionFactory) {
		return connectionFactory instanceof LettuceConnectionFactory;
	}

	public static boolean isJedis(RedisConnectionFactory connectionFactory) {
		return connectionFactory instanceof JedisConnectionFactory;
	}
}
