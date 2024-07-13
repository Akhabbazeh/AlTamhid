package com.beetronix.al_tamhid.features;
import android.view.View;

import com.beetronix.al_tamhid.features.ui.MainActivity;


public interface PageInterface {
   void hidePageInformation();
   void showPageInformation(int position);
   void set_state_type(MainActivity.StateTypeNow stateTypeNow,int number);
}
