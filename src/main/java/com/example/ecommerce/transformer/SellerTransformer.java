package com.example.ecommerce.transformer;

import com.example.ecommerce.dto.RequestDto.SellerRequestDto;
import com.example.ecommerce.dto.ResponseDto.SellerResponseDto;
import com.example.ecommerce.model.Seller;

import lombok.experimental.UtilityClass;

@UtilityClass
public class SellerTransformer {
    public static Seller SellerRequestDtoToseller(SellerRequestDto sellerRequestDto){
        return  Seller.builder()
        .name(sellerRequestDto.getName())
        .emailId(sellerRequestDto.getEmailId())
        .age(sellerRequestDto.getAge())
        .mobNo(sellerRequestDto.getMobNo())
        .build();

    }


     public static SellerResponseDto SellerToSellerResponseDto(Seller seller){

        return SellerResponseDto.builder()
                .name(seller.getName())
                .age(seller.getAge())
                .build();
    
}
}