package com.example.financier.services;

import com.example.financier.converters.DtoConverter;
import com.example.financier.domains.MoneySenderEntity;
import com.example.financier.payload.response.SenderDto;
import com.example.financier.payload.request.SenderDtoReq;
import com.example.financier.repository.SenderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class SenderService {
    @Autowired
    SenderRepo senderRepo;

    @Autowired
    RestTemplate restTemplate;


    DtoConverter dtoConverter=new DtoConverter();

    //get all transfers
    public List<MoneySenderEntity> getAllTransfers()
    {
        List<MoneySenderEntity> moneySenderEntities=senderRepo.findAll();
//        List<SenderDto> senderDtos=dtoConverter.entityToDtoMoney(moneySenderEntities);

        return moneySenderEntities;
    }


    //save transfers
    public SenderDto saveTransfer(SenderDtoReq senderDtoReq)
    {
        MoneySenderEntity moneySenderEntity=dtoConverter.dtoToEntityMoneyReq(senderDtoReq);
        senderRepo.save(moneySenderEntity);
        SenderDto senderDto=dtoConverter.entityToDtoMoney1(moneySenderEntity);
        return senderDto;
    }

    //updete transfer
    public SenderDto updateAmount(long id, BigDecimal amount)
    {
        Optional<MoneySenderEntity> moneySenderEntity=senderRepo.findById(id);
        if (moneySenderEntity.isPresent())
        {
            moneySenderEntity.get().setAmount(amount);
            senderRepo.save(moneySenderEntity.get());
        }

        SenderDto senderDto=dtoConverter.entityToDtoMoney1(moneySenderEntity.get());
        return senderDto;
    }

    //delete transfer
    public String deletteTransfer(long id)
    {
        Optional<MoneySenderEntity> moneySenderEntity=senderRepo.findById(id);
        if (moneySenderEntity.isPresent())
        {
            senderRepo.delete(moneySenderEntity.get());
        }
        return "o'chirildi";
    }
}
