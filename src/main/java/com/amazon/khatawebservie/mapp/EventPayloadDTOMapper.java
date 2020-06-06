package com.amazon.khatawebservie.mapp;

import com.amazon.khatawebservie.model.EventPayload;
import com.amazon.khatawebservie.model.EventPayloadDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * mapper interface of event payload and event payload DTO
 */
@Component
public class EventPayloadDTOMapper {

    /**
     * convert event payload DTO to event Payload
     * @param eventPayloadDTO input
     * @return newly generated event payload
     */
    public EventPayload toEventPayload(EventPayloadDTO eventPayloadDTO){
        EventPayload eventPayload = new EventPayload();
        eventPayload.setIdempotenceId(eventPayloadDTO.getIdempotenceId());
        eventPayload.setIdempotenceVersion(eventPayloadDTO.getIdempotenceVersion());
        eventPayload.setBusinessEventString(eventPayloadDTO.getBusinessEventString());
        eventPayload.setAmount(eventPayloadDTO.getAmount());
        eventPayload.setMarketplaceId(eventPayloadDTO.getMarketplaceId());
        eventPayload.setAccountingEvent(eventPayloadDTO.getAccountingEvent());
        eventPayload.setFolioId(eventPayloadDTO.getFolioId());
        eventPayload.setFailureMessage(eventPayloadDTO.getFailureMessage());
        eventPayload.setFailureStatus(eventPayloadDTO.getFailureStatus());
        eventPayload.setProcessAfterTime(eventPayloadDTO.getProcessAfterTime());
        eventPayload.setRetryCount(eventPayloadDTO.getRetryCount());
        eventPayload.setInProcessStatus(eventPayloadDTO.getInProcessStatus());
        eventPayload.setCreationTime(eventPayloadDTO.getCreationTime());
        eventPayload.setExpirationTime(eventPayloadDTO.getExpirationTime());
        eventPayload.setRecordVersion(eventPayloadDTO.getRecordVersion());
        return eventPayload;
    }

    /**
     * convert list of event payload DTO to list of event payload
     * @param eventPayloadDTOList input list of event payload DTO
     * @return list of newly created eventPayloads
     */
    public List<EventPayload> toListEventPayload(List<EventPayloadDTO> eventPayloadDTOList){
        List<EventPayload> eventPayloadList =new ArrayList<EventPayload>();
        eventPayloadDTOList.forEach(eventPayloadDTO -> {
            EventPayload eventPayload = toEventPayload(eventPayloadDTO);
            eventPayloadList.add(eventPayload);
        });
        return eventPayloadList;
    }

    /**
     * convert Event payload to event payload DTO
     * @param eventPayload input event payload DTO
     * @return newly created event payload DTO
     */
    public EventPayloadDTO toEventPayloadDTO(EventPayload eventPayload)
    {
        EventPayloadDTO eventPayloadDTO = new EventPayloadDTO();
        eventPayloadDTO.setIdempotenceId(eventPayload.getIdempotenceId());
        eventPayloadDTO.setIdempotenceVersion(eventPayload.getIdempotenceVersion());
        eventPayloadDTO.setBusinessEventString(eventPayload.getBusinessEventString());
        eventPayloadDTO.setAmount(eventPayload.getAmount());
        eventPayloadDTO.setMarketplaceId(eventPayload.getMarketplaceId());
        eventPayloadDTO.setAccountingEvent(eventPayload.getAccountingEvent());
        eventPayloadDTO.setFolioId(eventPayload.getFolioId());
        eventPayloadDTO.setFailureMessage(eventPayload.getFailureMessage());
        eventPayloadDTO.setFailureStatus(eventPayload.getFailureStatus());
        eventPayloadDTO.setProcessAfterTime(eventPayload.getProcessAfterTime());
        eventPayloadDTO.setRetryCount(eventPayload.getRetryCount());
        eventPayloadDTO.setInProcessStatus(eventPayload.getInProcessStatus());
        eventPayloadDTO.setCreationTime(eventPayload.getCreationTime());
        eventPayloadDTO.setExpirationTime(eventPayload.getExpirationTime());
        eventPayloadDTO.setRecordVersion(eventPayload.getRecordVersion());
        return eventPayloadDTO;
    }
}
