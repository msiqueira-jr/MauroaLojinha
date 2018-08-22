package br.com.mauro_alojinha.ui.main.about;

import android.databinding.DataBindingUtil;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.mauro_alojinha.R;
import br.com.mauro_alojinha.databinding.AboutFragmentBinding;

public class AboutFragment extends Fragment {
    private  AboutFragmentBinding mBinding;

    public AboutFragment() {
    }

    public static AboutFragment newInstance() {
        return new AboutFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.about_fragment,
                container, false);

        Typeface pacificoRegularFont = Typeface.createFromAsset(getActivity().getAssets(), "fonts/pacifico_regular.ttf");
        mBinding.logoSobre.setTypeface(pacificoRegularFont);

        return mBinding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
