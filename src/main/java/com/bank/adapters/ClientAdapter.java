package com.bank.adapters;

import com.bank.database.entities.ClientEntity;
import com.bank.domain.entity.Client;
import lombok.Data;

@Data
public class ClientAdapter {
    private Client client;

    public ClientAdapter(ClientEntity clientEntity){
        this.client = Client.builder()
                .lastName(clientEntity.getLastName())
                .firstName(clientEntity.getFirstName())
                .documentNumber(clientEntity.getDocumentNumber())
                .birthDay(clientEntity.getBirthDay())
                .build();
    }
}
