package com.chingtech.jdaddressselector;

import java.util.List;

import com.chingtech.jdaddressselector.model.City;
import com.chingtech.jdaddressselector.model.County;
import com.chingtech.jdaddressselector.model.Province;
import com.chingtech.jdaddressselector.model.Street;

public interface AddressProvider {
    void provideProvinces(AddressReceiver<Province> addressReceiver);

    void provideCitiesWith(int provinceId, AddressReceiver<City> addressReceiver);

    void provideCountiesWith(int cityId, AddressReceiver<County> addressReceiver);

    void provideStreetsWith(int countyId, AddressReceiver<Street> addressReceiver);

    interface AddressReceiver<T> {
        void send(List<T> data);
    }
}