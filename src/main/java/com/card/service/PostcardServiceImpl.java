package com.card.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.card.mapper.PostcardMapper;
import com.card.model.Postcard;


@Service(value="postcardServiceImpl")
public class PostcardServiceImpl implements PostcardService {

@Resource(name="postcardMapper")
private PostcardMapper pcmapper;
	@Override
	public void insertpc(Postcard pc) {
		pcmapper.insert(pc);
		System.out.println("被调用");
	}
	@Override
	public Postcard selectpostcardbyrandom() {
		Integer pcnum = pcmapper.getpostcradnum();
		int random1 = (int)(1+Math.random()*pcnum);
//		int random2 = (int)(1+Math.random()*pcnum);
//		int random3 = (int)(1+Math.random()*pcnum);
		
		System.out.println(random1);
//		System.out.println(random2);
//		System.out.println(random3);
		
		Postcard pc1=pcmapper.selectByPrimaryKey(random1);
//		Postcard pc2=pcmapper.selectByPrimaryKey(random2);
//		Postcard pc3=pcmapper.selectByPrimaryKey(random3);
//		List<Postcard> pclist = new ArrayList<Postcard>();
//		pclist.add(pc1);
//		pclist.add(pc2);
//		pclist.add(pc3);
		return pc1;
	}
}
