package com.example.customItemWriter;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class CustomWriter implements ItemWriter<StudentBean>{
	
	@Autowired
	StudentRepo stuRepo;
	
	public void write(List<? extends StudentBean> items) throws Exception{
		log.info("itemSize ",items.size());
		stuRepo.saveAll(items);
	}

}
