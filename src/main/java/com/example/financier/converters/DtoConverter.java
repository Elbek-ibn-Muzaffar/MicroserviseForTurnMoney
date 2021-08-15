package com.example.financier.converters;

import com.example.financier.domains.MoneySenderEntity;
import com.example.financier.payload.response.SenderDto;
import com.example.financier.payload.request.SenderDtoReq;
import org.modelmapper.ModelMapper;

import java.util.List;

public class DtoConverter {

    ModelMapper mapper=new ModelMapper();

    public MoneySenderEntity dtoToEntityMoney(SenderDto senderDto)
    {
        MoneySenderEntity moneySenderEntity=mapper.map(senderDto,MoneySenderEntity.class);
        return moneySenderEntity;
    }

    public List<SenderDto> entityToDtoMoney(List<MoneySenderEntity> moneySenderEntity)
    {
        List<SenderDto> senderDtos= (List<SenderDto>) mapper.map(moneySenderEntity,SenderDto.class);
        return senderDtos;
    }

    public MoneySenderEntity dtoToEntityMoneyReq(SenderDtoReq senderDtoReq)
    {
        MoneySenderEntity moneySenderEntity=mapper.map(senderDtoReq,MoneySenderEntity.class);
        return moneySenderEntity;
    }

    public SenderDto entityToDtoMoney1(MoneySenderEntity moneySenderEntity)
    {
        SenderDto senderDtos= mapper.map(moneySenderEntity,SenderDto.class);
        return senderDtos;
    }

}
