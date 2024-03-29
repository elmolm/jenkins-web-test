/*
 * Copyright 2018 Florian Schmidt
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

package blog.elmland;

import java.util.Objects;
import jakarta.ejb.Stateless;

/**
 * Simple echo service.
 * 
 * @author Florian Schmidt
 */
@Stateless
public class EchoService {
  /**
   * Echo a text :).
   * 
   * @param text Text to echo.
   * @return Echo text :).
   */
  public String echo(String text) {
    Objects.requireNonNull(text);

    return "echo: " + text;
  }
}
