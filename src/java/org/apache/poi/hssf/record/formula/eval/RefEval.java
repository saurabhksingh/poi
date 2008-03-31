/*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.apache.poi.hssf.record.formula.eval;

/**
 * @author Amol S Deshmukh &lt; amolweb at ya hoo dot com &gt;
 * 
 * RefEval is the super interface for Ref2D and Ref3DEval. Basically a RefEval
 * impl should contain reference to the original ReferencePtg or Ref3DPtg as
 * well as the final "value" resulting from the evaluation of the cell
 * reference. Thus if the HSSFCell has type CELL_TYPE_NUMERIC, the contained
 * value object should be of type NumberEval; if cell type is CELL_TYPE_STRING,
 * contained value object should be of type StringEval
 */
public interface RefEval extends ValueEval {

    /**
     * The (possibly evaluated) ValueEval contained
     * in this RefEval. eg. if cell A1 contains "test"
     * then in a formula referring to cell A1 
     * the RefEval representing
     * A1 will return as the getInnerValueEval() the
     * object of concrete type StringEval
     */
    public ValueEval getInnerValueEval();

    /**
     * returns the zero based column index.
     */
    public int getColumn();

    /**
     * returns the zero based row index.
     */
    public int getRow();
}