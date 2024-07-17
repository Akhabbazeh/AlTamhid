package com.ZidnyScience.TamheedTelawa.features;

import com.ZidnyScience.TamheedTelawa.features.ui.MainActivity;


public interface PageInterface {
   void hidePageInformation();
   void showPageInformation(int position);
   void set_state_type(MainActivity.StateTypeNow stateTypeNow,int number);
}
