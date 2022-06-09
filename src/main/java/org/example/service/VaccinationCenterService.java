
package org.example.service;

import java.util.ArrayList;
import java.util.List;
import org.example.model.VaccinationCenter;

public class VaccinationCenterService {
    List<VaccinationCenter> vaccinationCenterList = new ArrayList();

    public VaccinationCenterService() {
    }

    public void createVaccinationCenter(String code, String address) {
        this.vaccinationCenterList.add(new VaccinationCenter(code, address));
    }

    public List<VaccinationCenter> getAllCenters() {
        return this.vaccinationCenterList;
    }
}
