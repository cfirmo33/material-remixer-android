/*
 * Copyright 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package somepackage;

import com.google.android.libraries.remixer.Callback;
import com.google.android.libraries.remixer.ItemListVariable;
import com.google.android.libraries.remixer.Remixer;
import com.google.android.libraries.remixer.Variable;
import com.google.android.libraries.remixer.annotation.RemixerBinder;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

/**
 * This class was generated by RemixerAnnotationProcessor */
public class FixesDefaultValue_RemixerBinder implements RemixerBinder.Binder<FixesDefaultValue> {
  @Override
  public void bindInstance(FixesDefaultValue activity) {
    Remixer remixer = Remixer.getInstance();
    Generated_fixValue fixValue_callback = new Generated_fixValue(activity);
    ItemListVariable.Builder<String> fixValue_remixer_item = new ItemListVariable.Builder<String>();
    fixValue_remixer_item.setDataType(Remixer.getInstance().getDataType("string"));
    fixValue_remixer_item.setKey("fixValue");
    fixValue_remixer_item.setTitle("fixValue");
    fixValue_remixer_item.setLayoutId(0);
    fixValue_remixer_item.setContext(activity);
    fixValue_remixer_item.setCallback(fixValue_callback);
    ArrayList<String> fixValue_variable_list = new ArrayList<String>();
    fixValue_variable_list.add("hello");
    fixValue_variable_list.add("world");
    fixValue_remixer_item.setPossibleValues(fixValue_variable_list);
    fixValue_remixer_item.setDefaultValue("hello");
    remixer.addItem(fixValue_remixer_item.build());
  }

  static class Generated_fixValue implements Callback<String> {
    private final FixesDefaultValue activity;

    Generated_fixValue(FixesDefaultValue activity) {
      this.activity = activity;
    }

    @Override
    public void onValueSet(Variable<String> variable) {
      activity.fixValue(variable.getSelectedValue());
    }
  }
}
