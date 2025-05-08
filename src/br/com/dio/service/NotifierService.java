package br.com.dio.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static br.com.dio.service.EventEnum.CLEAR_SPACE;

public class NotifierService {
    private Map<EventEnum, List<EventListaner>> listeners = new HashMap<>(){{
        put(CLEAR_SPACE, new ArrayList<>());
    }};

    public void subscribe(final EventEnum eventType, EventListaner listaner ){
        var selectedListeners = listeners.get(eventType);
        selectedListeners.add(listaner);
    }

    public void  notify(final EventEnum eventType){
        listeners.get(eventType).forEach(l -> l.update(eventType));
    }
}
