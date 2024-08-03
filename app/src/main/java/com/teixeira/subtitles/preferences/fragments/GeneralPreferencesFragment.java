package com.teixeira.subtitles.preferences.fragments;

import android.os.Bundle;
import androidx.preference.PreferenceFragmentCompat;
import com.teixeira.subtitles.R;

public class GeneralPreferencesFragment extends PreferenceFragmentCompat {

  @Override
  public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
    setPreferencesFromResource(R.xml.preferences_general, rootKey);
  }
}
