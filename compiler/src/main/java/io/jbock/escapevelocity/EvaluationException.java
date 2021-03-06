/*
 * Copyright (C) 2018 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jbock.escapevelocity;

/**
 * An exception that occurred while evaluating a template, such as an undefined variable reference
 * or a division by zero.
 *
 * @author emcmanus@google.com (Éamonn McManus)
 */
public class EvaluationException extends RuntimeException {
    private static final long serialVersionUID = 1;

    EvaluationException(String message) {
        super(message);
    }

    EvaluationException(String message, Throwable cause) {
        super(message, cause);
    }
}
