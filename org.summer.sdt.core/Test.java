/*
 * Copyright (c) 2012, the Dart project authors.
 * 
 * Licensed under the Eclipse Public License v1.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.dart.engine.parser;

import Parser.SyntheticKeywordToken;

import com.google.common.annotations.VisibleForTesting;
import com.google.dart.engine.AnalysisEngine;
import com.google.dart.engine.ast.*;
import com.google.dart.engine.error.AnalysisError;
import com.google.dart.engine.error.AnalysisErrorListener;
import com.google.dart.engine.error.BooleanErrorListener;
import com.google.dart.engine.internal.parser.CommentAndMetadata;
import com.google.dart.engine.internal.parser.FinalConstVarOrType;
import com.google.dart.engine.internal.parser.Modifiers;
import com.google.dart.engine.scanner.BeginToken;
import com.google.dart.engine.scanner.Keyword;
import com.google.dart.engine.scanner.KeywordToken;
import com.google.dart.engine.scanner.Scanner;
import com.google.dart.engine.scanner.StringToken;
import com.google.dart.engine.scanner.SubSequenceReader;
import com.google.dart.engine.scanner.SyntheticStringToken;
import com.google.dart.engine.scanner.Token;
import com.google.dart.engine.scanner.TokenType;
import com.google.dart.engine.source.Source;
import com.google.dart.engine.utilities.dart.ParameterKind;
import com.google.dart.engine.utilities.general.StringUtilities;
import com.google.dart.engine.utilities.instrumentation.Instrumentation;
import com.google.dart.engine.utilities.instrumentation.InstrumentationBuilder;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Instances of the class {@code Parser} are used to parse tokens into an AST structure.
 * 
 * @coverage dart.engine.parser
 */
public class Parser {
	String dddd = "121212121;
//	for ddd;
			
	private String name;
}
