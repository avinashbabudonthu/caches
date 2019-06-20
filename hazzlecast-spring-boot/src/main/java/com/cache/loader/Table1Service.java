package com.cache.loader;

import com.hazelcast.core.HazelcastInstance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class Table1Service {

    @Autowired
    private Table1Repository table1Repository;

    @Autowired
    private HazelcastInstance hazelcastInstance;

    @Transactional
    public void saveMultipleEntitites(){
        List<Table1Entity> table1EntityList = new ArrayList<>();
        for(Long i=1L;i<1000000;i++){
            System.out.println("i="+ i);
            Table1Entity table1Entity = new Table1Entity();
            table1Entity.setCol1("col1"+i);
            table1Entity.setCol2("col2"+i);
            table1Entity.setCol3("col3"+i);
            table1Entity.setCol4("col4"+i);
            table1Entity.setCol5("col5"+i);
            table1Entity.setCol6("col6"+i);
            table1Entity.setCol7("col7"+i);
            table1Entity.setCol8("col8"+i);

            table1EntityList.add(table1Entity);
        }

        table1Repository.save(table1EntityList);
    }


    public List<Table1Entity> findAll(){
        return table1Repository.findAll();
    }
}
