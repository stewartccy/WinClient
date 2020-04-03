package com.DMX.model.sys.vendor;


import com.DMX.model.BaseEntity;

/**
 * 厂商型号
 * @author Eric
 * @date 2019年7月11日19:51:20
 */
public class Model extends BaseEntity {


    private String vendorId;

    private String vendorName;

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
}