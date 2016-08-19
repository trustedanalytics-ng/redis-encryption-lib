/**
 * Copyright (c) 2016 Intel Corporation
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

package org.trustedanalytics.redis.encryption;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Base64;

@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class SecureJson {
  private String iv;
  private String value;

  public SecureJson(byte[] iv, byte[] value) {
    this.iv = Base64.getEncoder().encodeToString(iv);
    this.value = Base64.getEncoder().encodeToString(value);
  }

  public byte[] getIv() {
    return Base64.getDecoder().decode(iv);
  }

  public byte[] getValue() {
    return Base64.getDecoder().decode(value);
  }
}
