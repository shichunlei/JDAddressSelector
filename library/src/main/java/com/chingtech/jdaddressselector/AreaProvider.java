package com.chingtech.jdaddressselector;

import android.content.Context;
import com.chingtech.jdaddressselector.model.City;
import com.chingtech.jdaddressselector.model.County;
import com.chingtech.jdaddressselector.model.Province;
import com.chingtech.jdaddressselector.model.Street;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * *    ***********    ***********    **
 * *    ***********    ***********    **
 * *    **             **             **
 * *    **             **             **
 * *    **             **             **
 * *    ***********    **             **
 * *    ***********    **             **
 * *             **    **             **
 * *             **    **             **
 * *             **    **             **
 * *    ***********    ***********    ***********
 * *    ***********    ***********    ***********
 * </p>
 * JDAddressSelector
 * Package com.chingtech.jdaddressselector
 * Description:
 * Created by 师春雷
 * Created at 18/3/10 上午8:35
 */
public class AreaProvider implements AddressProvider {

    private DbUtils dbUtils;

    public AreaProvider(Context context) {
        dbUtils = new DbUtils(context);
    }

    @Override
    public void provideProvinces(AddressReceiver<Province> addressReceiver) {
        List<Province> provinceQueryList = dbUtils.getProvinceList();
        addressReceiver.send(new ArrayList<>(provinceQueryList));
    }

    @Override
    public void provideCitiesWith(int provinceId, AddressReceiver<City> addressReceiver) {
        List<City> cityQueryList = dbUtils.getCityList(provinceId);
        addressReceiver.send(new ArrayList<>(cityQueryList));
    }

    @Override
    public void provideCountiesWith(int cityId, AddressReceiver<County> addressReceiver) {
        List<County> countyQueryList = dbUtils.getCountyList(cityId);
        addressReceiver.send(new ArrayList<>(countyQueryList));
    }

    @Override
    public void provideStreetsWith(int countyId, AddressReceiver<Street> addressReceiver) {
        List<Street> streetQueryList = dbUtils.getStreetList(countyId);
        addressReceiver.send(new ArrayList<>(streetQueryList));
    }
}
