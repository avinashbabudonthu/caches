package com.entry.processor;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.cache.processor.EntryProcessor;
import javax.cache.processor.EntryProcessorException;
import javax.cache.processor.MutableEntry;
import java.io.Serializable;

@Slf4j
public class SimpleEntryProcessor implements EntryProcessor<String, String, String>, Serializable {

    @Override
    public String process(MutableEntry<String, String> entry, Object... arguments) throws EntryProcessorException {
        log.info("value={}", entry.getValue());
        if(entry.exists()){
            String current = entry.getValue();
            entry.setValue(current+"-modified");
            return current;
        }

        return  null;
    }

}
