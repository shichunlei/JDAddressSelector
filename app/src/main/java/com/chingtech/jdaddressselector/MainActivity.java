package com.chingtech.jdaddressselector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.chingtech.jdaddressselector.model.City;
import com.chingtech.jdaddressselector.model.County;
import com.chingtech.jdaddressselector.model.Province;
import com.chingtech.jdaddressselector.model.Street;

public class MainActivity extends AppCompatActivity
        implements AddressSelector.OnAddressSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout frameLayout = findViewById(R.id.frameLayout);

        AddressSelector selector = new AddressSelector(this, null);
        selector.setOnAddressSelectedListener(this);

        assert frameLayout != null;
        frameLayout.addView(selector.getView());

        Button buttonBottomDialog = findViewById(R.id.buttonBottomDialog);
        assert buttonBottomDialog != null;
        buttonBottomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomDialog dialog = new BottomDialog(MainActivity.this);
                dialog.setOnAddressSelectedListener(MainActivity.this);
                dialog.show();
            }
        });
    }

    @Override
    public void onAddressSelected(Province province, City city, County county, Street street) {
        String s = (province == null ? "" : province.getName()) + (city == null ? "" :
                "\n" + city.getName()) + (county == null ? "" : "\n" + county.getName()) + (
                street == null ? "" : "\n" + street.getName());

        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
