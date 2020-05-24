package com.cimspace.stockup.api.v1.mapper;

import com.cimspace.stockup.api.v1.dto.VendorDTO;
import com.cimspace.stockup.domain.Vendor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VendorMapper {

    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);

    VendorDTO vendorToVendorDTO(Vendor vendor);

    Vendor vendorDTOtoVendor(VendorDTO vendorDTO);

}
