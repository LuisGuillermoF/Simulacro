package com.riwi.Simulacro_Spring_Boot.infrastructure.abastract_services;

import com.riwi.Simulacro_Spring_Boot.api.dto.request.MessageRequest;
import com.riwi.Simulacro_Spring_Boot.api.dto.response.basicResponse.MessageRSBasic;

public interface IMessageService extends CrudGeneral<MessageRequest,MessageRSBasic,Long>{

}
