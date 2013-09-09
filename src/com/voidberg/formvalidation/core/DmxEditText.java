package com.voidberg.formvalidation.core;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

public class DmxEditText extends EditText {
  private DmxValidator _validator;
  private boolean _shouldAllowViolation;
  private boolean _isValid;

  public DmxEditText(Context context) {
    super(context);
    init();
  }

  public DmxEditText(Context context, AttributeSet attrs) {
    super(context, attrs);
    init();
  }

  public DmxEditText(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
    init();
  }

  private void init() {
    _validator = new DmxValidator();
    _shouldAllowViolation = true;
    _isValid = false;
  }

  public boolean isValid() {
    return _validator.checkConditions(this.getText().toString()).count() == 0;
  }

  public void setShouldAllowViolation(boolean allowViolation) {
    _shouldAllowViolation = allowViolation;
  }

  public void setValidator(DmxValidator dmxValidator) {
    _validator = dmxValidator;
  }
 }
